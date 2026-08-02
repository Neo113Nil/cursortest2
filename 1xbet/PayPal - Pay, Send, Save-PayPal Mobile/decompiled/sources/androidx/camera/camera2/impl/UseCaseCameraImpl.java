package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001GBU\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010!\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00192\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J(\u0010+\u001a\u00020*2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020&H\u0096@¢\u0006\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00102\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u0010\t\u001a\u00020\b8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u00108R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u0010:R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000f0\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u0010:R\u0014\u0010<\u001a\u00020&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b=\u0010?R\u0014\u0010-\u001a\u00020@8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u0010AR\u001f\u00103\u001a\u0006*\u00020\u000b0\u000b8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b>\u0010B\u001a\u0004\b5\u0010CR\u001f\u00100\u001a\u0006*\u00020\r0\r8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b;\u0010B\u001a\u0004\b/\u0010DR\u001f\u0010F\u001a\u0006*\u00020\u000f0\u000f8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b5\u0010B\u001a\u0004\b2\u0010E"}, d2 = {"Landroidx/camera/camera2/impl/UseCaseCameraImpl;", "Landroidx/camera/camera2/impl/UseCaseCamera;", "Landroidx/camera/camera2/config/UseCaseGraphContext;", "useCaseGraphContext", "Landroidx/camera/camera2/impl/UseCaseThreads;", "threads", "Landroidx/camera/core/impl/SessionProcessor;", "sessionProcessor", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "requestControl", "Ljavax/inject/Provider;", "Landroidx/camera/camera2/impl/UseCaseSurfaceManager;", "useCaseSurfaceManagerProvider", "Landroidx/camera/camera2/adapter/SessionConfigAdapter;", "sessionConfigAdapterProvider", "Landroidx/camera/camera2/impl/CapturePipeline;", "capturePipelineProvider", "<init>", "(Landroidx/camera/camera2/config/UseCaseGraphContext;Landroidx/camera/camera2/impl/UseCaseThreads;Landroidx/camera/core/impl/SessionProcessor;Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "()V", "Lkotlinx/coroutines/Job;", "close", "()Lkotlinx/coroutines/Job;", "", "enabled", "setActiveResumeMode", "(Z)V", "isPrimary", "", "Landroidx/camera/core/UseCase;", "runningUseCases", "updateRepeatingRequestAsync", "(ZLjava/util/Collection;)Lkotlinx/coroutines/Job;", "", "toString", "()Ljava/lang/String;", "", "captureMode", "flashMode", "flashType", "Landroidx/camera/core/imagecapture/CameraCapturePipeline;", "getCameraCapturePipeline", "(IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInputSizeshNQ4ISI", "Landroidx/camera/camera2/config/UseCaseGraphContext;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizesFor", "Landroidx/camera/camera2/impl/UseCaseThreads;", "Camera2StreamConfigurationMap", "getOutputFormats", "Landroidx/camera/core/impl/SessionProcessor;", "getHighSpeedVideoSizes", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "getRequestControl", "()Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "getOutputSizes", "Ljavax/inject/Provider;", "getHighSpeedVideoFpsRanges", "getOutputMinFrameDuration", "getHighSpeedVideoFpsRangesFor", "getInputFormats", com.visa.cbp.getEncExpo.warmup, "Lkotlinx/atomicfu/AtomicBoolean;", "Lkotlinx/atomicfu/AtomicBoolean;", "Lkotlin/Lazy;", "()Landroidx/camera/camera2/impl/UseCaseSurfaceManager;", "()Landroidx/camera/camera2/adapter/SessionConfigAdapter;", "()Landroidx/camera/camera2/impl/CapturePipeline;", "getOutputStallDurationlomOqCM", "Bindings"}, k = 1, mv = {2, 1, 0}, xi = 48)
@androidx.camera.camera2.config.UseCaseCameraScope
/* loaded from: classes6.dex */
public final class UseCaseCameraImpl implements androidx.camera.camera2.impl.UseCaseCamera {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final javax.inject.Provider<androidx.camera.camera2.impl.CapturePipeline> getInputFormats;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.atomicfu.AtomicBoolean getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.Lazy getOutputStallDurationlomOqCM;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.UseCaseThreads Camera2StreamConfigurationMap;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final kotlin.Lazy getOutputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.camera2.config.UseCaseGraphContext getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.camera.core.impl.SessionProcessor getHighSpeedVideoSizes;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final javax.inject.Provider<androidx.camera.camera2.adapter.SessionConfigAdapter> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final javax.inject.Provider<androidx.camera.camera2.impl.UseCaseSurfaceManager> getHighSpeedVideoFpsRanges;
    private final androidx.camera.camera2.impl.UseCaseCameraRequestControl requestControl;

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/impl/UseCaseCameraImpl$Bindings;", "", "<init>", "()V", "Landroidx/camera/camera2/impl/UseCaseCameraImpl;", "useCaseCamera", "Landroidx/camera/camera2/impl/UseCaseCamera;", "provideUseCaseCamera", "(Landroidx/camera/camera2/impl/UseCaseCameraImpl;)Landroidx/camera/camera2/impl/UseCaseCamera;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @dagger.Module
    public static abstract class Bindings {
        @dagger.Binds
        @androidx.camera.camera2.config.UseCaseCameraScope
        public abstract androidx.camera.camera2.impl.UseCaseCamera provideUseCaseCamera(androidx.camera.camera2.impl.UseCaseCameraImpl useCaseCamera);
    }

    @javax.inject.Inject
    public UseCaseCameraImpl(androidx.camera.camera2.config.UseCaseGraphContext useCaseGraphContext, androidx.camera.camera2.impl.UseCaseThreads useCaseThreads, androidx.camera.core.impl.SessionProcessor sessionProcessor, androidx.camera.camera2.impl.UseCaseCameraRequestControl useCaseCameraRequestControl, javax.inject.Provider<androidx.camera.camera2.impl.UseCaseSurfaceManager> provider, javax.inject.Provider<androidx.camera.camera2.adapter.SessionConfigAdapter> provider2, javax.inject.Provider<androidx.camera.camera2.impl.CapturePipeline> provider3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseGraphContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseThreads, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseCameraRequestControl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider3, "");
        this.getHighResolutionOutputSizeshNQ4ISI = useCaseGraphContext;
        this.Camera2StreamConfigurationMap = useCaseThreads;
        this.getHighSpeedVideoSizes = sessionProcessor;
        this.requestControl = useCaseCameraRequestControl;
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getInputFormats = provider3;
        this.getOutputMinFrameDuration = androidx.camera.camera2.impl.UseCaseCameraKt.getUseCaseCameraIds().incrementAndGet();
        this.getInputSizeshNQ4ISI = kotlinx.atomicfu.AtomicFU.atomic(false);
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
        }
        this.getOutputFormats = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.camera2.impl.UseCaseCameraImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.camera.camera2.impl.UseCaseSurfaceManager useCaseSurfaceManager;
                useCaseSurfaceManager = androidx.camera.camera2.impl.UseCaseCameraImpl.this.getHighSpeedVideoFpsRanges.get();
                return useCaseSurfaceManager;
            }
        });
        this.getHighSpeedVideoSizesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.camera2.impl.UseCaseCameraImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.camera.camera2.adapter.SessionConfigAdapter sessionConfigAdapter;
                sessionConfigAdapter = androidx.camera.camera2.impl.UseCaseCameraImpl.this.getHighSpeedVideoFpsRangesFor.get();
                return sessionConfigAdapter;
            }
        });
        this.getOutputStallDurationlomOqCM = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.camera2.impl.UseCaseCameraImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.camera.camera2.impl.CapturePipeline capturePipeline;
                capturePipeline = androidx.camera.camera2.impl.UseCaseCameraImpl.this.getInputFormats.get();
                return capturePipeline;
            }
        });
    }

    @Override // androidx.camera.camera2.impl.UseCaseCamera
    public final androidx.camera.camera2.impl.UseCaseCameraRequestControl getRequestControl() {
        return this.requestControl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.camera.camera2.impl.UseCaseSurfaceManager getHighSpeedVideoSizes() {
        return (androidx.camera.camera2.impl.UseCaseSurfaceManager) this.getOutputFormats.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.camera.camera2.adapter.SessionConfigAdapter getHighResolutionOutputSizeshNQ4ISI() {
        return (androidx.camera.camera2.adapter.SessionConfigAdapter) this.getHighSpeedVideoSizesFor.getValue();
    }

    private final androidx.camera.camera2.impl.CapturePipeline Camera2StreamConfigurationMap() {
        return (androidx.camera.camera2.impl.CapturePipeline) this.getOutputStallDurationlomOqCM.getValue();
    }

    @Override // androidx.camera.camera2.impl.UseCaseCamera
    public final void start() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.Camera2StreamConfigurationMap.getSequentialScope(), null, null, new androidx.camera.camera2.impl.UseCaseCameraImpl$start$$inlined$confineLaunch$1(null, this), 3, null);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCamera
    public final kotlinx.coroutines.Job close() {
        kotlinx.coroutines.Job launch$default;
        if (this.getInputSizeshNQ4ISI.compareAndSet(false, true)) {
            getRequestControl().close();
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.Camera2StreamConfigurationMap.getSequentialScope(), null, null, new androidx.camera.camera2.impl.UseCaseCameraImpl$close$$inlined$confineLaunch$1(null, this), 3, null);
            return launch$default;
        }
        return kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred(kotlin.Unit.INSTANCE);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCamera
    public final void setActiveResumeMode(boolean enabled) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.Camera2StreamConfigurationMap.getSequentialScope(), null, null, new androidx.camera.camera2.impl.UseCaseCameraImpl$setActiveResumeMode$$inlined$confineLaunch$1(null, this, enabled), 3, null);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCamera
    public final kotlinx.coroutines.Job updateRepeatingRequestAsync(boolean isPrimary, java.util.Collection<? extends androidx.camera.core.UseCase> runningUseCases) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runningUseCases, "");
        return getRequestControl().updateRepeatingRequestAsync(isPrimary, runningUseCases);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UseCaseCamera-");
        sb.append(this.getOutputMinFrameDuration);
        return sb.toString();
    }

    @Override // androidx.camera.camera2.impl.UseCaseCamera
    public final java.lang.Object getCameraCapturePipeline(int i, int i2, int i3, kotlin.coroutines.Continuation<? super androidx.camera.core.imagecapture.CameraCapturePipeline> continuation) {
        return Camera2StreamConfigurationMap().getCameraCapturePipeline(i, i2, i3, continuation);
    }

    /* renamed from: access$findStillCaptureStreamId-4TVKcYk, reason: not valid java name */
    public static final /* synthetic */ androidx.camera.camera2.pipe.StreamId m135access$findStillCaptureStreamId4TVKcYk(androidx.camera.camera2.impl.UseCaseCameraImpl useCaseCameraImpl) {
        java.lang.Object obj;
        androidx.camera.core.impl.SessionConfig validSessionConfigOrNull = useCaseCameraImpl.getHighResolutionOutputSizeshNQ4ISI().getValidSessionConfigOrNull();
        if (validSessionConfigOrNull == null) {
            return null;
        }
        java.util.List<androidx.camera.core.impl.DeferrableSurface> surfaces = validSessionConfigOrNull.getRepeatingCaptureConfig().getSurfaces();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(surfaces, "");
        java.util.List<androidx.camera.core.impl.DeferrableSurface> surfaces2 = validSessionConfigOrNull.getSurfaces();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(surfaces2, "");
        java.util.Iterator<T> it = surfaces2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!surfaces.contains((androidx.camera.core.impl.DeferrableSurface) obj)) {
                break;
            }
        }
        androidx.camera.core.impl.DeferrableSurface deferrableSurface = (androidx.camera.core.impl.DeferrableSurface) obj;
        if (deferrableSurface == null) {
            return null;
        }
        return (androidx.camera.camera2.pipe.StreamId) kotlin.collections.CollectionsKt.firstOrNull(useCaseCameraImpl.getHighResolutionOutputSizeshNQ4ISI.getStreamIdsFromSurfaces(kotlin.collections.CollectionsKt.listOf(deferrableSurface)));
    }

    /* renamed from: access$setCaptureSessionRequestProcessor-9O56998, reason: not valid java name */
    public static final /* synthetic */ void m136access$setCaptureSessionRequestProcessor9O56998(final androidx.camera.camera2.impl.UseCaseCameraImpl useCaseCameraImpl, final androidx.camera.camera2.pipe.StreamId streamId, final androidx.camera.camera2.pipe.CameraGraph cameraGraph) {
        androidx.camera.core.impl.SessionProcessor sessionProcessor = useCaseCameraImpl.getHighSpeedVideoSizes;
        if (sessionProcessor != null) {
            sessionProcessor.setCaptureSessionRequestProcessor(new androidx.camera.core.impl.SessionProcessor.CaptureSessionRequestProcessor() { // from class: androidx.camera.camera2.impl.UseCaseCameraImpl$setCaptureSessionRequestProcessor$1
                @Override // androidx.camera.core.impl.SessionProcessor.CaptureSessionRequestProcessor
                public final android.util.Pair<java.lang.Long, java.lang.Long> getRealtimeStillCaptureLatency() {
                    androidx.camera.camera2.pipe.StreamGraph.OutputLatency m747getOutputLatencyIL232MI$default;
                    if (androidx.camera.camera2.pipe.StreamId.this == null || (m747getOutputLatencyIL232MI$default = androidx.camera.camera2.pipe.StreamGraph.m747getOutputLatencyIL232MI$default(cameraGraph.getStreams(), androidx.camera.camera2.pipe.StreamId.this.m761unboximpl(), null, 2, null)) == null) {
                        return null;
                    }
                    return android.util.Pair.create(java.lang.Long.valueOf(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(m747getOutputLatencyIL232MI$default.getEstimatedCaptureLatencyNs())), java.lang.Long.valueOf(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(m747getOutputLatencyIL232MI$default.getEstimatedProcessingLatencyNs())));
                }

                @Override // androidx.camera.core.impl.SessionProcessor.CaptureSessionRequestProcessor
                public final void setExtensionStrength(int strength) {
                    if (android.os.Build.VERSION.SDK_INT >= 34) {
                        androidx.camera.camera2.impl.UseCaseCameraRequestControl.setParametersAsync$default(useCaseCameraImpl.getRequestControl(), kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to(android.hardware.camera2.CaptureRequest.EXTENSION_STRENGTH, java.lang.Integer.valueOf(strength))), null, null, 6, null);
                    }
                }
            });
        }
    }
}
