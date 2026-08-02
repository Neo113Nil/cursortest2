package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u0084\u00012\u00020\u0001:\u0006\u0082\u0001\u0083\u0001\u0084\u0001BO\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010!\u001a\u00020\"*\u00020\"2\u0016\u0010#\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030%\u0012\u0004\u0012\u00020&0$2\u0006\u0010'\u001a\u00020(H\u0002J\u001e\u0010)\u001a\u00020\"*\u00020\"2\u0010\u0010*\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030%0+H\u0002J6\u0010/\u001a\b\u0012\u0004\u0012\u000201002\u0016\u0010#\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030%\u0012\u0004\u0012\u00020&0$2\u0006\u00102\u001a\u00020.2\u0006\u0010'\u001a\u00020(H\u0016J6\u00103\u001a\b\u0012\u0004\u0012\u000201002\u0016\u0010#\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030%\u0012\u0004\u0012\u00020&0$2\u0006\u00102\u001a\u00020.2\u0006\u0010'\u001a\u00020(H\u0016J<\u00104\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00102\u001a\u00020.2\u0016\u0010#\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030%\u0012\u0004\u0012\u00020&0$2\u0006\u0010'\u001a\u00020(H\u0082@¢\u0006\u0002\u00105J(\u00106\u001a\b\u0012\u0004\u0012\u000201002\u0010\u0010*\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030%0+2\u0006\u00102\u001a\u00020.H\u0016J$\u00107\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00108\u001a\u00020\u00122\f\u00109\u001a\b\u0012\u0004\u0012\u00020;0:H\u0016J*\u0010<\u001a\b\u0012\u0004\u0012\u000201002\u0006\u0010=\u001a\u00020>2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020&0$H\u0016J\u000e\u0010A\u001a\b\u0012\u0004\u0012\u00020B00H\u0016J\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020B002\u0006\u0010D\u001a\u00020EH\u0016¢\u0006\u0004\bF\u0010GJs\u0010H\u001a\b\u0012\u0004\u0012\u00020B002\u000e\u0010I\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010+2\u000e\u0010K\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010+2\u000e\u0010L\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010+2\b\u0010M\u001a\u0004\u0018\u00010N2\b\u0010O\u001a\u0004\u0018\u00010N2\b\u0010P\u001a\u0004\u0018\u00010N2\b\u0010Q\u001a\u0004\u0018\u00010E2\u0006\u0010R\u001a\u00020SH\u0016¢\u0006\u0002\bTJ\u000e\u0010U\u001a\b\u0012\u0004\u0012\u00020B00H\u0016J<\u0010V\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010W000+2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020Y0+2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020[2\u0006\u0010]\u001a\u00020[H\u0016J>\u0010^\u001a\b\u0012\u0004\u0012\u00020B002\u000e\u0010I\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010+2\u000e\u0010K\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010+2\u000e\u0010L\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010+H\u0016J\u000e\u0010_\u001a\u00020\u0012H\u0096@¢\u0006\u0002\u0010`J\b\u0010a\u001a\u000201H\u0016J&\u0010b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010W000+2\u0006\u0010c\u001a\u00020[2\u0006\u0010d\u001a\u00020@H\u0002J\u0012\u0010e\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00020Y0+H\u0002J\u0018\u0010f\u001a\u00020\"*\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\"0$H\u0002J\f\u0010g\u001a\u00020h*\u00020\"H\u0002J*\u0010i\u001a\b\u0012\u0004\u0012\u00020100*\u00020\"2\u0010\b\u0002\u0010j\u001a\n\u0012\u0004\u0012\u00020l\u0018\u00010kH\u0082@¢\u0006\u0002\u0010mJ$\u0010n\u001a\u0004\u0018\u0001Ho\"\u0004\b\u0000\u0010o2\f\u0010p\u001a\b\u0012\u0004\u0012\u0002Ho0qH\u0082\b¢\u0006\u0002\u0010rJ@\u0010s\u001a\b\u0012\u0004\u0012\u00020B002*\b\u0004\u0010p\u001a$\b\u0001\u0012\u0004\u0012\u00020u\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B000v\u0012\u0006\u0012\u0004\u0018\u00010&0tH\u0082H¢\u0006\u0002\u0010wJ=\u0010x\u001a\b\u0012\u0004\u0012\u0002Hy00\"\u0004\b\u0000\u0010y2\"\u0010p\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002Hy000v\u0012\u0006\u0012\u0004\u0018\u00010&0zH\u0002¢\u0006\u0002\u0010{JQ\u0010|\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002Hy000+\"\u0004\b\u0000\u0010y2\u0006\u0010}\u001a\u00020[2(\u0010p\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002Hy000+0v\u0012\u0006\u0012\u0004\u0018\u00010&0zH\u0002¢\u0006\u0002\u0010~J\u0013\u0010\u007f\u001a\u00030\u0080\u0001*\u00020\fH\u0000¢\u0006\u0003\b\u0081\u0001R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u0013\u001a\n \u0014*\u0004\u0018\u00010\u00040\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u0019\u001a\n \u0014*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u001d\u001a\n \u0014*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\"0-X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0085\u0001"}, d2 = {"Landroidx/camera/camera2/impl/UseCaseCameraRequestControlImpl;", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "capturePipelineProvider", "Ljavax/inject/Provider;", "Landroidx/camera/camera2/impl/CapturePipeline;", "useCaseCameraStateProvider", "Landroidx/camera/camera2/impl/UseCaseCameraState;", "useCaseGraphContext", "Landroidx/camera/camera2/config/UseCaseGraphContext;", "useCaseSurfaceManagerProvider", "Landroidx/camera/camera2/impl/UseCaseSurfaceManager;", "threads", "Landroidx/camera/camera2/impl/UseCaseThreads;", "cameraXConfig", "Landroidx/camera/core/CameraXConfig;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Landroidx/camera/camera2/config/UseCaseGraphContext;Ljavax/inject/Provider;Landroidx/camera/camera2/impl/UseCaseThreads;Landroidx/camera/core/CameraXConfig;)V", com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED, "", "capturePipeline", "kotlin.jvm.PlatformType", "getCapturePipeline", "()Landroidx/camera/camera2/impl/CapturePipeline;", "capturePipeline$delegate", "Lkotlin/Lazy;", "useCaseSurfaceManager", "getUseCaseSurfaceManager", "()Landroidx/camera/camera2/impl/UseCaseSurfaceManager;", "useCaseSurfaceManager$delegate", "useCaseCameraState", "getUseCaseCameraState", "()Landroidx/camera/camera2/impl/UseCaseCameraState;", "useCaseCameraState$delegate", "withParameters", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControlImpl$InfoBundle;", "values", "", "Landroid/hardware/camera2/CaptureRequest$Key;", "", "optionPriority", "Landroidx/camera/core/impl/Config$OptionPriority;", "withoutParameters", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "", "infoBundleMap", "", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl$Type;", "setParametersAsync", "Lkotlinx/coroutines/Deferred;", "", "type", "submitParameters", "setParametersInternal", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControl$Type;Ljava/util/Map;Landroidx/camera/core/impl/Config$OptionPriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeParametersAsync", "updateRepeatingRequestAsync", "isPrimary", "runningUseCases", "", "Landroidx/camera/core/UseCase;", "updateCamera2ConfigAsync", "config", "Landroidx/camera/core/impl/Config;", "tags", "", "setTorchOnAsync", "Landroidx/camera/camera2/pipe/Result3A;", "setTorchOffAsync", "aeMode", "Landroidx/camera/camera2/pipe/AeMode;", "setTorchOffAsync-MtizInI", "(I)Lkotlinx/coroutines/Deferred;", "startFocusAndMeteringAsync", "aeRegions", "Landroid/hardware/camera2/params/MeteringRectangle;", "afRegions", "awbRegions", "aeLockBehavior", "Landroidx/camera/camera2/pipe/Lock3ABehavior;", "afLockBehavior", "awbLockBehavior", "afTriggerStartAeMode", "timeLimitNs", "", "startFocusAndMeteringAsync-NxRnBj4", "cancelFocusAndMeteringAsync", "issueSingleCaptureAsync", "Ljava/lang/Void;", "captureSequence", "Landroidx/camera/core/impl/CaptureConfig;", "captureMode", "", "flashType", "flashMode", "update3aRegions", "awaitSurfaceSetup", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "failedResults", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "message", "hasInvalidSurface", "merge", "toTagBundle", "Landroidx/camera/core/impl/TagBundle;", "updateCameraStateAsync", "streams", "", "Landroidx/camera/camera2/pipe/StreamId;", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControlImpl$InfoBundle;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runIfNotClosed", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "useGraphSessionOrFailed", "Lkotlin/Function2;", "Landroidx/camera/camera2/pipe/CameraGraph$Session;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runOnSequential", "T", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Deferred;", "runOnSequentialList", io.ktor.http.ContentDisposition.Parameters.Size, "(ILkotlin/jvm/functions/Function1;)Ljava/util/List;", "determineStartStrategy", "Lkotlinx/coroutines/CoroutineStart;", "determineStartStrategy$camera_camera2", "InfoBundle", "Bindings", "Companion", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
@androidx.camera.camera2.config.UseCaseCameraScope
/* loaded from: classes6.dex */
public final class UseCaseCameraRequestControlImpl implements androidx.camera.camera2.impl.UseCaseCameraRequestControl {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.Companion INSTANCE = new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.Companion(null);
    private static final kotlinx.coroutines.CompletableDeferred<androidx.camera.camera2.pipe.Result3A> getHighSpeedVideoFpsRanges = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred(new androidx.camera.camera2.pipe.Result3A(androidx.camera.camera2.pipe.Result3A.Status.INSTANCE.m700getSUBMIT_FAILEDJvTi9ms(), null, 2, null));
    private static final kotlinx.coroutines.CompletableDeferred<kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    private final javax.inject.Provider<androidx.camera.camera2.impl.CapturePipeline> Camera2StreamConfigurationMap;
    private final androidx.camera.core.CameraXConfig getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.Lazy getHighSpeedVideoSizes;
    private final kotlin.Lazy getHighSpeedVideoSizesFor;
    private final javax.inject.Provider<androidx.camera.camera2.impl.UseCaseCameraState> getInputFormats;
    private volatile boolean getInputSizeshNQ4ISI;
    private final java.util.Map<androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type, androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.InfoBundle> getOutputFormats;
    private final androidx.camera.camera2.impl.UseCaseThreads getOutputMinFrameDuration;
    private final androidx.camera.camera2.config.UseCaseGraphContext getOutputMinFrameDurationlomOqCM;
    private final javax.inject.Provider<androidx.camera.camera2.impl.UseCaseSurfaceManager> getOutputSizes;
    private final kotlin.Lazy getOutputStallDurationlomOqCM;

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/impl/UseCaseCameraRequestControlImpl$Bindings;", "", "<init>", "()V", "Landroidx/camera/camera2/impl/DeferredUseCaseCameraRequestControl;", "requestControl", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "bindRequestControl", "(Landroidx/camera/camera2/impl/DeferredUseCaseCameraRequestControl;)Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @dagger.Module
    public static abstract class Bindings {
        @dagger.Binds
        @androidx.camera.camera2.config.UseCaseCameraScope
        public abstract androidx.camera.camera2.impl.UseCaseCameraRequestControl bindRequestControl(androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl requestControl);
    }

    @javax.inject.Inject
    public UseCaseCameraRequestControlImpl(javax.inject.Provider<androidx.camera.camera2.impl.CapturePipeline> provider, javax.inject.Provider<androidx.camera.camera2.impl.UseCaseCameraState> provider2, androidx.camera.camera2.config.UseCaseGraphContext useCaseGraphContext, javax.inject.Provider<androidx.camera.camera2.impl.UseCaseSurfaceManager> provider3, androidx.camera.camera2.impl.UseCaseThreads useCaseThreads, androidx.camera.core.CameraXConfig cameraXConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseGraphContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseThreads, "");
        this.Camera2StreamConfigurationMap = provider;
        this.getInputFormats = provider2;
        this.getOutputMinFrameDurationlomOqCM = useCaseGraphContext;
        this.getOutputSizes = provider3;
        this.getOutputMinFrameDuration = useCaseThreads;
        this.getHighResolutionOutputSizeshNQ4ISI = cameraXConfig;
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
        }
        this.getHighSpeedVideoSizes = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.camera.camera2.impl.CapturePipeline capturePipeline;
                capturePipeline = androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.this.Camera2StreamConfigurationMap.get();
                return capturePipeline;
            }
        });
        this.getOutputStallDurationlomOqCM = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.camera.camera2.impl.UseCaseSurfaceManager useCaseSurfaceManager;
                useCaseSurfaceManager = androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.this.getOutputSizes.get();
                return useCaseSurfaceManager;
            }
        });
        this.getHighSpeedVideoSizesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.camera.camera2.impl.UseCaseCameraState useCaseCameraState;
                useCaseCameraState = androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.this.getInputFormats.get();
                return useCaseCameraState;
            }
        });
        this.getOutputFormats = new java.util.LinkedHashMap();
    }

    public /* synthetic */ UseCaseCameraRequestControlImpl(javax.inject.Provider provider, javax.inject.Provider provider2, androidx.camera.camera2.config.UseCaseGraphContext useCaseGraphContext, javax.inject.Provider provider3, androidx.camera.camera2.impl.UseCaseThreads useCaseThreads, androidx.camera.core.CameraXConfig cameraXConfig, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(provider, provider2, useCaseGraphContext, provider3, useCaseThreads, (i & 32) != 0 ? null : cameraXConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.camera.camera2.impl.CapturePipeline Camera2StreamConfigurationMap() {
        return (androidx.camera.camera2.impl.CapturePipeline) this.getHighSpeedVideoSizes.getValue();
    }

    private final androidx.camera.camera2.impl.UseCaseSurfaceManager getHighSpeedVideoFpsRangesFor() {
        return (androidx.camera.camera2.impl.UseCaseSurfaceManager) this.getOutputStallDurationlomOqCM.getValue();
    }

    private final androidx.camera.camera2.impl.UseCaseCameraState getHighSpeedVideoSizes() {
        return (androidx.camera.camera2.impl.UseCaseCameraState) this.getHighSpeedVideoSizesFor.getValue();
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u0016\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010\n8\u0007@\u0007X\u0087\f¢\u0006\u0006\n\u0004\b\u0018\u0010 "}, d2 = {"Landroidx/camera/camera2/impl/UseCaseCameraRequestControlImpl$InfoBundle;", "", "Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;", "p0", "", "", "p1", "", "Landroidx/camera/camera2/pipe/Request$Listener;", "p2", "Landroidx/camera/camera2/pipe/RequestTemplate;", "p3", "<init>", "(Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;Ljava/util/Map;Ljava/util/Set;Landroidx/camera/camera2/pipe/RequestTemplate;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;", "getHighSpeedVideoFpsRangesFor", "()Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "getHighSpeedVideoSizes", "()Ljava/util/Map;", "Ljava/util/Set;", "()Ljava/util/Set;", "Landroidx/camera/camera2/pipe/RequestTemplate;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final /* data */ class InfoBundle {
        private final androidx.camera.camera2.impl.Camera2ImplConfig.Builder Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        androidx.camera.camera2.pipe.RequestTemplate getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.util.Set<androidx.camera.camera2.pipe.Request.Listener> getHighSpeedVideoFpsRangesFor;

        private InfoBundle(androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder, java.util.Map<java.lang.String, java.lang.Object> map, java.util.Set<androidx.camera.camera2.pipe.Request.Listener> set, androidx.camera.camera2.pipe.RequestTemplate requestTemplate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
            this.Camera2StreamConfigurationMap = builder;
            this.getHighSpeedVideoSizes = map;
            this.getHighSpeedVideoFpsRangesFor = set;
            this.getHighResolutionOutputSizeshNQ4ISI = requestTemplate;
        }

        public /* synthetic */ InfoBundle(androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder, java.util.LinkedHashMap linkedHashMap, java.util.LinkedHashSet linkedHashSet, androidx.camera.camera2.pipe.RequestTemplate requestTemplate, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new androidx.camera.camera2.impl.Camera2ImplConfig.Builder() : builder, (i & 2) != 0 ? new java.util.LinkedHashMap() : linkedHashMap, (i & 4) != 0 ? new java.util.LinkedHashSet() : linkedHashSet, (i & 8) != 0 ? null : requestTemplate, null);
        }

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from getter */
        public final androidx.camera.camera2.impl.Camera2ImplConfig.Builder getCamera2StreamConfigurationMap() {
            return this.Camera2StreamConfigurationMap;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoSizes() {
            return this.getHighSpeedVideoSizes;
        }

        public final java.util.Set<androidx.camera.camera2.pipe.Request.Listener> Camera2StreamConfigurationMap() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public static /* synthetic */ androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.InfoBundle getHighSpeedVideoFpsRanges(androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.InfoBundle infoBundle, androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder, java.util.Map map, java.util.Set set) {
            androidx.camera.camera2.pipe.RequestTemplate requestTemplate = infoBundle.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
            return new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.InfoBundle(builder, map, set, requestTemplate, null);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InfoBundle(Camera2StreamConfigurationMap=");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(", getHighSpeedVideoSizes=");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(", getHighSpeedVideoFpsRangesFor=");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.Camera2StreamConfigurationMap.hashCode();
            int hashCode2 = this.getHighSpeedVideoSizes.hashCode();
            int hashCode3 = this.getHighSpeedVideoFpsRangesFor.hashCode();
            androidx.camera.camera2.pipe.RequestTemplate requestTemplate = this.getHighResolutionOutputSizeshNQ4ISI;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (requestTemplate == null ? 0 : androidx.camera.camera2.pipe.RequestTemplate.m684hashCodeimpl(requestTemplate.m686unboximpl()));
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.InfoBundle)) {
                return false;
            }
            androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.InfoBundle infoBundle = (androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.InfoBundle) p0;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, infoBundle.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, infoBundle.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, infoBundle.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, infoBundle.getHighResolutionOutputSizeshNQ4ISI);
        }

        public /* synthetic */ InfoBundle(androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder, java.util.Map map, java.util.Set set, androidx.camera.camera2.pipe.RequestTemplate requestTemplate, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(builder, map, set, requestTemplate);
        }
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final kotlinx.coroutines.Deferred<kotlin.Unit> submitParameters(java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, ? extends java.lang.Object> values, androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type type, androidx.camera.core.impl.Config.OptionPriority optionPriority) {
        kotlinx.coroutines.Deferred<kotlin.Unit> async$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optionPriority, "");
        if (this.getInputSizeshNQ4ISI) {
            return getHighSpeedVideoFpsRangesFor;
        }
        this.getOutputMinFrameDuration.checkOnSequentialThread();
        async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(this.getOutputMinFrameDuration.getSequentialScope(), null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$submitParameters$1(this, type, values, optionPriority, null), 1, null);
        return async$default;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final java.lang.Object awaitSurfaceSetup(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return getHighSpeedVideoFpsRangesFor().awaitSetupCompletion(continuation);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final void close() {
        this.getInputSizeshNQ4ISI = true;
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
        }
        getHighSpeedVideoSizes().close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.util.List<kotlinx.coroutines.Deferred<java.lang.Void>> getHighSpeedVideoFpsRanges(int i, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            CompletableDeferred$default.completeExceptionally(new androidx.camera.core.ImageCaptureException(2, str, null));
            arrayList.add(CompletableDeferred$default);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.InfoBundle Camera2StreamConfigurationMap(java.util.Map<androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type, androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.InfoBundle> map) {
        androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.InfoBundle infoBundle = new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.InfoBundle(null, null, null, androidx.camera.camera2.pipe.RequestTemplate.m679boximpl(androidx.camera.camera2.pipe.RequestTemplate.m680constructorimpl(1)), 7, null);
        java.util.Iterator<E> it = androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type.getEntries().iterator();
        while (it.hasNext()) {
            androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.InfoBundle infoBundle2 = map.get((androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type) it.next());
            if (infoBundle2 != null) {
                infoBundle.getCamera2StreamConfigurationMap().insertAllOptions(infoBundle2.getCamera2StreamConfigurationMap().getMutableConfig());
                infoBundle.getHighSpeedVideoSizes().putAll(infoBundle2.getHighSpeedVideoSizes());
                infoBundle.Camera2StreamConfigurationMap().addAll(infoBundle2.Camera2StreamConfigurationMap());
                androidx.camera.camera2.pipe.RequestTemplate requestTemplate = infoBundle2.getHighResolutionOutputSizeshNQ4ISI;
                if (requestTemplate != null) {
                    infoBundle.getHighResolutionOutputSizeshNQ4ISI = androidx.camera.camera2.pipe.RequestTemplate.m679boximpl(requestTemplate.m686unboximpl());
                }
            }
        }
        return infoBundle;
    }

    private static androidx.camera.core.impl.TagBundle getHighResolutionOutputSizeshNQ4ISI(androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.InfoBundle infoBundle) {
        androidx.camera.core.impl.MutableTagBundle create = androidx.camera.core.impl.MutableTagBundle.create();
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : infoBundle.getHighSpeedVideoSizes().entrySet()) {
            create.putTag(entry.getKey(), entry.getValue());
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.InfoBundle infoBundle, java.util.Set<androidx.camera.camera2.pipe.StreamId> set, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<kotlin.Unit>> continuation) {
        androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$updateCameraStateAsync$1 useCaseCameraRequestControlImpl$updateCameraStateAsync$1;
        int i;
        kotlinx.coroutines.Deferred deferred;
        int i2;
        androidx.camera.camera2.interop.Camera2CaptureRequestConfigurator camera2CaptureRequestConfigurator;
        if (continuation instanceof androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$updateCameraStateAsync$1) {
            useCaseCameraRequestControlImpl$updateCameraStateAsync$1 = (androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$updateCameraStateAsync$1) continuation;
            if ((useCaseCameraRequestControlImpl$updateCameraStateAsync$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                useCaseCameraRequestControlImpl$updateCameraStateAsync$1.getHighSpeedVideoFpsRanges -= 2147483648;
                androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$updateCameraStateAsync$1 useCaseCameraRequestControlImpl$updateCameraStateAsync$12 = useCaseCameraRequestControlImpl$updateCameraStateAsync$1;
                java.lang.Object obj = useCaseCameraRequestControlImpl$updateCameraStateAsync$12.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = useCaseCameraRequestControlImpl$updateCameraStateAsync$12.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (this.getInputSizeshNQ4ISI) {
                        deferred = null;
                        return deferred == null ? getHighSpeedVideoFpsRangesFor : deferred;
                    }
                    androidx.camera.core.CameraXConfig cameraXConfig = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (cameraXConfig != null && (camera2CaptureRequestConfigurator = androidx.camera.camera2.interop.Camera2CaptureRequestConfiguratorKt.getCamera2CaptureRequestConfigurator(cameraXConfig)) != null) {
                        androidx.camera.camera2.interop.Camera2CaptureRequestConfiguratorKt.configureWithUnchecked(camera2CaptureRequestConfigurator, kotlin.collections.MapsKt.toMap(androidx.camera.camera2.impl.Camera2ImplConfigKt.toParameters(infoBundle.getCamera2StreamConfigurationMap().build())));
                    }
                    androidx.camera.camera2.impl.CapturePipeline Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
                    androidx.camera.camera2.pipe.RequestTemplate requestTemplate = infoBundle.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(requestTemplate);
                    if (requestTemplate.m686unboximpl() != -1) {
                        androidx.camera.camera2.pipe.RequestTemplate requestTemplate2 = infoBundle.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(requestTemplate2);
                        i2 = requestTemplate2.m686unboximpl();
                    } else {
                        i2 = 1;
                    }
                    Camera2StreamConfigurationMap.setTemplate(i2);
                    androidx.camera.camera2.impl.UseCaseCameraState highSpeedVideoSizes = getHighSpeedVideoSizes();
                    java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, ? extends java.lang.Object> parameters = androidx.camera.camera2.impl.Camera2ImplConfigKt.toParameters(infoBundle.getCamera2StreamConfigurationMap().build());
                    java.util.Map<androidx.camera.camera2.pipe.Metadata.Key<?>, ? extends java.lang.Object> mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(androidx.camera.camera2.impl.TagsKt.getCAMERAX_TAG_BUNDLE(), getHighResolutionOutputSizeshNQ4ISI(infoBundle)));
                    androidx.camera.camera2.pipe.RequestTemplate requestTemplate3 = infoBundle.getHighResolutionOutputSizeshNQ4ISI;
                    java.util.Set<androidx.camera.camera2.pipe.Request.Listener> Camera2StreamConfigurationMap2 = infoBundle.Camera2StreamConfigurationMap();
                    useCaseCameraRequestControlImpl$updateCameraStateAsync$12.getHighSpeedVideoFpsRanges = 1;
                    obj = highSpeedVideoSizes.m143updateAsyncTp9XwKQ(parameters, false, mapOf, false, set, requestTemplate3, Camera2StreamConfigurationMap2, useCaseCameraRequestControlImpl$updateCameraStateAsync$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                deferred = (kotlinx.coroutines.Deferred) obj;
                if (deferred == null) {
                }
            }
        }
        useCaseCameraRequestControlImpl$updateCameraStateAsync$1 = new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$updateCameraStateAsync$1(this, continuation);
        androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$updateCameraStateAsync$1 useCaseCameraRequestControlImpl$updateCameraStateAsync$122 = useCaseCameraRequestControlImpl$updateCameraStateAsync$1;
        java.lang.Object obj2 = useCaseCameraRequestControlImpl$updateCameraStateAsync$122.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = useCaseCameraRequestControlImpl$updateCameraStateAsync$122.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        deferred = (kotlinx.coroutines.Deferred) obj2;
        if (deferred == null) {
        }
    }

    private final <T> kotlinx.coroutines.Deferred<T> getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends T>>, ? extends java.lang.Object> function1) {
        kotlinx.coroutines.CoroutineStart determineStartStrategy$camera_camera2 = determineStartStrategy$camera_camera2(this.getOutputMinFrameDuration);
        androidx.camera.camera2.impl.UseCaseThreads useCaseThreads = this.getOutputMinFrameDuration;
        kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(useCaseThreads.getSequentialScope(), null, determineStartStrategy$camera_camera2, new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$runOnSequential$$inlined$confineDeferredSuspend$1(function1, CompletableDeferred$default, null), 1, null);
        return CompletableDeferred$default;
    }

    public final kotlinx.coroutines.CoroutineStart determineStartStrategy$camera_camera2(androidx.camera.camera2.impl.UseCaseThreads useCaseThreads) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseThreads, "");
        return useCaseThreads.isOnSequentialThread() ? kotlinx.coroutines.CoroutineStart.UNDISPATCHED : kotlinx.coroutines.CoroutineStart.DEFAULT;
    }

    @kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b*\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0015\u001a\u00020\u0012*\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019"}, d2 = {"Landroidx/camera/camera2/impl/UseCaseCameraRequestControlImpl$Companion;", "", "<init>", "()V", "Landroidx/camera/core/impl/SessionConfig;", "Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;", "extractCamera2ImplConfigBuilder", "(Landroidx/camera/core/impl/SessionConfig;)Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;", "", "", "extractTags", "(Landroidx/camera/core/impl/SessionConfig;)Ljava/util/Map;", "Ljava/util/concurrent/Executor;", "callbackExecutor", "", "Landroidx/camera/camera2/pipe/Request$Listener;", "extractListeners", "(Landroidx/camera/core/impl/SessionConfig;Ljava/util/concurrent/Executor;)Ljava/util/Set;", "Landroidx/camera/camera2/pipe/RequestTemplate;", "extractTemplate-ARED-Gk", "(Landroidx/camera/core/impl/SessionConfig;)I", "extractTemplate", "Lkotlinx/coroutines/CompletableDeferred;", "Landroidx/camera/camera2/pipe/Result3A;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/CompletableDeferred;", "Camera2StreamConfigurationMap", "", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.camera.camera2.impl.Camera2ImplConfig.Builder extractCamera2ImplConfigBuilder(androidx.camera.core.impl.SessionConfig sessionConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfig, "");
            androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder = new androidx.camera.camera2.impl.Camera2ImplConfig.Builder();
            if (!kotlin.jvm.internal.Intrinsics.areEqual(sessionConfig.getExpectedFrameRateRange(), androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
                android.hardware.camera2.CaptureRequest.Key key = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
                builder.setCaptureRequestOption(key, sessionConfig.getExpectedFrameRateRange());
            }
            androidx.camera.core.impl.Config implementationOptions = sessionConfig.getImplementationOptions();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(implementationOptions, "");
            builder.insertAllOptions(implementationOptions);
            return builder;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> extractTags(androidx.camera.core.impl.SessionConfig sessionConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfig, "");
            androidx.camera.core.impl.TagBundle tagBundle = sessionConfig.getRepeatingCaptureConfig().getTagBundle();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tagBundle, "");
            return kotlin.collections.MapsKt.toMutableMap(androidx.camera.camera2.impl.UseCaseCameraRequestControlKt.toMap(tagBundle));
        }

        public final java.util.Set<androidx.camera.camera2.pipe.Request.Listener> extractListeners(androidx.camera.core.impl.SessionConfig sessionConfig, java.util.concurrent.Executor executor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
            androidx.camera.camera2.impl.CameraCallbackMap.Companion companion = androidx.camera.camera2.impl.CameraCallbackMap.INSTANCE;
            java.util.List<androidx.camera.core.impl.CameraCaptureCallback> repeatingCameraCaptureCallbacks = sessionConfig.getRepeatingCameraCaptureCallbacks();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(repeatingCameraCaptureCallbacks, "");
            return kotlin.collections.SetsKt.mutableSetOf(companion.createFor(repeatingCameraCaptureCallbacks, executor));
        }

        /* renamed from: extractTemplate-ARED-Gk, reason: not valid java name */
        public final int m141extractTemplateAREDGk(androidx.camera.core.impl.SessionConfig sessionConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfig, "");
            return androidx.camera.camera2.pipe.RequestTemplate.m680constructorimpl(sessionConfig.getTemplateType());
        }

        public static final /* synthetic */ androidx.camera.camera2.impl.Camera2ImplConfig.Builder access$extractCamera2ImplConfigBuilder(androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.Companion companion, androidx.camera.core.impl.Config config) {
            androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder = new androidx.camera.camera2.impl.Camera2ImplConfig.Builder();
            builder.insertAllOptions(config);
            return builder;
        }

        public static final /* synthetic */ androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.InfoBundle access$toInfoBundle(androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.Companion companion, androidx.camera.core.impl.SessionConfig sessionConfig, java.util.concurrent.Executor executor) {
            return new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.InfoBundle(companion.extractCamera2ImplConfigBuilder(sessionConfig), companion.extractTags(sessionConfig), companion.extractListeners(sessionConfig, executor), androidx.camera.camera2.pipe.RequestTemplate.m679boximpl(companion.m141extractTemplateAREDGk(sessionConfig)), null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        kotlinx.coroutines.CompletableDeferred<kotlin.Unit> CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) CompletableDeferred$default, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        getHighSpeedVideoFpsRangesFor = CompletableDeferred$default;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final kotlinx.coroutines.Deferred<kotlin.Unit> setParametersAsync(java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, ? extends java.lang.Object> values, androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type type, androidx.camera.core.impl.Config.OptionPriority optionPriority) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optionPriority, "");
        kotlinx.coroutines.Deferred<kotlin.Unit> highSpeedVideoFpsRangesFor = !this.getInputSizeshNQ4ISI ? getHighSpeedVideoFpsRangesFor(new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$setParametersAsync$1$1(this, type, values, optionPriority, null)) : null;
        return highSpeedVideoFpsRangesFor == null ? getHighSpeedVideoFpsRangesFor : highSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final kotlinx.coroutines.Deferred<kotlin.Unit> removeParametersAsync(java.util.List<? extends android.hardware.camera2.CaptureRequest.Key<?>> keys, androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keys, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlinx.coroutines.Deferred<kotlin.Unit> highSpeedVideoFpsRangesFor = this.getInputSizeshNQ4ISI ? null : getHighSpeedVideoFpsRangesFor(new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$removeParametersAsync$1$1(this, type, keys, null));
        return highSpeedVideoFpsRangesFor == null ? getHighSpeedVideoFpsRangesFor : highSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final kotlinx.coroutines.Deferred<kotlin.Unit> updateRepeatingRequestAsync(boolean isPrimary, java.util.Collection<? extends androidx.camera.core.UseCase> runningUseCases) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runningUseCases, "");
        kotlinx.coroutines.Deferred<kotlin.Unit> highSpeedVideoFpsRangesFor = this.getInputSizeshNQ4ISI ? null : getHighSpeedVideoFpsRangesFor(new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$updateRepeatingRequestAsync$1$1(runningUseCases, isPrimary, this, null));
        return highSpeedVideoFpsRangesFor == null ? getHighSpeedVideoFpsRangesFor : highSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final kotlinx.coroutines.Deferred<kotlin.Unit> updateCamera2ConfigAsync(androidx.camera.core.impl.Config config, java.util.Map<java.lang.String, ? extends java.lang.Object> tags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tags, "");
        kotlinx.coroutines.Deferred<kotlin.Unit> highSpeedVideoFpsRangesFor = this.getInputSizeshNQ4ISI ? null : getHighSpeedVideoFpsRangesFor(new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$updateCamera2ConfigAsync$1$1(this, config, tags, null));
        return highSpeedVideoFpsRangesFor == null ? getHighSpeedVideoFpsRangesFor : highSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> setTorchOnAsync() {
        kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> highSpeedVideoFpsRangesFor = this.getInputSizeshNQ4ISI ? null : getHighSpeedVideoFpsRangesFor(new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$setTorchOnAsync$1$1(this, null));
        return highSpeedVideoFpsRangesFor == null ? getHighSpeedVideoFpsRanges : highSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    /* renamed from: setTorchOffAsync-MtizInI */
    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> mo114setTorchOffAsyncMtizInI(int aeMode) {
        kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> highSpeedVideoFpsRangesFor = this.getInputSizeshNQ4ISI ? null : getHighSpeedVideoFpsRangesFor(new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$setTorchOffAsync$1$1(this, aeMode, null));
        return highSpeedVideoFpsRangesFor == null ? getHighSpeedVideoFpsRanges : highSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    /* renamed from: startFocusAndMeteringAsync-NxRnBj4 */
    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> mo115startFocusAndMeteringAsyncNxRnBj4(java.util.List<android.hardware.camera2.params.MeteringRectangle> aeRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> afRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> awbRegions, androidx.camera.camera2.pipe.Lock3ABehavior aeLockBehavior, androidx.camera.camera2.pipe.Lock3ABehavior afLockBehavior, androidx.camera.camera2.pipe.Lock3ABehavior awbLockBehavior, androidx.camera.camera2.pipe.AeMode afTriggerStartAeMode, long timeLimitNs) {
        kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> highSpeedVideoFpsRangesFor = !this.getInputSizeshNQ4ISI ? getHighSpeedVideoFpsRangesFor(new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$startFocusAndMeteringAsync$1$1(this, aeRegions, afRegions, awbRegions, aeLockBehavior, afLockBehavior, awbLockBehavior, afTriggerStartAeMode, timeLimitNs, null)) : null;
        return highSpeedVideoFpsRangesFor == null ? getHighSpeedVideoFpsRanges : highSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> cancelFocusAndMeteringAsync() {
        kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> highSpeedVideoFpsRangesFor = this.getInputSizeshNQ4ISI ? null : getHighSpeedVideoFpsRangesFor(new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$cancelFocusAndMeteringAsync$1$1(this, null));
        return highSpeedVideoFpsRangesFor == null ? getHighSpeedVideoFpsRanges : highSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final java.util.List<kotlinx.coroutines.Deferred<java.lang.Void>> issueSingleCaptureAsync(java.util.List<androidx.camera.core.impl.CaptureConfig> captureSequence, int captureMode, int flashType, int flashMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureSequence, "");
        java.util.ArrayList arrayList = null;
        if (!this.getInputSizeshNQ4ISI) {
            int size = captureSequence.size();
            androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$issueSingleCaptureAsync$1$1 useCaseCameraRequestControlImpl$issueSingleCaptureAsync$1$1 = new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$issueSingleCaptureAsync$1$1(this, captureSequence, captureMode, flashType, flashMode, null);
            kotlinx.coroutines.CoroutineStart determineStartStrategy$camera_camera2 = determineStartStrategy$camera_camera2(this.getOutputMinFrameDuration);
            androidx.camera.camera2.impl.UseCaseThreads useCaseThreads = this.getOutputMinFrameDuration;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList2.add(kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null));
            }
            java.util.ArrayList arrayList3 = arrayList2;
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(useCaseThreads.getSequentialScope(), null, determineStartStrategy$camera_camera2, new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$runOnSequentialList$$inlined$confineDeferredListSuspend$1(useCaseCameraRequestControlImpl$issueSingleCaptureAsync$1$1, arrayList3, null), 1, null);
            arrayList = arrayList3;
        }
        return arrayList == null ? getHighSpeedVideoFpsRanges(captureSequence.size(), "Capture request is cancelled on closed CameraGraph") : arrayList;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> update3aRegions(java.util.List<android.hardware.camera2.params.MeteringRectangle> aeRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> afRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> awbRegions) {
        kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> highSpeedVideoFpsRangesFor = !this.getInputSizeshNQ4ISI ? getHighSpeedVideoFpsRangesFor(new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$update3aRegions$1$1(this, aeRegions, afRegions, awbRegions, null)) : null;
        return highSpeedVideoFpsRangesFor == null ? getHighSpeedVideoFpsRanges : highSpeedVideoFpsRangesFor;
    }

    public static final /* synthetic */ boolean access$hasInvalidSurface(androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.CaptureConfig captureConfig = (androidx.camera.core.impl.CaptureConfig) it.next();
            if (captureConfig.getSurfaces().isEmpty()) {
                return true;
            }
            java.util.List<androidx.camera.core.impl.DeferrableSurface> surfaces = captureConfig.getSurfaces();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(surfaces, "");
            java.util.Iterator<T> it2 = surfaces.iterator();
            while (it2.hasNext()) {
                if (useCaseCameraRequestControlImpl.getOutputMinFrameDurationlomOqCM.getSurfaceToStreamMap().get((androidx.camera.core.impl.DeferrableSurface) it2.next()) == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final /* synthetic */ java.lang.Object access$setParametersInternal(androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type type, java.util.Map map, androidx.camera.core.impl.Config.OptionPriority optionPriority, kotlin.coroutines.Continuation continuation) {
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            java.util.Objects.toString(type);
            java.util.Objects.toString(map);
            java.util.Objects.toString(optionPriority);
        }
        java.util.Map<androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type, androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.InfoBundle> map2 = useCaseCameraRequestControlImpl.getOutputFormats;
        androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.InfoBundle infoBundle = map2.get(type);
        if (infoBundle == null) {
            infoBundle = new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.InfoBundle(null, null, null, null, 15, null);
            map2.put(type, infoBundle);
        }
        androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.InfoBundle infoBundle2 = infoBundle;
        java.util.Map<androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type, androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.InfoBundle> map3 = useCaseCameraRequestControlImpl.getOutputFormats;
        androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder = new androidx.camera.camera2.impl.Camera2ImplConfig.Builder();
        builder.insertAllOptions(infoBundle2.getCamera2StreamConfigurationMap().getMutableConfig());
        builder.addAllCaptureRequestOptionsWithPriority(map, optionPriority);
        map3.put(type, androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.InfoBundle.getHighSpeedVideoFpsRanges(infoBundle2, builder, kotlin.collections.MapsKt.toMutableMap(infoBundle2.getHighSpeedVideoSizes()), kotlin.collections.CollectionsKt.toMutableSet(infoBundle2.Camera2StreamConfigurationMap())));
        return useCaseCameraRequestControlImpl.Camera2StreamConfigurationMap(Camera2StreamConfigurationMap(useCaseCameraRequestControlImpl.getOutputFormats), null, continuation);
    }

    public static final /* synthetic */ androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.InfoBundle access$withoutParameters(androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.InfoBundle infoBundle, java.util.List list) {
        androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder = new androidx.camera.camera2.impl.Camera2ImplConfig.Builder();
        builder.insertAllOptions(infoBundle.getCamera2StreamConfigurationMap().getMutableConfig());
        builder.removeCaptureRequestOptions(list);
        return androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.InfoBundle.getHighSpeedVideoFpsRanges(infoBundle, builder, kotlin.collections.MapsKt.toMutableMap(infoBundle.getHighSpeedVideoSizes()), kotlin.collections.CollectionsKt.toMutableSet(infoBundle.Camera2StreamConfigurationMap()));
    }
}
