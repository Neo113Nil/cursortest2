package androidx.camera.camera2.impl;

@androidx.camera.camera2.config.CameraScope
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002FGB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00112\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00112\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u00112\u0006\u0010\u001c\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\fJ\u000f\u0010\u001e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\fJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010'R(\u0010.\u001a\u0004\u0018\u00010%2\b\u0010)\u001a\u0004\u0018\u00010%8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0014\u0010\u001e\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u00100R*\u00101\u001a\u0004\u0018\u00010\u00148\u0001@\u0001X\u0080\u000e¢\u0006\u0018\n\u0004\b1\u00102\u0012\u0004\b7\u0010\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001e\u0010&\u001a\f\u0012\b\u0012\u0006*\u00020\u00180\u0018088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u00109R\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00180:8G¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010/\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u00100R\u0014\u0010A\u001a\u00020\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010?\u001a\u00020\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bA\u0010@R\u001e\u0010 \u001a\f\u0012\b\u0012\u0006*\u00020\u00180\u0018088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u00109R\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00180:8G¢\u0006\u0006\u001a\u0004\bB\u0010<R\u001e\u0010>\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010D8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010ER\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010D8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010E"}, d2 = {"Landroidx/camera/camera2/impl/TorchControl;", "Landroidx/camera/camera2/impl/UseCaseCameraControl;", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "Landroidx/camera/camera2/impl/State3AControl;", "state3AControl", "Landroidx/camera/camera2/impl/UseCaseThreads;", "threads", "<init>", "(Landroidx/camera/camera2/impl/CameraProperties;Landroidx/camera/camera2/impl/State3AControl;Landroidx/camera/camera2/impl/UseCaseThreads;)V", "", "reset", "()V", "", "torch", "cancelPreviousTask", "ignoreFlashUnitAvailability", "Lkotlinx/coroutines/Deferred;", "setTorchAsync", "(ZZZ)Lkotlinx/coroutines/Deferred;", "Landroidx/camera/camera2/impl/TorchControl$TorchMode;", "mode", "setTorchAsync-Oup_wC0$camera_camera2", "(IZZ)Lkotlinx/coroutines/Deferred;", "", "level", "setTorchStrengthLevelAsync", "(I)Lkotlinx/coroutines/Deferred;", "p0", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "(I)V", "getOutputFormats", "Landroidx/camera/camera2/impl/State3AControl;", "getHighSpeedVideoSizes", "getOutputSizes", "Landroidx/camera/camera2/impl/UseCaseThreads;", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "getHighSpeedVideoFpsRanges", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "getHighSpeedVideoFpsRangesFor", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getRequestControl", "()Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "setRequestControl", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;)V", "requestControl", "getInputSizeshNQ4ISI", "Z", "torchMode", "Landroidx/camera/camera2/impl/TorchControl$TorchMode;", "getTorchMode-MnUA4hI$camera_camera2", "()Landroidx/camera/camera2/impl/TorchControl$TorchMode;", "setTorchMode-UuNXre8$camera_camera2", "(Landroidx/camera/camera2/impl/TorchControl$TorchMode;)V", "getTorchMode-MnUA4hI$camera_camera2$annotations", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/LiveData;", "getTorchStateLiveData", "()Landroidx/lifecycle/LiveData;", "torchStateLiveData", "getOutputMinFrameDuration", "getInputFormats", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizesFor", "getTorchStrengthLiveData", "torchStrengthLiveData", "Lkotlinx/coroutines/CompletableDeferred;", "Lkotlinx/coroutines/CompletableDeferred;", "Bindings", "TorchMode"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TorchControl implements androidx.camera.camera2.impl.UseCaseCameraControl {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private kotlinx.coroutines.CompletableDeferred<kotlin.Unit> getOutputSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.view.MutableLiveData<java.lang.Integer> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.camera.camera2.impl.UseCaseCameraRequestControl getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.view.MutableLiveData<java.lang.Integer> getOutputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private kotlinx.coroutines.CompletableDeferred<kotlin.Unit> getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final int getInputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.State3AControl getHighSpeedVideoSizes;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final boolean getInputSizeshNQ4ISI;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.UseCaseThreads Camera2StreamConfigurationMap;
    private androidx.camera.camera2.impl.TorchControl.TorchMode torchMode;

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/impl/TorchControl$Bindings;", "", "<init>", "()V", "Landroidx/camera/camera2/impl/TorchControl;", "torchControl", "Landroidx/camera/camera2/impl/UseCaseCameraControl;", "provideControls", "(Landroidx/camera/camera2/impl/TorchControl;)Landroidx/camera/camera2/impl/UseCaseCameraControl;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @dagger.Module
    public static abstract class Bindings {
        @dagger.Binds
        @dagger.multibindings.IntoSet
        public abstract androidx.camera.camera2.impl.UseCaseCameraControl provideControls(androidx.camera.camera2.impl.TorchControl torchControl);
    }

    /* renamed from: getTorchMode-MnUA4hI$camera_camera2$annotations, reason: not valid java name */
    public static /* synthetic */ void m119getTorchModeMnUA4hI$camera_camera2$annotations() {
    }

    @javax.inject.Inject
    public TorchControl(androidx.camera.camera2.impl.CameraProperties cameraProperties, androidx.camera.camera2.impl.State3AControl state3AControl, androidx.camera.camera2.impl.UseCaseThreads useCaseThreads) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraProperties, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state3AControl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseThreads, "");
        this.getHighSpeedVideoSizes = state3AControl;
        this.Camera2StreamConfigurationMap = useCaseThreads;
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.camera.camera2.compat.workaround.FlashAvailabilityCheckerKt.isFlashAvailable$default(cameraProperties, false, 1, null);
        this.getHighSpeedVideoFpsRanges = new androidx.view.MutableLiveData<>(0);
        this.getInputSizeshNQ4ISI = androidx.camera.camera2.pipe.CameraMetadata.INSTANCE.getSupportsTorchStrength(cameraProperties.getMetadata());
        int defaultTorchStrengthLevel = androidx.camera.camera2.pipe.CameraMetadata.INSTANCE.getDefaultTorchStrengthLevel(cameraProperties.getMetadata());
        this.getHighSpeedVideoSizesFor = defaultTorchStrengthLevel;
        this.getInputFormats = androidx.camera.camera2.pipe.CameraMetadata.INSTANCE.getMaxTorchStrengthLevel(cameraProperties.getMetadata());
        this.getOutputFormats = new androidx.view.MutableLiveData<>(java.lang.Integer.valueOf(defaultTorchStrengthLevel));
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    /* renamed from: getRequestControl, reason: from getter */
    public final androidx.camera.camera2.impl.UseCaseCameraRequestControl getCamera2StreamConfigurationMap() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r8.intValue() != 1) goto L8;
     */
    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setRequestControl(androidx.camera.camera2.impl.UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this.getHighSpeedVideoFpsRangesFor = useCaseCameraRequestControl;
        if (this.torchMode != null) {
            java.lang.Integer value = getTorchStateLiveData().getValue();
            boolean z = value != null;
            setTorchAsync$default(this, z, false, false, 4, null);
        }
    }

    /* renamed from: getTorchMode-MnUA4hI$camera_camera2, reason: not valid java name and from getter */
    public final androidx.camera.camera2.impl.TorchControl.TorchMode getTorchMode() {
        return this.torchMode;
    }

    /* renamed from: setTorchMode-UuNXre8$camera_camera2, reason: not valid java name */
    public final void m123setTorchModeUuNXre8$camera_camera2(androidx.camera.camera2.impl.TorchControl.TorchMode torchMode) {
        this.torchMode = torchMode;
    }

    public final androidx.view.LiveData<java.lang.Integer> getTorchStateLiveData() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final androidx.view.LiveData<java.lang.Integer> getTorchStrengthLiveData() {
        return this.getOutputFormats;
    }

    public static /* synthetic */ kotlinx.coroutines.Deferred setTorchAsync$default(androidx.camera.camera2.impl.TorchControl torchControl, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        return torchControl.setTorchAsync(z, z2, z3);
    }

    public final kotlinx.coroutines.Deferred<kotlin.Unit> setTorchAsync(boolean torch, boolean cancelPreviousTask, boolean ignoreFlashUnitAvailability) {
        return m122setTorchAsyncOup_wC0$camera_camera2(torch ? androidx.camera.camera2.impl.TorchControl.TorchMode.INSTANCE.m131getONIRs_R8() : androidx.camera.camera2.impl.TorchControl.TorchMode.INSTANCE.m130getOFFIRs_R8(), cancelPreviousTask, ignoreFlashUnitAvailability);
    }

    /* renamed from: setTorchAsync-Oup_wC0$camera_camera2$default, reason: not valid java name */
    public static /* synthetic */ kotlinx.coroutines.Deferred m120setTorchAsyncOup_wC0$camera_camera2$default(androidx.camera.camera2.impl.TorchControl torchControl, int i, boolean z, boolean z2, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return torchControl.m122setTorchAsyncOup_wC0$camera_camera2(i, z, z2);
    }

    /* renamed from: setTorchAsync-Oup_wC0$camera_camera2, reason: not valid java name */
    public final kotlinx.coroutines.Deferred<kotlin.Unit> m122setTorchAsyncOup_wC0$camera_camera2(int mode, boolean cancelPreviousTask, boolean ignoreFlashUnitAvailability) {
        int m161getONbOjpiJc;
        kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> mo114setTorchOffAsyncMtizInI;
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            androidx.camera.camera2.impl.TorchControl.TorchMode.m128toStringimpl(mode);
        }
        kotlinx.coroutines.CompletableDeferred<kotlin.Unit> CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        if (ignoreFlashUnitAvailability || this.getHighResolutionOutputSizeshNQ4ISI) {
            androidx.camera.camera2.impl.UseCaseCameraRequestControl camera2StreamConfigurationMap = getCamera2StreamConfigurationMap();
            if (camera2StreamConfigurationMap != null) {
                getHighResolutionOutputSizeshNQ4ISI(mode);
                if (cancelPreviousTask) {
                    Camera2StreamConfigurationMap();
                } else {
                    kotlinx.coroutines.CompletableDeferred<kotlin.Unit> completableDeferred = this.getOutputMinFrameDuration;
                    if (completableDeferred != null) {
                        androidx.camera.camera2.adapter.CoroutineAdaptersKt.propagateTo(CompletableDeferred$default, completableDeferred);
                    }
                }
                this.getOutputMinFrameDuration = CompletableDeferred$default;
                this.getHighSpeedVideoSizes.setPreferredAeModeAsync(androidx.camera.camera2.impl.TorchControl.TorchMode.m126equalsimpl0(mode, androidx.camera.camera2.impl.TorchControl.TorchMode.INSTANCE.m130getOFFIRs_R8()) ^ true ? 1 : null);
                androidx.camera.camera2.pipe.AeMode m159fromIntOrNullkQd0u18 = androidx.camera.camera2.pipe.AeMode.INSTANCE.m159fromIntOrNullkQd0u18(this.getHighSpeedVideoSizes.getFinalSupportedAeMode());
                if (m159fromIntOrNullkQd0u18 != null) {
                    m161getONbOjpiJc = m159fromIntOrNullkQd0u18.m157unboximpl();
                } else {
                    androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                    if (androidx.camera.core.Logger.isWarnEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                        java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                        this.getHighSpeedVideoSizes.getFinalSupportedAeMode();
                    }
                    m161getONbOjpiJc = androidx.camera.camera2.pipe.AeMode.INSTANCE.m161getONbOjpiJc();
                }
                if (!androidx.camera.camera2.impl.TorchControl.TorchMode.m126equalsimpl0(mode, androidx.camera.camera2.impl.TorchControl.TorchMode.INSTANCE.m130getOFFIRs_R8())) {
                    if (androidx.camera.camera2.impl.TorchControl.TorchMode.m126equalsimpl0(mode, androidx.camera.camera2.impl.TorchControl.TorchMode.INSTANCE.m131getONIRs_R8())) {
                        java.lang.Integer value = getTorchStrengthLiveData().getValue();
                        if (value != null) {
                            Camera2StreamConfigurationMap(value.intValue());
                        }
                    } else {
                        Camera2StreamConfigurationMap(this.getHighSpeedVideoSizesFor);
                    }
                    mo114setTorchOffAsyncMtizInI = camera2StreamConfigurationMap.setTorchOnAsync();
                } else {
                    mo114setTorchOffAsyncMtizInI = camera2StreamConfigurationMap.mo114setTorchOffAsyncMtizInI(m161getONbOjpiJc);
                }
                androidx.camera.camera2.adapter.CoroutineAdaptersKt.propagateTo(mo114setTorchOffAsyncMtizInI, CompletableDeferred$default, new kotlin.jvm.functions.Function1() { // from class: androidx.camera.camera2.impl.TorchControl$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.camera.camera2.impl.TorchControl.m118$r8$lambda$zWFTHKLjGUBSQony1A4xNaMs1M((androidx.camera.camera2.pipe.Result3A) obj);
                    }
                });
            } else {
                CompletableDeferred$default.completeExceptionally(new androidx.camera.core.CameraControl.OperationCanceledException("Camera is not active."));
            }
            return CompletableDeferred$default;
        }
        CompletableDeferred$default.completeExceptionally(new java.lang.IllegalStateException("No flash unit"));
        return CompletableDeferred$default;
    }

    public final kotlinx.coroutines.Deferred<kotlin.Unit> setTorchStrengthLevelAsync(int level) {
        if (!this.getInputSizeshNQ4ISI) {
            kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            CompletableDeferred$default.completeExceptionally(new java.lang.UnsupportedOperationException("Configuring torch strength is not supported on the device."));
            return CompletableDeferred$default;
        }
        if (level <= 0 || level > this.getInputFormats) {
            kotlinx.coroutines.CompletableDeferred CompletableDeferred$default2 = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            CompletableDeferred$default2.completeExceptionally(new java.lang.IllegalArgumentException("The given torch strength level is invalid."));
            return CompletableDeferred$default2;
        }
        androidx.view.MutableLiveData<java.lang.Integer> mutableLiveData = this.getOutputFormats;
        if (androidx.camera.core.impl.utils.Threads.isMainThread()) {
            mutableLiveData.setValue(java.lang.Integer.valueOf(level));
        } else {
            mutableLiveData.postValue(java.lang.Integer.valueOf(level));
        }
        java.lang.Integer value = getTorchStateLiveData().getValue();
        if (value != null && value.intValue() == 1) {
            return Camera2StreamConfigurationMap(level);
        }
        return kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred(kotlin.Unit.INSTANCE);
    }

    private final kotlinx.coroutines.Deferred<kotlin.Unit> Camera2StreamConfigurationMap(int p0) {
        kotlinx.coroutines.Deferred parametersAsync$default;
        kotlinx.coroutines.CompletableDeferred<kotlin.Unit> CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        if (android.os.Build.VERSION.SDK_INT >= 35 && this.getInputSizeshNQ4ISI) {
            if (this.getOutputSizes != null) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
            this.getOutputSizes = CompletableDeferred$default;
            CompletableDeferred$default.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: androidx.camera.camera2.impl.TorchControl$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.camera.camera2.impl.TorchControl.$r8$lambda$WpwW2OEsOoPvgaaFVKL9Qn3v_s4(androidx.camera.camera2.impl.TorchControl.this, (java.lang.Throwable) obj);
                }
            });
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            androidx.camera.camera2.compat.Api35Compat.setFlashStrengthLevel(linkedHashMap, p0);
            androidx.camera.camera2.impl.UseCaseCameraRequestControl camera2StreamConfigurationMap = getCamera2StreamConfigurationMap();
            if (camera2StreamConfigurationMap == null || (parametersAsync$default = androidx.camera.camera2.impl.UseCaseCameraRequestControl.setParametersAsync$default(camera2StreamConfigurationMap, linkedHashMap, null, null, 6, null)) == null) {
                CompletableDeferred$default.completeExceptionally(new androidx.camera.core.CameraControl.OperationCanceledException("Camera is not active."));
            } else {
                androidx.camera.camera2.adapter.CoroutineAdaptersKt.propagateTo(parametersAsync$default, CompletableDeferred$default);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        } else {
            CompletableDeferred$default.completeExceptionally(new java.lang.UnsupportedOperationException("Configuring torch strength is not supported on the device."));
        }
        return CompletableDeferred$default;
    }

    private final void Camera2StreamConfigurationMap() {
        kotlinx.coroutines.CompletableDeferred<kotlin.Unit> completableDeferred = this.getOutputMinFrameDuration;
        if (completableDeferred != null) {
            completableDeferred.completeExceptionally(new androidx.camera.core.CameraControl.OperationCanceledException("There is a new enableTorch being set"));
        }
        this.getOutputMinFrameDuration = null;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        kotlinx.coroutines.CompletableDeferred<kotlin.Unit> completableDeferred = this.getOutputSizes;
        if (completableDeferred != null) {
            completableDeferred.completeExceptionally(new androidx.camera.core.CameraControl.OperationCanceledException("There is a new torch strength being set"));
        }
        this.getOutputSizes = null;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(int p0) {
        this.torchMode = androidx.camera.camera2.impl.TorchControl.TorchMode.m124boximpl(p0);
        boolean m126equalsimpl0 = androidx.camera.camera2.impl.TorchControl.TorchMode.m126equalsimpl0(p0, androidx.camera.camera2.impl.TorchControl.TorchMode.INSTANCE.m131getONIRs_R8());
        androidx.view.MutableLiveData<java.lang.Integer> mutableLiveData = this.getHighSpeedVideoFpsRanges;
        if (androidx.camera.core.impl.utils.Threads.isMainThread()) {
            mutableLiveData.setValue(java.lang.Integer.valueOf(m126equalsimpl0 ? 1 : 0));
        } else {
            mutableLiveData.postValue(java.lang.Integer.valueOf(m126equalsimpl0 ? 1 : 0));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0081@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\u001a\u0010\u0006\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0088\u0001\u000f\u0092\u0001\u00020\u0007"}, d2 = {"Landroidx/camera/camera2/impl/TorchControl$TorchMode;", "", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "", "hashCode-impl", "(I)I", "hashCode", "", "toString-impl", "(I)Ljava/lang/String;", "toString", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.visa.cbp.getEncExpo.warmup, "getValue", "()I", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    public static final class TorchMode {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.camera.camera2.impl.TorchControl.TorchMode.Companion INSTANCE = new androidx.camera.camera2.impl.TorchControl.TorchMode.Companion(null);
        private static final int OFF = 0;
        private static final int ON = 1;
        private static final int USED_AS_FLASH = 2;
        private final int value;

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m126equalsimpl0(int i, int i2) {
            return i == i2;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Landroidx/camera/camera2/impl/TorchControl$TorchMode$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/impl/TorchControl$TorchMode;", "OFF", com.visa.cbp.getEncExpo.warmup, "getOFF-IRs_-R8", "()I", "ON", "getON-IRs_-R8", "USED_AS_FLASH", "getUSED_AS_FLASH-IRs_-R8"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: getOFF-IRs_-R8, reason: not valid java name */
            public final int m130getOFFIRs_R8() {
                return androidx.camera.camera2.impl.TorchControl.TorchMode.OFF;
            }

            /* renamed from: getON-IRs_-R8, reason: not valid java name */
            public final int m131getONIRs_R8() {
                return androidx.camera.camera2.impl.TorchControl.TorchMode.ON;
            }

            /* renamed from: getUSED_AS_FLASH-IRs_-R8, reason: not valid java name */
            public final int m132getUSED_AS_FLASHIRs_R8() {
                return androidx.camera.camera2.impl.TorchControl.TorchMode.USED_AS_FLASH;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private /* synthetic */ TorchMode(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m129unboximpl() {
            return this.value;
        }

        public final java.lang.String toString() {
            return m128toStringimpl(this.value);
        }

        public final int hashCode() {
            return m127hashCodeimpl(this.value);
        }

        public final boolean equals(java.lang.Object obj) {
            return m125equalsimpl(this.value, obj);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m128toStringimpl(int i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TorchMode(value=");
            sb.append(i);
            sb.append(')');
            return sb.toString();
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m127hashCodeimpl(int i) {
            return java.lang.Integer.hashCode(i);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m125equalsimpl(int i, java.lang.Object obj) {
            return (obj instanceof androidx.camera.camera2.impl.TorchControl.TorchMode) && i == ((androidx.camera.camera2.impl.TorchControl.TorchMode) obj).m129unboximpl();
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ androidx.camera.camera2.impl.TorchControl.TorchMode m124boximpl(int i) {
            return new androidx.camera.camera2.impl.TorchControl.TorchMode(i);
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WpwW2OEsOoPvgaaFVKL9Qn3v_s4(androidx.camera.camera2.impl.TorchControl torchControl, java.lang.Throwable th) {
        torchControl.getOutputSizes = null;
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zWFTHKLjGUB-SQony1A4xNaMs1M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m118$r8$lambda$zWFTHKLjGUBSQony1A4xNaMs1M(androidx.camera.camera2.pipe.Result3A result3A) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result3A, "");
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void reset() {
        Camera2StreamConfigurationMap();
        getHighResolutionOutputSizeshNQ4ISI();
        if (this.torchMode != null) {
            getHighResolutionOutputSizeshNQ4ISI(androidx.camera.camera2.impl.TorchControl.TorchMode.INSTANCE.m130getOFFIRs_R8());
            setTorchAsync$default(this, false, false, false, 6, null);
            this.torchMode = null;
        }
    }
}
