package androidx.camera.camera2.impl;

@androidx.camera.camera2.config.CameraScope
@kotlin.Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0002TUB1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\"¢\u0006\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00103\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00106\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u00105R(\u0010<\u001a\u0004\u0018\u0001042\b\u00107\u001a\u0004\u0018\u0001048W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020=8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010AR\u0018\u0010E\u001a\u0006*\u00020C0C8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010DR\u0018\u0010F\u001a\u0006*\u00020C0C8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bE\u0010DR\u0018\u0010G\u001a\u0006*\u00020C0C8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u0010DR\u0014\u0010(\u001a\u00020\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001e\u0010>\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010J\u0018\u00010I8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u0010KR\u001e\u0010.\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010L\u0018\u00010I8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010KR\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010M8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bN\u0010OR \u0010P\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010M8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bF\u0010OR\u0018\u0010S\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b@\u0010RR\u0018\u0010N\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010R"}, d2 = {"Landroidx/camera/camera2/impl/FocusMeteringControl;", "Landroidx/camera/camera2/impl/UseCaseCameraControl;", "Landroidx/camera/camera2/impl/UseCaseManager$RunningUseCasesChangeListener;", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "Landroidx/camera/camera2/compat/workaround/MeteringRegionCorrection;", "meteringRegionCorrection", "Landroidx/camera/camera2/impl/State3AControl;", "state3AControl", "Landroidx/camera/camera2/impl/UseCaseThreads;", "threads", "Landroidx/camera/camera2/compat/ZoomCompat;", "zoomCompat", "<init>", "(Landroidx/camera/camera2/impl/CameraProperties;Landroidx/camera/camera2/compat/workaround/MeteringRegionCorrection;Landroidx/camera/camera2/impl/State3AControl;Landroidx/camera/camera2/impl/UseCaseThreads;Landroidx/camera/camera2/compat/ZoomCompat;)V", "", "Landroidx/camera/core/UseCase;", "runningUseCases", "", "onRunningUseCasesChanged", "(Ljava/util/Set;)V", "reset", "()V", "Landroidx/camera/core/FocusMeteringAction;", "action", "", "autoFocusTimeoutMs", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/camera/core/FocusMeteringResult;", "startFocusAndMetering", "(Landroidx/camera/core/FocusMeteringAction;J)Lcom/google/common/util/concurrent/ListenableFuture;", "", "isFocusMeteringSupported", "(Landroidx/camera/core/FocusMeteringAction;)Z", "Lkotlinx/coroutines/Deferred;", "Landroidx/camera/camera2/pipe/Result3A;", "cancelFocusAndMeteringAsync", "()Lkotlinx/coroutines/Deferred;", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/camera2/impl/CameraProperties;", "getOutputSizeshNQ4ISI", "Landroidx/camera/camera2/compat/workaround/MeteringRegionCorrection;", "getHighSpeedVideoFpsRanges", "getOutputStallDuration", "Landroidx/camera/camera2/impl/State3AControl;", "getHighResolutionOutputSizeshNQ4ISI", "getOutputSizes", "Landroidx/camera/camera2/impl/UseCaseThreads;", "Camera2StreamConfigurationMap", "isOutputSupportedForhNQ4ISI", "Landroidx/camera/camera2/compat/ZoomCompat;", "getHighSpeedVideoSizes", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "getInputSizeshNQ4ISI", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getRequestControl", "()Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "setRequestControl", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;)V", "requestControl", "Landroid/util/Rational;", "getOutputStallDurationlomOqCM", "Landroid/util/Rational;", "getInputFormats", "()Landroid/util/Rational;", "getOutputFormats", "", "Ljava/lang/Integer;", "getOutputMinFrameDuration", "getHighSpeedVideoSizesFor", "getOutputMinFrameDurationlomOqCM", "Z", "", "Landroidx/camera/camera2/pipe/AeMode;", "Ljava/util/List;", "Landroidx/camera/camera2/pipe/AfMode;", "Lkotlinx/coroutines/CompletableDeferred;", "isOutputSupportedFor", "Lkotlinx/coroutines/CompletableDeferred;", "unwrapAs", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "getValidOutputFormatsForInputhNQ4ISI", "Companion", "Bindings"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FocusMeteringControl implements androidx.camera.camera2.impl.UseCaseCameraControl, androidx.camera.camera2.impl.UseCaseManager.RunningUseCasesChangeListener {
    public static final long AUTO_FOCUS_TIMEOUT_DURATION = 5000;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.impl.FocusMeteringControl.Companion INSTANCE = new androidx.camera.camera2.impl.FocusMeteringControl.Companion(null);
    public static final int METERING_WEIGHT_DEFAULT = 1000;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.List<androidx.camera.camera2.pipe.AeMode> getOutputStallDurationlomOqCM;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private kotlinx.coroutines.Job isOutputSupportedFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.List<androidx.camera.camera2.pipe.AfMode> getOutputSizes;
    private final androidx.camera.camera2.impl.CameraProperties getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.camera.camera2.impl.UseCaseCameraRequestControl getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private kotlinx.coroutines.CompletableDeferred<androidx.camera.camera2.pipe.Result3A> unwrapAs;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getValidOutputFormatsForInputhNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.Integer getOutputMinFrameDurationlomOqCM;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final java.lang.Integer getOutputMinFrameDuration;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final java.lang.Integer getHighSpeedVideoSizesFor;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final boolean getOutputSizeshNQ4ISI;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.UseCaseThreads Camera2StreamConfigurationMap;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.camera2.compat.workaround.MeteringRegionCorrection getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.State3AControl getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private android.util.Rational getInputFormats;

    /* renamed from: isOutputSupportedFor, reason: from kotlin metadata */
    private kotlinx.coroutines.CompletableDeferred<androidx.camera.core.FocusMeteringResult> getOutputStallDuration;

    /* renamed from: isOutputSupportedForhNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.camera2.compat.ZoomCompat getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/impl/FocusMeteringControl$Bindings;", "", "<init>", "()V", "Landroidx/camera/camera2/impl/FocusMeteringControl;", "focusMeteringControl", "Landroidx/camera/camera2/impl/UseCaseCameraControl;", "provideControls", "(Landroidx/camera/camera2/impl/FocusMeteringControl;)Landroidx/camera/camera2/impl/UseCaseCameraControl;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @dagger.Module
    public static abstract class Bindings {
        @dagger.Binds
        @dagger.multibindings.IntoSet
        public abstract androidx.camera.camera2.impl.UseCaseCameraControl provideControls(androidx.camera.camera2.impl.FocusMeteringControl focusMeteringControl);
    }

    @javax.inject.Inject
    public FocusMeteringControl(androidx.camera.camera2.impl.CameraProperties cameraProperties, androidx.camera.camera2.compat.workaround.MeteringRegionCorrection meteringRegionCorrection, androidx.camera.camera2.impl.State3AControl state3AControl, androidx.camera.camera2.impl.UseCaseThreads useCaseThreads, androidx.camera.camera2.compat.ZoomCompat zoomCompat) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraProperties, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(meteringRegionCorrection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state3AControl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseThreads, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zoomCompat, "");
        this.getHighSpeedVideoFpsRangesFor = cameraProperties;
        this.getHighSpeedVideoFpsRanges = meteringRegionCorrection;
        this.getHighResolutionOutputSizeshNQ4ISI = state3AControl;
        this.Camera2StreamConfigurationMap = useCaseThreads;
        this.getHighSpeedVideoSizes = zoomCompat;
        androidx.camera.camera2.pipe.CameraMetadata metadata = cameraProperties.getMetadata();
        android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AF;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        this.getOutputMinFrameDuration = (java.lang.Integer) metadata.getOrDefault((android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.CameraCharacteristics.Key>) key, (android.hardware.camera2.CameraCharacteristics.Key) 0);
        androidx.camera.camera2.pipe.CameraMetadata metadata2 = cameraProperties.getMetadata();
        android.hardware.camera2.CameraCharacteristics.Key key2 = android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key2, "");
        this.getHighSpeedVideoSizesFor = (java.lang.Integer) metadata2.getOrDefault((android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.CameraCharacteristics.Key>) key2, (android.hardware.camera2.CameraCharacteristics.Key) 0);
        androidx.camera.camera2.pipe.CameraMetadata metadata3 = cameraProperties.getMetadata();
        android.hardware.camera2.CameraCharacteristics.Key key3 = android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AWB;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key3, "");
        this.getOutputMinFrameDurationlomOqCM = (java.lang.Integer) metadata3.getOrDefault((android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.CameraCharacteristics.Key>) key3, (android.hardware.camera2.CameraCharacteristics.Key) 0);
        this.getOutputSizeshNQ4ISI = androidx.camera.camera2.pipe.CameraMetadata.INSTANCE.getSupportsAutoFocusTrigger(cameraProperties.getMetadata());
        androidx.camera.camera2.pipe.CameraMetadata metadata4 = cameraProperties.getMetadata();
        android.hardware.camera2.CameraCharacteristics.Key key4 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key4, "");
        int[] iArr = (int[]) metadata4.get(key4);
        java.util.ArrayList arrayList2 = null;
        if (iArr != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList(iArr.length);
            for (int i : iArr) {
                arrayList3.add(androidx.camera.camera2.pipe.AeMode.INSTANCE.m159fromIntOrNullkQd0u18(i));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        this.getOutputStallDurationlomOqCM = arrayList;
        androidx.camera.camera2.pipe.CameraMetadata metadata5 = this.getHighSpeedVideoFpsRangesFor.getMetadata();
        android.hardware.camera2.CameraCharacteristics.Key key5 = android.hardware.camera2.CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key5, "");
        int[] iArr2 = (int[]) metadata5.get(key5);
        if (iArr2 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList(iArr2.length);
            for (int i2 : iArr2) {
                arrayList4.add(androidx.camera.camera2.pipe.AfMode.INSTANCE.m177fromIntOrNullMKXwA8g(i2));
            }
            arrayList2 = arrayList4;
        }
        this.getOutputSizes = arrayList2;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    /* renamed from: getRequestControl, reason: from getter */
    public final androidx.camera.camera2.impl.UseCaseCameraRequestControl getGetHighSpeedVideoSizes() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void setRequestControl(androidx.camera.camera2.impl.UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this.getInputSizeshNQ4ISI = useCaseCameraRequestControl;
    }

    @Override // androidx.camera.camera2.impl.UseCaseManager.RunningUseCasesChangeListener
    public final void onRunningUseCasesChanged(java.util.Set<? extends androidx.camera.core.UseCase> runningUseCases) {
        android.util.Size attachedSurfaceResolution;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runningUseCases, "");
        this.getInputFormats = null;
        for (androidx.camera.core.UseCase useCase : runningUseCases) {
            if ((useCase instanceof androidx.camera.core.Preview) && (attachedSurfaceResolution = ((androidx.camera.core.Preview) useCase).getAttachedSurfaceResolution()) != null) {
                this.getInputFormats = new android.util.Rational(attachedSurfaceResolution.getWidth(), attachedSurfaceResolution.getHeight());
            }
        }
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void reset() {
        this.getInputFormats = null;
        cancelFocusAndMeteringAsync();
    }

    private final android.util.Rational getHighResolutionOutputSizeshNQ4ISI() {
        android.util.Rational rational = this.getInputFormats;
        return rational == null ? new android.util.Rational(this.getHighSpeedVideoSizes.getCropSensorRegion().width(), this.getHighSpeedVideoSizes.getCropSensorRegion().height()) : rational;
    }

    public static /* synthetic */ com.google.common.util.concurrent.ListenableFuture startFocusAndMetering$default(androidx.camera.camera2.impl.FocusMeteringControl focusMeteringControl, androidx.camera.core.FocusMeteringAction focusMeteringAction, long j, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 5000;
        }
        return focusMeteringControl.startFocusAndMetering(focusMeteringAction, j);
    }

    public final com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.FocusMeteringResult> startFocusAndMetering(androidx.camera.core.FocusMeteringAction action, long autoFocusTimeoutMs) {
        java.util.List<android.hardware.camera2.params.MeteringRectangle> list;
        java.util.List<android.hardware.camera2.params.MeteringRectangle> list2;
        java.util.List<android.hardware.camera2.params.MeteringRectangle> list3;
        final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> update3aRegions;
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job launch$default2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        final kotlinx.coroutines.CompletableDeferred<androidx.camera.core.FocusMeteringResult> CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        androidx.camera.camera2.impl.UseCaseCameraRequestControl getHighSpeedVideoSizes = getGetHighSpeedVideoSizes();
        if (getHighSpeedVideoSizes != null) {
            kotlinx.coroutines.Job job = this.getValidOutputFormatsForInputhNQ4ISI;
            if (job != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
            kotlinx.coroutines.Job job2 = this.isOutputSupportedFor;
            if (job2 != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
            kotlinx.coroutines.CompletableDeferred<androidx.camera.camera2.pipe.Result3A> completableDeferred = this.unwrapAs;
            if (completableDeferred != null) {
                completableDeferred.completeExceptionally(new androidx.camera.core.CameraControl.OperationCanceledException("Cancelled by another startFocusAndMetering()"));
            }
            kotlinx.coroutines.CompletableDeferred<androidx.camera.core.FocusMeteringResult> completableDeferred2 = this.getOutputStallDuration;
            if (completableDeferred2 != null) {
                completableDeferred2.completeExceptionally(new androidx.camera.core.CameraControl.OperationCanceledException("Cancelled by another startFocusAndMetering()"));
            }
            this.getOutputStallDuration = CompletableDeferred$default;
            androidx.camera.camera2.impl.FocusMeteringControl.Companion companion = INSTANCE;
            java.util.List<androidx.camera.core.MeteringPoint> meteringPointsAe = action.getMeteringPointsAe();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(meteringPointsAe, "");
            java.lang.Integer num = this.getHighSpeedVideoSizesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num, "");
            java.util.List<android.hardware.camera2.params.MeteringRectangle> meteringRegionsFromMeteringPoints = companion.meteringRegionsFromMeteringPoints(meteringPointsAe, num.intValue(), this.getHighSpeedVideoSizes.getCropSensorRegion(), getHighResolutionOutputSizeshNQ4ISI(), 2, this.getHighSpeedVideoFpsRanges);
            java.util.List<androidx.camera.core.MeteringPoint> meteringPointsAf = action.getMeteringPointsAf();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(meteringPointsAf, "");
            java.lang.Integer num2 = this.getOutputMinFrameDuration;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num2, "");
            java.util.List<android.hardware.camera2.params.MeteringRectangle> meteringRegionsFromMeteringPoints2 = companion.meteringRegionsFromMeteringPoints(meteringPointsAf, num2.intValue(), this.getHighSpeedVideoSizes.getCropSensorRegion(), getHighResolutionOutputSizeshNQ4ISI(), 1, this.getHighSpeedVideoFpsRanges);
            java.util.List<androidx.camera.core.MeteringPoint> meteringPointsAwb = action.getMeteringPointsAwb();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(meteringPointsAwb, "");
            java.lang.Integer num3 = this.getOutputMinFrameDurationlomOqCM;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num3, "");
            java.util.List<android.hardware.camera2.params.MeteringRectangle> meteringRegionsFromMeteringPoints3 = companion.meteringRegionsFromMeteringPoints(meteringPointsAwb, num3.intValue(), this.getHighSpeedVideoSizes.getCropSensorRegion(), getHighResolutionOutputSizeshNQ4ISI(), 4, this.getHighSpeedVideoFpsRanges);
            if (meteringRegionsFromMeteringPoints.isEmpty() && meteringRegionsFromMeteringPoints2.isEmpty() && meteringRegionsFromMeteringPoints3.isEmpty()) {
                CompletableDeferred$default.completeExceptionally(new java.lang.IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
                return androidx.camera.camera2.adapter.CoroutineAdaptersKt.asListenableFuture$default((kotlinx.coroutines.Deferred) CompletableDeferred$default, (java.lang.Object) null, 1, (java.lang.Object) null);
            }
            java.util.List<android.hardware.camera2.params.MeteringRectangle> list4 = meteringRegionsFromMeteringPoints2;
            if (!list4.isEmpty()) {
                this.getHighResolutionOutputSizeshNQ4ISI.setPreferredFocusModeAsync(1);
            }
            if (this.getHighSpeedVideoSizesFor.intValue() > 0) {
                java.util.List<android.hardware.camera2.params.MeteringRectangle> list5 = meteringRegionsFromMeteringPoints;
                if (list5.isEmpty()) {
                    list5 = kotlin.collections.ArraysKt.toList(androidx.camera.camera2.pipe.CameraGraph.Constants3A.INSTANCE.getMETERING_REGIONS_DEFAULT());
                }
                list = list5;
            } else {
                list = null;
            }
            if (this.getOutputMinFrameDuration.intValue() > 0) {
                list2 = list4.isEmpty() ? kotlin.collections.ArraysKt.toList(androidx.camera.camera2.pipe.CameraGraph.Constants3A.INSTANCE.getMETERING_REGIONS_DEFAULT()) : list4;
            } else {
                list2 = null;
            }
            if (this.getOutputMinFrameDurationlomOqCM.intValue() > 0) {
                java.util.List<android.hardware.camera2.params.MeteringRectangle> list6 = meteringRegionsFromMeteringPoints3;
                if (list6.isEmpty()) {
                    list6 = kotlin.collections.ArraysKt.toList(androidx.camera.camera2.pipe.CameraGraph.Constants3A.INSTANCE.getMETERING_REGIONS_DEFAULT());
                }
                list3 = list6;
            } else {
                list3 = null;
            }
            if (meteringRegionsFromMeteringPoints2.isEmpty() || !this.getOutputSizeshNQ4ISI) {
                androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
                update3aRegions = getHighSpeedVideoSizes.update3aRegions(list, list2, list3);
            } else {
                long autoCancelDurationInMillis = (!action.isAutoCancelEnabled() || action.getAutoCancelDurationInMillis() >= autoFocusTimeoutMs) ? autoFocusTimeoutMs : action.getAutoCancelDurationInMillis();
                androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
                androidx.camera.camera2.pipe.Lock3ABehavior m524boximpl = this.getOutputMinFrameDuration.intValue() > 0 ? androidx.camera.camera2.pipe.Lock3ABehavior.m524boximpl(androidx.camera.camera2.pipe.Lock3ABehavior.INSTANCE.m532getIMMEDIATEhRqSH3k()) : null;
                int m161getONbOjpiJc = androidx.camera.camera2.pipe.AeMode.INSTANCE.m161getONbOjpiJc();
                java.util.List<androidx.camera.camera2.pipe.AeMode> list7 = this.getOutputStallDurationlomOqCM;
                if (list7 != null) {
                    if (!list7.contains(androidx.camera.camera2.pipe.AeMode.m148boximpl(m161getONbOjpiJc))) {
                        if (this.getOutputStallDurationlomOqCM.contains(androidx.camera.camera2.pipe.AeMode.m148boximpl(androidx.camera.camera2.pipe.AeMode.INSTANCE.m161getONbOjpiJc()))) {
                            m161getONbOjpiJc = androidx.camera.camera2.pipe.AeMode.INSTANCE.m161getONbOjpiJc();
                        }
                    }
                    update3aRegions = androidx.camera.camera2.impl.UseCaseCameraRequestControl.m137startFocusAndMeteringAsyncNxRnBj4$default(getHighSpeedVideoSizes, list, list2, list3, null, m524boximpl, null, androidx.camera.camera2.pipe.AeMode.m148boximpl(m161getONbOjpiJc), java.util.concurrent.TimeUnit.NANOSECONDS.convert(autoCancelDurationInMillis, java.util.concurrent.TimeUnit.MILLISECONDS), 40, null);
                }
                m161getONbOjpiJc = androidx.camera.camera2.pipe.AeMode.INSTANCE.m160getOFFbOjpiJc();
                update3aRegions = androidx.camera.camera2.impl.UseCaseCameraRequestControl.m137startFocusAndMeteringAsyncNxRnBj4$default(getHighSpeedVideoSizes, list, list2, list3, null, m524boximpl, null, androidx.camera.camera2.pipe.AeMode.m148boximpl(m161getONbOjpiJc), java.util.concurrent.TimeUnit.NANOSECONDS.convert(autoCancelDurationInMillis, java.util.concurrent.TimeUnit.MILLISECONDS), 40, null);
            }
            final boolean z = !list4.isEmpty();
            update3aRegions.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: androidx.camera.camera2.impl.FocusMeteringControl$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.camera.camera2.impl.FocusMeteringControl.$r8$lambda$acTtX0ZmOPlAGU7Xv4zujOVEEf0(kotlinx.coroutines.CompletableDeferred.this, update3aRegions, this, z, (java.lang.Throwable) obj);
                }
            });
            kotlinx.coroutines.Job job3 = this.getValidOutputFormatsForInputhNQ4ISI;
            if (job3 != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job3, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.Camera2StreamConfigurationMap.getSequentialScope(), null, null, new androidx.camera.camera2.impl.FocusMeteringControl$triggerFocusTimeout$1(autoFocusTimeoutMs, CompletableDeferred$default, null), 3, null);
            this.getValidOutputFormatsForInputhNQ4ISI = launch$default;
            if (action.isAutoCancelEnabled()) {
                long autoCancelDurationInMillis2 = action.getAutoCancelDurationInMillis();
                kotlinx.coroutines.Job job4 = this.isOutputSupportedFor;
                if (job4 != null) {
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(job4, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                }
                launch$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.Camera2StreamConfigurationMap.getSequentialScope(), null, null, new androidx.camera.camera2.impl.FocusMeteringControl$triggerAutoCancel$1(autoCancelDurationInMillis2, this, getHighSpeedVideoSizes, CompletableDeferred$default, null), 3, null);
                this.isOutputSupportedFor = launch$default2;
            }
        } else {
            CompletableDeferred$default.completeExceptionally(new androidx.camera.core.CameraControl.OperationCanceledException("Camera is not active."));
        }
        return androidx.camera.camera2.adapter.CoroutineAdaptersKt.asListenableFuture$default((kotlinx.coroutines.Deferred) CompletableDeferred$default, (java.lang.Object) null, 1, (java.lang.Object) null);
    }

    public final boolean isFocusMeteringSupported(androidx.camera.core.FocusMeteringAction action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        androidx.camera.camera2.impl.FocusMeteringControl.Companion companion = INSTANCE;
        java.util.List<androidx.camera.core.MeteringPoint> meteringPointsAe = action.getMeteringPointsAe();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(meteringPointsAe, "");
        java.lang.Integer num = this.getHighSpeedVideoSizesFor;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num, "");
        java.util.List<android.hardware.camera2.params.MeteringRectangle> meteringRegionsFromMeteringPoints = companion.meteringRegionsFromMeteringPoints(meteringPointsAe, num.intValue(), this.getHighSpeedVideoSizes.getCropSensorRegion(), getHighResolutionOutputSizeshNQ4ISI(), 2, this.getHighSpeedVideoFpsRanges);
        java.util.List<androidx.camera.core.MeteringPoint> meteringPointsAf = action.getMeteringPointsAf();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(meteringPointsAf, "");
        java.lang.Integer num2 = this.getOutputMinFrameDuration;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num2, "");
        java.util.List<android.hardware.camera2.params.MeteringRectangle> meteringRegionsFromMeteringPoints2 = companion.meteringRegionsFromMeteringPoints(meteringPointsAf, num2.intValue(), this.getHighSpeedVideoSizes.getCropSensorRegion(), getHighResolutionOutputSizeshNQ4ISI(), 1, this.getHighSpeedVideoFpsRanges);
        java.util.List<androidx.camera.core.MeteringPoint> meteringPointsAwb = action.getMeteringPointsAwb();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(meteringPointsAwb, "");
        java.lang.Integer num3 = this.getOutputMinFrameDurationlomOqCM;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num3, "");
        return (meteringRegionsFromMeteringPoints.isEmpty() && meteringRegionsFromMeteringPoints2.isEmpty() && companion.meteringRegionsFromMeteringPoints(meteringPointsAwb, num3.intValue(), this.getHighSpeedVideoSizes.getCropSensorRegion(), getHighResolutionOutputSizeshNQ4ISI(), 4, this.getHighSpeedVideoFpsRanges).isEmpty()) ? false : true;
    }

    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> cancelFocusAndMeteringAsync() {
        kotlinx.coroutines.CompletableDeferred<androidx.camera.camera2.pipe.Result3A> CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        androidx.camera.camera2.impl.UseCaseCameraRequestControl getHighSpeedVideoSizes = getGetHighSpeedVideoSizes();
        if (getHighSpeedVideoSizes != null) {
            kotlinx.coroutines.Job job = this.getValidOutputFormatsForInputhNQ4ISI;
            if (job != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
            kotlinx.coroutines.Job job2 = this.isOutputSupportedFor;
            if (job2 != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
            kotlinx.coroutines.CompletableDeferred<androidx.camera.camera2.pipe.Result3A> completableDeferred = this.unwrapAs;
            if (completableDeferred != null) {
                completableDeferred.completeExceptionally(new androidx.camera.core.CameraControl.OperationCanceledException("Cancelled by another cancelFocusAndMetering()"));
            }
            this.unwrapAs = CompletableDeferred$default;
            kotlinx.coroutines.CompletableDeferred<androidx.camera.core.FocusMeteringResult> completableDeferred2 = this.getOutputStallDuration;
            if (completableDeferred2 != null) {
                completableDeferred2.completeExceptionally(new androidx.camera.core.CameraControl.OperationCanceledException("Cancelled by cancelFocusAndMetering()"));
            }
            this.getHighResolutionOutputSizeshNQ4ISI.setPreferredFocusModeAsync(null);
            androidx.camera.camera2.adapter.CoroutineAdaptersKt.propagateTo(getHighSpeedVideoSizes.cancelFocusAndMeteringAsync(), CompletableDeferred$default);
        } else {
            CompletableDeferred$default.completeExceptionally(new androidx.camera.core.CameraControl.OperationCanceledException("Camera is not active."));
        }
        return CompletableDeferred$default;
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00078\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/camera/camera2/impl/FocusMeteringControl$Companion;", "", "<init>", "()V", "", "Landroidx/camera/core/MeteringPoint;", "meteringPoints", "", "maxRegionCount", "Landroid/graphics/Rect;", "cropSensorRegion", "Landroid/util/Rational;", "defaultAspectRatio", "meteringMode", "Landroidx/camera/camera2/compat/workaround/MeteringRegionCorrection;", "meteringRegionCorrection", "Landroid/hardware/camera2/params/MeteringRectangle;", "meteringRegionsFromMeteringPoints", "(Ljava/util/List;ILandroid/graphics/Rect;Landroid/util/Rational;ILandroidx/camera/camera2/compat/workaround/MeteringRegionCorrection;)Ljava/util/List;", "METERING_WEIGHT_DEFAULT", com.visa.cbp.getEncExpo.warmup, "", "AUTO_FOCUS_TIMEOUT_DURATION", "J"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.util.List<android.hardware.camera2.params.MeteringRectangle> meteringRegionsFromMeteringPoints(java.util.List<? extends androidx.camera.core.MeteringPoint> meteringPoints, int maxRegionCount, android.graphics.Rect cropSensorRegion, android.util.Rational defaultAspectRatio, int meteringMode, androidx.camera.camera2.compat.workaround.MeteringRegionCorrection meteringRegionCorrection) {
            android.graphics.PointF pointF;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(meteringPoints, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cropSensorRegion, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultAspectRatio, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(meteringRegionCorrection, "");
            if (meteringPoints.isEmpty() || maxRegionCount == 0) {
                return kotlin.collections.CollectionsKt.emptyList();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            android.util.Rational rational = new android.util.Rational(cropSensorRegion.width(), cropSensorRegion.height());
            for (androidx.camera.core.MeteringPoint meteringPoint : meteringPoints) {
                if (arrayList.size() >= maxRegionCount) {
                    break;
                }
                if (meteringPoint.getX() >= 0.0f && meteringPoint.getX() <= 1.0f && meteringPoint.getY() >= 0.0f && meteringPoint.getY() <= 1.0f) {
                    android.util.Rational surfaceAspectRatio = meteringPoint.getSurfaceAspectRatio();
                    if (surfaceAspectRatio == null) {
                        surfaceAspectRatio = defaultAspectRatio;
                    }
                    android.graphics.PointF correctedPoint = meteringRegionCorrection.getCorrectedPoint(meteringPoint, meteringMode);
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(surfaceAspectRatio, rational)) {
                        if (surfaceAspectRatio.compareTo(rational) > 0) {
                            pointF = new android.graphics.PointF(correctedPoint.x, correctedPoint.y);
                            float doubleValue = (float) (surfaceAspectRatio.doubleValue() / rational.doubleValue());
                            pointF.y = (((float) ((doubleValue - 1.0d) / 2.0d)) + pointF.y) * (1.0f / doubleValue);
                        } else {
                            pointF = new android.graphics.PointF(correctedPoint.x, correctedPoint.y);
                            float doubleValue2 = (float) (rational.doubleValue() / surfaceAspectRatio.doubleValue());
                            pointF.x = (((float) ((doubleValue2 - 1.0d) / 2.0d)) + pointF.x) * (1.0f / doubleValue2);
                        }
                    } else {
                        pointF = new android.graphics.PointF(correctedPoint.x, correctedPoint.y);
                    }
                    float size = meteringPoint.getSize();
                    int width = (int) (cropSensorRegion.left + (pointF.x * cropSensorRegion.width()));
                    int height = (int) (cropSensorRegion.top + (pointF.y * cropSensorRegion.height()));
                    int width2 = ((int) (cropSensorRegion.width() * size)) / 2;
                    int height2 = ((int) (size * cropSensorRegion.height())) / 2;
                    android.graphics.Rect rect = new android.graphics.Rect(width - width2, height - height2, width + width2, height + height2);
                    rect.left = kotlin.ranges.RangesKt.coerceIn(rect.left, cropSensorRegion.left, cropSensorRegion.right);
                    rect.right = kotlin.ranges.RangesKt.coerceIn(rect.right, cropSensorRegion.left, cropSensorRegion.right);
                    rect.top = kotlin.ranges.RangesKt.coerceIn(rect.top, cropSensorRegion.top, cropSensorRegion.bottom);
                    rect.bottom = kotlin.ranges.RangesKt.coerceIn(rect.bottom, cropSensorRegion.top, cropSensorRegion.bottom);
                    arrayList.add(new android.hardware.camera2.params.MeteringRectangle(rect, 1000));
                }
            }
            return arrayList;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$acTtX0ZmOPlAGU7Xv4zujOVEEf0(kotlinx.coroutines.CompletableDeferred completableDeferred, kotlinx.coroutines.Deferred deferred, androidx.camera.camera2.impl.FocusMeteringControl focusMeteringControl, boolean z, java.lang.Throwable th) {
        java.lang.Integer num;
        androidx.camera.core.FocusMeteringResult create;
        if (th != null) {
            androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isWarnEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
            completableDeferred.completeExceptionally(th);
        } else {
            androidx.camera.camera2.pipe.Result3A result3A = (androidx.camera.camera2.pipe.Result3A) deferred.getCompleted();
            androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
            if (androidx.camera.camera2.pipe.Result3A.Status.m693equalsimpl0(result3A.m690getStatusJvTi9ms(), androidx.camera.camera2.pipe.Result3A.Status.INSTANCE.m700getSUBMIT_FAILEDJvTi9ms())) {
                completableDeferred.completeExceptionally(new androidx.camera.core.CameraControl.OperationCanceledException("Camera is not active."));
            } else {
                boolean z2 = false;
                if (androidx.camera.camera2.pipe.Result3A.Status.m693equalsimpl0(result3A.m690getStatusJvTi9ms(), androidx.camera.camera2.pipe.Result3A.Status.INSTANCE.m701getTIME_LIMIT_REACHEDJvTi9ms())) {
                    androidx.camera.core.FocusMeteringResult create2 = androidx.camera.core.FocusMeteringResult.create(false);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create2, "");
                    completableDeferred.complete(create2);
                } else {
                    if (!androidx.camera.camera2.pipe.Result3A.Status.m693equalsimpl0(result3A.m690getStatusJvTi9ms(), androidx.camera.camera2.pipe.Result3A.Status.INSTANCE.m698getOKJvTi9ms())) {
                        create = androidx.camera.core.FocusMeteringResult.create(false);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
                    } else {
                        androidx.camera.camera2.pipe.FrameMetadata frameMetadata = result3A.getFrameMetadata();
                        if (frameMetadata != null) {
                            android.hardware.camera2.CaptureResult.Key key = android.hardware.camera2.CaptureResult.CONTROL_AF_STATE;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
                            num = (java.lang.Integer) frameMetadata.get(key);
                        } else {
                            num = null;
                        }
                        if (z) {
                            int m178getAUTOvHZNRtE = androidx.camera.camera2.pipe.AfMode.INSTANCE.m178getAUTOvHZNRtE();
                            java.util.List<androidx.camera.camera2.pipe.AfMode> list = focusMeteringControl.getOutputSizes;
                            if (list == null || !list.contains(androidx.camera.camera2.pipe.AfMode.m167boximpl(m178getAUTOvHZNRtE)) || (result3A.getFrameMetadata() != null && (num == null || num.intValue() == 4))) {
                                z2 = true;
                            }
                        }
                        create = androidx.camera.core.FocusMeteringResult.create(z2);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
                    }
                    completableDeferred.complete(create);
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ kotlinx.coroutines.Deferred access$cancelFocusAndMeteringNowAsync(androidx.camera.camera2.impl.FocusMeteringControl focusMeteringControl, androidx.camera.camera2.impl.UseCaseCameraRequestControl useCaseCameraRequestControl, kotlinx.coroutines.CompletableDeferred completableDeferred) {
        if (completableDeferred != null) {
            completableDeferred.completeExceptionally(new androidx.camera.core.CameraControl.OperationCanceledException("Cancelled by cancelFocusAndMetering()"));
        }
        focusMeteringControl.getHighResolutionOutputSizeshNQ4ISI.setPreferredFocusModeAsync(null);
        return useCaseCameraRequestControl.cancelFocusAndMeteringAsync();
    }
}
