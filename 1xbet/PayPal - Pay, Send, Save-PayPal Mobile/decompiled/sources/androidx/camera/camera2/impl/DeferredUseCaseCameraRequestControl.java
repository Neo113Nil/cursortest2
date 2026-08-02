package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ=\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0016\u0010\f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J=\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0016\u0010\f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J/\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0010\u0010\u0017\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\u00162\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J1\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\"\u001a\u00020!2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000b0\tH\u0016¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0011H\u0016¢\u0006\u0004\b(\u0010)J\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020'0\u00112\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-Ju\u0010<\u001a\b\u0012\u0004\u0012\u00020'0\u00112\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\u00162\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\u00162\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\u00162\b\u00104\u001a\u0004\u0018\u0001032\b\u00105\u001a\u0004\u0018\u0001032\b\u00106\u001a\u0004\u0018\u0001032\b\u00107\u001a\u0004\u0018\u00010*2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u0015\u0010=\u001a\b\u0012\u0004\u0012\u00020'0\u0011H\u0016¢\u0006\u0004\b=\u0010)JE\u0010>\u001a\b\u0012\u0004\u0012\u00020'0\u00112\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\u00162\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\u00162\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\u0016H\u0016¢\u0006\u0004\b>\u0010?JC\u0010G\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010F0\u00110\u00162\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u00162\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020B2\u0006\u0010E\u001a\u00020BH\u0016¢\u0006\u0004\bG\u0010HJ\u0010\u0010I\u001a\u00020\u001aH\u0096@¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u0012H\u0016¢\u0006\u0004\bK\u0010LR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010R\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010M\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010V\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010U"}, d2 = {"Landroidx/camera/camera2/impl/DeferredUseCaseCameraRequestControl;", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "Ljavax/inject/Provider;", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControlImpl;", "implProvider", "Landroidx/camera/camera2/impl/UseCaseThreads;", "threads", "<init>", "(Ljavax/inject/Provider;Landroidx/camera/camera2/impl/UseCaseThreads;)V", "", "Landroid/hardware/camera2/CaptureRequest$Key;", "", "values", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl$Type;", "type", "Landroidx/camera/core/impl/Config$OptionPriority;", "optionPriority", "Lkotlinx/coroutines/Deferred;", "", "setParametersAsync", "(Ljava/util/Map;Landroidx/camera/camera2/impl/UseCaseCameraRequestControl$Type;Landroidx/camera/core/impl/Config$OptionPriority;)Lkotlinx/coroutines/Deferred;", "submitParameters", "", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "removeParametersAsync", "(Ljava/util/List;Landroidx/camera/camera2/impl/UseCaseCameraRequestControl$Type;)Lkotlinx/coroutines/Deferred;", "", "isPrimary", "", "Landroidx/camera/core/UseCase;", "runningUseCases", "updateRepeatingRequestAsync", "(ZLjava/util/Collection;)Lkotlinx/coroutines/Deferred;", "Landroidx/camera/core/impl/Config;", "config", "", "tags", "updateCamera2ConfigAsync", "(Landroidx/camera/core/impl/Config;Ljava/util/Map;)Lkotlinx/coroutines/Deferred;", "Landroidx/camera/camera2/pipe/Result3A;", "setTorchOnAsync", "()Lkotlinx/coroutines/Deferred;", "Landroidx/camera/camera2/pipe/AeMode;", "aeMode", "setTorchOffAsync-MtizInI", "(I)Lkotlinx/coroutines/Deferred;", "setTorchOffAsync", "Landroid/hardware/camera2/params/MeteringRectangle;", "aeRegions", "afRegions", "awbRegions", "Landroidx/camera/camera2/pipe/Lock3ABehavior;", "aeLockBehavior", "afLockBehavior", "awbLockBehavior", "afTriggerStartAeMode", "", "timeLimitNs", "startFocusAndMeteringAsync-NxRnBj4", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/AeMode;J)Lkotlinx/coroutines/Deferred;", "startFocusAndMeteringAsync", "cancelFocusAndMeteringAsync", "update3aRegions", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lkotlinx/coroutines/Deferred;", "Landroidx/camera/core/impl/CaptureConfig;", "captureSequence", "", "captureMode", "flashType", "flashMode", "Ljava/lang/Void;", "issueSingleCaptureAsync", "(Ljava/util/List;III)Ljava/util/List;", "awaitSurfaceSetup", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "()V", "getHighSpeedVideoSizes", "Ljavax/inject/Provider;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/camera2/impl/UseCaseThreads;", "getHighSpeedVideoFpsRanges", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControlImpl;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
@androidx.camera.camera2.config.UseCaseCameraScope
/* loaded from: classes6.dex */
public final class DeferredUseCaseCameraRequestControl implements androidx.camera.camera2.impl.UseCaseCameraRequestControl {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicBoolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private volatile androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.UseCaseThreads getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final javax.inject.Provider<androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl> Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public DeferredUseCaseCameraRequestControl(javax.inject.Provider<androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl> provider, androidx.camera.camera2.impl.UseCaseThreads useCaseThreads) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseThreads, "");
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = useCaseThreads;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final java.util.List<kotlinx.coroutines.Deferred<java.lang.Void>> issueSingleCaptureAsync(java.util.List<androidx.camera.core.impl.CaptureConfig> captureSequence, int captureMode, int flashType, int flashMode) {
        kotlinx.coroutines.Deferred async$default;
        kotlinx.coroutines.Deferred async$default2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureSequence, "");
        int size = captureSequence.size();
        androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.getHighSpeedVideoSizes;
        if (useCaseCameraRequestControlImpl == null) {
            async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(this.getHighSpeedVideoFpsRanges.getSequentialScope(), null, null, new androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl$issueSingleCaptureAsync$$inlined$runOnSequentialList$1(this, null, captureSequence, captureMode, flashType, flashMode), 3, null);
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            for (int i = 0; i < size; i++) {
                async$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(this.getHighSpeedVideoFpsRanges.getSequentialScope(), null, null, new androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl$runOnSequentialList$2$1(async$default, i, null), 3, null);
                arrayList.add(async$default2);
            }
            return arrayList;
        }
        return useCaseCameraRequestControlImpl.issueSingleCaptureAsync(captureSequence, captureMode, flashType, flashMode);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final void close() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.getAndSet(true)) {
            return;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRanges.getSequentialScope(), null, null, new androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl$close$$inlined$confineLaunch$1(null, this), 3, null);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final kotlinx.coroutines.Deferred<kotlin.Unit> setParametersAsync(java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, ? extends java.lang.Object> values, androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type type, androidx.camera.core.impl.Config.OptionPriority optionPriority) {
        kotlinx.coroutines.Deferred<kotlin.Unit> async$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optionPriority, "");
        androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.getHighSpeedVideoSizes;
        if (useCaseCameraRequestControlImpl == null) {
            async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(this.getHighSpeedVideoFpsRanges.getSequentialScope(), null, null, new androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl$setParametersAsync$$inlined$runOnSequential$1(this, null, values, type, optionPriority), 3, null);
            return async$default;
        }
        return useCaseCameraRequestControlImpl.setParametersAsync(values, type, optionPriority);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final kotlinx.coroutines.Deferred<kotlin.Unit> submitParameters(java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, ? extends java.lang.Object> values, androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type type, androidx.camera.core.impl.Config.OptionPriority optionPriority) {
        kotlinx.coroutines.Deferred<kotlin.Unit> async$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optionPriority, "");
        androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.getHighSpeedVideoSizes;
        if (useCaseCameraRequestControlImpl == null) {
            async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(this.getHighSpeedVideoFpsRanges.getSequentialScope(), null, null, new androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl$submitParameters$$inlined$runOnSequential$1(this, null, values, type, optionPriority), 3, null);
            return async$default;
        }
        return useCaseCameraRequestControlImpl.submitParameters(values, type, optionPriority);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final kotlinx.coroutines.Deferred<kotlin.Unit> removeParametersAsync(java.util.List<? extends android.hardware.camera2.CaptureRequest.Key<?>> keys, androidx.camera.camera2.impl.UseCaseCameraRequestControl.Type type) {
        kotlinx.coroutines.Deferred<kotlin.Unit> async$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keys, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.getHighSpeedVideoSizes;
        if (useCaseCameraRequestControlImpl == null) {
            async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(this.getHighSpeedVideoFpsRanges.getSequentialScope(), null, null, new androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl$removeParametersAsync$$inlined$runOnSequential$1(this, null, keys, type), 3, null);
            return async$default;
        }
        return useCaseCameraRequestControlImpl.removeParametersAsync(keys, type);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final kotlinx.coroutines.Deferred<kotlin.Unit> updateRepeatingRequestAsync(boolean isPrimary, java.util.Collection<? extends androidx.camera.core.UseCase> runningUseCases) {
        kotlinx.coroutines.Deferred<kotlin.Unit> async$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runningUseCases, "");
        androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.getHighSpeedVideoSizes;
        if (useCaseCameraRequestControlImpl == null) {
            async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(this.getHighSpeedVideoFpsRanges.getSequentialScope(), null, null, new androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl$updateRepeatingRequestAsync$$inlined$runOnSequential$1(this, null, isPrimary, runningUseCases), 3, null);
            return async$default;
        }
        return useCaseCameraRequestControlImpl.updateRepeatingRequestAsync(isPrimary, runningUseCases);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final kotlinx.coroutines.Deferred<kotlin.Unit> updateCamera2ConfigAsync(androidx.camera.core.impl.Config config, java.util.Map<java.lang.String, ? extends java.lang.Object> tags) {
        kotlinx.coroutines.Deferred<kotlin.Unit> async$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tags, "");
        androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.getHighSpeedVideoSizes;
        if (useCaseCameraRequestControlImpl == null) {
            async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(this.getHighSpeedVideoFpsRanges.getSequentialScope(), null, null, new androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl$updateCamera2ConfigAsync$$inlined$runOnSequential$1(this, null, config, tags), 3, null);
            return async$default;
        }
        return useCaseCameraRequestControlImpl.updateCamera2ConfigAsync(config, tags);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> setTorchOnAsync() {
        kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> async$default;
        androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.getHighSpeedVideoSizes;
        if (useCaseCameraRequestControlImpl == null) {
            async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(this.getHighSpeedVideoFpsRanges.getSequentialScope(), null, null, new androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl$setTorchOnAsync$$inlined$runOnSequential$1(this, null), 3, null);
            return async$default;
        }
        return useCaseCameraRequestControlImpl.setTorchOnAsync();
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    /* renamed from: setTorchOffAsync-MtizInI, reason: not valid java name */
    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> mo114setTorchOffAsyncMtizInI(int aeMode) {
        kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> async$default;
        androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.getHighSpeedVideoSizes;
        if (useCaseCameraRequestControlImpl == null) {
            async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(this.getHighSpeedVideoFpsRanges.getSequentialScope(), null, null, new androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl$setTorchOffAsyncMtizInI$$inlined$runOnSequential$1(this, null, aeMode), 3, null);
            return async$default;
        }
        return useCaseCameraRequestControlImpl.mo114setTorchOffAsyncMtizInI(aeMode);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    /* renamed from: startFocusAndMeteringAsync-NxRnBj4, reason: not valid java name */
    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> mo115startFocusAndMeteringAsyncNxRnBj4(java.util.List<android.hardware.camera2.params.MeteringRectangle> aeRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> afRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> awbRegions, androidx.camera.camera2.pipe.Lock3ABehavior aeLockBehavior, androidx.camera.camera2.pipe.Lock3ABehavior afLockBehavior, androidx.camera.camera2.pipe.Lock3ABehavior awbLockBehavior, androidx.camera.camera2.pipe.AeMode afTriggerStartAeMode, long timeLimitNs) {
        kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> async$default;
        androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.getHighSpeedVideoSizes;
        if (useCaseCameraRequestControlImpl == null) {
            async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(this.getHighSpeedVideoFpsRanges.getSequentialScope(), null, null, new androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl$startFocusAndMeteringAsyncNxRnBj4$$inlined$runOnSequential$1(this, null, aeRegions, afRegions, awbRegions, aeLockBehavior, afLockBehavior, awbLockBehavior, afTriggerStartAeMode, timeLimitNs), 3, null);
            return async$default;
        }
        return useCaseCameraRequestControlImpl.mo115startFocusAndMeteringAsyncNxRnBj4(aeRegions, afRegions, awbRegions, aeLockBehavior, afLockBehavior, awbLockBehavior, afTriggerStartAeMode, timeLimitNs);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> cancelFocusAndMeteringAsync() {
        kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> async$default;
        androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.getHighSpeedVideoSizes;
        if (useCaseCameraRequestControlImpl == null) {
            async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(this.getHighSpeedVideoFpsRanges.getSequentialScope(), null, null, new androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl$cancelFocusAndMeteringAsync$$inlined$runOnSequential$1(this, null), 3, null);
            return async$default;
        }
        return useCaseCameraRequestControlImpl.cancelFocusAndMeteringAsync();
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> update3aRegions(java.util.List<android.hardware.camera2.params.MeteringRectangle> aeRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> afRegions, java.util.List<android.hardware.camera2.params.MeteringRectangle> awbRegions) {
        kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A> async$default;
        androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.getHighSpeedVideoSizes;
        if (useCaseCameraRequestControlImpl == null) {
            async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(this.getHighSpeedVideoFpsRanges.getSequentialScope(), null, null, new androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl$update3aRegions$$inlined$runOnSequential$1(this, null, aeRegions, afRegions, awbRegions), 3, null);
            return async$default;
        }
        return useCaseCameraRequestControlImpl.update3aRegions(aeRegions, afRegions, awbRegions);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public final java.lang.Object awaitSurfaceSetup(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.getHighSpeedVideoSizes;
        if (useCaseCameraRequestControlImpl != null) {
            return useCaseCameraRequestControlImpl.awaitSurfaceSetup(continuation);
        }
        return kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.ExecutorsKt.from(this.getHighSpeedVideoFpsRanges.getSequentialExecutor()), new androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl$awaitSurfaceSetup$$inlined$runOnSequentialSuspend$1(this, null), continuation);
    }

    public static final /* synthetic */ androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl access$getOrCreateImpl(androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl deferredUseCaseCameraRequestControl) {
        if (deferredUseCaseCameraRequestControl.getHighResolutionOutputSizeshNQ4ISI.get()) {
            throw new java.util.concurrent.CancellationException("UseCaseCameraRequestControl is closed");
        }
        androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = deferredUseCaseCameraRequestControl.getHighSpeedVideoSizes;
        if (useCaseCameraRequestControlImpl != null) {
            return useCaseCameraRequestControlImpl;
        }
        androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl2 = deferredUseCaseCameraRequestControl.Camera2StreamConfigurationMap.get();
        if (deferredUseCaseCameraRequestControl.getHighResolutionOutputSizeshNQ4ISI.get()) {
            useCaseCameraRequestControlImpl2.close();
            throw new java.util.concurrent.CancellationException("UseCaseCameraRequestControl closed during initialization");
        }
        deferredUseCaseCameraRequestControl.getHighSpeedVideoSizes = useCaseCameraRequestControlImpl2;
        kotlin.jvm.internal.Intrinsics.checkNotNull(useCaseCameraRequestControlImpl2);
        return useCaseCameraRequestControlImpl2;
    }
}
