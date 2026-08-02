package androidx.camera.camera2.impl;

@androidx.camera.camera2.config.CameraScope
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002)*B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ9\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000b0\u00112\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR(\u0010%\u001a\u0004\u0018\u00010\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001e8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010("}, d2 = {"Landroidx/camera/camera2/impl/StillCaptureRequestControl;", "Landroidx/camera/camera2/impl/UseCaseCameraControl;", "Landroidx/camera/camera2/impl/FlashControl;", "flashControl", "Landroidx/camera/camera2/impl/UseCaseThreads;", "threads", "<init>", "(Landroidx/camera/camera2/impl/FlashControl;Landroidx/camera/camera2/impl/UseCaseThreads;)V", "", "reset", "()V", "", "Landroidx/camera/core/impl/CaptureConfig;", "captureConfigs", "", "captureMode", "flashType", "Lcom/google/common/util/concurrent/ListenableFuture;", "Ljava/lang/Void;", "issueCaptureRequests", "(Ljava/util/List;II)Lcom/google/common/util/concurrent/ListenableFuture;", "getHighSpeedVideoFpsRanges", "Landroidx/camera/camera2/impl/FlashControl;", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/camera2/impl/UseCaseThreads;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/sync/Mutex;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/sync/Mutex;", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getRequestControl", "()Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "setRequestControl", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;)V", "requestControl", "Ljava/util/LinkedList;", "Landroidx/camera/camera2/impl/StillCaptureRequestControl$CaptureRequest;", "Ljava/util/LinkedList;", "CaptureRequest", "Bindings"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StillCaptureRequestControl implements androidx.camera.camera2.impl.UseCaseCameraControl {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.LinkedList<androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.sync.Mutex Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.FlashControl getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.UseCaseThreads getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.camera.camera2.impl.UseCaseCameraRequestControl getHighResolutionOutputSizeshNQ4ISI;

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/impl/StillCaptureRequestControl$Bindings;", "", "<init>", "()V", "Landroidx/camera/camera2/impl/StillCaptureRequestControl;", "control", "Landroidx/camera/camera2/impl/UseCaseCameraControl;", "provideControls", "(Landroidx/camera/camera2/impl/StillCaptureRequestControl;)Landroidx/camera/camera2/impl/UseCaseCameraControl;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @dagger.Module
    public static abstract class Bindings {
        @dagger.Binds
        @dagger.multibindings.IntoSet
        public abstract androidx.camera.camera2.impl.UseCaseCameraControl provideControls(androidx.camera.camera2.impl.StillCaptureRequestControl control);
    }

    @javax.inject.Inject
    public StillCaptureRequestControl(androidx.camera.camera2.impl.FlashControl flashControl, androidx.camera.camera2.impl.UseCaseThreads useCaseThreads) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flashControl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseThreads, "");
        this.getHighSpeedVideoFpsRangesFor = flashControl;
        this.getHighSpeedVideoSizes = useCaseThreads;
        this.Camera2StreamConfigurationMap = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
        this.getHighSpeedVideoFpsRanges = new java.util.LinkedList<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$submitRequest(androidx.camera.camera2.impl.StillCaptureRequestControl stillCaptureRequestControl, androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest captureRequest, androidx.camera.camera2.impl.UseCaseCameraRequestControl useCaseCameraRequestControl, kotlin.coroutines.Continuation continuation) {
        androidx.camera.camera2.impl.StillCaptureRequestControl$submitRequest$1 stillCaptureRequestControl$submitRequest$1;
        int i;
        kotlinx.coroutines.Deferred async$default;
        if (continuation instanceof androidx.camera.camera2.impl.StillCaptureRequestControl$submitRequest$1) {
            stillCaptureRequestControl$submitRequest$1 = (androidx.camera.camera2.impl.StillCaptureRequestControl$submitRequest$1) continuation;
            if ((stillCaptureRequestControl$submitRequest$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                stillCaptureRequestControl$submitRequest$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = stillCaptureRequestControl$submitRequest$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stillCaptureRequestControl$submitRequest$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                    if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                        java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                    }
                    androidx.camera.camera2.impl.FlashControl flashControl = stillCaptureRequestControl.getHighSpeedVideoFpsRangesFor;
                    stillCaptureRequestControl$submitRequest$1.getHighSpeedVideoSizes = captureRequest;
                    stillCaptureRequestControl$submitRequest$1.Camera2StreamConfigurationMap = useCaseCameraRequestControl;
                    stillCaptureRequestControl$submitRequest$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = flashControl.awaitFlashModeUpdate(stillCaptureRequestControl$submitRequest$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    useCaseCameraRequestControl = (androidx.camera.camera2.impl.UseCaseCameraRequestControl) stillCaptureRequestControl$submitRequest$1.Camera2StreamConfigurationMap;
                    captureRequest = (androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest) stillCaptureRequestControl$submitRequest$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                int intValue = ((java.lang.Number) obj).intValue();
                androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
                async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(stillCaptureRequestControl.getHighSpeedVideoSizes.getSequentialScope(), null, null, new androidx.camera.camera2.impl.StillCaptureRequestControl$submitRequest$4(useCaseCameraRequestControl.issueSingleCaptureAsync(captureRequest.getCaptureConfigs(), captureRequest.getCaptureMode(), captureRequest.getFlashType(), intValue), captureRequest, null), 3, null);
                return async$default;
            }
        }
        stillCaptureRequestControl$submitRequest$1 = new androidx.camera.camera2.impl.StillCaptureRequestControl$submitRequest$1(stillCaptureRequestControl, continuation);
        java.lang.Object obj2 = stillCaptureRequestControl$submitRequest$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stillCaptureRequestControl$submitRequest$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        int intValue2 = ((java.lang.Number) obj2).intValue();
        androidx.camera.camera2.impl.Camera2Logger camera2Logger22 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
        }
        async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(stillCaptureRequestControl.getHighSpeedVideoSizes.getSequentialScope(), null, null, new androidx.camera.camera2.impl.StillCaptureRequestControl$submitRequest$4(useCaseCameraRequestControl.issueSingleCaptureAsync(captureRequest.getCaptureConfigs(), captureRequest.getCaptureMode(), captureRequest.getFlashType(), intValue2), captureRequest, null), 3, null);
        return async$default;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    /* renamed from: getRequestControl, reason: from getter */
    public final androidx.camera.camera2.impl.UseCaseCameraRequestControl getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void setRequestControl(androidx.camera.camera2.impl.UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this.getHighResolutionOutputSizeshNQ4ISI = useCaseCameraRequestControl;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoSizes.getSequentialScope(), null, null, new androidx.camera.camera2.impl.StillCaptureRequestControl$trySubmitPendingRequests$1(this, null), 3, null);
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u001e\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JL\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0016\b\u0002\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b\"\u0010\u0010R(\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010\u0013"}, d2 = {"Landroidx/camera/camera2/impl/StillCaptureRequestControl$CaptureRequest;", "", "", "Landroidx/camera/core/impl/CaptureConfig;", "captureConfigs", "", "captureMode", "flashType", "Lkotlinx/coroutines/CompletableDeferred;", "Ljava/lang/Void;", "result", "<init>", "(Ljava/util/List;IILkotlinx/coroutines/CompletableDeferred;)V", "component1", "()Ljava/util/List;", "component2", "()I", "component3", "component4", "()Lkotlinx/coroutines/CompletableDeferred;", "copy", "(Ljava/util/List;IILkotlinx/coroutines/CompletableDeferred;)Landroidx/camera/camera2/impl/StillCaptureRequestControl$CaptureRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getCaptureConfigs", com.visa.cbp.getEncExpo.warmup, "getCaptureMode", "getFlashType", "Lkotlinx/coroutines/CompletableDeferred;", "getResult"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CaptureRequest {
        private final java.util.List<androidx.camera.core.impl.CaptureConfig> captureConfigs;
        private final int captureMode;
        private final int flashType;
        private final kotlinx.coroutines.CompletableDeferred<java.util.List<java.lang.Void>> result;

        public CaptureRequest(java.util.List<androidx.camera.core.impl.CaptureConfig> list, int i, int i2, kotlinx.coroutines.CompletableDeferred<java.util.List<java.lang.Void>> completableDeferred) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completableDeferred, "");
            this.captureConfigs = list;
            this.captureMode = i;
            this.flashType = i2;
            this.result = completableDeferred;
        }

        public final java.util.List<androidx.camera.core.impl.CaptureConfig> getCaptureConfigs() {
            return this.captureConfigs;
        }

        public final int getCaptureMode() {
            return this.captureMode;
        }

        public final int getFlashType() {
            return this.flashType;
        }

        public final kotlinx.coroutines.CompletableDeferred<java.util.List<java.lang.Void>> getResult() {
            return this.result;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CaptureRequest(captureConfigs=");
            sb.append(this.captureConfigs);
            sb.append(", captureMode=");
            sb.append(this.captureMode);
            sb.append(", flashType=");
            sb.append(this.flashType);
            sb.append(", result=");
            sb.append(this.result);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.captureConfigs.hashCode() * 31) + java.lang.Integer.hashCode(this.captureMode)) * 31) + java.lang.Integer.hashCode(this.flashType)) * 31) + this.result.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest)) {
                return false;
            }
            androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest captureRequest = (androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.captureConfigs, captureRequest.captureConfigs) && this.captureMode == captureRequest.captureMode && this.flashType == captureRequest.flashType && kotlin.jvm.internal.Intrinsics.areEqual(this.result, captureRequest.result);
        }

        public final androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest copy(java.util.List<androidx.camera.core.impl.CaptureConfig> captureConfigs, int captureMode, int flashType, kotlinx.coroutines.CompletableDeferred<java.util.List<java.lang.Void>> result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureConfigs, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest(captureConfigs, captureMode, flashType, result);
        }

        public final kotlinx.coroutines.CompletableDeferred<java.util.List<java.lang.Void>> component4() {
            return this.result;
        }

        /* renamed from: component3, reason: from getter */
        public final int getFlashType() {
            return this.flashType;
        }

        /* renamed from: component2, reason: from getter */
        public final int getCaptureMode() {
            return this.captureMode;
        }

        public final java.util.List<androidx.camera.core.impl.CaptureConfig> component1() {
            return this.captureConfigs;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest copy$default(androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest captureRequest, java.util.List list, int i, int i2, kotlinx.coroutines.CompletableDeferred completableDeferred, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                list = captureRequest.captureConfigs;
            }
            if ((i3 & 2) != 0) {
                i = captureRequest.captureMode;
            }
            if ((i3 & 4) != 0) {
                i2 = captureRequest.flashType;
            }
            if ((i3 & 8) != 0) {
                completableDeferred = captureRequest.result;
            }
            return captureRequest.copy(list, i, i2, completableDeferred);
        }
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void reset() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoSizes.getSequentialScope(), null, null, new androidx.camera.camera2.impl.StillCaptureRequestControl$reset$1(this, null), 3, null);
    }

    public final com.google.common.util.concurrent.ListenableFuture<java.util.List<java.lang.Void>> issueCaptureRequests(java.util.List<androidx.camera.core.impl.CaptureConfig> captureConfigs, int captureMode, int flashType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureConfigs, "");
        kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoSizes.getSequentialScope(), null, null, new androidx.camera.camera2.impl.StillCaptureRequestControl$issueCaptureRequests$1(captureConfigs, captureMode, flashType, CompletableDeferred$default, this, null), 3, null);
        com.google.common.util.concurrent.ListenableFuture<java.util.List<java.lang.Void>> nonCancellationPropagating = androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(androidx.camera.camera2.adapter.CoroutineAdaptersKt.asListenableFuture$default((kotlinx.coroutines.Deferred) CompletableDeferred$default, (java.lang.Object) null, 1, (java.lang.Object) null));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nonCancellationPropagating, "");
        return nonCancellationPropagating;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$d94nr3kKLaWRlrxlGv5M4rvfiJA(androidx.camera.camera2.impl.StillCaptureRequestControl stillCaptureRequestControl, kotlinx.coroutines.Deferred deferred, androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest captureRequest, androidx.camera.camera2.impl.UseCaseCameraRequestControl useCaseCameraRequestControl, java.lang.Throwable th) {
        if ((th instanceof androidx.camera.core.ImageCaptureException) && ((androidx.camera.core.ImageCaptureException) th).getImageCaptureError() == 3) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(stillCaptureRequestControl.getHighSpeedVideoSizes.getSequentialScope(), null, null, new androidx.camera.camera2.impl.StillCaptureRequestControl$propagateResultOrEnqueueRequest$1$1(stillCaptureRequestControl, useCaseCameraRequestControl, captureRequest, null), 3, null);
        } else {
            androidx.camera.camera2.adapter.CoroutineAdaptersKt.propagateCompletion(deferred, captureRequest.getResult(), th);
        }
        return kotlin.Unit.INSTANCE;
    }
}
