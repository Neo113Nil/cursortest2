package androidx.camera.camera2.impl;

@androidx.camera.camera2.config.CameraScope
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001GB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0010J\u0017\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00152\u0006\u0010 \u001a\u00020\u001fH\u0082@¢\u0006\u0004\b\u0018\u0010!J\u0010\u0010\"\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b#\u0010\u001eR\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010$R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u0010(\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u00102R(\u00108\u001a\u0004\u0018\u0001012\b\u00103\u001a\u0004\u0018\u0001018W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0016\u0010.\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u00109R*\u0010\u0012\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00118G@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u00109\u0012\u0004\b<\u0010\u0010\u001a\u0004\b:\u0010;R\u0018\u0010>\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u0010=R(\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010 \u001a\u0004\u0018\u00010\u00198G@BX\u0087\u000e¢\u0006\f\n\u0004\b\u001a\u0010=\u001a\u0004\b?\u0010@R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010A8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010BR0\u0010C\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00152\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u00158G@BX\u0087\u000e¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F"}, d2 = {"Landroidx/camera/camera2/impl/FlashControl;", "Landroidx/camera/camera2/impl/UseCaseCameraControl;", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "Landroidx/camera/camera2/impl/State3AControl;", "state3AControl", "Landroidx/camera/camera2/impl/UseCaseThreads;", "threads", "Landroidx/camera/camera2/impl/TorchControl;", "torchControl", "Landroidx/camera/camera2/compat/workaround/UseFlashModeTorchFor3aUpdate;", "useFlashModeTorchFor3aUpdate", "<init>", "(Landroidx/camera/camera2/impl/CameraProperties;Landroidx/camera/camera2/impl/State3AControl;Landroidx/camera/camera2/impl/UseCaseThreads;Landroidx/camera/camera2/impl/TorchControl;Landroidx/camera/camera2/compat/workaround/UseFlashModeTorchFor3aUpdate;)V", "", "reset", "()V", "", "flashMode", "", "cancelPreviousTask", "Lkotlinx/coroutines/Deferred;", "setFlashAsync", "(IZ)Lkotlinx/coroutines/Deferred;", "Camera2StreamConfigurationMap", "Landroidx/camera/core/ImageCapture$ScreenFlash;", "screenFlash", "setScreenFlash", "(Landroidx/camera/core/ImageCapture$ScreenFlash;)V", "startScreenFlashCaptureTasks", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "p0", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopScreenFlashCaptureTasks", "awaitFlashModeUpdate", "Landroidx/camera/camera2/impl/CameraProperties;", "getHighSpeedVideoSizesFor", "Landroidx/camera/camera2/impl/State3AControl;", "getHighResolutionOutputSizeshNQ4ISI", "getOutputMinFrameDuration", "Landroidx/camera/camera2/impl/UseCaseThreads;", "getHighSpeedVideoFpsRanges", "getOutputFormats", "Landroidx/camera/camera2/impl/TorchControl;", "getHighSpeedVideoFpsRangesFor", "getInputSizeshNQ4ISI", "Landroidx/camera/camera2/compat/workaround/UseFlashModeTorchFor3aUpdate;", "getHighSpeedVideoSizes", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getRequestControl", "()Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "setRequestControl", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;)V", "requestControl", com.visa.cbp.getEncExpo.warmup, "getFlashMode", "()I", "getFlashMode$annotations", "Landroidx/camera/core/ImageCapture$ScreenFlash;", "getInputFormats", "getScreenFlash", "()Landroidx/camera/core/ImageCapture$ScreenFlash;", "Lkotlinx/coroutines/CompletableDeferred;", "Lkotlinx/coroutines/CompletableDeferred;", "updateSignal", "Lkotlinx/coroutines/Deferred;", "getUpdateSignal", "()Lkotlinx/coroutines/Deferred;", "Bindings"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FlashControl implements androidx.camera.camera2.impl.UseCaseCameraControl {
    private final androidx.camera.camera2.impl.CameraProperties Camera2StreamConfigurationMap;
    private int flashMode;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private volatile int getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.camera.camera2.impl.UseCaseCameraRequestControl getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private kotlinx.coroutines.CompletableDeferred<kotlin.Unit> getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private volatile androidx.camera.core.ImageCapture.ScreenFlash getInputFormats;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.State3AControl getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.camera2.compat.workaround.UseFlashModeTorchFor3aUpdate getHighSpeedVideoSizes;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.TorchControl getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.UseCaseThreads getHighSpeedVideoFpsRanges;
    private androidx.camera.core.ImageCapture.ScreenFlash screenFlash;
    private kotlinx.coroutines.Deferred<kotlin.Unit> updateSignal;

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/impl/FlashControl$Bindings;", "", "<init>", "()V", "Landroidx/camera/camera2/impl/FlashControl;", "flashControl", "Landroidx/camera/camera2/impl/UseCaseCameraControl;", "provideControls", "(Landroidx/camera/camera2/impl/FlashControl;)Landroidx/camera/camera2/impl/UseCaseCameraControl;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @dagger.Module
    public static abstract class Bindings {
        @dagger.Binds
        @dagger.multibindings.IntoSet
        public abstract androidx.camera.camera2.impl.UseCaseCameraControl provideControls(androidx.camera.camera2.impl.FlashControl flashControl);
    }

    public static /* synthetic */ void getFlashMode$annotations() {
    }

    @javax.inject.Inject
    public FlashControl(androidx.camera.camera2.impl.CameraProperties cameraProperties, androidx.camera.camera2.impl.State3AControl state3AControl, androidx.camera.camera2.impl.UseCaseThreads useCaseThreads, androidx.camera.camera2.impl.TorchControl torchControl, androidx.camera.camera2.compat.workaround.UseFlashModeTorchFor3aUpdate useFlashModeTorchFor3aUpdate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraProperties, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state3AControl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseThreads, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(torchControl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useFlashModeTorchFor3aUpdate, "");
        this.Camera2StreamConfigurationMap = cameraProperties;
        this.getHighResolutionOutputSizeshNQ4ISI = state3AControl;
        this.getHighSpeedVideoFpsRanges = useCaseThreads;
        this.getHighSpeedVideoFpsRangesFor = torchControl;
        this.getHighSpeedVideoSizes = useFlashModeTorchFor3aUpdate;
        this.getInputSizeshNQ4ISI = 2;
        this.flashMode = this.getInputSizeshNQ4ISI;
        this.screenFlash = this.getInputFormats;
        this.updateSignal = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred(kotlin.Unit.INSTANCE);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    /* renamed from: getRequestControl, reason: from getter */
    public final androidx.camera.camera2.impl.UseCaseCameraRequestControl getGetHighSpeedVideoFpsRangesFor() {
        return this.getOutputMinFrameDuration;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void setRequestControl(androidx.camera.camera2.impl.UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this.getOutputMinFrameDuration = useCaseCameraRequestControl;
        setFlashAsync(this.getInputSizeshNQ4ISI, false);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void reset() {
        this.getInputSizeshNQ4ISI = 2;
        this.getInputFormats = null;
        Camera2StreamConfigurationMap();
        setFlashAsync$default(this, 2, false, 2, null);
    }

    /* renamed from: getFlashMode, reason: from getter */
    public final int getGetInputSizeshNQ4ISI() {
        return this.getInputSizeshNQ4ISI;
    }

    /* renamed from: getScreenFlash, reason: from getter */
    public final androidx.camera.core.ImageCapture.ScreenFlash getGetInputFormats() {
        return this.getInputFormats;
    }

    public final kotlinx.coroutines.Deferred<kotlin.Unit> getUpdateSignal() {
        kotlinx.coroutines.CompletableDeferred<kotlin.Unit> completableDeferred = this.getHighSpeedVideoSizesFor;
        if (completableDeferred != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(completableDeferred);
            return completableDeferred;
        }
        return kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred(kotlin.Unit.INSTANCE);
    }

    public static /* synthetic */ kotlinx.coroutines.Deferred setFlashAsync$default(androidx.camera.camera2.impl.FlashControl flashControl, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        return flashControl.setFlashAsync(i, z);
    }

    public final kotlinx.coroutines.Deferred<kotlin.Unit> setFlashAsync(int flashMode, boolean cancelPreviousTask) {
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            getGetHighSpeedVideoFpsRangesFor();
        }
        kotlinx.coroutines.CompletableDeferred<kotlin.Unit> CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        if (getGetHighSpeedVideoFpsRangesFor() != null) {
            this.getInputSizeshNQ4ISI = flashMode;
            if (cancelPreviousTask) {
                Camera2StreamConfigurationMap();
            } else {
                kotlinx.coroutines.CompletableDeferred<kotlin.Unit> completableDeferred = this.getHighSpeedVideoSizesFor;
                if (completableDeferred != null) {
                    androidx.camera.camera2.adapter.CoroutineAdaptersKt.propagateTo(CompletableDeferred$default, completableDeferred);
                }
            }
            this.getHighSpeedVideoSizesFor = CompletableDeferred$default;
            androidx.camera.camera2.adapter.CoroutineAdaptersKt.propagateTo(this.getHighResolutionOutputSizeshNQ4ISI.setFlashModeAsync(flashMode), CompletableDeferred$default);
        } else {
            CompletableDeferred$default.completeExceptionally(new androidx.camera.core.CameraControl.OperationCanceledException("Camera is not active."));
        }
        return CompletableDeferred$default;
    }

    private final void Camera2StreamConfigurationMap() {
        kotlinx.coroutines.CompletableDeferred<kotlin.Unit> completableDeferred = this.getHighSpeedVideoSizesFor;
        if (completableDeferred != null) {
            completableDeferred.completeExceptionally(new androidx.camera.core.CameraControl.OperationCanceledException("There is a new flash mode being set or camera was closed"));
        }
        this.getHighSpeedVideoSizesFor = null;
    }

    public final void setScreenFlash(androidx.camera.core.ImageCapture.ScreenFlash screenFlash) {
        this.getInputFormats = screenFlash;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f0, code lost:
    
        if (kotlinx.coroutines.AwaitKt.awaitAll(r5, r0) != r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object startScreenFlashCaptureTasks(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.camera.camera2.impl.FlashControl$startScreenFlashCaptureTasks$1 flashControl$startScreenFlashCaptureTasks$1;
        int i;
        java.util.ArrayList arrayList;
        java.util.List list;
        boolean isExternalFlashAeModeSupported;
        kotlinx.coroutines.Deferred<kotlin.Unit> tryExternalFlashAeModeAsync;
        boolean shouldUseFlashModeTorch;
        kotlinx.coroutines.Deferred m120setTorchAsyncOup_wC0$camera_camera2$default;
        if (continuation instanceof androidx.camera.camera2.impl.FlashControl$startScreenFlashCaptureTasks$1) {
            flashControl$startScreenFlashCaptureTasks$1 = (androidx.camera.camera2.impl.FlashControl$startScreenFlashCaptureTasks$1) continuation;
            if ((flashControl$startScreenFlashCaptureTasks$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                flashControl$startScreenFlashCaptureTasks$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = flashControl$startScreenFlashCaptureTasks$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flashControl$startScreenFlashCaptureTasks$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    arrayList = new java.util.ArrayList();
                    long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(3L);
                    flashControl$startScreenFlashCaptureTasks$1.getHighSpeedVideoSizes = arrayList;
                    flashControl$startScreenFlashCaptureTasks$1.Camera2StreamConfigurationMap = arrayList;
                    flashControl$startScreenFlashCaptureTasks$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = Camera2StreamConfigurationMap(millis, flashControl$startScreenFlashCaptureTasks$1);
                    if (obj != coroutine_suspended) {
                        list = arrayList;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                arrayList = (java.util.List) flashControl$startScreenFlashCaptureTasks$1.Camera2StreamConfigurationMap;
                list = (java.util.List) flashControl$startScreenFlashCaptureTasks$1.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                arrayList.add(obj);
                isExternalFlashAeModeSupported = androidx.camera.camera2.impl.CameraMetadataIntegrationKt.isExternalFlashAeModeSupported(this.Camera2StreamConfigurationMap.getMetadata());
                androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
                if (isExternalFlashAeModeSupported) {
                    tryExternalFlashAeModeAsync = null;
                } else {
                    tryExternalFlashAeModeAsync = this.getHighResolutionOutputSizeshNQ4ISI.setTryExternalFlashAeModeAsync(true);
                    androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                    if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                        java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                    }
                    tryExternalFlashAeModeAsync.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: androidx.camera.camera2.impl.FlashControl$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return androidx.camera.camera2.impl.FlashControl.m117$r8$lambda$vM4TrryTp58oBOcQCWtFkO6dA((java.lang.Throwable) obj2);
                        }
                    });
                }
                if (tryExternalFlashAeModeAsync != null) {
                    kotlin.coroutines.jvm.internal.Boxing.boxBoolean(list.add(tryExternalFlashAeModeAsync));
                }
                shouldUseFlashModeTorch = this.getHighSpeedVideoSizes.shouldUseFlashModeTorch();
                androidx.camera.camera2.impl.Camera2Logger camera2Logger3 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused3 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
                if (shouldUseFlashModeTorch) {
                    m120setTorchAsyncOup_wC0$camera_camera2$default = null;
                } else {
                    m120setTorchAsyncOup_wC0$camera_camera2$default = androidx.camera.camera2.impl.TorchControl.m120setTorchAsyncOup_wC0$camera_camera2$default(this.getHighSpeedVideoFpsRangesFor, androidx.camera.camera2.impl.TorchControl.TorchMode.INSTANCE.m132getUSED_AS_FLASHIRs_R8(), false, true, 2, null);
                    androidx.camera.camera2.impl.Camera2Logger camera2Logger4 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                    if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                        java.lang.String unused4 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                    }
                    m120setTorchAsyncOup_wC0$camera_camera2$default.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: androidx.camera.camera2.impl.FlashControl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return androidx.camera.camera2.impl.FlashControl.m116$r8$lambda$SwVrm2z41YDL9LSUGcsr2C2tZY((java.lang.Throwable) obj2);
                        }
                    });
                }
                if (m120setTorchAsyncOup_wC0$camera_camera2$default != null) {
                    kotlin.coroutines.jvm.internal.Boxing.boxBoolean(list.add(m120setTorchAsyncOup_wC0$camera_camera2$default));
                }
                flashControl$startScreenFlashCaptureTasks$1.getHighSpeedVideoSizes = null;
                flashControl$startScreenFlashCaptureTasks$1.Camera2StreamConfigurationMap = null;
                flashControl$startScreenFlashCaptureTasks$1.getHighSpeedVideoFpsRangesFor = 2;
            }
        }
        flashControl$startScreenFlashCaptureTasks$1 = new androidx.camera.camera2.impl.FlashControl$startScreenFlashCaptureTasks$1(this, continuation);
        java.lang.Object obj2 = flashControl$startScreenFlashCaptureTasks$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flashControl$startScreenFlashCaptureTasks$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        arrayList.add(obj2);
        isExternalFlashAeModeSupported = androidx.camera.camera2.impl.CameraMetadataIntegrationKt.isExternalFlashAeModeSupported(this.Camera2StreamConfigurationMap.getMetadata());
        androidx.camera.camera2.impl.Camera2Logger camera2Logger5 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
        }
        if (isExternalFlashAeModeSupported) {
        }
        if (tryExternalFlashAeModeAsync != null) {
        }
        shouldUseFlashModeTorch = this.getHighSpeedVideoSizes.shouldUseFlashModeTorch();
        androidx.camera.camera2.impl.Camera2Logger camera2Logger32 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
        }
        if (shouldUseFlashModeTorch) {
        }
        if (m120setTorchAsyncOup_wC0$camera_camera2$default != null) {
        }
        flashControl$startScreenFlashCaptureTasks$1.getHighSpeedVideoSizes = null;
        flashControl$startScreenFlashCaptureTasks$1.Camera2StreamConfigurationMap = null;
        flashControl$startScreenFlashCaptureTasks$1.getHighSpeedVideoFpsRangesFor = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(long j, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<kotlin.Unit>> continuation) {
        androidx.camera.camera2.impl.FlashControl$applyScreenFlash$1 flashControl$applyScreenFlash$1;
        int i;
        kotlinx.coroutines.CompletableDeferred completableDeferred;
        kotlinx.coroutines.Deferred async$default;
        if (continuation instanceof androidx.camera.camera2.impl.FlashControl$applyScreenFlash$1) {
            flashControl$applyScreenFlash$1 = (androidx.camera.camera2.impl.FlashControl$applyScreenFlash$1) continuation;
            if ((flashControl$applyScreenFlash$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                flashControl$applyScreenFlash$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = flashControl$applyScreenFlash$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flashControl$applyScreenFlash$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    final kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                    androidx.camera.core.ImageCapture.ScreenFlashListener screenFlashListener = new androidx.camera.core.ImageCapture.ScreenFlashListener() { // from class: androidx.camera.camera2.impl.FlashControl$$ExternalSyntheticLambda1
                        @Override // androidx.camera.core.ImageCapture.ScreenFlashListener
                        public final void onCompleted() {
                            kotlinx.coroutines.CompletableDeferred.this.complete(kotlin.Unit.INSTANCE);
                        }
                    };
                    kotlinx.coroutines.MainCoroutineDispatcher main = kotlinx.coroutines.Dispatchers.getMain();
                    androidx.camera.camera2.impl.FlashControl$applyScreenFlash$2 flashControl$applyScreenFlash$2 = new androidx.camera.camera2.impl.FlashControl$applyScreenFlash$2(j, this, screenFlashListener, null);
                    flashControl$applyScreenFlash$1.Camera2StreamConfigurationMap = CompletableDeferred$default;
                    flashControl$applyScreenFlash$1.getHighSpeedVideoFpsRangesFor = j;
                    flashControl$applyScreenFlash$1.getHighSpeedVideoFpsRanges = 1;
                    if (kotlinx.coroutines.BuildersKt.withContext(main, flashControl$applyScreenFlash$2, flashControl$applyScreenFlash$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    completableDeferred = CompletableDeferred$default;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = flashControl$applyScreenFlash$1.getHighSpeedVideoFpsRangesFor;
                    completableDeferred = (kotlinx.coroutines.CompletableDeferred) flashControl$applyScreenFlash$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(this.getHighSpeedVideoFpsRanges.getScope(), null, null, new androidx.camera.camera2.impl.FlashControl$applyScreenFlash$3(completableDeferred, j, null), 3, null);
                return async$default;
            }
        }
        flashControl$applyScreenFlash$1 = new androidx.camera.camera2.impl.FlashControl$applyScreenFlash$1(this, continuation);
        java.lang.Object obj2 = flashControl$applyScreenFlash$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flashControl$applyScreenFlash$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(this.getHighSpeedVideoFpsRanges.getScope(), null, null, new androidx.camera.camera2.impl.FlashControl$applyScreenFlash$3(completableDeferred, j, null), 3, null);
        return async$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object stopScreenFlashCaptureTasks(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.camera.camera2.impl.FlashControl$stopScreenFlashCaptureTasks$1 flashControl$stopScreenFlashCaptureTasks$1;
        int i;
        if (continuation instanceof androidx.camera.camera2.impl.FlashControl$stopScreenFlashCaptureTasks$1) {
            flashControl$stopScreenFlashCaptureTasks$1 = (androidx.camera.camera2.impl.FlashControl$stopScreenFlashCaptureTasks$1) continuation;
            if ((flashControl$stopScreenFlashCaptureTasks$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                flashControl$stopScreenFlashCaptureTasks$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = flashControl$stopScreenFlashCaptureTasks$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flashControl$stopScreenFlashCaptureTasks$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.MainCoroutineDispatcher main = kotlinx.coroutines.Dispatchers.getMain();
                    androidx.camera.camera2.impl.FlashControl$stopScreenFlashCaptureTasks$2 flashControl$stopScreenFlashCaptureTasks$2 = new androidx.camera.camera2.impl.FlashControl$stopScreenFlashCaptureTasks$2(this, null);
                    flashControl$stopScreenFlashCaptureTasks$1.Camera2StreamConfigurationMap = 1;
                    if (kotlinx.coroutines.BuildersKt.withContext(main, flashControl$stopScreenFlashCaptureTasks$2, flashControl$stopScreenFlashCaptureTasks$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (androidx.camera.camera2.impl.CameraMetadataIntegrationKt.isExternalFlashAeModeSupported(this.Camera2StreamConfigurationMap.getMetadata())) {
                    this.getHighResolutionOutputSizeshNQ4ISI.setTryExternalFlashAeModeAsync(false);
                }
                if (this.getHighSpeedVideoSizes.shouldUseFlashModeTorch()) {
                    androidx.camera.camera2.impl.TorchControl.m120setTorchAsyncOup_wC0$camera_camera2$default(this.getHighSpeedVideoFpsRangesFor, androidx.camera.camera2.impl.TorchControl.TorchMode.INSTANCE.m130getOFFIRs_R8(), false, true, 2, null);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        flashControl$stopScreenFlashCaptureTasks$1 = new androidx.camera.camera2.impl.FlashControl$stopScreenFlashCaptureTasks$1(this, continuation);
        java.lang.Object obj2 = flashControl$stopScreenFlashCaptureTasks$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flashControl$stopScreenFlashCaptureTasks$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        if (androidx.camera.camera2.impl.CameraMetadataIntegrationKt.isExternalFlashAeModeSupported(this.Camera2StreamConfigurationMap.getMetadata())) {
        }
        if (this.getHighSpeedVideoSizes.shouldUseFlashModeTorch()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object awaitFlashModeUpdate(kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        androidx.camera.camera2.impl.FlashControl$awaitFlashModeUpdate$1 flashControl$awaitFlashModeUpdate$1;
        int i;
        int i2;
        if (continuation instanceof androidx.camera.camera2.impl.FlashControl$awaitFlashModeUpdate$1) {
            flashControl$awaitFlashModeUpdate$1 = (androidx.camera.camera2.impl.FlashControl$awaitFlashModeUpdate$1) continuation;
            if ((flashControl$awaitFlashModeUpdate$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                flashControl$awaitFlashModeUpdate$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = flashControl$awaitFlashModeUpdate$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flashControl$awaitFlashModeUpdate$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                    if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                        java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                    }
                    int getInputSizeshNQ4ISI = getGetInputSizeshNQ4ISI();
                    kotlinx.coroutines.Deferred<kotlin.Unit> updateSignal = getUpdateSignal();
                    flashControl$awaitFlashModeUpdate$1.getHighSpeedVideoFpsRangesFor = getInputSizeshNQ4ISI;
                    flashControl$awaitFlashModeUpdate$1.Camera2StreamConfigurationMap = 1;
                    if (updateSignal.join(flashControl$awaitFlashModeUpdate$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i2 = getInputSizeshNQ4ISI;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = flashControl$awaitFlashModeUpdate$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxInt(i2);
            }
        }
        flashControl$awaitFlashModeUpdate$1 = new androidx.camera.camera2.impl.FlashControl$awaitFlashModeUpdate$1(this, continuation);
        java.lang.Object obj2 = flashControl$awaitFlashModeUpdate$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flashControl$awaitFlashModeUpdate$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        androidx.camera.camera2.impl.Camera2Logger camera2Logger22 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxInt(i2);
    }

    /* renamed from: $r8$lambda$SwVrm2z41YDL9LSU-Gcsr2C2tZY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m116$r8$lambda$SwVrm2z41YDL9LSUGcsr2C2tZY(java.lang.Throwable th) {
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$vM4TrryT-p58oBOc-QCWtFkO6dA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m117$r8$lambda$vM4TrryTp58oBOcQCWtFkO6dA(java.lang.Throwable th) {
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
        }
        return kotlin.Unit.INSTANCE;
    }
}
