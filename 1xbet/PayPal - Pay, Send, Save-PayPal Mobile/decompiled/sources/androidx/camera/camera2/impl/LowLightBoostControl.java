package androidx.camera.camera2.impl;

@androidx.camera.camera2.config.CameraScope
@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001EB+\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u00172\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u000eJ!\u0010\u001a\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001a\u0010\u001eR\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010)R(\u00100\u001a\u0004\u0018\u00010(2\b\u0010+\u001a\u0004\u0018\u00010(8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0014\u0010#\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00101\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u00102R\u001e\u0010 \u001a\f\u0012\b\u0012\u0006*\u00020\u001c0\u001c0\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u00104R\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020\u001c058G¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010:\u001a\u0002098\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001e\u00103\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010<8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010=R0\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00178\u0001@\u0001X\u0080\u000e¢\u0006\u0018\n\u0004\b>\u0010?\u0012\u0004\bD\u0010\u000e\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C"}, d2 = {"Landroidx/camera/camera2/impl/LowLightBoostControl;", "Landroidx/camera/camera2/impl/UseCaseCameraControl;", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraMetadata", "Landroidx/camera/camera2/impl/State3AControl;", "state3AControl", "Landroidx/camera/camera2/impl/UseCaseThreads;", "threads", "Landroidx/camera/camera2/impl/ComboRequestListener;", "comboRequestListener", "<init>", "(Landroidx/camera/camera2/pipe/CameraMetadata;Landroidx/camera/camera2/impl/State3AControl;Landroidx/camera/camera2/impl/UseCaseThreads;Landroidx/camera/camera2/impl/ComboRequestListener;)V", "", "reset", "()V", "", "Landroidx/camera/core/UseCase;", "useCases", "onSessionConfigChanged", "(Ljava/util/List;)V", "", "lowLightBoost", "cancelPreviousTask", "Lkotlinx/coroutines/Deferred;", "setLowLightBoostAsync", "(ZZ)Lkotlinx/coroutines/Deferred;", "getHighSpeedVideoFpsRangesFor", "Landroidx/lifecycle/MutableLiveData;", "", "p0", "(Landroidx/lifecycle/MutableLiveData;I)V", "Landroidx/camera/camera2/pipe/CameraMetadata;", "getOutputFormats", "Landroidx/camera/camera2/impl/State3AControl;", "Camera2StreamConfigurationMap", "getOutputMinFrameDuration", "Landroidx/camera/camera2/impl/UseCaseThreads;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Landroidx/camera/camera2/impl/ComboRequestListener;", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "getHighSpeedVideoSizes", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getRequestControl", "()Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "setRequestControl", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;)V", "requestControl", "getHighSpeedVideoSizesFor", "Z", "getInputSizeshNQ4ISI", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/LiveData;", "getLowLightBoostStateLiveData", "()Landroidx/lifecycle/LiveData;", "lowLightBoostStateLiveData", "Ljava/util/concurrent/atomic/AtomicInteger;", "getInputFormats", "Ljava/util/concurrent/atomic/AtomicInteger;", "Lkotlinx/coroutines/CompletableDeferred;", "Lkotlinx/coroutines/CompletableDeferred;", "checkFrameRateJob", "Lkotlinx/coroutines/Deferred;", "getCheckFrameRateJob$camera_camera2", "()Lkotlinx/coroutines/Deferred;", "setCheckFrameRateJob$camera_camera2", "(Lkotlinx/coroutines/Deferred;)V", "getCheckFrameRateJob$camera_camera2$annotations", "Bindings"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LowLightBoostControl implements androidx.camera.camera2.impl.UseCaseCameraControl {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.camera.camera2.impl.UseCaseCameraRequestControl getHighSpeedVideoSizes;
    private kotlinx.coroutines.Deferred<java.lang.Boolean> checkFrameRateJob;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.view.MutableLiveData<java.lang.Integer> getOutputFormats;
    private final androidx.camera.camera2.impl.ComboRequestListener getHighSpeedVideoFpsRanges;
    private final androidx.camera.camera2.pipe.CameraMetadata getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private kotlinx.coroutines.CompletableDeferred<kotlin.Unit> getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final boolean getOutputMinFrameDuration;
    private final java.util.concurrent.atomic.AtomicInteger getInputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.State3AControl Camera2StreamConfigurationMap;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.UseCaseThreads getHighResolutionOutputSizeshNQ4ISI;

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/impl/LowLightBoostControl$Bindings;", "", "<init>", "()V", "Landroidx/camera/camera2/impl/LowLightBoostControl;", "lowLightBoostControl", "Landroidx/camera/camera2/impl/UseCaseCameraControl;", "provideControls", "(Landroidx/camera/camera2/impl/LowLightBoostControl;)Landroidx/camera/camera2/impl/UseCaseCameraControl;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @dagger.Module
    public static abstract class Bindings {
        @dagger.Binds
        @dagger.multibindings.IntoSet
        public abstract androidx.camera.camera2.impl.UseCaseCameraControl provideControls(androidx.camera.camera2.impl.LowLightBoostControl lowLightBoostControl);
    }

    public static /* synthetic */ void getCheckFrameRateJob$camera_camera2$annotations() {
    }

    @javax.inject.Inject
    public LowLightBoostControl(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata, androidx.camera.camera2.impl.State3AControl state3AControl, androidx.camera.camera2.impl.UseCaseThreads useCaseThreads, androidx.camera.camera2.impl.ComboRequestListener comboRequestListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state3AControl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseThreads, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comboRequestListener, "");
        this.getHighSpeedVideoFpsRangesFor = cameraMetadata;
        this.Camera2StreamConfigurationMap = state3AControl;
        this.getHighResolutionOutputSizeshNQ4ISI = useCaseThreads;
        this.getHighSpeedVideoFpsRanges = comboRequestListener;
        boolean z = false;
        if (cameraMetadata != null && androidx.camera.camera2.pipe.CameraMetadata.INSTANCE.getSupportsLowLightBoost(cameraMetadata)) {
            z = true;
        }
        this.getOutputMinFrameDuration = z;
        this.getOutputFormats = new androidx.view.MutableLiveData<>(-1);
        this.getInputFormats = new java.util.concurrent.atomic.AtomicInteger(-1);
        if (z) {
            comboRequestListener.addListener(new androidx.camera.camera2.pipe.Request.Listener() { // from class: androidx.camera.camera2.impl.LowLightBoostControl.1
                @Override // androidx.camera.camera2.pipe.Request.Listener
                /* renamed from: onTotalCaptureResult-CcXjc1I */
                public final void mo38onTotalCaptureResultCcXjc1I(androidx.camera.camera2.pipe.RequestMetadata requestMetadata, long frameNumber, androidx.camera.camera2.pipe.FrameInfo totalCaptureResult) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalCaptureResult, "");
                    if (android.os.Build.VERSION.SDK_INT < 35 || androidx.camera.camera2.impl.LowLightBoostControl.this.getHighSpeedVideoSizes == null || !androidx.camera.camera2.impl.LowLightBoostControl.this.getHighSpeedVideoSizesFor) {
                        return;
                    }
                    androidx.camera.camera2.pipe.FrameMetadata metadata = totalCaptureResult.getMetadata();
                    android.hardware.camera2.CaptureResult.Key key = android.hardware.camera2.CaptureResult.CONTROL_LOW_LIGHT_BOOST_STATE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
                    java.lang.Integer num = (java.lang.Integer) metadata.get(key);
                    if (num != null) {
                        androidx.camera.camera2.impl.LowLightBoostControl lowLightBoostControl = androidx.camera.camera2.impl.LowLightBoostControl.this;
                        lowLightBoostControl.getHighSpeedVideoFpsRangesFor(lowLightBoostControl.getOutputFormats, num.intValue() != 1 ? 0 : 1);
                    }
                }
            }, useCaseThreads.getSequentialExecutor());
        }
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    /* renamed from: getRequestControl, reason: from getter */
    public final androidx.camera.camera2.impl.UseCaseCameraRequestControl getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void setRequestControl(androidx.camera.camera2.impl.UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this.getHighSpeedVideoSizes = useCaseCameraRequestControl;
        if (this.getHighSpeedVideoSizesFor) {
            if (useCaseCameraRequestControl != null) {
                setLowLightBoostAsync(true, false);
            } else {
                getHighSpeedVideoFpsRangesFor(this.getOutputFormats, 0);
            }
        }
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void reset() {
        getHighSpeedVideoFpsRangesFor();
        setLowLightBoostAsync$default(this, false, false, 2, null);
    }

    public final androidx.view.LiveData<java.lang.Integer> getLowLightBoostStateLiveData() {
        return this.getOutputFormats;
    }

    public final kotlinx.coroutines.Deferred<java.lang.Boolean> getCheckFrameRateJob$camera_camera2() {
        return this.checkFrameRateJob;
    }

    public final void setCheckFrameRateJob$camera_camera2(kotlinx.coroutines.Deferred<java.lang.Boolean> deferred) {
        this.checkFrameRateJob = deferred;
    }

    public final void onSessionConfigChanged(java.util.List<? extends androidx.camera.core.UseCase> useCases) {
        kotlinx.coroutines.Deferred<java.lang.Boolean> async$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCases, "");
        if (this.getOutputMinFrameDuration) {
            if (!useCases.isEmpty()) {
                async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(this.getHighResolutionOutputSizeshNQ4ISI.getSequentialScope(), null, null, new androidx.camera.camera2.impl.LowLightBoostControl$onSessionConfigChanged$1(this, useCases, null), 3, null);
                this.checkFrameRateJob = async$default;
            } else {
                this.checkFrameRateJob = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred(java.lang.Boolean.FALSE);
            }
        }
    }

    public static /* synthetic */ kotlinx.coroutines.Deferred setLowLightBoostAsync$default(androidx.camera.camera2.impl.LowLightBoostControl lowLightBoostControl, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        return lowLightBoostControl.setLowLightBoostAsync(z, z2);
    }

    public final kotlinx.coroutines.Deferred<kotlin.Unit> setLowLightBoostAsync(boolean lowLightBoost, boolean cancelPreviousTask) {
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
        }
        kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        if (this.getOutputMinFrameDuration) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighResolutionOutputSizeshNQ4ISI.getSequentialScope(), null, null, new androidx.camera.camera2.impl.LowLightBoostControl$setLowLightBoostAsync$$inlined$confineLaunch$1(null, this, CompletableDeferred$default, lowLightBoost, cancelPreviousTask), 3, null);
            return CompletableDeferred$default;
        }
        CompletableDeferred$default.completeExceptionally(new java.lang.IllegalStateException("Low Light Boost is not supported!"));
        return CompletableDeferred$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRangesFor() {
        kotlinx.coroutines.CompletableDeferred<kotlin.Unit> completableDeferred = this.getInputSizeshNQ4ISI;
        if (completableDeferred != null) {
            completableDeferred.completeExceptionally(new androidx.camera.core.CameraControl.OperationCanceledException("There is a new enableLowLightBoost being set"));
        }
        this.getInputSizeshNQ4ISI = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRangesFor(androidx.view.MutableLiveData<java.lang.Integer> mutableLiveData, int i) {
        if (this.getInputFormats.getAndSet(i) != i) {
            if (androidx.camera.core.impl.utils.Threads.isMainThread()) {
                mutableLiveData.setValue(java.lang.Integer.valueOf(i));
            } else {
                mutableLiveData.postValue(java.lang.Integer.valueOf(i));
            }
        }
    }

    public static final /* synthetic */ kotlinx.coroutines.CompletableDeferred access$createFailureResult(androidx.camera.camera2.impl.LowLightBoostControl lowLightBoostControl, kotlinx.coroutines.CompletableDeferred completableDeferred, java.lang.Exception exc) {
        completableDeferred.completeExceptionally(exc);
        return completableDeferred;
    }

    public static final /* synthetic */ androidx.camera.core.impl.SessionConfig access$getSessionConfig(androidx.camera.camera2.impl.LowLightBoostControl lowLightBoostControl, java.util.Collection collection) {
        androidx.camera.core.impl.SessionConfig.ValidatingBuilder validatingBuilder = new androidx.camera.core.impl.SessionConfig.ValidatingBuilder();
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            validatingBuilder.add(((androidx.camera.core.UseCase) it.next()).getSessionConfig());
        }
        androidx.camera.core.impl.SessionConfig build = validatingBuilder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }
}
