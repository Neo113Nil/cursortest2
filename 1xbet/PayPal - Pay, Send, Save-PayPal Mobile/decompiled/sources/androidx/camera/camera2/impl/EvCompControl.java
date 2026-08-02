package androidx.camera.camera2.impl;

@androidx.camera.camera2.config.CameraScope
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001%B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\r2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\t8\u0002@CX\u0082\f¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u0017\u001a\u00020\u00168\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR(\u0010$\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#"}, d2 = {"Landroidx/camera/camera2/impl/EvCompControl;", "Landroidx/camera/camera2/impl/UseCaseCameraControl;", "Landroidx/camera/camera2/compat/EvCompCompat;", "compat", "<init>", "(Landroidx/camera/camera2/compat/EvCompCompat;)V", "", "reset", "()V", "", "exposureIndex", "", "cancelPreviousTask", "Lkotlinx/coroutines/Deferred;", "updateAsync", "(IZ)Lkotlinx/coroutines/Deferred;", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/camera2/compat/EvCompCompat;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "Landroidx/camera/camera2/adapter/EvCompValue;", "exposureState", "Landroidx/camera/camera2/adapter/EvCompValue;", "getExposureState", "()Landroidx/camera/camera2/adapter/EvCompValue;", "setExposureState", "(Landroidx/camera/camera2/adapter/EvCompValue;)V", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getRequestControl", "()Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "setRequestControl", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;)V", "requestControl", "Bindings"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EvCompControl implements androidx.camera.camera2.impl.UseCaseCameraControl {
    private androidx.camera.camera2.adapter.EvCompValue exposureState;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.camera.camera2.impl.UseCaseCameraRequestControl getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.camera.camera2.compat.EvCompCompat getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges;

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/impl/EvCompControl$Bindings;", "", "<init>", "()V", "Landroidx/camera/camera2/impl/EvCompControl;", "evCompControl", "Landroidx/camera/camera2/impl/UseCaseCameraControl;", "provideControls", "(Landroidx/camera/camera2/impl/EvCompControl;)Landroidx/camera/camera2/impl/UseCaseCameraControl;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @dagger.Module
    public static abstract class Bindings {
        @dagger.Binds
        @dagger.multibindings.IntoSet
        public abstract androidx.camera.camera2.impl.UseCaseCameraControl provideControls(androidx.camera.camera2.impl.EvCompControl evCompControl);
    }

    @javax.inject.Inject
    public EvCompControl(androidx.camera.camera2.compat.EvCompCompat evCompCompat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evCompCompat, "");
        this.getHighResolutionOutputSizeshNQ4ISI = evCompCompat;
        this.exposureState = new androidx.camera.camera2.adapter.EvCompValue(evCompCompat.getSupported(), this.getHighSpeedVideoFpsRanges, evCompCompat.getRange(), evCompCompat.getStep());
    }

    public final androidx.camera.camera2.adapter.EvCompValue getExposureState() {
        return this.exposureState;
    }

    public final void setExposureState(androidx.camera.camera2.adapter.EvCompValue evCompValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evCompValue, "");
        this.exposureState = evCompValue;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    /* renamed from: getRequestControl, reason: from getter */
    public final androidx.camera.camera2.impl.UseCaseCameraRequestControl getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void setRequestControl(androidx.camera.camera2.impl.UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this.getHighSpeedVideoSizes = useCaseCameraRequestControl;
        updateAsync(this.getHighSpeedVideoFpsRanges, false);
    }

    public static /* synthetic */ kotlinx.coroutines.Deferred updateAsync$default(androidx.camera.camera2.impl.EvCompControl evCompControl, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        return evCompControl.updateAsync(i, z);
    }

    public final kotlinx.coroutines.Deferred<java.lang.Integer> updateAsync(int exposureIndex, boolean cancelPreviousTask) {
        if (!this.getHighResolutionOutputSizeshNQ4ISI.getSupported()) {
            java.lang.IllegalArgumentException illegalArgumentException = new java.lang.IllegalArgumentException("ExposureCompensation is not supported");
            kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            CompletableDeferred$default.completeExceptionally(illegalArgumentException);
            return CompletableDeferred$default;
        }
        if (!this.getHighResolutionOutputSizeshNQ4ISI.getRange().contains((android.util.Range<java.lang.Integer>) java.lang.Integer.valueOf(exposureIndex))) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Requested ExposureCompensation ");
            sb.append(exposureIndex);
            sb.append(" is not within valid range [");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI.getRange().getUpper());
            sb.append(" .. ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI.getRange().getLower());
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            java.lang.IllegalArgumentException illegalArgumentException2 = new java.lang.IllegalArgumentException(sb.toString());
            kotlinx.coroutines.CompletableDeferred CompletableDeferred$default2 = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            CompletableDeferred$default2.completeExceptionally(illegalArgumentException2);
            return CompletableDeferred$default2;
        }
        androidx.camera.camera2.impl.UseCaseCameraRequestControl getHighSpeedVideoSizes = getGetHighSpeedVideoSizes();
        if (getHighSpeedVideoSizes != null) {
            this.getHighSpeedVideoFpsRanges = exposureIndex;
            this.exposureState = this.exposureState.updateIndex$camera_camera2(exposureIndex);
            kotlinx.coroutines.Deferred<java.lang.Integer> applyAsync = this.getHighResolutionOutputSizeshNQ4ISI.applyAsync(exposureIndex, getHighSpeedVideoSizes, cancelPreviousTask);
            if (applyAsync != null) {
                return applyAsync;
            }
        }
        androidx.camera.core.CameraControl.OperationCanceledException operationCanceledException = new androidx.camera.core.CameraControl.OperationCanceledException("Camera is not active.");
        this.getHighResolutionOutputSizeshNQ4ISI.stopRunningTask(operationCanceledException);
        kotlinx.coroutines.CompletableDeferred CompletableDeferred$default3 = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        CompletableDeferred$default3.completeExceptionally(operationCanceledException);
        return CompletableDeferred$default3;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void reset() {
        this.getHighSpeedVideoFpsRanges = 0;
        this.exposureState = this.exposureState.updateIndex$camera_camera2(0);
        updateAsync$default(this, 0, false, 2, null);
    }
}
