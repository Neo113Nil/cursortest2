package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0002mnB_\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJN\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010&0%0\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010#H\u0082@¢\u0006\u0004\b\u001a\u0010'JT\u00103\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010&0%0\u001c2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u001c2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\u001fH\u0096@¢\u0006\u0004\b1\u00102J(\u00105\u001a\u0002042\u0006\u0010.\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020\u001fH\u0096@¢\u0006\u0004\b5\u00106JF\u00107\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010&0%0\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010#2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0082@¢\u0006\u0004\b7\u00108JF\u00109\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010&0%0\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010#2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0082@¢\u0006\u0004\b9\u00108J>\u00109\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010&0%0\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010#2\u0006\u0010 \u001a\u00020\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0082@¢\u0006\u0004\b9\u0010:JN\u0010=\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010&0%0\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010#2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020;2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010$\u001a\u00020<H\u0082@¢\u0006\u0004\b=\u0010>JF\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010&0%0\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010#2\u0006\u0010 \u001a\u00020;2\u0006\u0010!\u001a\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0082@¢\u0006\u0004\b\u001a\u0010?J>\u0010=\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010&0%0\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010#2\u0006\u0010 \u001a\u00020\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0082@¢\u0006\u0004\b=\u0010:J\u0018\u0010A\u001a\u00020@2\u0006\u0010.\u001a\u00020\u001fH\u0086@¢\u0006\u0004\bA\u0010BJ\u0018\u0010C\u001a\u00020@2\u0006\u0010.\u001a\u00020\u001fH\u0086@¢\u0006\u0004\bC\u0010BJ \u0010=\u001a\u00020D2\u0006\u0010\u001e\u001a\u00020;2\u0006\u0010 \u001a\u00020<H\u0082@¢\u0006\u0004\b=\u0010EJ\u0013\u0010=\u001a\u00020F*\u00020\u0019H\u0002¢\u0006\u0004\b=\u0010GJ\u0018\u00107\u001a\u00020D2\u0006\u0010\u001e\u001a\u00020;H\u0082@¢\u0006\u0004\b7\u0010HJ%\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010&0%0\u001c2\u0006\u0010\u001e\u001a\u00020#H\u0002¢\u0006\u0004\b\u001a\u0010IJ\u0018\u00109\u001a\u00020<2\u0006\u0010\u001e\u001a\u00020\u001fH\u0082@¢\u0006\u0004\b9\u0010BJ3\u00107\u001a\u0004\u0018\u00010K2\u0006\u0010\u001e\u001a\u00020;2\u0017\u0010 \u001a\u0013\u0012\t\u0012\u00070K¢\u0006\u0002\bL\u0012\u0004\u0012\u00020<0JH\u0082@¢\u0006\u0004\b7\u0010MJ\u0018\u0010=\u001a\u00020<2\u0006\u0010\u001e\u001a\u00020\u001fH\u0082@¢\u0006\u0004\b=\u0010BR\u0014\u0010O\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010NR\u0014\u0010=\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u00107\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u00109\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u001a\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010Y\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Q\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010\\R\u0014\u0010_\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u001b\u0010U\u001a\u00020<8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010`\u001a\u0004\b7\u0010aR\u001f\u0010]\u001a\u0006*\u00020\u00130\u00138CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\b=\u0010bR\"\u0010c\u001a\u00020\u001f8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u0018\u0010Z\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u0010iR\u0014\u0010l\u001a\u00020j8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010k"}, d2 = {"Landroidx/camera/camera2/impl/CapturePipelineImpl;", "Landroidx/camera/camera2/impl/CapturePipeline;", "Landroidx/camera/camera2/adapter/CaptureConfigAdapter;", "configAdapter", "Landroidx/camera/camera2/impl/FlashControl;", "flashControl", "Landroidx/camera/camera2/impl/TorchControl;", "torchControl", "Landroidx/camera/camera2/impl/VideoUsageControl;", "videoUsageControl", "Landroidx/camera/camera2/impl/UseCaseThreads;", "threads", "Landroidx/camera/camera2/impl/ComboRequestListener;", "requestListener", "Landroidx/camera/camera2/compat/workaround/UseTorchAsFlash;", "useTorchAsFlash", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "Ljavax/inject/Provider;", "Landroidx/camera/camera2/impl/UseCaseCameraState;", "useCaseCameraStateProvider", "Landroidx/camera/camera2/config/UseCaseGraphContext;", "useCaseGraphContext", "<init>", "(Landroidx/camera/camera2/adapter/CaptureConfigAdapter;Landroidx/camera/camera2/impl/FlashControl;Landroidx/camera/camera2/impl/TorchControl;Landroidx/camera/camera2/impl/VideoUsageControl;Landroidx/camera/camera2/impl/UseCaseThreads;Landroidx/camera/camera2/impl/ComboRequestListener;Landroidx/camera/camera2/compat/workaround/UseTorchAsFlash;Landroidx/camera/camera2/impl/CameraProperties;Ljavax/inject/Provider;Landroidx/camera/camera2/config/UseCaseGraphContext;)V", "Landroidx/camera/camera2/pipe/FrameMetadata;", "getHighSpeedVideoSizes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Landroidx/camera/camera2/impl/CapturePipelineImpl$PipelineTask;", "p0", "", "p1", "p2", "p3", "Landroidx/camera/camera2/impl/CapturePipelineImpl$MainCaptureParams;", "p4", "Lkotlinx/coroutines/Deferred;", "Ljava/lang/Void;", "(Ljava/util/List;IIILandroidx/camera/camera2/impl/CapturePipelineImpl$MainCaptureParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/camera/core/impl/CaptureConfig;", "configs", "Landroidx/camera/camera2/pipe/RequestTemplate;", "requestTemplate", "Landroidx/camera/core/impl/Config;", "sessionConfigOptions", "captureMode", "flashType", "flashMode", "submitStillCaptures-BvXKQx0", "(Ljava/util/List;ILandroidx/camera/core/impl/Config;IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitStillCaptures", "Landroidx/camera/core/imagecapture/CameraCapturePipeline;", "getCameraCapturePipeline", "(IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "(Landroidx/camera/camera2/impl/CapturePipelineImpl$MainCaptureParams;IILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/camera/camera2/impl/CapturePipelineImpl$MainCaptureParams;ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "getHighSpeedVideoFpsRanges", "(Landroidx/camera/camera2/impl/CapturePipelineImpl$MainCaptureParams;IJLjava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroidx/camera/camera2/impl/CapturePipelineImpl$MainCaptureParams;JILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "invokeScreenFlashPreCaptureTasks", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invokeScreenFlashPostCaptureTasks", "Landroidx/camera/camera2/pipe/Result3A;", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/camera/core/impl/CameraCaptureResult;", "(Landroidx/camera/camera2/pipe/FrameMetadata;)Landroidx/camera/core/impl/CameraCaptureResult;", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroidx/camera/camera2/impl/CapturePipelineImpl$MainCaptureParams;)Ljava/util/List;", "Lkotlin/Function1;", "Landroidx/camera/camera2/pipe/FrameInfo;", "Lkotlin/ParameterName;", "(JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/camera/camera2/adapter/CaptureConfigAdapter;", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/camera2/impl/FlashControl;", "getHighSpeedVideoSizesFor", "Landroidx/camera/camera2/impl/TorchControl;", "getOutputMinFrameDurationlomOqCM", "Landroidx/camera/camera2/impl/VideoUsageControl;", "getOutputFormats", "Landroidx/camera/camera2/impl/UseCaseThreads;", "getInputFormats", "Landroidx/camera/camera2/impl/ComboRequestListener;", "getInputSizeshNQ4ISI", "getOutputStallDurationlomOqCM", "Landroidx/camera/camera2/compat/workaround/UseTorchAsFlash;", "Ljavax/inject/Provider;", "getOutputSizeshNQ4ISI", "Landroidx/camera/camera2/config/UseCaseGraphContext;", "getOutputMinFrameDuration", "Lkotlin/Lazy;", "()Z", "()Landroidx/camera/camera2/impl/UseCaseCameraState;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.TEMPLATE, com.visa.cbp.getEncExpo.warmup, "getTemplate", "()I", "setTemplate", "(I)V", "Landroidx/camera/camera2/pipe/FrameMetadata;", "Landroidx/camera/camera2/impl/CapturePipelineImpl$emptyRequestMetadata$1;", "Landroidx/camera/camera2/impl/CapturePipelineImpl$emptyRequestMetadata$1;", "getOutputStallDuration", "PipelineTask", "MainCaptureParams"}, k = 1, mv = {2, 1, 0}, xi = 48)
@androidx.camera.camera2.config.UseCaseCameraScope
/* loaded from: classes6.dex */
public final class CapturePipelineImpl implements androidx.camera.camera2.impl.CapturePipeline {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.Lazy getOutputFormats;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.camera.camera2.pipe.FrameMetadata getOutputStallDurationlomOqCM;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.camera.camera2.adapter.CaptureConfigAdapter getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.FlashControl getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.CapturePipelineImpl$emptyRequestMetadata$1 getOutputStallDuration;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.TorchControl Camera2StreamConfigurationMap;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.ComboRequestListener getInputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final javax.inject.Provider<androidx.camera.camera2.impl.UseCaseCameraState> getInputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.UseCaseThreads getHighSpeedVideoSizes;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final kotlin.Lazy getOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.VideoUsageControl getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.camera2.config.UseCaseGraphContext getOutputMinFrameDuration;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final androidx.camera.camera2.compat.workaround.UseTorchAsFlash getHighSpeedVideoSizesFor;
    private int template;

    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.camera.camera2.impl.CapturePipelineImpl$emptyRequestMetadata$1] */
    @javax.inject.Inject
    public CapturePipelineImpl(androidx.camera.camera2.adapter.CaptureConfigAdapter captureConfigAdapter, androidx.camera.camera2.impl.FlashControl flashControl, androidx.camera.camera2.impl.TorchControl torchControl, androidx.camera.camera2.impl.VideoUsageControl videoUsageControl, androidx.camera.camera2.impl.UseCaseThreads useCaseThreads, androidx.camera.camera2.impl.ComboRequestListener comboRequestListener, androidx.camera.camera2.compat.workaround.UseTorchAsFlash useTorchAsFlash, final androidx.camera.camera2.impl.CameraProperties cameraProperties, javax.inject.Provider<androidx.camera.camera2.impl.UseCaseCameraState> provider, androidx.camera.camera2.config.UseCaseGraphContext useCaseGraphContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureConfigAdapter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flashControl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(torchControl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoUsageControl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseThreads, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comboRequestListener, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useTorchAsFlash, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraProperties, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseGraphContext, "");
        this.getHighSpeedVideoFpsRangesFor = captureConfigAdapter;
        this.getHighSpeedVideoFpsRanges = flashControl;
        this.Camera2StreamConfigurationMap = torchControl;
        this.getHighResolutionOutputSizeshNQ4ISI = videoUsageControl;
        this.getHighSpeedVideoSizes = useCaseThreads;
        this.getInputSizeshNQ4ISI = comboRequestListener;
        this.getHighSpeedVideoSizesFor = useTorchAsFlash;
        this.getInputFormats = provider;
        this.getOutputMinFrameDuration = useCaseGraphContext;
        this.getOutputFormats = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.camera2.impl.CapturePipelineImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                boolean isFlashAvailable$default;
                isFlashAvailable$default = androidx.camera.camera2.compat.workaround.FlashAvailabilityCheckerKt.isFlashAvailable$default(androidx.camera.camera2.impl.CameraProperties.this, false, 1, null);
                return java.lang.Boolean.valueOf(isFlashAvailable$default);
            }
        });
        this.getOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.camera2.impl.CapturePipelineImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.camera.camera2.impl.UseCaseCameraState useCaseCameraState;
                useCaseCameraState = androidx.camera.camera2.impl.CapturePipelineImpl.this.getInputFormats.get();
                return useCaseCameraState;
            }
        });
        this.template = 1;
        this.getOutputStallDuration = new androidx.camera.camera2.pipe.RequestMetadata() { // from class: androidx.camera.camera2.impl.CapturePipelineImpl$emptyRequestMetadata$1
            private final int template = androidx.camera.camera2.pipe.RequestTemplate.m680constructorimpl(0);
            private final java.util.Map<androidx.camera.camera2.pipe.StreamId, android.view.Surface> streams = kotlin.collections.MapsKt.emptyMap();
            private final boolean repeating = true;
            private final androidx.camera.camera2.pipe.Request request = new androidx.camera.camera2.pipe.Request(kotlin.collections.CollectionsKt.emptyList(), null, null, null, null, null, 62, null);
            private final long requestNumber = androidx.camera.camera2.pipe.RequestNumber.m673constructorimpl(0);

            @Override // androidx.camera.camera2.pipe.RequestMetadata
            /* renamed from: getTemplate-fGx8uWA, reason: not valid java name and from getter */
            public final int getTemplate() {
                return this.template;
            }

            @Override // androidx.camera.camera2.pipe.RequestMetadata
            public final java.util.Map<androidx.camera.camera2.pipe.StreamId, android.view.Surface> getStreams() {
                return this.streams;
            }

            @Override // androidx.camera.camera2.pipe.RequestMetadata
            public final boolean getRepeating() {
                return this.repeating;
            }

            @Override // androidx.camera.camera2.pipe.RequestMetadata
            public final androidx.camera.camera2.pipe.Request getRequest() {
                return this.request;
            }

            @Override // androidx.camera.camera2.pipe.RequestMetadata
            /* renamed from: getRequestNumber-my6kx4g, reason: not valid java name and from getter */
            public final long getRequestNumber() {
                return this.requestNumber;
            }

            @Override // androidx.camera.camera2.pipe.UnsafeWrapper
            public final <T> T unwrapAs(kotlin.reflect.KClass<T> type) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
                return null;
            }

            @Override // androidx.camera.camera2.pipe.Metadata
            public final <T> T getOrDefault(androidx.camera.camera2.pipe.Metadata.Key<T> key, T r3) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
                return r3;
            }

            @Override // androidx.camera.camera2.pipe.RequestMetadata
            public final <T> T getOrDefault(android.hardware.camera2.CaptureRequest.Key<T> key, T r3) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
                return r3;
            }

            @Override // androidx.camera.camera2.pipe.Metadata
            public final <T> T get(androidx.camera.camera2.pipe.Metadata.Key<T> key) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
                return null;
            }

            @Override // androidx.camera.camera2.pipe.RequestMetadata
            public final <T> T get(android.hardware.camera2.CaptureRequest.Key<T> key) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
                return null;
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/camera/camera2/impl/CapturePipelineImpl$PipelineTask;", "", "<init>", "(Ljava/lang/String;I)V", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class PipelineTask {
        public static final androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask Camera2StreamConfigurationMap;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
        public static final androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask getHighSpeedVideoFpsRanges;
        private static final /* synthetic */ androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask[] getHighSpeedVideoFpsRangesFor;
        public static final androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask getHighSpeedVideoSizes;

        private PipelineTask(java.lang.String str, int i) {
        }

        static {
            androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask pipelineTask = new androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask("PRE_CAPTURE", 0);
            getHighSpeedVideoFpsRanges = pipelineTask;
            androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask pipelineTask2 = new androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask("MAIN_CAPTURE", 1);
            getHighSpeedVideoSizes = pipelineTask2;
            androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask pipelineTask3 = new androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask("POST_CAPTURE", 2);
            Camera2StreamConfigurationMap = pipelineTask3;
            androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask[] pipelineTaskArr = {pipelineTask, pipelineTask2, pipelineTask3};
            getHighSpeedVideoFpsRangesFor = pipelineTaskArr;
            getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(pipelineTaskArr);
        }

        public static androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask[] values() {
            return (androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask[]) getHighSpeedVideoFpsRangesFor.clone();
        }

        public static androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask valueOf(java.lang.String str) {
            return (androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask) java.lang.Enum.valueOf(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.class, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0018\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c"}, d2 = {"Landroidx/camera/camera2/impl/CapturePipelineImpl$MainCaptureParams;", "", "", "Landroidx/camera/core/impl/CaptureConfig;", "p0", "Landroidx/camera/camera2/pipe/RequestTemplate;", "p1", "Landroidx/camera/core/impl/Config;", "p2", "<init>", "(Ljava/util/List;ILandroidx/camera/core/impl/Config;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "()Ljava/util/List;", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/core/impl/Config;", "()Landroidx/camera/core/impl/Config;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final /* data */ class MainCaptureParams {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final androidx.camera.core.impl.Config getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final java.util.List<androidx.camera.core.impl.CaptureConfig> getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final int getHighResolutionOutputSizeshNQ4ISI;

        private MainCaptureParams(java.util.List<androidx.camera.core.impl.CaptureConfig> list, int i, androidx.camera.core.impl.Config config) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
            this.getHighSpeedVideoFpsRangesFor = list;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.getHighSpeedVideoSizes = config;
        }

        public final java.util.List<androidx.camera.core.impl.CaptureConfig> getHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from getter */
        public final int getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        /* renamed from: getHighSpeedVideoSizes, reason: from getter */
        public final androidx.camera.core.impl.Config getGetHighSpeedVideoSizes() {
            return this.getHighSpeedVideoSizes;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MainCaptureParams(getHighSpeedVideoFpsRangesFor=");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
            sb.append((java.lang.Object) androidx.camera.camera2.pipe.RequestTemplate.m685toStringimpl(this.getHighResolutionOutputSizeshNQ4ISI));
            sb.append(", getHighSpeedVideoSizes=");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.getHighSpeedVideoFpsRangesFor.hashCode() * 31) + androidx.camera.camera2.pipe.RequestTemplate.m684hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI)) * 31) + this.getHighSpeedVideoSizes.hashCode();
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams)) {
                return false;
            }
            androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams mainCaptureParams = (androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams) p0;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, mainCaptureParams.getHighSpeedVideoFpsRangesFor) && androidx.camera.camera2.pipe.RequestTemplate.m682equalsimpl0(this.getHighResolutionOutputSizeshNQ4ISI, mainCaptureParams.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, mainCaptureParams.getHighSpeedVideoSizes);
        }

        public /* synthetic */ MainCaptureParams(java.util.List list, int i, androidx.camera.core.impl.Config config, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, i, config);
        }
    }

    private final boolean Camera2StreamConfigurationMap() {
        return ((java.lang.Boolean) this.getOutputFormats.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.camera.camera2.impl.UseCaseCameraState getHighSpeedVideoFpsRanges() {
        return (androidx.camera.camera2.impl.UseCaseCameraState) this.getOutputSizeshNQ4ISI.getValue();
    }

    @Override // androidx.camera.camera2.impl.CapturePipeline
    public final int getTemplate() {
        return this.template;
    }

    @Override // androidx.camera.camera2.impl.CapturePipeline
    public final void setTemplate(int i) {
        this.template = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.FrameMetadata> continuation) {
        androidx.camera.camera2.impl.CapturePipelineImpl$getFrameMetadata$1 capturePipelineImpl$getFrameMetadata$1;
        int i;
        long j;
        androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl;
        if (continuation instanceof androidx.camera.camera2.impl.CapturePipelineImpl$getFrameMetadata$1) {
            capturePipelineImpl$getFrameMetadata$1 = (androidx.camera.camera2.impl.CapturePipelineImpl$getFrameMetadata$1) continuation;
            if ((capturePipelineImpl$getFrameMetadata$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                capturePipelineImpl$getFrameMetadata$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = capturePipelineImpl$getFrameMetadata$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = capturePipelineImpl$getFrameMetadata$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (this.getOutputStallDurationlomOqCM == null) {
                        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                        }
                        j = androidx.camera.camera2.impl.CapturePipelineKt.getHighResolutionOutputSizeshNQ4ISI;
                        capturePipelineImpl$getFrameMetadata$1.getHighSpeedVideoSizes = this;
                        capturePipelineImpl$getFrameMetadata$1.getHighSpeedVideoFpsRanges = 1;
                        obj = Camera2StreamConfigurationMap(j, new kotlin.jvm.functions.Function1() { // from class: androidx.camera.camera2.impl.CapturePipelineImpl$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return java.lang.Boolean.valueOf(androidx.camera.camera2.impl.CapturePipelineImpl.$r8$lambda$QUMNp0tfcXRSiLsQB0i9runZEEs((androidx.camera.camera2.pipe.FrameInfo) obj2));
                            }
                        }, capturePipelineImpl$getFrameMetadata$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        capturePipelineImpl = this;
                    }
                    androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                    if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                        java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                        androidx.camera.camera2.pipe.FrameMetadata unused3 = this.getOutputStallDurationlomOqCM;
                    }
                    return this.getOutputStallDurationlomOqCM;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                capturePipelineImpl = (androidx.camera.camera2.impl.CapturePipelineImpl) capturePipelineImpl$getFrameMetadata$1.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.camera.camera2.pipe.FrameInfo frameInfo = (androidx.camera.camera2.pipe.FrameInfo) obj;
                capturePipelineImpl.getOutputStallDurationlomOqCM = frameInfo == null ? frameInfo.getMetadata() : null;
                androidx.camera.camera2.impl.Camera2Logger camera2Logger22 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                }
                return this.getOutputStallDurationlomOqCM;
            }
        }
        capturePipelineImpl$getFrameMetadata$1 = new androidx.camera.camera2.impl.CapturePipelineImpl$getFrameMetadata$1(this, continuation);
        java.lang.Object obj2 = capturePipelineImpl$getFrameMetadata$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = capturePipelineImpl$getFrameMetadata$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        androidx.camera.camera2.pipe.FrameInfo frameInfo2 = (androidx.camera.camera2.pipe.FrameInfo) obj2;
        capturePipelineImpl.getOutputStallDurationlomOqCM = frameInfo2 == null ? frameInfo2.getMetadata() : null;
        androidx.camera.camera2.impl.Camera2Logger camera2Logger222 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
        }
        return this.getOutputStallDurationlomOqCM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009f, code lost:
    
        if (r0 == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> list, int i, int i2, int i3, androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams mainCaptureParams, kotlin.coroutines.Continuation<? super java.util.List<? extends kotlinx.coroutines.Deferred<java.lang.Void>>> continuation) {
        androidx.camera.camera2.impl.CapturePipelineImpl$invokeCaptureTasks$1 capturePipelineImpl$invokeCaptureTasks$1;
        java.lang.Object obj;
        int i4;
        if (continuation instanceof androidx.camera.camera2.impl.CapturePipelineImpl$invokeCaptureTasks$1) {
            capturePipelineImpl$invokeCaptureTasks$1 = (androidx.camera.camera2.impl.CapturePipelineImpl$invokeCaptureTasks$1) continuation;
            if ((capturePipelineImpl$invokeCaptureTasks$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                capturePipelineImpl$invokeCaptureTasks$1.getHighSpeedVideoSizes -= 2147483648;
                androidx.camera.camera2.impl.CapturePipelineImpl$invokeCaptureTasks$1 capturePipelineImpl$invokeCaptureTasks$12 = capturePipelineImpl$invokeCaptureTasks$1;
                obj = capturePipelineImpl$invokeCaptureTasks$12.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i4 = capturePipelineImpl$invokeCaptureTasks$12.getHighSpeedVideoSizes;
                if (i4 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                    if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                        java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                        java.util.Objects.toString(list);
                    }
                    this.getOutputStallDurationlomOqCM = null;
                    if (list.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.getHighSpeedVideoSizes) && mainCaptureParams == null) {
                        throw new java.lang.IllegalStateException("Must not be null for PipelineType.MAIN_CAPTURE".toString());
                    }
                    if (i2 == 3) {
                        capturePipelineImpl$invokeCaptureTasks$12.getHighSpeedVideoSizes = 1;
                        java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(mainCaptureParams, i, list, capturePipelineImpl$invokeCaptureTasks$12);
                        if (highSpeedVideoFpsRanges != coroutine_suspended) {
                            return highSpeedVideoFpsRanges;
                        }
                    } else {
                        capturePipelineImpl$invokeCaptureTasks$12.getHighSpeedVideoFpsRangesFor = list;
                        capturePipelineImpl$invokeCaptureTasks$12.getHighResolutionOutputSizeshNQ4ISI = mainCaptureParams;
                        capturePipelineImpl$invokeCaptureTasks$12.Camera2StreamConfigurationMap = i;
                        capturePipelineImpl$invokeCaptureTasks$12.getHighSpeedVideoFpsRanges = i2;
                        capturePipelineImpl$invokeCaptureTasks$12.getHighSpeedVideoSizes = 2;
                        obj = getHighSpeedVideoFpsRanges(i3, capturePipelineImpl$invokeCaptureTasks$12);
                    }
                    return coroutine_suspended;
                }
                if (i4 == 1) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return obj;
                }
                if (i4 != 2) {
                    if (i4 == 3) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    if (i4 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return obj;
                }
                i2 = capturePipelineImpl$invokeCaptureTasks$12.getHighSpeedVideoFpsRanges;
                i = capturePipelineImpl$invokeCaptureTasks$12.Camera2StreamConfigurationMap;
                mainCaptureParams = (androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams) capturePipelineImpl$invokeCaptureTasks$12.getHighResolutionOutputSizeshNQ4ISI;
                list = (java.util.List) capturePipelineImpl$invokeCaptureTasks$12.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                int i5 = i2;
                int i6 = i;
                androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams mainCaptureParams2 = mainCaptureParams;
                java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> list2 = list;
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    capturePipelineImpl$invokeCaptureTasks$12.getHighSpeedVideoFpsRangesFor = null;
                    capturePipelineImpl$invokeCaptureTasks$12.getHighResolutionOutputSizeshNQ4ISI = null;
                    capturePipelineImpl$invokeCaptureTasks$12.getHighSpeedVideoSizes = 3;
                    java.lang.Object Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(mainCaptureParams2, i6, i5, list2, capturePipelineImpl$invokeCaptureTasks$12);
                    if (Camera2StreamConfigurationMap != coroutine_suspended) {
                        return Camera2StreamConfigurationMap;
                    }
                } else {
                    capturePipelineImpl$invokeCaptureTasks$12.getHighSpeedVideoFpsRangesFor = null;
                    capturePipelineImpl$invokeCaptureTasks$12.getHighResolutionOutputSizeshNQ4ISI = null;
                    capturePipelineImpl$invokeCaptureTasks$12.getHighSpeedVideoSizes = 4;
                    java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(mainCaptureParams2, i6, i5, list2, capturePipelineImpl$invokeCaptureTasks$12);
                    if (highResolutionOutputSizeshNQ4ISI != coroutine_suspended) {
                        return highResolutionOutputSizeshNQ4ISI;
                    }
                }
                return coroutine_suspended;
            }
        }
        capturePipelineImpl$invokeCaptureTasks$1 = new androidx.camera.camera2.impl.CapturePipelineImpl$invokeCaptureTasks$1(this, continuation);
        androidx.camera.camera2.impl.CapturePipelineImpl$invokeCaptureTasks$1 capturePipelineImpl$invokeCaptureTasks$122 = capturePipelineImpl$invokeCaptureTasks$1;
        obj = capturePipelineImpl$invokeCaptureTasks$122.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i4 = capturePipelineImpl$invokeCaptureTasks$122.getHighSpeedVideoSizes;
        if (i4 != 0) {
        }
        int i52 = i2;
        int i62 = i;
        androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams mainCaptureParams22 = mainCaptureParams;
        java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> list22 = list;
        if (!((java.lang.Boolean) obj).booleanValue()) {
        }
        return coroutine_suspended2;
    }

    @Override // androidx.camera.camera2.impl.CapturePipeline
    /* renamed from: submitStillCaptures-BvXKQx0 */
    public final java.lang.Object mo73submitStillCapturesBvXKQx0(java.util.List<androidx.camera.core.impl.CaptureConfig> list, int i, androidx.camera.core.impl.Config config, int i2, int i3, int i4, kotlin.coroutines.Continuation<? super java.util.List<? extends kotlinx.coroutines.Deferred<java.lang.Void>>> continuation) {
        return getHighSpeedVideoSizes(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask[]{androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.getHighSpeedVideoFpsRanges, androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.getHighSpeedVideoSizes, androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.Camera2StreamConfigurationMap}), i2, i4, i3, new androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams(list, i, config, null), continuation);
    }

    @Override // androidx.camera.camera2.impl.CapturePipeline
    public final java.lang.Object getCameraCapturePipeline(final int i, final int i2, final int i3, kotlin.coroutines.Continuation<? super androidx.camera.core.imagecapture.CameraCapturePipeline> continuation) {
        return new androidx.camera.core.imagecapture.CameraCapturePipeline() { // from class: androidx.camera.camera2.impl.CapturePipelineImpl$getCameraCapturePipeline$2
            @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
            public final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> invokePreCapture() {
                androidx.camera.camera2.impl.UseCaseThreads useCaseThreads;
                useCaseThreads = androidx.camera.camera2.impl.CapturePipelineImpl.this.getHighSpeedVideoSizes;
                final kotlinx.coroutines.CoroutineScope scope = useCaseThreads.getScope();
                final androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl = androidx.camera.camera2.impl.CapturePipelineImpl.this;
                final int i4 = i;
                final int i5 = i2;
                final int i6 = i3;
                com.google.common.util.concurrent.ListenableFuture<java.lang.Void> future = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.impl.CapturePipelineImpl$getCameraCapturePipeline$2$invokePreCapture$$inlined$future$1
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer<T> completer) {
                        kotlinx.coroutines.Job launch$default;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completer, "");
                        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScope.this, null, null, new androidx.camera.camera2.impl.CapturePipelineImpl$getCameraCapturePipeline$2$invokePreCapture$$inlined$future$1.AnonymousClass1(completer, null, capturePipelineImpl, i4, i5, i6), 3, null);
                        return launch$default;
                    }

                    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "androidx/camera/camera2/adapter/CoroutineAdaptersKt$future$resolver$1$1"}, k = 3, mv = {2, 1, 0}, xi = 48)
                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.CapturePipelineImpl$getCameraCapturePipeline$2$invokePreCapture$$inlined$future$1$1", f = "CapturePipeline.kt", i = {}, l = {104, 111}, m = "invokeSuspend", n = {}, s = {}, v = 1)
                    /* renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$getCameraCapturePipeline$2$invokePreCapture$$inlined$future$1$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                        final /* synthetic */ int Camera2StreamConfigurationMap;
                        java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                        final /* synthetic */ int getHighSpeedVideoFpsRanges;
                        final /* synthetic */ int getHighSpeedVideoFpsRangesFor;
                        final /* synthetic */ androidx.concurrent.futures.CallbackToFutureAdapter.Completer getHighSpeedVideoSizes;
                        int getInputSizeshNQ4ISI;
                        final /* synthetic */ androidx.camera.camera2.impl.CapturePipelineImpl getOutputFormats;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                            java.lang.Object highSpeedVideoSizes;
                            androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer;
                            androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer2;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.getInputSizeshNQ4ISI;
                            if (i == 0) {
                                kotlin.ResultKt.throwOnFailure(obj);
                                androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer3 = this.getHighSpeedVideoSizes;
                                androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl = this.getOutputFormats;
                                java.util.List listOf = kotlin.collections.CollectionsKt.listOf(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.getHighSpeedVideoFpsRanges);
                                int i2 = this.getHighSpeedVideoFpsRanges;
                                int i3 = this.getHighSpeedVideoFpsRangesFor;
                                int i4 = this.Camera2StreamConfigurationMap;
                                this.getHighResolutionOutputSizeshNQ4ISI = completer3;
                                this.getInputSizeshNQ4ISI = 1;
                                highSpeedVideoSizes = capturePipelineImpl.getHighSpeedVideoSizes(listOf, i2, i3, i4, null, this);
                                if (highSpeedVideoSizes != coroutine_suspended) {
                                    completer = completer3;
                                    obj = highSpeedVideoSizes;
                                }
                                return coroutine_suspended;
                            }
                            if (i != 1) {
                                if (i != 2) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                completer2 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) this.getHighResolutionOutputSizeshNQ4ISI;
                                kotlin.ResultKt.throwOnFailure(obj);
                                completer2.set(null);
                                return kotlin.Unit.INSTANCE;
                            }
                            completer = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) this.getHighResolutionOutputSizeshNQ4ISI;
                            kotlin.ResultKt.throwOnFailure(obj);
                            this.getHighResolutionOutputSizeshNQ4ISI = completer;
                            this.getInputSizeshNQ4ISI = 2;
                            if (kotlinx.coroutines.AwaitKt.joinAll((java.util.Collection<? extends kotlinx.coroutines.Job>) obj, this) != coroutine_suspended) {
                                completer2 = completer;
                                completer2.set(null);
                                return kotlin.Unit.INSTANCE;
                            }
                            return coroutine_suspended;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                            return ((androidx.camera.camera2.impl.CapturePipelineImpl$getCameraCapturePipeline$2$invokePreCapture$$inlined$future$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                            return new androidx.camera.camera2.impl.CapturePipelineImpl$getCameraCapturePipeline$2$invokePreCapture$$inlined$future$1.AnonymousClass1(this.getHighSpeedVideoSizes, continuation, this.getOutputFormats, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer, kotlin.coroutines.Continuation continuation, androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl, int i, int i2, int i3) {
                            super(2, continuation);
                            this.getHighSpeedVideoSizes = completer;
                            this.getOutputFormats = capturePipelineImpl;
                            this.getHighSpeedVideoFpsRanges = i;
                            this.getHighSpeedVideoFpsRangesFor = i2;
                            this.Camera2StreamConfigurationMap = i3;
                        }
                    }
                });
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(future, "");
                return future;
            }

            @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
            public final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> invokePostCapture() {
                androidx.camera.camera2.impl.UseCaseThreads useCaseThreads;
                useCaseThreads = androidx.camera.camera2.impl.CapturePipelineImpl.this.getHighSpeedVideoSizes;
                final kotlinx.coroutines.CoroutineScope scope = useCaseThreads.getScope();
                final androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl = androidx.camera.camera2.impl.CapturePipelineImpl.this;
                final int i4 = i;
                final int i5 = i2;
                final int i6 = i3;
                com.google.common.util.concurrent.ListenableFuture<java.lang.Void> future = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.impl.CapturePipelineImpl$getCameraCapturePipeline$2$invokePostCapture$$inlined$future$1
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer<T> completer) {
                        kotlinx.coroutines.Job launch$default;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completer, "");
                        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScope.this, null, null, new androidx.camera.camera2.impl.CapturePipelineImpl$getCameraCapturePipeline$2$invokePostCapture$$inlined$future$1.AnonymousClass1(completer, null, capturePipelineImpl, i4, i5, i6), 3, null);
                        return launch$default;
                    }

                    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "androidx/camera/camera2/adapter/CoroutineAdaptersKt$future$resolver$1$1"}, k = 3, mv = {2, 1, 0}, xi = 48)
                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.CapturePipelineImpl$getCameraCapturePipeline$2$invokePostCapture$$inlined$future$1$1", f = "CapturePipeline.kt", i = {}, l = {104, 111}, m = "invokeSuspend", n = {}, s = {}, v = 1)
                    /* renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$getCameraCapturePipeline$2$invokePostCapture$$inlined$future$1$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                        final /* synthetic */ int Camera2StreamConfigurationMap;
                        final /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.Object getHighSpeedVideoFpsRanges;
                        final /* synthetic */ int getHighSpeedVideoFpsRangesFor;
                        final /* synthetic */ androidx.concurrent.futures.CallbackToFutureAdapter.Completer getHighSpeedVideoSizes;
                        final /* synthetic */ androidx.camera.camera2.impl.CapturePipelineImpl getHighSpeedVideoSizesFor;
                        int getInputFormats;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                            java.lang.Object highSpeedVideoSizes;
                            androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer;
                            androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer2;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.getInputFormats;
                            if (i == 0) {
                                kotlin.ResultKt.throwOnFailure(obj);
                                androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer3 = this.getHighSpeedVideoSizes;
                                androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl = this.getHighSpeedVideoSizesFor;
                                java.util.List listOf = kotlin.collections.CollectionsKt.listOf(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.Camera2StreamConfigurationMap);
                                int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
                                int i3 = this.getHighSpeedVideoFpsRangesFor;
                                int i4 = this.Camera2StreamConfigurationMap;
                                this.getHighSpeedVideoFpsRanges = completer3;
                                this.getInputFormats = 1;
                                highSpeedVideoSizes = capturePipelineImpl.getHighSpeedVideoSizes(listOf, i2, i3, i4, null, this);
                                if (highSpeedVideoSizes != coroutine_suspended) {
                                    completer = completer3;
                                    obj = highSpeedVideoSizes;
                                }
                                return coroutine_suspended;
                            }
                            if (i != 1) {
                                if (i != 2) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                completer2 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) this.getHighSpeedVideoFpsRanges;
                                kotlin.ResultKt.throwOnFailure(obj);
                                completer2.set(null);
                                return kotlin.Unit.INSTANCE;
                            }
                            completer = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) this.getHighSpeedVideoFpsRanges;
                            kotlin.ResultKt.throwOnFailure(obj);
                            this.getHighSpeedVideoFpsRanges = completer;
                            this.getInputFormats = 2;
                            if (kotlinx.coroutines.AwaitKt.joinAll((java.util.Collection<? extends kotlinx.coroutines.Job>) obj, this) != coroutine_suspended) {
                                completer2 = completer;
                                completer2.set(null);
                                return kotlin.Unit.INSTANCE;
                            }
                            return coroutine_suspended;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                            return ((androidx.camera.camera2.impl.CapturePipelineImpl$getCameraCapturePipeline$2$invokePostCapture$$inlined$future$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                            return new androidx.camera.camera2.impl.CapturePipelineImpl$getCameraCapturePipeline$2$invokePostCapture$$inlined$future$1.AnonymousClass1(this.getHighSpeedVideoSizes, continuation, this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer, kotlin.coroutines.Continuation continuation, androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl, int i, int i2, int i3) {
                            super(2, continuation);
                            this.getHighSpeedVideoSizes = completer;
                            this.getHighSpeedVideoSizesFor = capturePipelineImpl;
                            this.getHighResolutionOutputSizeshNQ4ISI = i;
                            this.getHighSpeedVideoFpsRangesFor = i2;
                            this.Camera2StreamConfigurationMap = i3;
                        }
                    }
                });
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(future, "");
                return future;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0070, code lost:
    
        if (r14 != r0) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams mainCaptureParams, int i, int i2, java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> list, kotlin.coroutines.Continuation<? super java.util.List<? extends kotlinx.coroutines.Deferred<java.lang.Void>>> continuation) {
        androidx.camera.camera2.impl.CapturePipelineImpl$torchAsFlashCapture$1 capturePipelineImpl$torchAsFlashCapture$1;
        java.lang.Object obj;
        int i3;
        long j;
        if (continuation instanceof androidx.camera.camera2.impl.CapturePipelineImpl$torchAsFlashCapture$1) {
            capturePipelineImpl$torchAsFlashCapture$1 = (androidx.camera.camera2.impl.CapturePipelineImpl$torchAsFlashCapture$1) continuation;
            if ((capturePipelineImpl$torchAsFlashCapture$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                capturePipelineImpl$torchAsFlashCapture$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                androidx.camera.camera2.impl.CapturePipelineImpl$torchAsFlashCapture$1 capturePipelineImpl$torchAsFlashCapture$12 = capturePipelineImpl$torchAsFlashCapture$1;
                obj = capturePipelineImpl$torchAsFlashCapture$12.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = capturePipelineImpl$torchAsFlashCapture$12.getHighSpeedVideoFpsRangesFor;
                if (i3 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                    if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                        java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                    }
                    if (Camera2StreamConfigurationMap()) {
                        capturePipelineImpl$torchAsFlashCapture$12.getHighResolutionOutputSizeshNQ4ISI = mainCaptureParams;
                        capturePipelineImpl$torchAsFlashCapture$12.getHighSpeedVideoFpsRanges = list;
                        capturePipelineImpl$torchAsFlashCapture$12.Camera2StreamConfigurationMap = i;
                        capturePipelineImpl$torchAsFlashCapture$12.getHighSpeedVideoFpsRangesFor = 1;
                        obj = getHighResolutionOutputSizeshNQ4ISI(i2, capturePipelineImpl$torchAsFlashCapture$12);
                    }
                    capturePipelineImpl$torchAsFlashCapture$12.getHighResolutionOutputSizeshNQ4ISI = null;
                    capturePipelineImpl$torchAsFlashCapture$12.getHighSpeedVideoFpsRanges = null;
                    capturePipelineImpl$torchAsFlashCapture$12.getHighSpeedVideoFpsRangesFor = 3;
                    java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(mainCaptureParams, i, list, capturePipelineImpl$torchAsFlashCapture$12);
                    return highResolutionOutputSizeshNQ4ISI != coroutine_suspended ? coroutine_suspended : highResolutionOutputSizeshNQ4ISI;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    if (i3 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return obj;
                }
                i = capturePipelineImpl$torchAsFlashCapture$12.Camera2StreamConfigurationMap;
                list = (java.util.List) capturePipelineImpl$torchAsFlashCapture$12.getHighSpeedVideoFpsRanges;
                mainCaptureParams = (androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams) capturePipelineImpl$torchAsFlashCapture$12.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> list2 = list;
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    j = androidx.camera.camera2.impl.CapturePipelineKt.getHighSpeedVideoSizes;
                    boolean z = (this.getHighSpeedVideoSizesFor.shouldDisableAePrecapture() || this.getHighResolutionOutputSizeshNQ4ISI.isInVideoUsage()) ? false : true;
                    capturePipelineImpl$torchAsFlashCapture$12.getHighResolutionOutputSizeshNQ4ISI = null;
                    capturePipelineImpl$torchAsFlashCapture$12.getHighSpeedVideoFpsRanges = null;
                    capturePipelineImpl$torchAsFlashCapture$12.getHighSpeedVideoFpsRangesFor = 2;
                    java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(mainCaptureParams, i, j, list2, z, capturePipelineImpl$torchAsFlashCapture$12);
                    if (highSpeedVideoFpsRanges != coroutine_suspended) {
                        return highSpeedVideoFpsRanges;
                    }
                } else {
                    list = list2;
                    capturePipelineImpl$torchAsFlashCapture$12.getHighResolutionOutputSizeshNQ4ISI = null;
                    capturePipelineImpl$torchAsFlashCapture$12.getHighSpeedVideoFpsRanges = null;
                    capturePipelineImpl$torchAsFlashCapture$12.getHighSpeedVideoFpsRangesFor = 3;
                    java.lang.Object highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(mainCaptureParams, i, list, capturePipelineImpl$torchAsFlashCapture$12);
                    if (highResolutionOutputSizeshNQ4ISI2 != coroutine_suspended) {
                    }
                }
            }
        }
        capturePipelineImpl$torchAsFlashCapture$1 = new androidx.camera.camera2.impl.CapturePipelineImpl$torchAsFlashCapture$1(this, continuation);
        androidx.camera.camera2.impl.CapturePipelineImpl$torchAsFlashCapture$1 capturePipelineImpl$torchAsFlashCapture$122 = capturePipelineImpl$torchAsFlashCapture$1;
        obj = capturePipelineImpl$torchAsFlashCapture$122.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = capturePipelineImpl$torchAsFlashCapture$122.getHighSpeedVideoFpsRangesFor;
        if (i3 != 0) {
        }
        java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> list22 = list;
        if (!((java.lang.Boolean) obj).booleanValue()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0068, code lost:
    
        if (r13 == r0) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams mainCaptureParams, int i, int i2, java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> list, kotlin.coroutines.Continuation<? super java.util.List<? extends kotlinx.coroutines.Deferred<java.lang.Void>>> continuation) {
        androidx.camera.camera2.impl.CapturePipelineImpl$defaultCapture$1 capturePipelineImpl$defaultCapture$1;
        androidx.camera.camera2.impl.CapturePipelineImpl$defaultCapture$1 capturePipelineImpl$defaultCapture$12;
        java.lang.Object coroutine_suspended;
        int i3;
        int i4;
        java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> list2;
        boolean booleanValue;
        long j;
        java.lang.Object highSpeedVideoSizes;
        if (continuation instanceof androidx.camera.camera2.impl.CapturePipelineImpl$defaultCapture$1) {
            capturePipelineImpl$defaultCapture$1 = (androidx.camera.camera2.impl.CapturePipelineImpl$defaultCapture$1) continuation;
            if ((capturePipelineImpl$defaultCapture$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                capturePipelineImpl$defaultCapture$1.getHighSpeedVideoSizes -= 2147483648;
                capturePipelineImpl$defaultCapture$12 = capturePipelineImpl$defaultCapture$1;
                java.lang.Object obj = capturePipelineImpl$defaultCapture$12.getHighSpeedVideoFpsRangesFor;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = capturePipelineImpl$defaultCapture$12.getHighSpeedVideoSizes;
                if (i3 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (Camera2StreamConfigurationMap()) {
                        capturePipelineImpl$defaultCapture$12.getHighResolutionOutputSizeshNQ4ISI = mainCaptureParams;
                        capturePipelineImpl$defaultCapture$12.getHighSpeedVideoFpsRanges = list;
                        capturePipelineImpl$defaultCapture$12.Camera2StreamConfigurationMap = i;
                        capturePipelineImpl$defaultCapture$12.getHighSpeedVideoSizes = 1;
                        obj = getHighResolutionOutputSizeshNQ4ISI(i2, capturePipelineImpl$defaultCapture$12);
                    } else {
                        capturePipelineImpl$defaultCapture$12.getHighSpeedVideoSizes = 4;
                        java.lang.Object highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(mainCaptureParams, i, list, capturePipelineImpl$defaultCapture$12);
                        if (highResolutionOutputSizeshNQ4ISI != coroutine_suspended) {
                            return highResolutionOutputSizeshNQ4ISI;
                        }
                    }
                    return coroutine_suspended;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    if (i3 == 3) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    if (i3 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return obj;
                }
                i = capturePipelineImpl$defaultCapture$12.Camera2StreamConfigurationMap;
                list = (java.util.List) capturePipelineImpl$defaultCapture$12.getHighSpeedVideoFpsRanges;
                mainCaptureParams = (androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams) capturePipelineImpl$defaultCapture$12.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                i4 = i;
                list2 = list;
                booleanValue = ((java.lang.Boolean) obj).booleanValue();
                j = !booleanValue ? androidx.camera.camera2.impl.CapturePipelineKt.getHighSpeedVideoSizes : androidx.camera.camera2.impl.CapturePipelineKt.getHighSpeedVideoFpsRangesFor;
                if (!booleanValue || i4 == 0) {
                    capturePipelineImpl$defaultCapture$12.getHighResolutionOutputSizeshNQ4ISI = null;
                    capturePipelineImpl$defaultCapture$12.getHighSpeedVideoFpsRanges = null;
                    capturePipelineImpl$defaultCapture$12.getHighSpeedVideoSizes = 2;
                    highSpeedVideoSizes = getHighSpeedVideoSizes(mainCaptureParams, j, i4, list2, capturePipelineImpl$defaultCapture$12);
                    if (highSpeedVideoSizes == coroutine_suspended) {
                        return highSpeedVideoSizes;
                    }
                } else {
                    capturePipelineImpl$defaultCapture$12.getHighResolutionOutputSizeshNQ4ISI = null;
                    capturePipelineImpl$defaultCapture$12.getHighSpeedVideoFpsRanges = null;
                    capturePipelineImpl$defaultCapture$12.getHighSpeedVideoSizes = 3;
                    java.lang.Object highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(mainCaptureParams, i4, list2, capturePipelineImpl$defaultCapture$12);
                    if (highResolutionOutputSizeshNQ4ISI2 != coroutine_suspended) {
                        return highResolutionOutputSizeshNQ4ISI2;
                    }
                }
                return coroutine_suspended;
            }
        }
        capturePipelineImpl$defaultCapture$1 = new androidx.camera.camera2.impl.CapturePipelineImpl$defaultCapture$1(this, continuation);
        capturePipelineImpl$defaultCapture$12 = capturePipelineImpl$defaultCapture$1;
        java.lang.Object obj2 = capturePipelineImpl$defaultCapture$12.getHighSpeedVideoFpsRangesFor;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = capturePipelineImpl$defaultCapture$12.getHighSpeedVideoSizes;
        if (i3 != 0) {
        }
        i4 = i;
        list2 = list;
        booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        if (!booleanValue) {
        }
        if (!booleanValue) {
        }
        capturePipelineImpl$defaultCapture$12.getHighResolutionOutputSizeshNQ4ISI = null;
        capturePipelineImpl$defaultCapture$12.getHighSpeedVideoFpsRanges = null;
        capturePipelineImpl$defaultCapture$12.getHighSpeedVideoSizes = 2;
        highSpeedVideoSizes = getHighSpeedVideoSizes(mainCaptureParams, j, i4, list2, capturePipelineImpl$defaultCapture$12);
        if (highSpeedVideoSizes == coroutine_suspended) {
            return coroutine_suspended;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams mainCaptureParams, int i, java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> list, kotlin.coroutines.Continuation<? super java.util.List<? extends kotlinx.coroutines.Deferred<java.lang.Void>>> continuation) {
        androidx.camera.camera2.impl.CapturePipelineImpl$defaultNoFlashCapture$1 capturePipelineImpl$defaultNoFlashCapture$1;
        int i2;
        int i3;
        androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl;
        androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams mainCaptureParams2;
        long j;
        java.util.List<kotlinx.coroutines.Deferred<java.lang.Void>> listOf;
        java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> list2 = list;
        if (continuation instanceof androidx.camera.camera2.impl.CapturePipelineImpl$defaultNoFlashCapture$1) {
            capturePipelineImpl$defaultNoFlashCapture$1 = (androidx.camera.camera2.impl.CapturePipelineImpl$defaultNoFlashCapture$1) continuation;
            if ((capturePipelineImpl$defaultNoFlashCapture$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                capturePipelineImpl$defaultNoFlashCapture$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = capturePipelineImpl$defaultNoFlashCapture$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = capturePipelineImpl$defaultNoFlashCapture$1.getHighSpeedVideoSizes;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                    if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                        java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                    }
                    i3 = i == 0 ? 1 : 0;
                    androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                    if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                        java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                    }
                    if (list2.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.getHighSpeedVideoFpsRanges)) {
                        androidx.camera.camera2.impl.Camera2Logger camera2Logger3 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                            java.lang.String unused3 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                        }
                        if (i3 != 0) {
                            androidx.camera.camera2.impl.Camera2Logger camera2Logger4 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                java.lang.String unused4 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                            }
                            j = androidx.camera.camera2.impl.CapturePipelineKt.getHighSpeedVideoFpsRangesFor;
                            capturePipelineImpl$defaultNoFlashCapture$1.Camera2StreamConfigurationMap = this;
                            capturePipelineImpl$defaultNoFlashCapture$1.getHighResolutionOutputSizeshNQ4ISI = list2;
                            capturePipelineImpl$defaultNoFlashCapture$1.getHighSpeedVideoFpsRanges = mainCaptureParams;
                            capturePipelineImpl$defaultNoFlashCapture$1.getHighSpeedVideoFpsRangesFor = i3;
                            capturePipelineImpl$defaultNoFlashCapture$1.getHighSpeedVideoSizes = 1;
                            if (getHighSpeedVideoFpsRanges(j, false, capturePipelineImpl$defaultNoFlashCapture$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            capturePipelineImpl = this;
                            mainCaptureParams2 = mainCaptureParams;
                        } else {
                            capturePipelineImpl = this;
                            mainCaptureParams2 = mainCaptureParams;
                            androidx.camera.camera2.impl.Camera2Logger camera2Logger5 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                java.lang.String unused5 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                            }
                            if (!list2.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.getHighSpeedVideoSizes)) {
                                androidx.camera.camera2.impl.Camera2Logger camera2Logger6 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                    java.lang.String unused6 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                                }
                                if (mainCaptureParams2 != null) {
                                    listOf = capturePipelineImpl.getHighSpeedVideoSizes(mainCaptureParams2);
                                    androidx.camera.camera2.impl.Camera2Logger camera2Logger7 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                    if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                        java.lang.String unused7 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                                    }
                                } else {
                                    throw new java.lang.IllegalStateException("Required value was null.".toString());
                                }
                            } else {
                                listOf = kotlin.collections.CollectionsKt.listOf(kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred((java.lang.Object) null));
                            }
                            if (list2.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.Camera2StreamConfigurationMap)) {
                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(capturePipelineImpl.getHighSpeedVideoSizes.getSequentialScope(), null, null, new androidx.camera.camera2.impl.CapturePipelineImpl$defaultNoFlashCapture$$inlined$invoke$1(listOf, null, i3 != 0, this), 3, null);
                            }
                            return listOf;
                        }
                    } else {
                        capturePipelineImpl = this;
                        mainCaptureParams2 = mainCaptureParams;
                        if (!list2.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.getHighSpeedVideoSizes)) {
                        }
                        if (list2.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.Camera2StreamConfigurationMap)) {
                        }
                        return listOf;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = capturePipelineImpl$defaultNoFlashCapture$1.getHighSpeedVideoFpsRangesFor;
                    mainCaptureParams2 = (androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams) capturePipelineImpl$defaultNoFlashCapture$1.getHighSpeedVideoFpsRanges;
                    java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> list3 = (java.util.List) capturePipelineImpl$defaultNoFlashCapture$1.getHighResolutionOutputSizeshNQ4ISI;
                    capturePipelineImpl = (androidx.camera.camera2.impl.CapturePipelineImpl) capturePipelineImpl$defaultNoFlashCapture$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    i3 = i4;
                    list2 = list3;
                }
                androidx.camera.camera2.impl.Camera2Logger camera2Logger8 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused8 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
                androidx.camera.camera2.impl.Camera2Logger camera2Logger52 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                }
                if (!list2.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.getHighSpeedVideoSizes)) {
                }
                if (list2.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.Camera2StreamConfigurationMap)) {
                }
                return listOf;
            }
        }
        capturePipelineImpl$defaultNoFlashCapture$1 = new androidx.camera.camera2.impl.CapturePipelineImpl$defaultNoFlashCapture$1(this, continuation);
        java.lang.Object obj2 = capturePipelineImpl$defaultNoFlashCapture$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = capturePipelineImpl$defaultNoFlashCapture$1.getHighSpeedVideoSizes;
        if (i2 != 0) {
        }
        androidx.camera.camera2.impl.Camera2Logger camera2Logger82 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
        }
        androidx.camera.camera2.impl.Camera2Logger camera2Logger522 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
        }
        if (!list2.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.getHighSpeedVideoSizes)) {
        }
        if (list2.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.Camera2StreamConfigurationMap)) {
        }
        return listOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams mainCaptureParams, int i, long j, java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> list, boolean z, kotlin.coroutines.Continuation<? super java.util.List<? extends kotlinx.coroutines.Deferred<java.lang.Void>>> continuation) {
        androidx.camera.camera2.impl.CapturePipelineImpl$torchApplyCapture$1 capturePipelineImpl$torchApplyCapture$1;
        int i2;
        int i3;
        androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams mainCaptureParams2;
        boolean z2;
        boolean z3;
        int i4;
        java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> list2;
        androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl;
        int i5;
        int i6;
        boolean z4;
        java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> list3;
        int i7;
        long j2;
        int i8;
        boolean z5;
        int i9;
        int i10;
        androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams mainCaptureParams3;
        java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> list4;
        androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl2;
        long j3;
        int i11;
        int i12;
        androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl3;
        java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> list5;
        androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams mainCaptureParams4;
        java.lang.AutoCloseable autoCloseable;
        java.lang.Throwable th;
        java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> list6;
        java.lang.Object lock3AForCapture$default;
        java.lang.AutoCloseable autoCloseable2;
        androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl4;
        androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams mainCaptureParams5;
        int i13;
        java.lang.AutoCloseable autoCloseable3;
        androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl5;
        java.util.List<kotlinx.coroutines.Deferred<java.lang.Void>> listOf;
        if (continuation instanceof androidx.camera.camera2.impl.CapturePipelineImpl$torchApplyCapture$1) {
            capturePipelineImpl$torchApplyCapture$1 = (androidx.camera.camera2.impl.CapturePipelineImpl$torchApplyCapture$1) continuation;
            if ((capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = capturePipelineImpl$torchApplyCapture$1.getOutputMinFrameDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoSizesFor) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                        }
                        java.lang.Integer value = this.Camera2StreamConfigurationMap.getTorchStateLiveData().getValue();
                        i2 = (value == null || value.intValue() != 0) ? 0 : 1;
                        i3 = (i2 != 0 || i == 0) ? 1 : 0;
                        androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                            java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                        }
                        if (list.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.getHighSpeedVideoFpsRanges)) {
                            androidx.camera.camera2.impl.Camera2Logger camera2Logger3 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                java.lang.String unused3 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                            }
                            if (i2 == 0) {
                                mainCaptureParams2 = mainCaptureParams;
                                i5 = i2;
                                i6 = i3;
                                capturePipelineImpl = this;
                                z4 = z;
                                list3 = list;
                                i7 = i;
                                j2 = j;
                                if (z4) {
                                }
                                return coroutine_suspended;
                            }
                            androidx.camera.camera2.impl.Camera2Logger camera2Logger4 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                java.lang.String unused4 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                            }
                            kotlinx.coroutines.Deferred m120setTorchAsyncOup_wC0$camera_camera2$default = androidx.camera.camera2.impl.TorchControl.m120setTorchAsyncOup_wC0$camera_camera2$default(this.Camera2StreamConfigurationMap, androidx.camera.camera2.impl.TorchControl.TorchMode.INSTANCE.m132getUSED_AS_FLASHIRs_R8(), false, false, 6, null);
                            capturePipelineImpl$torchApplyCapture$1.Camera2StreamConfigurationMap = this;
                            capturePipelineImpl$torchApplyCapture$1.getInputFormats = list;
                            mainCaptureParams2 = mainCaptureParams;
                            capturePipelineImpl$torchApplyCapture$1.getOutputMinFrameDuration = mainCaptureParams2;
                            capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoSizes = i;
                            capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoFpsRanges = j;
                            capturePipelineImpl$torchApplyCapture$1.getOutputFormats = z;
                            capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoFpsRangesFor = i2;
                            capturePipelineImpl$torchApplyCapture$1.getHighResolutionOutputSizeshNQ4ISI = i3;
                            capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoSizesFor = 1;
                            if (m120setTorchAsyncOup_wC0$camera_camera2$default.join(capturePipelineImpl$torchApplyCapture$1) != coroutine_suspended) {
                                i5 = i2;
                                i6 = i3;
                                capturePipelineImpl = this;
                                z4 = z;
                                list3 = list;
                                i7 = i;
                                j2 = j;
                                androidx.camera.camera2.impl.Camera2Logger camera2Logger5 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                    java.lang.String unused5 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                                }
                                if (z4) {
                                    androidx.camera.camera2.impl.Camera2Logger camera2Logger6 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                    if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                        java.lang.String unused6 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                                    }
                                    androidx.camera.camera2.pipe.CameraGraph graph = this.getOutputMinFrameDuration.getGraph();
                                    capturePipelineImpl$torchApplyCapture$1.Camera2StreamConfigurationMap = capturePipelineImpl;
                                    capturePipelineImpl$torchApplyCapture$1.getInputFormats = list3;
                                    capturePipelineImpl$torchApplyCapture$1.getOutputMinFrameDuration = mainCaptureParams2;
                                    capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoSizes = i7;
                                    capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoFpsRanges = j2;
                                    capturePipelineImpl$torchApplyCapture$1.getOutputFormats = z4;
                                    capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoFpsRangesFor = i5;
                                    capturePipelineImpl$torchApplyCapture$1.getHighResolutionOutputSizeshNQ4ISI = i6;
                                    capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoSizesFor = 2;
                                    java.lang.Object acquireSession = graph.acquireSession(capturePipelineImpl$torchApplyCapture$1);
                                    if (acquireSession != coroutine_suspended) {
                                        j3 = j2;
                                        i8 = i6;
                                        obj = acquireSession;
                                        i11 = i5;
                                        i12 = i7;
                                        capturePipelineImpl3 = capturePipelineImpl;
                                        list5 = list3;
                                        mainCaptureParams4 = mainCaptureParams2;
                                        autoCloseable = (java.lang.AutoCloseable) obj;
                                        try {
                                            androidx.camera.camera2.pipe.CameraGraph.Session session = (androidx.camera.camera2.pipe.CameraGraph.Session) autoCloseable;
                                            boolean z6 = i12 != 0;
                                            boolean z7 = i12 != 0;
                                            capturePipelineImpl$torchApplyCapture$1.Camera2StreamConfigurationMap = capturePipelineImpl3;
                                            capturePipelineImpl$torchApplyCapture$1.getInputFormats = list5;
                                            capturePipelineImpl$torchApplyCapture$1.getOutputMinFrameDuration = mainCaptureParams4;
                                            capturePipelineImpl$torchApplyCapture$1.getInputSizeshNQ4ISI = autoCloseable;
                                            capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoSizes = i12;
                                            capturePipelineImpl$torchApplyCapture$1.getOutputFormats = z4;
                                            capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoFpsRangesFor = i11;
                                            capturePipelineImpl$torchApplyCapture$1.getHighResolutionOutputSizeshNQ4ISI = i8;
                                            capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoSizesFor = 3;
                                            androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl6 = capturePipelineImpl3;
                                            androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams mainCaptureParams6 = mainCaptureParams4;
                                            list6 = list5;
                                            lock3AForCapture$default = androidx.camera.camera2.pipe.CameraGraph.Session.lock3AForCapture$default(session, z6, z7, 0, j3, capturePipelineImpl$torchApplyCapture$1, 4, null);
                                            if (lock3AForCapture$default != coroutine_suspended) {
                                                autoCloseable2 = autoCloseable;
                                                obj = lock3AForCapture$default;
                                                capturePipelineImpl4 = capturePipelineImpl6;
                                                mainCaptureParams5 = mainCaptureParams6;
                                                i13 = i12;
                                                capturePipelineImpl$torchApplyCapture$1.Camera2StreamConfigurationMap = capturePipelineImpl4;
                                                capturePipelineImpl$torchApplyCapture$1.getInputFormats = list6;
                                                capturePipelineImpl$torchApplyCapture$1.getOutputMinFrameDuration = mainCaptureParams5;
                                                capturePipelineImpl$torchApplyCapture$1.getInputSizeshNQ4ISI = autoCloseable2;
                                                capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoSizes = i13;
                                                capturePipelineImpl$torchApplyCapture$1.getOutputFormats = z4;
                                                capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoFpsRangesFor = i11;
                                                capturePipelineImpl$torchApplyCapture$1.getHighResolutionOutputSizeshNQ4ISI = i8;
                                                capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoSizesFor = 4;
                                                obj = ((kotlinx.coroutines.Deferred) obj).await(capturePipelineImpl$torchApplyCapture$1);
                                                if (obj != coroutine_suspended) {
                                                    z5 = z4;
                                                    i9 = i13;
                                                    autoCloseable3 = autoCloseable2;
                                                    mainCaptureParams2 = mainCaptureParams5;
                                                    capturePipelineImpl5 = capturePipelineImpl4;
                                                    list2 = list6;
                                                    kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable3, null);
                                                    androidx.camera.camera2.impl.Camera2Logger camera2Logger7 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                                    if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                                        java.lang.String unused7 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                                                    }
                                                    i2 = i11;
                                                    capturePipelineImpl = capturePipelineImpl5;
                                                    z3 = true;
                                                    androidx.camera.camera2.impl.Camera2Logger camera2Logger8 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                                    if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                                        java.lang.String unused8 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                                                    }
                                                    z2 = z5;
                                                    i4 = i9;
                                                    i3 = i8;
                                                    if (!list2.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.getHighSpeedVideoSizes)) {
                                                        androidx.camera.camera2.impl.Camera2Logger camera2Logger9 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                                        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                                            java.lang.String unused9 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                                                        }
                                                        if (mainCaptureParams2 != null) {
                                                            listOf = capturePipelineImpl.getHighSpeedVideoSizes(mainCaptureParams2);
                                                            androidx.camera.camera2.impl.Camera2Logger camera2Logger10 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                                            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                                                java.lang.String unused10 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                                                            }
                                                        } else {
                                                            throw new java.lang.IllegalStateException("Required value was null.".toString());
                                                        }
                                                    } else {
                                                        listOf = kotlin.collections.CollectionsKt.listOf(kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred((java.lang.Object) null));
                                                    }
                                                    if (list2.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.Camera2StreamConfigurationMap)) {
                                                        kotlinx.coroutines.CoroutineScope sequentialScope = capturePipelineImpl.getHighSpeedVideoSizes.getSequentialScope();
                                                        boolean z8 = i2 != 0 ? z3 : false;
                                                        if (i3 == 0) {
                                                            z3 = false;
                                                        }
                                                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(sequentialScope, null, null, new androidx.camera.camera2.impl.CapturePipelineImpl$torchApplyCapture$$inlined$invoke$1(listOf, null, z8, this, z2, z3, i4), 3, null);
                                                    }
                                                    return listOf;
                                                }
                                            }
                                        } catch (java.lang.Throwable th2) {
                                            th = th2;
                                            try {
                                                throw th;
                                            } catch (java.lang.Throwable th3) {
                                                kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable, th);
                                                throw th3;
                                            }
                                        }
                                    }
                                } else {
                                    if (i6 == 0) {
                                        z3 = true;
                                        i8 = i6;
                                        z5 = z4;
                                        i2 = i5;
                                        i9 = i7;
                                        list2 = list3;
                                        androidx.camera.camera2.impl.Camera2Logger camera2Logger82 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                        }
                                        z2 = z5;
                                        i4 = i9;
                                        i3 = i8;
                                        if (!list2.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.getHighSpeedVideoSizes)) {
                                        }
                                        if (list2.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.Camera2StreamConfigurationMap)) {
                                        }
                                        return listOf;
                                    }
                                    if (i7 == 0) {
                                        androidx.camera.camera2.impl.Camera2Logger camera2Logger11 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                            java.lang.String unused11 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                                        }
                                        capturePipelineImpl$torchApplyCapture$1.Camera2StreamConfigurationMap = capturePipelineImpl;
                                        capturePipelineImpl$torchApplyCapture$1.getInputFormats = list3;
                                        capturePipelineImpl$torchApplyCapture$1.getOutputMinFrameDuration = mainCaptureParams2;
                                        capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoSizes = i7;
                                        capturePipelineImpl$torchApplyCapture$1.getOutputFormats = z4;
                                        capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoFpsRangesFor = i5;
                                        capturePipelineImpl$torchApplyCapture$1.getHighResolutionOutputSizeshNQ4ISI = i6;
                                        capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoSizesFor = 5;
                                        z3 = true;
                                        if (getHighSpeedVideoFpsRanges(j2, true, capturePipelineImpl$torchApplyCapture$1) != coroutine_suspended) {
                                            i8 = i6;
                                            z5 = z4;
                                            i10 = i5;
                                            mainCaptureParams3 = mainCaptureParams2;
                                            i9 = i7;
                                            list4 = list3;
                                            capturePipelineImpl2 = capturePipelineImpl;
                                            androidx.camera.camera2.impl.Camera2Logger camera2Logger12 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                                java.lang.String unused12 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                                            }
                                            capturePipelineImpl = capturePipelineImpl2;
                                            i2 = i10;
                                            list2 = list4;
                                            mainCaptureParams2 = mainCaptureParams3;
                                            androidx.camera.camera2.impl.Camera2Logger camera2Logger822 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                            }
                                            z2 = z5;
                                            i4 = i9;
                                            i3 = i8;
                                            if (!list2.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.getHighSpeedVideoSizes)) {
                                            }
                                            if (list2.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.Camera2StreamConfigurationMap)) {
                                            }
                                            return listOf;
                                        }
                                    } else {
                                        z3 = true;
                                        androidx.camera.camera2.impl.Camera2Logger camera2Logger13 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                            java.lang.String unused13 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                                        }
                                        kotlin.jvm.functions.Function1<androidx.camera.camera2.pipe.FrameInfo, java.lang.Boolean> function1 = new kotlin.jvm.functions.Function1<androidx.camera.camera2.pipe.FrameInfo, java.lang.Boolean>() { // from class: androidx.camera.camera2.impl.CapturePipelineImpl$torchApplyCapture$3$8
                                            @Override // kotlin.jvm.functions.Function1
                                            public final /* synthetic */ java.lang.Boolean invoke(androidx.camera.camera2.pipe.FrameInfo frameInfo) {
                                                androidx.camera.core.impl.CameraCaptureResult highSpeedVideoFpsRanges;
                                                androidx.camera.camera2.pipe.FrameInfo frameInfo2 = frameInfo;
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameInfo2, "");
                                                highSpeedVideoFpsRanges = androidx.camera.camera2.impl.CapturePipelineImpl.this.getHighSpeedVideoFpsRanges(frameInfo2.getMetadata());
                                                return java.lang.Boolean.valueOf(androidx.camera.core.impl.ConvergenceUtils.is3AConverged(highSpeedVideoFpsRanges, true));
                                            }
                                        };
                                        capturePipelineImpl$torchApplyCapture$1.Camera2StreamConfigurationMap = capturePipelineImpl;
                                        capturePipelineImpl$torchApplyCapture$1.getInputFormats = list3;
                                        capturePipelineImpl$torchApplyCapture$1.getOutputMinFrameDuration = mainCaptureParams2;
                                        capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoSizes = i7;
                                        capturePipelineImpl$torchApplyCapture$1.getOutputFormats = z4;
                                        capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoFpsRangesFor = i5;
                                        capturePipelineImpl$torchApplyCapture$1.getHighResolutionOutputSizeshNQ4ISI = i6;
                                        capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoSizesFor = 6;
                                        if (Camera2StreamConfigurationMap(j2, function1, capturePipelineImpl$torchApplyCapture$1) != coroutine_suspended) {
                                            i8 = i6;
                                            z5 = z4;
                                            i10 = i5;
                                            mainCaptureParams3 = mainCaptureParams2;
                                            i9 = i7;
                                            list4 = list3;
                                            capturePipelineImpl2 = capturePipelineImpl;
                                            androidx.camera.camera2.impl.Camera2Logger camera2Logger14 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                                java.lang.String unused14 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                                            }
                                            capturePipelineImpl = capturePipelineImpl2;
                                            i2 = i10;
                                            list2 = list4;
                                            mainCaptureParams2 = mainCaptureParams3;
                                            androidx.camera.camera2.impl.Camera2Logger camera2Logger8222 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                            }
                                            z2 = z5;
                                            i4 = i9;
                                            i3 = i8;
                                            if (!list2.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.getHighSpeedVideoSizes)) {
                                            }
                                            if (list2.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.Camera2StreamConfigurationMap)) {
                                            }
                                            return listOf;
                                        }
                                    }
                                }
                            }
                            return coroutine_suspended;
                        }
                        mainCaptureParams2 = mainCaptureParams;
                        z2 = z;
                        z3 = true;
                        i4 = i;
                        list2 = list;
                        capturePipelineImpl = this;
                        if (!list2.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.getHighSpeedVideoSizes)) {
                        }
                        if (list2.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.Camera2StreamConfigurationMap)) {
                        }
                        return listOf;
                    case 1:
                        int i14 = capturePipelineImpl$torchApplyCapture$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i15 = capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoFpsRangesFor;
                        z4 = capturePipelineImpl$torchApplyCapture$1.getOutputFormats;
                        long j4 = capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoFpsRanges;
                        i7 = capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoSizes;
                        androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams mainCaptureParams7 = (androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams) capturePipelineImpl$torchApplyCapture$1.getOutputMinFrameDuration;
                        list3 = (java.util.List) capturePipelineImpl$torchApplyCapture$1.getInputFormats;
                        capturePipelineImpl = (androidx.camera.camera2.impl.CapturePipelineImpl) capturePipelineImpl$torchApplyCapture$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        i6 = i14;
                        i5 = i15;
                        j2 = j4;
                        mainCaptureParams2 = mainCaptureParams7;
                        androidx.camera.camera2.impl.Camera2Logger camera2Logger52 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                        }
                        if (z4) {
                        }
                        return coroutine_suspended;
                    case 2:
                        i8 = capturePipelineImpl$torchApplyCapture$1.getHighResolutionOutputSizeshNQ4ISI;
                        i11 = capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoFpsRangesFor;
                        z4 = capturePipelineImpl$torchApplyCapture$1.getOutputFormats;
                        long j5 = capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoFpsRanges;
                        int i16 = capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoSizes;
                        androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams mainCaptureParams8 = (androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams) capturePipelineImpl$torchApplyCapture$1.getOutputMinFrameDuration;
                        java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> list7 = (java.util.List) capturePipelineImpl$torchApplyCapture$1.getInputFormats;
                        androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl7 = (androidx.camera.camera2.impl.CapturePipelineImpl) capturePipelineImpl$torchApplyCapture$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        j3 = j5;
                        i12 = i16;
                        mainCaptureParams4 = mainCaptureParams8;
                        capturePipelineImpl3 = capturePipelineImpl7;
                        list5 = list7;
                        autoCloseable = (java.lang.AutoCloseable) obj;
                        androidx.camera.camera2.pipe.CameraGraph.Session session2 = (androidx.camera.camera2.pipe.CameraGraph.Session) autoCloseable;
                        if (i12 != 0) {
                        }
                        if (i12 != 0) {
                        }
                        capturePipelineImpl$torchApplyCapture$1.Camera2StreamConfigurationMap = capturePipelineImpl3;
                        capturePipelineImpl$torchApplyCapture$1.getInputFormats = list5;
                        capturePipelineImpl$torchApplyCapture$1.getOutputMinFrameDuration = mainCaptureParams4;
                        capturePipelineImpl$torchApplyCapture$1.getInputSizeshNQ4ISI = autoCloseable;
                        capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoSizes = i12;
                        capturePipelineImpl$torchApplyCapture$1.getOutputFormats = z4;
                        capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoFpsRangesFor = i11;
                        capturePipelineImpl$torchApplyCapture$1.getHighResolutionOutputSizeshNQ4ISI = i8;
                        capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoSizesFor = 3;
                        androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl62 = capturePipelineImpl3;
                        androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams mainCaptureParams62 = mainCaptureParams4;
                        list6 = list5;
                        lock3AForCapture$default = androidx.camera.camera2.pipe.CameraGraph.Session.lock3AForCapture$default(session2, z6, z7, 0, j3, capturePipelineImpl$torchApplyCapture$1, 4, null);
                        if (lock3AForCapture$default != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 3:
                        i8 = capturePipelineImpl$torchApplyCapture$1.getHighResolutionOutputSizeshNQ4ISI;
                        i11 = capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoFpsRangesFor;
                        z4 = capturePipelineImpl$torchApplyCapture$1.getOutputFormats;
                        i13 = capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoSizes;
                        autoCloseable2 = (java.lang.AutoCloseable) capturePipelineImpl$torchApplyCapture$1.getInputSizeshNQ4ISI;
                        mainCaptureParams5 = (androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams) capturePipelineImpl$torchApplyCapture$1.getOutputMinFrameDuration;
                        java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> list8 = (java.util.List) capturePipelineImpl$torchApplyCapture$1.getInputFormats;
                        capturePipelineImpl4 = (androidx.camera.camera2.impl.CapturePipelineImpl) capturePipelineImpl$torchApplyCapture$1.Camera2StreamConfigurationMap;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            list6 = list8;
                            capturePipelineImpl$torchApplyCapture$1.Camera2StreamConfigurationMap = capturePipelineImpl4;
                            capturePipelineImpl$torchApplyCapture$1.getInputFormats = list6;
                            capturePipelineImpl$torchApplyCapture$1.getOutputMinFrameDuration = mainCaptureParams5;
                            capturePipelineImpl$torchApplyCapture$1.getInputSizeshNQ4ISI = autoCloseable2;
                            capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoSizes = i13;
                            capturePipelineImpl$torchApplyCapture$1.getOutputFormats = z4;
                            capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoFpsRangesFor = i11;
                            capturePipelineImpl$torchApplyCapture$1.getHighResolutionOutputSizeshNQ4ISI = i8;
                            capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoSizesFor = 4;
                            obj = ((kotlinx.coroutines.Deferred) obj).await(capturePipelineImpl$torchApplyCapture$1);
                            if (obj != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            autoCloseable = autoCloseable2;
                            throw th;
                        }
                    case 4:
                        i8 = capturePipelineImpl$torchApplyCapture$1.getHighResolutionOutputSizeshNQ4ISI;
                        i11 = capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoFpsRangesFor;
                        z5 = capturePipelineImpl$torchApplyCapture$1.getOutputFormats;
                        i9 = capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoSizes;
                        autoCloseable3 = (java.lang.AutoCloseable) capturePipelineImpl$torchApplyCapture$1.getInputSizeshNQ4ISI;
                        mainCaptureParams2 = (androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams) capturePipelineImpl$torchApplyCapture$1.getOutputMinFrameDuration;
                        list2 = (java.util.List) capturePipelineImpl$torchApplyCapture$1.getInputFormats;
                        capturePipelineImpl5 = (androidx.camera.camera2.impl.CapturePipelineImpl) capturePipelineImpl$torchApplyCapture$1.Camera2StreamConfigurationMap;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable3, null);
                            androidx.camera.camera2.impl.Camera2Logger camera2Logger72 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                            }
                            i2 = i11;
                            capturePipelineImpl = capturePipelineImpl5;
                            z3 = true;
                            androidx.camera.camera2.impl.Camera2Logger camera2Logger82222 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                            }
                            z2 = z5;
                            i4 = i9;
                            i3 = i8;
                            if (!list2.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.getHighSpeedVideoSizes)) {
                            }
                            if (list2.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.Camera2StreamConfigurationMap)) {
                            }
                            return listOf;
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            autoCloseable = autoCloseable3;
                            throw th;
                        }
                    case 5:
                        i8 = capturePipelineImpl$torchApplyCapture$1.getHighResolutionOutputSizeshNQ4ISI;
                        i10 = capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoFpsRangesFor;
                        z5 = capturePipelineImpl$torchApplyCapture$1.getOutputFormats;
                        i9 = capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoSizes;
                        mainCaptureParams3 = (androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams) capturePipelineImpl$torchApplyCapture$1.getOutputMinFrameDuration;
                        list4 = (java.util.List) capturePipelineImpl$torchApplyCapture$1.getInputFormats;
                        capturePipelineImpl2 = (androidx.camera.camera2.impl.CapturePipelineImpl) capturePipelineImpl$torchApplyCapture$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        z3 = true;
                        androidx.camera.camera2.impl.Camera2Logger camera2Logger122 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                        }
                        capturePipelineImpl = capturePipelineImpl2;
                        i2 = i10;
                        list2 = list4;
                        mainCaptureParams2 = mainCaptureParams3;
                        androidx.camera.camera2.impl.Camera2Logger camera2Logger822222 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                        }
                        z2 = z5;
                        i4 = i9;
                        i3 = i8;
                        if (!list2.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.getHighSpeedVideoSizes)) {
                        }
                        if (list2.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.Camera2StreamConfigurationMap)) {
                        }
                        return listOf;
                    case 6:
                        i8 = capturePipelineImpl$torchApplyCapture$1.getHighResolutionOutputSizeshNQ4ISI;
                        i10 = capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoFpsRangesFor;
                        z5 = capturePipelineImpl$torchApplyCapture$1.getOutputFormats;
                        i9 = capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoSizes;
                        mainCaptureParams3 = (androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams) capturePipelineImpl$torchApplyCapture$1.getOutputMinFrameDuration;
                        list4 = (java.util.List) capturePipelineImpl$torchApplyCapture$1.getInputFormats;
                        capturePipelineImpl2 = (androidx.camera.camera2.impl.CapturePipelineImpl) capturePipelineImpl$torchApplyCapture$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        z3 = true;
                        androidx.camera.camera2.impl.Camera2Logger camera2Logger142 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                        }
                        capturePipelineImpl = capturePipelineImpl2;
                        i2 = i10;
                        list2 = list4;
                        mainCaptureParams2 = mainCaptureParams3;
                        androidx.camera.camera2.impl.Camera2Logger camera2Logger8222222 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                        }
                        z2 = z5;
                        i4 = i9;
                        i3 = i8;
                        if (!list2.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.getHighSpeedVideoSizes)) {
                        }
                        if (list2.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.Camera2StreamConfigurationMap)) {
                        }
                        return listOf;
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        capturePipelineImpl$torchApplyCapture$1 = new androidx.camera.camera2.impl.CapturePipelineImpl$torchApplyCapture$1(this, continuation);
        java.lang.Object obj2 = capturePipelineImpl$torchApplyCapture$1.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (capturePipelineImpl$torchApplyCapture$1.getHighSpeedVideoSizesFor) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x015a A[Catch: all -> 0x006b, TryCatch #2 {all -> 0x006b, blocks: (B:13:0x0047, B:14:0x0152, B:16:0x015a, B:17:0x015d, B:43:0x0066, B:44:0x013c), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams mainCaptureParams, long j, int i, java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> list, kotlin.coroutines.Continuation<? super java.util.List<? extends kotlinx.coroutines.Deferred<java.lang.Void>>> continuation) {
        androidx.camera.camera2.impl.CapturePipelineImpl$aePreCaptureApplyCapture$1 capturePipelineImpl$aePreCaptureApplyCapture$1;
        java.lang.Object coroutine_suspended;
        ?? r4;
        java.lang.AutoCloseable autoCloseable;
        java.lang.Throwable th;
        androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams mainCaptureParams2;
        int i2;
        androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl;
        java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> list2;
        androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl2;
        androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams mainCaptureParams3;
        java.lang.Object obj;
        int i3;
        long j2;
        java.lang.AutoCloseable autoCloseable2;
        java.lang.Object lock3AForCapture$default;
        androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams mainCaptureParams4;
        int i4;
        java.lang.AutoCloseable autoCloseable3;
        java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> list3;
        androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl3;
        java.util.List<kotlinx.coroutines.Deferred<java.lang.Void>> listOf;
        java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> list4 = list;
        try {
            try {
                try {
                    if (continuation instanceof androidx.camera.camera2.impl.CapturePipelineImpl$aePreCaptureApplyCapture$1) {
                        capturePipelineImpl$aePreCaptureApplyCapture$1 = (androidx.camera.camera2.impl.CapturePipelineImpl$aePreCaptureApplyCapture$1) continuation;
                        if ((capturePipelineImpl$aePreCaptureApplyCapture$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                            capturePipelineImpl$aePreCaptureApplyCapture$1.getOutputMinFrameDuration -= 2147483648;
                            java.lang.Object obj2 = capturePipelineImpl$aePreCaptureApplyCapture$1.getInputSizeshNQ4ISI;
                            coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            r4 = capturePipelineImpl$aePreCaptureApplyCapture$1.getOutputMinFrameDuration;
                            if (r4 != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                    java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                                }
                                androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                    java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                                }
                                if (list4.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.getHighSpeedVideoFpsRanges)) {
                                    androidx.camera.camera2.impl.Camera2Logger camera2Logger3 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                    if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                        java.lang.String unused3 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                                    }
                                    androidx.camera.camera2.impl.Camera2Logger camera2Logger4 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                    if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                        java.lang.String unused4 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                                    }
                                    androidx.camera.camera2.pipe.CameraGraph graph = this.getOutputMinFrameDuration.getGraph();
                                    capturePipelineImpl$aePreCaptureApplyCapture$1.getHighSpeedVideoFpsRangesFor = this;
                                    capturePipelineImpl$aePreCaptureApplyCapture$1.getHighSpeedVideoSizes = list4;
                                    capturePipelineImpl$aePreCaptureApplyCapture$1.getHighResolutionOutputSizeshNQ4ISI = mainCaptureParams;
                                    capturePipelineImpl$aePreCaptureApplyCapture$1.Camera2StreamConfigurationMap = j;
                                    capturePipelineImpl$aePreCaptureApplyCapture$1.getHighSpeedVideoFpsRanges = i;
                                    capturePipelineImpl$aePreCaptureApplyCapture$1.getOutputMinFrameDuration = 1;
                                    java.lang.Object acquireSession = graph.acquireSession(capturePipelineImpl$aePreCaptureApplyCapture$1);
                                    if (acquireSession != coroutine_suspended) {
                                        list2 = list4;
                                        capturePipelineImpl2 = this;
                                        mainCaptureParams3 = mainCaptureParams;
                                        obj = acquireSession;
                                        i3 = i;
                                        j2 = j;
                                    }
                                    return coroutine_suspended;
                                }
                                mainCaptureParams2 = mainCaptureParams;
                                i2 = i;
                                capturePipelineImpl = this;
                                if (list4.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.getHighSpeedVideoSizes)) {
                                }
                                if (list4.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.Camera2StreamConfigurationMap)) {
                                }
                                return listOf;
                            }
                            if (r4 != 1) {
                                if (r4 == 2) {
                                    i4 = capturePipelineImpl$aePreCaptureApplyCapture$1.getHighSpeedVideoFpsRanges;
                                    java.lang.AutoCloseable autoCloseable4 = (java.lang.AutoCloseable) capturePipelineImpl$aePreCaptureApplyCapture$1.getInputFormats;
                                    mainCaptureParams4 = (androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams) capturePipelineImpl$aePreCaptureApplyCapture$1.getHighResolutionOutputSizeshNQ4ISI;
                                    list3 = (java.util.List) capturePipelineImpl$aePreCaptureApplyCapture$1.getHighSpeedVideoSizes;
                                    capturePipelineImpl3 = (androidx.camera.camera2.impl.CapturePipelineImpl) capturePipelineImpl$aePreCaptureApplyCapture$1.getHighSpeedVideoFpsRangesFor;
                                    kotlin.ResultKt.throwOnFailure(obj2);
                                    autoCloseable3 = autoCloseable4;
                                    capturePipelineImpl$aePreCaptureApplyCapture$1.getHighSpeedVideoFpsRangesFor = capturePipelineImpl3;
                                    capturePipelineImpl$aePreCaptureApplyCapture$1.getHighSpeedVideoSizes = list3;
                                    capturePipelineImpl$aePreCaptureApplyCapture$1.getHighResolutionOutputSizeshNQ4ISI = mainCaptureParams4;
                                    capturePipelineImpl$aePreCaptureApplyCapture$1.getInputFormats = autoCloseable3;
                                    capturePipelineImpl$aePreCaptureApplyCapture$1.getHighSpeedVideoFpsRanges = i4;
                                    capturePipelineImpl$aePreCaptureApplyCapture$1.getOutputMinFrameDuration = 3;
                                    if (((kotlinx.coroutines.Deferred) obj2).join(capturePipelineImpl$aePreCaptureApplyCapture$1) != coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    capturePipelineImpl = capturePipelineImpl3;
                                    r4 = autoCloseable3;
                                    androidx.camera.camera2.impl.Camera2Logger camera2Logger5 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                    if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                    }
                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                    kotlin.jdk7.AutoCloseableKt.closeFinally(r4, null);
                                    androidx.camera.camera2.impl.Camera2Logger camera2Logger6 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                    if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                    }
                                    i2 = i4;
                                    mainCaptureParams2 = mainCaptureParams4;
                                    list4 = list3;
                                    if (list4.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.getHighSpeedVideoSizes)) {
                                    }
                                    if (list4.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.Camera2StreamConfigurationMap)) {
                                    }
                                    return listOf;
                                }
                                if (r4 != 3) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                i4 = capturePipelineImpl$aePreCaptureApplyCapture$1.getHighSpeedVideoFpsRanges;
                                java.lang.AutoCloseable autoCloseable5 = (java.lang.AutoCloseable) capturePipelineImpl$aePreCaptureApplyCapture$1.getInputFormats;
                                mainCaptureParams4 = (androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams) capturePipelineImpl$aePreCaptureApplyCapture$1.getHighResolutionOutputSizeshNQ4ISI;
                                list3 = (java.util.List) capturePipelineImpl$aePreCaptureApplyCapture$1.getHighSpeedVideoSizes;
                                capturePipelineImpl = (androidx.camera.camera2.impl.CapturePipelineImpl) capturePipelineImpl$aePreCaptureApplyCapture$1.getHighSpeedVideoFpsRangesFor;
                                kotlin.ResultKt.throwOnFailure(obj2);
                                r4 = autoCloseable5;
                                androidx.camera.camera2.impl.Camera2Logger camera2Logger52 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                    java.lang.String unused5 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                                }
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                kotlin.jdk7.AutoCloseableKt.closeFinally(r4, null);
                                androidx.camera.camera2.impl.Camera2Logger camera2Logger62 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                    java.lang.String unused6 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                                }
                                i2 = i4;
                                mainCaptureParams2 = mainCaptureParams4;
                                list4 = list3;
                                if (list4.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.getHighSpeedVideoSizes)) {
                                    androidx.camera.camera2.impl.Camera2Logger camera2Logger7 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                    if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                        java.lang.String unused7 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                                    }
                                    if (mainCaptureParams2 != null) {
                                        listOf = capturePipelineImpl.getHighSpeedVideoSizes(mainCaptureParams2);
                                        androidx.camera.camera2.impl.Camera2Logger camera2Logger8 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                            java.lang.String unused8 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                                        }
                                    } else {
                                        throw new java.lang.IllegalStateException("Required value was null.".toString());
                                    }
                                } else {
                                    listOf = kotlin.collections.CollectionsKt.listOf(kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred((java.lang.Object) null));
                                }
                                if (list4.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.Camera2StreamConfigurationMap)) {
                                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(capturePipelineImpl.getHighSpeedVideoSizes.getSequentialScope(), null, null, new androidx.camera.camera2.impl.CapturePipelineImpl$aePreCaptureApplyCapture$$inlined$invoke$1(listOf, null, this, i2), 3, null);
                                }
                                return listOf;
                            }
                            int i5 = capturePipelineImpl$aePreCaptureApplyCapture$1.getHighSpeedVideoFpsRanges;
                            long j3 = capturePipelineImpl$aePreCaptureApplyCapture$1.Camera2StreamConfigurationMap;
                            androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams mainCaptureParams5 = (androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams) capturePipelineImpl$aePreCaptureApplyCapture$1.getHighResolutionOutputSizeshNQ4ISI;
                            java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> list5 = (java.util.List) capturePipelineImpl$aePreCaptureApplyCapture$1.getHighSpeedVideoSizes;
                            androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl4 = (androidx.camera.camera2.impl.CapturePipelineImpl) capturePipelineImpl$aePreCaptureApplyCapture$1.getHighSpeedVideoFpsRangesFor;
                            kotlin.ResultKt.throwOnFailure(obj2);
                            list2 = list5;
                            capturePipelineImpl2 = capturePipelineImpl4;
                            j2 = j3;
                            i3 = i5;
                            mainCaptureParams3 = mainCaptureParams5;
                            obj = obj2;
                            autoCloseable2 = (java.lang.AutoCloseable) obj;
                            androidx.camera.camera2.pipe.CameraGraph.Session session = (androidx.camera.camera2.pipe.CameraGraph.Session) autoCloseable2;
                            androidx.camera.camera2.impl.Camera2Logger camera2Logger9 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                try {
                                    java.lang.String unused9 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    autoCloseable = autoCloseable2;
                                    try {
                                        throw th;
                                    } catch (java.lang.Throwable th3) {
                                        kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable, th);
                                        throw th3;
                                    }
                                }
                            }
                            boolean z = i3 != 0;
                            boolean z2 = i3 == 0;
                            capturePipelineImpl$aePreCaptureApplyCapture$1.getHighSpeedVideoFpsRangesFor = capturePipelineImpl2;
                            capturePipelineImpl$aePreCaptureApplyCapture$1.getHighSpeedVideoSizes = list2;
                            capturePipelineImpl$aePreCaptureApplyCapture$1.getHighResolutionOutputSizeshNQ4ISI = mainCaptureParams3;
                            capturePipelineImpl$aePreCaptureApplyCapture$1.getInputFormats = autoCloseable2;
                            capturePipelineImpl$aePreCaptureApplyCapture$1.getHighSpeedVideoFpsRanges = i3;
                            capturePipelineImpl$aePreCaptureApplyCapture$1.getOutputMinFrameDuration = 2;
                            androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl5 = capturePipelineImpl2;
                            java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> list6 = list2;
                            lock3AForCapture$default = androidx.camera.camera2.pipe.CameraGraph.Session.lock3AForCapture$default(session, z, z2, 0, j2, capturePipelineImpl$aePreCaptureApplyCapture$1, 4, null);
                            if (lock3AForCapture$default != coroutine_suspended) {
                                mainCaptureParams4 = mainCaptureParams3;
                                i4 = i3;
                                obj2 = lock3AForCapture$default;
                                autoCloseable3 = autoCloseable2;
                                list3 = list6;
                                capturePipelineImpl3 = capturePipelineImpl5;
                                capturePipelineImpl$aePreCaptureApplyCapture$1.getHighSpeedVideoFpsRangesFor = capturePipelineImpl3;
                                capturePipelineImpl$aePreCaptureApplyCapture$1.getHighSpeedVideoSizes = list3;
                                capturePipelineImpl$aePreCaptureApplyCapture$1.getHighResolutionOutputSizeshNQ4ISI = mainCaptureParams4;
                                capturePipelineImpl$aePreCaptureApplyCapture$1.getInputFormats = autoCloseable3;
                                capturePipelineImpl$aePreCaptureApplyCapture$1.getHighSpeedVideoFpsRanges = i4;
                                capturePipelineImpl$aePreCaptureApplyCapture$1.getOutputMinFrameDuration = 3;
                                if (((kotlinx.coroutines.Deferred) obj2).join(capturePipelineImpl$aePreCaptureApplyCapture$1) != coroutine_suspended) {
                                }
                            }
                            return coroutine_suspended;
                        }
                    }
                    lock3AForCapture$default = androidx.camera.camera2.pipe.CameraGraph.Session.lock3AForCapture$default(session, z, z2, 0, j2, capturePipelineImpl$aePreCaptureApplyCapture$1, 4, null);
                    if (lock3AForCapture$default != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    r4 = autoCloseable2;
                    th = th;
                    autoCloseable = r4;
                    throw th;
                }
                androidx.camera.camera2.pipe.CameraGraph.Session session2 = (androidx.camera.camera2.pipe.CameraGraph.Session) autoCloseable2;
                androidx.camera.camera2.impl.Camera2Logger camera2Logger92 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                }
                if (i3 != 0) {
                }
                if (i3 == 0) {
                }
                capturePipelineImpl$aePreCaptureApplyCapture$1.getHighSpeedVideoFpsRangesFor = capturePipelineImpl2;
                capturePipelineImpl$aePreCaptureApplyCapture$1.getHighSpeedVideoSizes = list2;
                capturePipelineImpl$aePreCaptureApplyCapture$1.getHighResolutionOutputSizeshNQ4ISI = mainCaptureParams3;
                capturePipelineImpl$aePreCaptureApplyCapture$1.getInputFormats = autoCloseable2;
                capturePipelineImpl$aePreCaptureApplyCapture$1.getHighSpeedVideoFpsRanges = i3;
                capturePipelineImpl$aePreCaptureApplyCapture$1.getOutputMinFrameDuration = 2;
                androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl52 = capturePipelineImpl2;
                java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> list62 = list2;
            } catch (java.lang.Throwable th5) {
                th = th5;
                autoCloseable = autoCloseable2;
            }
            if (r4 != 0) {
            }
            autoCloseable2 = (java.lang.AutoCloseable) obj;
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        capturePipelineImpl$aePreCaptureApplyCapture$1 = new androidx.camera.camera2.impl.CapturePipelineImpl$aePreCaptureApplyCapture$1(this, continuation);
        java.lang.Object obj22 = capturePipelineImpl$aePreCaptureApplyCapture$1.getInputSizeshNQ4ISI;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r4 = capturePipelineImpl$aePreCaptureApplyCapture$1.getOutputMinFrameDuration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams mainCaptureParams, int i, java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> list, kotlin.coroutines.Continuation<? super java.util.List<? extends kotlinx.coroutines.Deferred<java.lang.Void>>> continuation) {
        androidx.camera.camera2.impl.CapturePipelineImpl$screenFlashCapture$1 capturePipelineImpl$screenFlashCapture$1;
        int i2;
        androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl;
        java.util.List<kotlinx.coroutines.Deferred<java.lang.Void>> listOf;
        if (continuation instanceof androidx.camera.camera2.impl.CapturePipelineImpl$screenFlashCapture$1) {
            capturePipelineImpl$screenFlashCapture$1 = (androidx.camera.camera2.impl.CapturePipelineImpl$screenFlashCapture$1) continuation;
            if ((capturePipelineImpl$screenFlashCapture$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                capturePipelineImpl$screenFlashCapture$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = capturePipelineImpl$screenFlashCapture$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = capturePipelineImpl$screenFlashCapture$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                    if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                        java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                    }
                    androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                    if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                        java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                    }
                    if (!list.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.getHighSpeedVideoFpsRanges)) {
                        capturePipelineImpl = this;
                        if (list.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.getHighSpeedVideoSizes)) {
                            androidx.camera.camera2.impl.Camera2Logger camera2Logger3 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                java.lang.String unused3 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                            }
                            if (mainCaptureParams == null) {
                                throw new java.lang.IllegalStateException("Required value was null.".toString());
                            }
                            listOf = capturePipelineImpl.getHighSpeedVideoSizes(mainCaptureParams);
                            androidx.camera.camera2.impl.Camera2Logger camera2Logger4 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                java.lang.String unused4 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                            }
                        } else {
                            listOf = kotlin.collections.CollectionsKt.listOf(kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred((java.lang.Object) null));
                        }
                        if (list.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.Camera2StreamConfigurationMap)) {
                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(capturePipelineImpl.getHighSpeedVideoSizes.getSequentialScope(), null, null, new androidx.camera.camera2.impl.CapturePipelineImpl$screenFlashCapture$$inlined$invoke$1(listOf, null, this, i), 3, null);
                        }
                        return listOf;
                    }
                    androidx.camera.camera2.impl.Camera2Logger camera2Logger5 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                    if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                        java.lang.String unused5 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                    }
                    capturePipelineImpl$screenFlashCapture$1.getHighSpeedVideoFpsRangesFor = this;
                    capturePipelineImpl$screenFlashCapture$1.Camera2StreamConfigurationMap = list;
                    capturePipelineImpl$screenFlashCapture$1.getHighSpeedVideoSizes = mainCaptureParams;
                    capturePipelineImpl$screenFlashCapture$1.getHighSpeedVideoFpsRanges = i;
                    capturePipelineImpl$screenFlashCapture$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (invokeScreenFlashPreCaptureTasks(i, capturePipelineImpl$screenFlashCapture$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    capturePipelineImpl = this;
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = capturePipelineImpl$screenFlashCapture$1.getHighSpeedVideoFpsRanges;
                    mainCaptureParams = (androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams) capturePipelineImpl$screenFlashCapture$1.getHighSpeedVideoSizes;
                    list = (java.util.List) capturePipelineImpl$screenFlashCapture$1.Camera2StreamConfigurationMap;
                    capturePipelineImpl = (androidx.camera.camera2.impl.CapturePipelineImpl) capturePipelineImpl$screenFlashCapture$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                androidx.camera.camera2.impl.Camera2Logger camera2Logger6 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused6 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
                if (list.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.getHighSpeedVideoSizes)) {
                }
                if (list.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.Camera2StreamConfigurationMap)) {
                }
                return listOf;
            }
        }
        capturePipelineImpl$screenFlashCapture$1 = new androidx.camera.camera2.impl.CapturePipelineImpl$screenFlashCapture$1(this, continuation);
        java.lang.Object obj2 = capturePipelineImpl$screenFlashCapture$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = capturePipelineImpl$screenFlashCapture$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i2 != 0) {
        }
        androidx.camera.camera2.impl.Camera2Logger camera2Logger62 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
        }
        if (list.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.getHighSpeedVideoSizes)) {
        }
        if (list.contains(androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask.Camera2StreamConfigurationMap)) {
        }
        return listOf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ab, code lost:
    
        if (r0 != r12) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0080, code lost:
    
        if (r0 == r12) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0070, code lost:
    
        if (r0.startScreenFlashCaptureTasks(r2) != r12) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c5 A[Catch: all -> 0x003e, TryCatch #3 {all -> 0x003e, blocks: (B:14:0x0039, B:15:0x00bb, B:17:0x00c5, B:18:0x00c8), top: B:13:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeScreenFlashPreCaptureTasks(int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.camera.camera2.impl.CapturePipelineImpl$invokeScreenFlashPreCaptureTasks$1 capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1;
        int i2;
        int i3;
        java.lang.AutoCloseable autoCloseable;
        long j;
        java.lang.AutoCloseable autoCloseable2;
        java.lang.AutoCloseable autoCloseable3;
        java.lang.Throwable th;
        if (continuation instanceof androidx.camera.camera2.impl.CapturePipelineImpl$invokeScreenFlashPreCaptureTasks$1) {
            capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1 = (androidx.camera.camera2.impl.CapturePipelineImpl$invokeScreenFlashPreCaptureTasks$1) continuation;
            if ((capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.getHighSpeedVideoSizes;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.camera.camera2.impl.FlashControl flashControl = this.getHighSpeedVideoFpsRanges;
                    i3 = i;
                    capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.Camera2StreamConfigurationMap = i3;
                    capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.getHighSpeedVideoSizes = 1;
                } else if (i2 == 1) {
                    i3 = capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            autoCloseable3 = (java.lang.AutoCloseable) capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.getHighResolutionOutputSizeshNQ4ISI;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                    java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                                }
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable3, null);
                                return kotlin.Unit.INSTANCE;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                autoCloseable2 = autoCloseable3;
                                th = th;
                                try {
                                    throw th;
                                } catch (java.lang.Throwable th3) {
                                    kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable2, th);
                                    throw th3;
                                }
                            }
                        }
                        autoCloseable2 = (java.lang.AutoCloseable) capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.getHighResolutionOutputSizeshNQ4ISI;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            autoCloseable = autoCloseable2;
                            capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.getHighResolutionOutputSizeshNQ4ISI = autoCloseable;
                            capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.getHighSpeedVideoSizes = 4;
                            obj = ((kotlinx.coroutines.Deferred) obj).await(capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1);
                            if (obj != coroutine_suspended) {
                                autoCloseable3 = autoCloseable;
                                androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                }
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable3, null);
                                return kotlin.Unit.INSTANCE;
                            }
                            return coroutine_suspended;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            th = th;
                            throw th;
                        }
                    }
                    i3 = capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    autoCloseable = (java.lang.AutoCloseable) obj;
                    try {
                        androidx.camera.camera2.pipe.CameraGraph.Session session = (androidx.camera.camera2.pipe.CameraGraph.Session) autoCloseable;
                        androidx.camera.camera2.impl.Camera2Logger camera2Logger3 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                            java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                        }
                        j = androidx.camera.camera2.impl.CapturePipelineKt.getHighSpeedVideoFpsRanges;
                        boolean z = i3 == 0;
                        capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.getHighResolutionOutputSizeshNQ4ISI = autoCloseable;
                        capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.getHighSpeedVideoSizes = 3;
                        obj = androidx.camera.camera2.pipe.CameraGraph.Session.lock3AForCapture$default(session, z, true, 0, j, capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1, 4, null);
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        autoCloseable2 = autoCloseable;
                        th = th;
                        throw th;
                    }
                }
                androidx.camera.camera2.pipe.CameraGraph graph = this.getOutputMinFrameDuration.getGraph();
                capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.Camera2StreamConfigurationMap = i3;
                capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.getHighSpeedVideoSizes = 2;
                obj = graph.acquireSession(capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1);
            }
        }
        capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1 = new androidx.camera.camera2.impl.CapturePipelineImpl$invokeScreenFlashPreCaptureTasks$1(this, continuation);
        java.lang.Object obj2 = capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.getHighSpeedVideoSizes;
        if (i2 != 0) {
        }
        androidx.camera.camera2.pipe.CameraGraph graph2 = this.getOutputMinFrameDuration.getGraph();
        capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.Camera2StreamConfigurationMap = i3;
        capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1.getHighSpeedVideoSizes = 2;
        obj2 = graph2.acquireSession(capturePipelineImpl$invokeScreenFlashPreCaptureTasks$1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0075, code lost:
    
        if (r10 == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005a, code lost:
    
        if (r10.stopScreenFlashCaptureTasks(r0) != r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009e A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0032, B:14:0x0096, B:16:0x009e, B:17:0x00a1), top: B:12:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeScreenFlashPostCaptureTasks(int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.camera.camera2.impl.CapturePipelineImpl$invokeScreenFlashPostCaptureTasks$1 capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1;
        int i2;
        java.lang.Throwable th;
        java.lang.AutoCloseable autoCloseable;
        if (continuation instanceof androidx.camera.camera2.impl.CapturePipelineImpl$invokeScreenFlashPostCaptureTasks$1) {
            capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1 = (androidx.camera.camera2.impl.CapturePipelineImpl$invokeScreenFlashPostCaptureTasks$1) continuation;
            if ((capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.getHighSpeedVideoFpsRanges;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.camera.camera2.impl.FlashControl flashControl = this.getHighSpeedVideoFpsRanges;
                    capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.getHighSpeedVideoSizes = i;
                    capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.getHighSpeedVideoFpsRanges = 1;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            autoCloseable = (java.lang.AutoCloseable) capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.getHighSpeedVideoFpsRangesFor;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                    java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                                }
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable, null);
                                return kotlin.Unit.INSTANCE;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                try {
                                    throw th;
                                } catch (java.lang.Throwable th3) {
                                    kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable, th);
                                    throw th3;
                                }
                            }
                        }
                        i = capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.lang.AutoCloseable autoCloseable2 = (java.lang.AutoCloseable) obj;
                        try {
                            androidx.camera.camera2.pipe.CameraGraph.Session session = (androidx.camera.camera2.pipe.CameraGraph.Session) autoCloseable2;
                            androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                            }
                            boolean z = i == 0;
                            capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.getHighSpeedVideoFpsRangesFor = autoCloseable2;
                            capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.getHighSpeedVideoFpsRanges = 3;
                            if (session.unlock3APostCapture(z, capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1) != coroutine_suspended) {
                                autoCloseable = autoCloseable2;
                                androidx.camera.camera2.impl.Camera2Logger camera2Logger3 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                }
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable, null);
                                return kotlin.Unit.INSTANCE;
                            }
                            return coroutine_suspended;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            autoCloseable = autoCloseable2;
                            throw th;
                        }
                    }
                    i = capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                androidx.camera.camera2.impl.Camera2Logger camera2Logger4 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused3 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
                androidx.camera.camera2.pipe.CameraGraph graph = this.getOutputMinFrameDuration.getGraph();
                capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.getHighSpeedVideoSizes = i;
                capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.getHighSpeedVideoFpsRanges = 2;
                obj = graph.acquireSession(capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1);
            }
        }
        capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1 = new androidx.camera.camera2.impl.CapturePipelineImpl$invokeScreenFlashPostCaptureTasks$1(this, continuation);
        java.lang.Object obj2 = capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.getHighSpeedVideoFpsRanges;
        if (i2 != 0) {
        }
        androidx.camera.camera2.impl.Camera2Logger camera2Logger42 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
        }
        androidx.camera.camera2.pipe.CameraGraph graph2 = this.getOutputMinFrameDuration.getGraph();
        capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.getHighSpeedVideoSizes = i;
        capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1.getHighSpeedVideoFpsRanges = 2;
        obj2 = graph2.acquireSession(capturePipelineImpl$invokeScreenFlashPostCaptureTasks$1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(4:(2:3|(10:5|6|(1:(1:(1:(2:11|12)(2:14|15))(8:16|17|18|19|20|21|22|(1:25)(1:24)))(1:38))(2:54|(1:56)(2:57|58))|39|40|41|42|43|44|(5:46|20|21|22|(0)(0))(1:47)))|43|44|(0)(0))|59|6|(0)(0)|39|40|41|42|(2:(1:32)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d3, code lost:
    
        r2 = r0;
        r3 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(long j, boolean z, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.Result3A> continuation) {
        androidx.camera.camera2.impl.CapturePipelineImpl$lockAf$1 capturePipelineImpl$lockAf$1;
        int i;
        final boolean z2;
        long j2;
        java.lang.AutoCloseable autoCloseable;
        java.lang.Throwable th;
        java.lang.AutoCloseable autoCloseable2;
        long j3;
        java.lang.Object obj;
        java.lang.Object m385lock3AtS25XM$default;
        java.lang.AutoCloseable autoCloseable3;
        try {
            if (continuation instanceof androidx.camera.camera2.impl.CapturePipelineImpl$lockAf$1) {
                capturePipelineImpl$lockAf$1 = (androidx.camera.camera2.impl.CapturePipelineImpl$lockAf$1) continuation;
                if ((capturePipelineImpl$lockAf$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    capturePipelineImpl$lockAf$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj2 = capturePipelineImpl$lockAf$1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = capturePipelineImpl$lockAf$1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        androidx.camera.camera2.pipe.CameraGraph graph = this.getOutputMinFrameDuration.getGraph();
                        capturePipelineImpl$lockAf$1.getHighResolutionOutputSizeshNQ4ISI = j;
                        z2 = z;
                        capturePipelineImpl$lockAf$1.getHighSpeedVideoFpsRanges = z2;
                        capturePipelineImpl$lockAf$1.getHighSpeedVideoFpsRangesFor = 1;
                        obj2 = graph.acquireSession(capturePipelineImpl$lockAf$1);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        j2 = j;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                                return obj2;
                            }
                            autoCloseable2 = (java.lang.AutoCloseable) capturePipelineImpl$lockAf$1.getHighSpeedVideoSizes;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                autoCloseable3 = autoCloseable2;
                                m385lock3AtS25XM$default = obj2;
                                obj = coroutine_suspended;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                th = th;
                                try {
                                    throw th;
                                } catch (java.lang.Throwable th3) {
                                    kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable2, th);
                                    throw th3;
                                }
                            }
                            try {
                                kotlinx.coroutines.Deferred deferred = (kotlinx.coroutines.Deferred) m385lock3AtS25XM$default;
                                kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable3, null);
                                capturePipelineImpl$lockAf$1.getHighSpeedVideoSizes = null;
                                capturePipelineImpl$lockAf$1.getHighSpeedVideoFpsRangesFor = 3;
                                java.lang.Object await = deferred.await(capturePipelineImpl$lockAf$1);
                                return await != obj ? obj : await;
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                autoCloseable2 = autoCloseable3;
                                th = th;
                                throw th;
                            }
                        }
                        z2 = capturePipelineImpl$lockAf$1.getHighSpeedVideoFpsRanges;
                        long j4 = capturePipelineImpl$lockAf$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        j2 = j4;
                    }
                    autoCloseable = (java.lang.AutoCloseable) obj2;
                    androidx.camera.camera2.pipe.CameraGraph.Session session = (androidx.camera.camera2.pipe.CameraGraph.Session) autoCloseable;
                    androidx.camera.camera2.pipe.Lock3ABehavior m524boximpl = androidx.camera.camera2.pipe.Lock3ABehavior.m524boximpl(androidx.camera.camera2.pipe.Lock3ABehavior.INSTANCE.m530getAFTER_CURRENT_SCANhRqSH3k());
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.camera.camera2.impl.CapturePipelineImpl$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj3) {
                            return java.lang.Boolean.valueOf(androidx.camera.camera2.impl.CapturePipelineImpl.$r8$lambda$u8rpfFcSEU3zva8xfZhpabtQWUM(androidx.camera.camera2.impl.CapturePipelineImpl.this, z2, (androidx.camera.camera2.pipe.FrameMetadata) obj3));
                        }
                    };
                    j3 = androidx.camera.camera2.impl.CapturePipelineKt.getHighSpeedVideoFpsRangesFor;
                    capturePipelineImpl$lockAf$1.getHighSpeedVideoSizes = autoCloseable;
                    capturePipelineImpl$lockAf$1.getHighSpeedVideoFpsRangesFor = 2;
                    obj = coroutine_suspended;
                    m385lock3AtS25XM$default = androidx.camera.camera2.pipe.CameraGraph.Session.m385lock3AtS25XM$default(session, null, null, null, null, null, null, null, m524boximpl, null, null, function1, null, 0, j2, j3, capturePipelineImpl$lockAf$1, 6719, null);
                    if (m385lock3AtS25XM$default != obj) {
                        return obj;
                    }
                    autoCloseable3 = autoCloseable;
                    kotlinx.coroutines.Deferred deferred2 = (kotlinx.coroutines.Deferred) m385lock3AtS25XM$default;
                    kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable3, null);
                    capturePipelineImpl$lockAf$1.getHighSpeedVideoSizes = null;
                    capturePipelineImpl$lockAf$1.getHighSpeedVideoFpsRangesFor = 3;
                    java.lang.Object await2 = deferred2.await(capturePipelineImpl$lockAf$1);
                    if (await2 != obj) {
                    }
                }
            }
            m385lock3AtS25XM$default = androidx.camera.camera2.pipe.CameraGraph.Session.m385lock3AtS25XM$default(session, null, null, null, null, null, null, null, m524boximpl, null, null, function1, null, 0, j2, j3, capturePipelineImpl$lockAf$1, 6719, null);
            if (m385lock3AtS25XM$default != obj) {
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
            autoCloseable2 = autoCloseable;
            th = th;
            throw th;
        }
        capturePipelineImpl$lockAf$1 = new androidx.camera.camera2.impl.CapturePipelineImpl$lockAf$1(this, continuation);
        java.lang.Object obj22 = capturePipelineImpl$lockAf$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = capturePipelineImpl$lockAf$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        autoCloseable = (java.lang.AutoCloseable) obj22;
        androidx.camera.camera2.pipe.CameraGraph.Session session2 = (androidx.camera.camera2.pipe.CameraGraph.Session) autoCloseable;
        androidx.camera.camera2.pipe.Lock3ABehavior m524boximpl2 = androidx.camera.camera2.pipe.Lock3ABehavior.m524boximpl(androidx.camera.camera2.pipe.Lock3ABehavior.INSTANCE.m530getAFTER_CURRENT_SCANhRqSH3k());
        kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: androidx.camera.camera2.impl.CapturePipelineImpl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return java.lang.Boolean.valueOf(androidx.camera.camera2.impl.CapturePipelineImpl.$r8$lambda$u8rpfFcSEU3zva8xfZhpabtQWUM(androidx.camera.camera2.impl.CapturePipelineImpl.this, z2, (androidx.camera.camera2.pipe.FrameMetadata) obj3));
            }
        };
        j3 = androidx.camera.camera2.impl.CapturePipelineKt.getHighSpeedVideoFpsRangesFor;
        capturePipelineImpl$lockAf$1.getHighSpeedVideoSizes = autoCloseable;
        capturePipelineImpl$lockAf$1.getHighSpeedVideoFpsRangesFor = 2;
        obj = coroutine_suspended2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.camera.core.impl.CameraCaptureResult getHighSpeedVideoFpsRanges(final androidx.camera.camera2.pipe.FrameMetadata frameMetadata) {
        return new androidx.camera.camera2.adapter.CaptureResultAdapter(this.getOutputStallDuration, frameMetadata.mo496getFrameNumberUgla2oM(), new androidx.camera.camera2.pipe.FrameInfo(frameMetadata, this) { // from class: androidx.camera.camera2.impl.CapturePipelineImpl$toCameraCaptureResult$frameInfo$1
            private final java.lang.String camera;
            private final long frameNumber;

            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
            private final androidx.camera.camera2.pipe.FrameMetadata getHighSpeedVideoFpsRanges;
            private final androidx.camera.camera2.pipe.FrameMetadata metadata;
            private final androidx.camera.camera2.pipe.RequestMetadata requestMetadata;

            {
                androidx.camera.camera2.impl.CapturePipelineImpl$emptyRequestMetadata$1 capturePipelineImpl$emptyRequestMetadata$1;
                this.getHighSpeedVideoFpsRanges = frameMetadata;
                this.metadata = frameMetadata;
                this.camera = frameMetadata.getCamera();
                this.frameNumber = frameMetadata.mo496getFrameNumberUgla2oM();
                capturePipelineImpl$emptyRequestMetadata$1 = this.getOutputStallDuration;
                this.requestMetadata = capturePipelineImpl$emptyRequestMetadata$1;
            }

            @Override // androidx.camera.camera2.pipe.FrameInfo
            public final androidx.camera.camera2.pipe.FrameMetadata getMetadata() {
                return this.metadata;
            }

            @Override // androidx.camera.camera2.pipe.FrameInfo
            /* renamed from: get-EfqyGwQ, reason: not valid java name */
            public final androidx.camera.camera2.pipe.FrameMetadata mo110getEfqyGwQ(java.lang.String camera) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(camera, "");
                return this.getHighSpeedVideoFpsRanges;
            }

            @Override // androidx.camera.camera2.pipe.FrameInfo
            /* renamed from: getCamera-Dz_R5H8, reason: not valid java name and from getter */
            public final java.lang.String getCamera() {
                return this.camera;
            }

            @Override // androidx.camera.camera2.pipe.FrameInfo
            /* renamed from: getFrameNumber-Ugla2oM, reason: not valid java name and from getter */
            public final long getFrameNumber() {
                return this.frameNumber;
            }

            @Override // androidx.camera.camera2.pipe.FrameInfo
            public final androidx.camera.camera2.pipe.RequestMetadata getRequestMetadata() {
                return this.requestMetadata;
            }

            @Override // androidx.camera.camera2.pipe.UnsafeWrapper
            public final <T> T unwrapAs(kotlin.reflect.KClass<T> type) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
                return null;
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x005f, code lost:
    
        if (r0 != r14) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(long j, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.Result3A> continuation) {
        androidx.camera.camera2.impl.CapturePipelineImpl$unlockAf$1 capturePipelineImpl$unlockAf$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        long j2;
        java.lang.AutoCloseable autoCloseable;
        java.lang.AutoCloseable autoCloseable2;
        java.lang.Throwable th;
        java.lang.AutoCloseable autoCloseable3;
        java.lang.AutoCloseable autoCloseable4;
        try {
            try {
                if (continuation instanceof androidx.camera.camera2.impl.CapturePipelineImpl$unlockAf$1) {
                    capturePipelineImpl$unlockAf$1 = (androidx.camera.camera2.impl.CapturePipelineImpl$unlockAf$1) continuation;
                    if ((capturePipelineImpl$unlockAf$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                        capturePipelineImpl$unlockAf$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                        obj = capturePipelineImpl$unlockAf$1.getHighSpeedVideoSizes;
                        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = capturePipelineImpl$unlockAf$1.getHighResolutionOutputSizeshNQ4ISI;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            androidx.camera.camera2.pipe.CameraGraph graph = this.getOutputMinFrameDuration.getGraph();
                            j2 = j;
                            capturePipelineImpl$unlockAf$1.Camera2StreamConfigurationMap = j2;
                            capturePipelineImpl$unlockAf$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                            obj = graph.acquireSession(capturePipelineImpl$unlockAf$1);
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    return obj;
                                }
                                autoCloseable4 = (java.lang.AutoCloseable) capturePipelineImpl$unlockAf$1.getHighSpeedVideoFpsRangesFor;
                                try {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    kotlinx.coroutines.Deferred deferred = (kotlinx.coroutines.Deferred) obj;
                                    kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable4, null);
                                    capturePipelineImpl$unlockAf$1.getHighSpeedVideoFpsRangesFor = null;
                                    capturePipelineImpl$unlockAf$1.getHighResolutionOutputSizeshNQ4ISI = 3;
                                    java.lang.Object await = deferred.await(capturePipelineImpl$unlockAf$1);
                                    return await != coroutine_suspended ? coroutine_suspended : await;
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    autoCloseable3 = autoCloseable4;
                                    try {
                                        throw th;
                                    } catch (java.lang.Throwable th3) {
                                        kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable3, th);
                                        throw th3;
                                    }
                                }
                            }
                            j2 = capturePipelineImpl$unlockAf$1.Camera2StreamConfigurationMap;
                            kotlin.ResultKt.throwOnFailure(obj);
                        }
                        long j3 = j2;
                        autoCloseable = (java.lang.AutoCloseable) obj;
                        androidx.camera.camera2.pipe.CameraGraph.Session session = (androidx.camera.camera2.pipe.CameraGraph.Session) autoCloseable;
                        java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                        capturePipelineImpl$unlockAf$1.getHighSpeedVideoFpsRangesFor = autoCloseable;
                        capturePipelineImpl$unlockAf$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                        autoCloseable2 = autoCloseable;
                        obj = androidx.camera.camera2.pipe.CameraGraph.Session.unlock3A$default(session, null, boxBoolean, null, null, 0, j3, capturePipelineImpl$unlockAf$1, 29, null);
                        if (obj != coroutine_suspended) {
                            autoCloseable4 = autoCloseable2;
                            kotlinx.coroutines.Deferred deferred2 = (kotlinx.coroutines.Deferred) obj;
                            kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable4, null);
                            capturePipelineImpl$unlockAf$1.getHighSpeedVideoFpsRangesFor = null;
                            capturePipelineImpl$unlockAf$1.getHighResolutionOutputSizeshNQ4ISI = 3;
                            java.lang.Object await2 = deferred2.await(capturePipelineImpl$unlockAf$1);
                            if (await2 != coroutine_suspended) {
                            }
                        }
                    }
                }
                obj = androidx.camera.camera2.pipe.CameraGraph.Session.unlock3A$default(session, null, boxBoolean, null, null, 0, j3, capturePipelineImpl$unlockAf$1, 29, null);
                if (obj != coroutine_suspended) {
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                th = th;
                autoCloseable3 = autoCloseable2;
                throw th;
            }
            androidx.camera.camera2.pipe.CameraGraph.Session session2 = (androidx.camera.camera2.pipe.CameraGraph.Session) autoCloseable;
            java.lang.Boolean boxBoolean2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
            capturePipelineImpl$unlockAf$1.getHighSpeedVideoFpsRangesFor = autoCloseable;
            capturePipelineImpl$unlockAf$1.getHighResolutionOutputSizeshNQ4ISI = 2;
            autoCloseable2 = autoCloseable;
        } catch (java.lang.Throwable th5) {
            th = th5;
            autoCloseable2 = autoCloseable;
        }
        capturePipelineImpl$unlockAf$1 = new androidx.camera.camera2.impl.CapturePipelineImpl$unlockAf$1(this, continuation);
        obj = capturePipelineImpl$unlockAf$1.getHighSpeedVideoSizes;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = capturePipelineImpl$unlockAf$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        long j32 = j2;
        autoCloseable = (java.lang.AutoCloseable) obj;
    }

    private final java.util.List<kotlinx.coroutines.Deferred<java.lang.Void>> getHighSpeedVideoSizes(androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams p0) {
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            java.util.Objects.toString(p0.getHighSpeedVideoFpsRangesFor());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<androidx.camera.core.impl.CaptureConfig> highSpeedVideoFpsRangesFor = p0.getHighSpeedVideoFpsRangesFor();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<T> it = highSpeedVideoFpsRangesFor.iterator();
        while (true) {
            androidx.camera.camera2.pipe.Request request = null;
            if (!it.hasNext()) {
                break;
            }
            androidx.camera.core.impl.CaptureConfig captureConfig = (androidx.camera.core.impl.CaptureConfig) it.next();
            final kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            arrayList.add(CompletableDeferred$default);
            try {
                request = this.getHighSpeedVideoFpsRangesFor.m34mapToRequestnAberiA(captureConfig, p0.getGetHighResolutionOutputSizeshNQ4ISI(), p0.getGetHighSpeedVideoSizes(), kotlin.collections.CollectionsKt.listOf(new androidx.camera.camera2.pipe.Request.Listener() { // from class: androidx.camera.camera2.impl.CapturePipelineImpl$submitRequestInternal$requests$1$1
                    @Override // androidx.camera.camera2.pipe.Request.Listener
                    public final void onAborted(androidx.camera.camera2.pipe.Request request2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request2, "");
                        CompletableDeferred$default.completeExceptionally(new androidx.camera.core.ImageCaptureException(3, "Capture request is cancelled because camera is closed", null));
                    }

                    @Override // androidx.camera.camera2.pipe.Request.Listener
                    /* renamed from: onTotalCaptureResult-CcXjc1I */
                    public final void mo38onTotalCaptureResultCcXjc1I(androidx.camera.camera2.pipe.RequestMetadata requestMetadata, long frameNumber, androidx.camera.camera2.pipe.FrameInfo totalCaptureResult) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalCaptureResult, "");
                        CompletableDeferred$default.complete(null);
                    }

                    @Override // androidx.camera.camera2.pipe.Request.Listener
                    /* renamed from: onFailed-CcXjc1I */
                    public final void mo37onFailedCcXjc1I(androidx.camera.camera2.pipe.RequestMetadata requestMetadata, long frameNumber, androidx.camera.camera2.pipe.RequestFailure requestFailure) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestFailure, "");
                        kotlinx.coroutines.CompletableDeferred<java.lang.Void> completableDeferred = CompletableDeferred$default;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Capture request failed with reason ");
                        sb.append(requestFailure.getReason());
                        completableDeferred.completeExceptionally(new androidx.camera.core.ImageCaptureException(2, sb.toString(), null));
                    }
                }));
            } catch (java.lang.IllegalStateException e) {
                androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                java.lang.IllegalStateException illegalStateException = e;
                if (androidx.camera.core.Logger.isInfoEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Capture request failed with reason ");
                sb.append(e.getMessage());
                CompletableDeferred$default.completeExceptionally(new androidx.camera.core.ImageCaptureException(2, sb.toString(), illegalStateException));
            }
            if (request != null) {
                arrayList2.add(request);
            }
        }
        java.util.ArrayList arrayList3 = arrayList2;
        if (arrayList3.isEmpty()) {
            return arrayList;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoSizes.getSequentialScope(), null, null, new androidx.camera.camera2.impl.CapturePipelineImpl$submitRequestInternal$$inlined$confineLaunch$1(null, this, arrayList, arrayList3), 3, null);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (r6.intValue() != 4) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(int i, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        androidx.camera.camera2.impl.CapturePipelineImpl$isPhysicalFlashRequired$1 capturePipelineImpl$isPhysicalFlashRequired$1;
        int i2;
        androidx.camera.camera2.pipe.FrameMetadata frameMetadata;
        if (continuation instanceof androidx.camera.camera2.impl.CapturePipelineImpl$isPhysicalFlashRequired$1) {
            capturePipelineImpl$isPhysicalFlashRequired$1 = (androidx.camera.camera2.impl.CapturePipelineImpl$isPhysicalFlashRequired$1) continuation;
            if ((capturePipelineImpl$isPhysicalFlashRequired$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                capturePipelineImpl$isPhysicalFlashRequired$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = capturePipelineImpl$isPhysicalFlashRequired$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = capturePipelineImpl$isPhysicalFlashRequired$1.getHighSpeedVideoFpsRanges;
                boolean z = true;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (i == 0) {
                        capturePipelineImpl$isPhysicalFlashRequired$1.getHighSpeedVideoFpsRanges = 1;
                        obj = getHighSpeedVideoSizes(capturePipelineImpl$isPhysicalFlashRequired$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2 && i != 3) {
                                throw new java.lang.AssertionError(i);
                            }
                            z = false;
                        }
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                frameMetadata = (androidx.camera.camera2.pipe.FrameMetadata) obj;
                if (frameMetadata != null) {
                    android.hardware.camera2.CaptureResult.Key key = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
                    java.lang.Integer num = (java.lang.Integer) frameMetadata.get(key);
                    if (num != null) {
                    }
                }
                z = false;
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
            }
        }
        capturePipelineImpl$isPhysicalFlashRequired$1 = new androidx.camera.camera2.impl.CapturePipelineImpl$isPhysicalFlashRequired$1(this, continuation);
        java.lang.Object obj2 = capturePipelineImpl$isPhysicalFlashRequired$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = capturePipelineImpl$isPhysicalFlashRequired$1.getHighSpeedVideoFpsRanges;
        boolean z2 = true;
        if (i2 != 0) {
        }
        frameMetadata = (androidx.camera.camera2.pipe.FrameMetadata) obj2;
        if (frameMetadata != null) {
        }
        z2 = false;
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(long j, kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameInfo, java.lang.Boolean> function1, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.FrameInfo> continuation) {
        androidx.camera.camera2.impl.CapturePipelineImpl$waitForResult$1 capturePipelineImpl$waitForResult$1;
        java.lang.Object obj;
        int i;
        androidx.camera.camera2.impl.ResultListener resultListener;
        if (continuation instanceof androidx.camera.camera2.impl.CapturePipelineImpl$waitForResult$1) {
            capturePipelineImpl$waitForResult$1 = (androidx.camera.camera2.impl.CapturePipelineImpl$waitForResult$1) continuation;
            if ((capturePipelineImpl$waitForResult$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                capturePipelineImpl$waitForResult$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                obj = capturePipelineImpl$waitForResult$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = capturePipelineImpl$waitForResult$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.camera.camera2.impl.ResultListener resultListener2 = new androidx.camera.camera2.impl.ResultListener(j, function1);
                    this.getInputSizeshNQ4ISI.addListener(resultListener2, this.getHighSpeedVideoSizes.getSequentialExecutor());
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoSizes.getSequentialScope(), null, null, new androidx.camera.camera2.impl.CapturePipelineImpl$waitForResult$resultListener$1$1(resultListener2, this, null), 3, null);
                    long millis = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(j);
                    androidx.camera.camera2.impl.CapturePipelineImpl$waitForResult$3 capturePipelineImpl$waitForResult$3 = new androidx.camera.camera2.impl.CapturePipelineImpl$waitForResult$3(resultListener2, null);
                    capturePipelineImpl$waitForResult$1.getHighResolutionOutputSizeshNQ4ISI = resultListener2;
                    capturePipelineImpl$waitForResult$1.getHighSpeedVideoFpsRangesFor = 1;
                    java.lang.Object withTimeoutOrNull = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(millis, capturePipelineImpl$waitForResult$3, capturePipelineImpl$waitForResult$1);
                    if (withTimeoutOrNull == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = withTimeoutOrNull;
                    resultListener = resultListener2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    resultListener = (androidx.camera.camera2.impl.ResultListener) capturePipelineImpl$waitForResult$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (((androidx.camera.camera2.pipe.FrameInfo) obj) == null) {
                    this.getInputSizeshNQ4ISI.removeListener(resultListener);
                }
                return obj;
            }
        }
        capturePipelineImpl$waitForResult$1 = new androidx.camera.camera2.impl.CapturePipelineImpl$waitForResult$1(this, continuation);
        obj = capturePipelineImpl$waitForResult$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = capturePipelineImpl$waitForResult$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        if (((androidx.camera.camera2.pipe.FrameInfo) obj) == null) {
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoFpsRanges(int i, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        if (getTemplate() != 3 && i != 1) {
            return this.getHighSpeedVideoSizesFor.shouldUseTorchAsFlash(new androidx.camera.camera2.impl.CapturePipelineImpl$isTorchAsFlash$2(this, null), continuation);
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
    }

    public static /* synthetic */ boolean $r8$lambda$QUMNp0tfcXRSiLsQB0i9runZEEs(androidx.camera.camera2.pipe.FrameInfo frameInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameInfo, "");
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$u8rpfFcSEU3zva8xfZhpabtQWUM(androidx.camera.camera2.impl.CapturePipelineImpl capturePipelineImpl, boolean z, androidx.camera.camera2.pipe.FrameMetadata frameMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameMetadata, "");
        return androidx.camera.core.impl.ConvergenceUtils.is3AConverged(capturePipelineImpl.getHighSpeedVideoFpsRanges(frameMetadata), z);
    }
}
