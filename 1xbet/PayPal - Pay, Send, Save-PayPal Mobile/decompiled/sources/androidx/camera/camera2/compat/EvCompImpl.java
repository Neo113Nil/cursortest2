package androidx.camera.camera2.compat;

@androidx.camera.camera2.config.CameraScope
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u001f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u00138\u0017X\u0097\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010)\u001a\u00020(8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010-8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u00101"}, d2 = {"Landroidx/camera/camera2/compat/EvCompImpl;", "Landroidx/camera/camera2/compat/EvCompCompat;", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "Landroidx/camera/camera2/impl/UseCaseThreads;", "threads", "Landroidx/camera/camera2/impl/ComboRequestListener;", "comboRequestListener", "<init>", "(Landroidx/camera/camera2/impl/CameraProperties;Landroidx/camera/camera2/impl/UseCaseThreads;Landroidx/camera/camera2/impl/ComboRequestListener;)V", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "stopRunningTask", "(Ljava/lang/Throwable;)V", "", "evCompIndex", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "requestControl", "", "cancelPreviousTask", "Lkotlinx/coroutines/Deferred;", "applyAsync", "(ILandroidx/camera/camera2/impl/UseCaseCameraRequestControl;Z)Lkotlinx/coroutines/Deferred;", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/impl/CameraProperties;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Landroidx/camera/camera2/impl/UseCaseThreads;", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/camera2/impl/ComboRequestListener;", "Landroid/util/Range;", "range", "Landroid/util/Range;", "getRange", "()Landroid/util/Range;", "supported", "Z", "getSupported", "()Z", "Landroid/util/Rational;", "step", "Landroid/util/Rational;", "getStep", "()Landroid/util/Rational;", "Lkotlinx/coroutines/CompletableDeferred;", "Lkotlinx/coroutines/CompletableDeferred;", "Landroidx/camera/camera2/pipe/Request$Listener;", "getHighSpeedVideoSizes", "Landroidx/camera/camera2/pipe/Request$Listener;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EvCompImpl implements androidx.camera.camera2.compat.EvCompCompat {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.CameraProperties getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private kotlinx.coroutines.CompletableDeferred<java.lang.Integer> Camera2StreamConfigurationMap;
    private final androidx.camera.camera2.impl.UseCaseThreads getHighSpeedVideoFpsRanges;
    private final androidx.camera.camera2.impl.ComboRequestListener getHighSpeedVideoFpsRangesFor;
    private androidx.camera.camera2.pipe.Request.Listener getHighSpeedVideoSizes;
    private final android.util.Range<java.lang.Integer> range;
    private final android.util.Rational step;
    private final boolean supported;

    @javax.inject.Inject
    public EvCompImpl(androidx.camera.camera2.impl.CameraProperties cameraProperties, androidx.camera.camera2.impl.UseCaseThreads useCaseThreads, androidx.camera.camera2.impl.ComboRequestListener comboRequestListener) {
        java.lang.Integer lower;
        android.util.Rational rational;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraProperties, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseThreads, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comboRequestListener, "");
        this.getHighResolutionOutputSizeshNQ4ISI = cameraProperties;
        this.getHighSpeedVideoFpsRanges = useCaseThreads;
        this.getHighSpeedVideoFpsRangesFor = comboRequestListener;
        androidx.camera.camera2.pipe.CameraMetadata metadata = cameraProperties.getMetadata();
        android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
        java.lang.Object orDefault = metadata.getOrDefault((android.hardware.camera2.CameraCharacteristics.Key<android.hardware.camera2.CameraCharacteristics.Key>) key, (android.hardware.camera2.CameraCharacteristics.Key) androidx.camera.camera2.compat.EvCompCompatKt.getEMPTY_RANGE());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(orDefault, "");
        this.range = (android.util.Range) orDefault;
        java.lang.Integer upper = getRange().getUpper();
        this.supported = (upper == null || upper.intValue() != 0) && ((lower = getRange().getLower()) == null || lower.intValue() != 0);
        if (!getSupported()) {
            rational = android.util.Rational.ZERO;
            kotlin.jvm.internal.Intrinsics.checkNotNull(rational);
        } else {
            androidx.camera.camera2.pipe.CameraMetadata metadata2 = cameraProperties.getMetadata();
            android.hardware.camera2.CameraCharacteristics.Key key2 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key2, "");
            java.lang.Object obj = metadata2.get((android.hardware.camera2.CameraCharacteristics.Key<java.lang.Object>) key2);
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
            rational = (android.util.Rational) obj;
        }
        this.step = rational;
    }

    @Override // androidx.camera.camera2.compat.EvCompCompat
    public final android.util.Range<java.lang.Integer> getRange() {
        return this.range;
    }

    @Override // androidx.camera.camera2.compat.EvCompCompat
    public final boolean getSupported() {
        return this.supported;
    }

    @Override // androidx.camera.camera2.compat.EvCompCompat
    public final android.util.Rational getStep() {
        return this.step;
    }

    @Override // androidx.camera.camera2.compat.EvCompCompat
    public final void stopRunningTask(java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
        kotlinx.coroutines.CompletableDeferred<java.lang.Integer> completableDeferred = this.Camera2StreamConfigurationMap;
        if (completableDeferred != null) {
            completableDeferred.completeExceptionally(throwable);
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.camera.camera2.compat.EvCompImpl$applyAsync$3] */
    @Override // androidx.camera.camera2.compat.EvCompCompat
    public final kotlinx.coroutines.Deferred<java.lang.Integer> applyAsync(final int evCompIndex, androidx.camera.camera2.impl.UseCaseCameraRequestControl requestControl, boolean cancelPreviousTask) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestControl, "");
        final kotlinx.coroutines.CompletableDeferred<java.lang.Integer> CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        kotlinx.coroutines.CompletableDeferred<java.lang.Integer> completableDeferred = this.Camera2StreamConfigurationMap;
        if (completableDeferred != null) {
            if (cancelPreviousTask) {
                completableDeferred.completeExceptionally(new androidx.camera.core.CameraControl.OperationCanceledException("Cancelled by another setExposureCompensationIndex()"));
            } else {
                androidx.camera.camera2.adapter.CoroutineAdaptersKt.propagateTo(CompletableDeferred$default, completableDeferred);
            }
        }
        this.Camera2StreamConfigurationMap = CompletableDeferred$default;
        androidx.camera.camera2.pipe.Request.Listener listener = this.getHighSpeedVideoSizes;
        if (listener != null) {
            this.getHighSpeedVideoFpsRangesFor.removeListener(listener);
            this.getHighSpeedVideoSizes = null;
        }
        androidx.camera.camera2.impl.UseCaseCameraRequestControl.setParametersAsync$default(requestControl, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(android.hardware.camera2.CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, java.lang.Integer.valueOf(evCompIndex))), null, null, 6, null);
        final ?? r9 = new androidx.camera.camera2.pipe.Request.Listener() { // from class: androidx.camera.camera2.compat.EvCompImpl$applyAsync$3
            @Override // androidx.camera.camera2.pipe.Request.Listener
            /* renamed from: onComplete-CcXjc1I */
            public final void mo36onCompleteCcXjc1I(androidx.camera.camera2.pipe.RequestMetadata requestMetadata, long frameNumber, androidx.camera.camera2.pipe.FrameInfo result) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMetadata, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                androidx.camera.camera2.pipe.FrameMetadata metadata = result.getMetadata();
                android.hardware.camera2.CaptureResult.Key key = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
                java.lang.Integer num = (java.lang.Integer) metadata.get(key);
                androidx.camera.camera2.pipe.FrameMetadata metadata2 = result.getMetadata();
                android.hardware.camera2.CaptureResult.Key key2 = android.hardware.camera2.CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key2, "");
                java.lang.Integer num2 = (java.lang.Integer) metadata2.get(key2);
                if (num == null || num2 == null) {
                    if (num2 != null) {
                        if (num2.intValue() == evCompIndex) {
                            CompletableDeferred$default.complete(java.lang.Integer.valueOf(evCompIndex));
                            return;
                        }
                        return;
                    }
                    return;
                }
                int intValue = num.intValue();
                if (intValue == 2 || intValue == 3 || intValue == 4) {
                    if (num2.intValue() == evCompIndex) {
                        CompletableDeferred$default.complete(java.lang.Integer.valueOf(evCompIndex));
                    }
                }
            }
        };
        androidx.camera.camera2.pipe.Request.Listener listener2 = (androidx.camera.camera2.pipe.Request.Listener) r9;
        this.getHighSpeedVideoFpsRangesFor.addListener(listener2, this.getHighSpeedVideoFpsRanges.getSequentialExecutor());
        CompletableDeferred$default.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: androidx.camera.camera2.compat.EvCompImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.camera.camera2.compat.EvCompImpl.m68$r8$lambda$YC4JQEnY8FmJcoebMHC7Y8Vs38(androidx.camera.camera2.compat.EvCompImpl.this, r9, (java.lang.Throwable) obj);
            }
        });
        this.getHighSpeedVideoSizes = listener2;
        return CompletableDeferred$default;
    }

    /* renamed from: $r8$lambda$YC4JQEnY8FmJcoebMHC7Y-8Vs38, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m68$r8$lambda$YC4JQEnY8FmJcoebMHC7Y8Vs38(androidx.camera.camera2.compat.EvCompImpl evCompImpl, androidx.camera.camera2.compat.EvCompImpl$applyAsync$3 evCompImpl$applyAsync$3, java.lang.Throwable th) {
        evCompImpl.getHighSpeedVideoFpsRangesFor.removeListener(evCompImpl$applyAsync$3);
        return kotlin.Unit.INSTANCE;
    }
}
