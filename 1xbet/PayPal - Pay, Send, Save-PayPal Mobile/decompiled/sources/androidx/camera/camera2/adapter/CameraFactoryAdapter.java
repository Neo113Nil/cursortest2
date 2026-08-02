package androidx.camera.camera2.adapter;

@kotlin.Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0015H\u0016¢\u0006\u0004\b\"\u0010#J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u001dH\u0016¢\u0006\u0004\b\u001a\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u001b\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00140+H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0017H\u0016¢\u0006\u0004\b/\u00100R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00108\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00109R\u0014\u00104\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010<R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001b\u0010>\u001a\u00020A8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00102\u001a\u0004\b3\u0010BR\u001c\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00150\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u0010CR\u0014\u00101\u001a\u00020(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b@\u0010ER\u0014\u00106\u001a\u00020F8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bD\u0010G"}, d2 = {"Landroidx/camera/camera2/adapter/CameraFactoryAdapter;", "Landroidx/camera/core/impl/CameraFactory;", "Landroidx/camera/core/impl/CameraFactory$Interrogator;", "Lkotlin/Lazy;", "Landroidx/camera/camera2/pipe/CameraPipe;", "lazyCameraPipe", "Landroid/content/Context;", "context", "Landroidx/camera/core/impl/CameraThreadConfig;", "threadConfig", "Landroidx/camera/camera2/impl/CameraInteropStateCallbackRepository;", "camera2InteropCallbacks", "Landroidx/camera/core/CameraSelector;", "availableCamerasSelector", "Landroidx/camera/core/internal/StreamSpecsCalculator;", "streamSpecsCalculator", "Landroidx/camera/core/CameraXConfig;", "cameraXConfig", "<init>", "(Lkotlin/Lazy;Landroid/content/Context;Landroidx/camera/core/impl/CameraThreadConfig;Landroidx/camera/camera2/impl/CameraInteropStateCallbackRepository;Landroidx/camera/core/CameraSelector;Landroidx/camera/core/internal/StreamSpecsCalculator;Landroidx/camera/core/CameraXConfig;)V", "", "", "cameraIds", "", "onCameraIdsUpdated", "(Ljava/util/List;)V", "getAvailableCameraIds", "(Ljava/util/List;)Ljava/util/List;", "p0", "", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/util/List;)Ljava/util/Set;", "cameraId", "Landroidx/camera/core/impl/CameraInternal;", "getCamera", "(Ljava/lang/String;)Landroidx/camera/core/impl/CameraInternal;", "()Ljava/util/Set;", "Landroidx/camera/core/concurrent/CameraCoordinator;", "getCameraCoordinator", "()Landroidx/camera/core/concurrent/CameraCoordinator;", "", "getCameraManager", "()Ljava/lang/Object;", "Landroidx/camera/core/impl/Observable;", "Landroidx/camera/core/CameraIdentifier;", "getCameraPresenceSource", "()Landroidx/camera/core/impl/Observable;", "shutdown", "()V", "getInputSizeshNQ4ISI", "Lkotlin/Lazy;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Landroidx/camera/core/CameraSelector;", "getOutputFormats", "Landroidx/camera/core/internal/StreamSpecsCalculator;", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/core/CameraXConfig;", "getHighSpeedVideoSizes", "Landroidx/camera/camera2/adapter/CameraCoordinatorAdapter;", "Landroidx/camera/camera2/adapter/CameraCoordinatorAdapter;", "Landroidx/camera/camera2/adapter/PipeCameraPresenceSource;", "getHighSpeedVideoSizesFor", "Landroidx/camera/camera2/adapter/PipeCameraPresenceSource;", "getOutputMinFrameDuration", "Landroidx/camera/camera2/config/CameraAppComponent;", "()Landroidx/camera/camera2/config/CameraAppComponent;", "Ljava/util/Set;", "getInputFormats", "Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraFactoryAdapter implements androidx.camera.core.impl.CameraFactory, androidx.camera.core.impl.CameraFactory.Interrogator {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.camera.core.CameraSelector getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.core.CameraXConfig getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private java.util.Set<java.lang.String> getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.camera.camera2.adapter.CameraCoordinatorAdapter Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.camera.camera2.adapter.PipeCameraPresenceSource getOutputMinFrameDuration;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicBoolean getOutputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.Lazy<androidx.camera.camera2.pipe.CameraPipe> getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.camera.core.internal.StreamSpecsCalculator getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final java.lang.Object getInputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public CameraFactoryAdapter(kotlin.Lazy<? extends androidx.camera.camera2.pipe.CameraPipe> lazy, final android.content.Context context, final androidx.camera.core.impl.CameraThreadConfig cameraThreadConfig, final androidx.camera.camera2.impl.CameraInteropStateCallbackRepository cameraInteropStateCallbackRepository, androidx.camera.core.CameraSelector cameraSelector, androidx.camera.core.internal.StreamSpecsCalculator streamSpecsCalculator, androidx.camera.core.CameraXConfig cameraXConfig) {
        java.util.ArrayList emptyList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraThreadConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInteropStateCallbackRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamSpecsCalculator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraXConfig, "");
        this.getHighSpeedVideoFpsRanges = lazy;
        this.getHighResolutionOutputSizeshNQ4ISI = cameraSelector;
        this.getHighSpeedVideoFpsRangesFor = streamSpecsCalculator;
        this.getHighSpeedVideoSizes = cameraXConfig;
        this.Camera2StreamConfigurationMap = new androidx.camera.camera2.adapter.CameraCoordinatorAdapter((androidx.camera.camera2.pipe.CameraPipe) lazy.getValue(), ((androidx.camera.camera2.pipe.CameraPipe) lazy.getValue()).cameras());
        this.getHighSpeedVideoSizesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.camera2.adapter.CameraFactoryAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.camera.camera2.adapter.CameraFactoryAdapter.$r8$lambda$XdM0ky82a6o_01qy6QMeRMWkwsQ(context, cameraThreadConfig, this, cameraInteropStateCallbackRepository);
            }
        });
        this.getInputFormats = kotlin.collections.SetsKt.emptySet();
        this.getInputSizeshNQ4ISI = new java.lang.Object();
        this.getOutputFormats = new java.util.concurrent.atomic.AtomicBoolean(false);
        java.util.List m280awaitCameraIdsSeavPBo$default = androidx.camera.camera2.pipe.CameraDevices.m280awaitCameraIdsSeavPBo$default(getHighSpeedVideoFpsRanges().getCameraDevices(), null, 1, null);
        if (m280awaitCameraIdsSeavPBo$default == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List list = m280awaitCameraIdsSeavPBo$default;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((androidx.camera.camera2.pipe.CameraId) it.next()).m399unboximpl());
            }
            emptyList = arrayList;
        }
        kotlinx.coroutines.flow.Flow m283cameraIdsFlowSeavPBo$default = androidx.camera.camera2.pipe.CameraDevices.m283cameraIdsFlowSeavPBo$default(this.getHighSpeedVideoFpsRanges.getValue().cameras(), null, 1, null);
        java.util.concurrent.Executor cameraExecutor = cameraThreadConfig.getCameraExecutor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraExecutor, "");
        this.getOutputMinFrameDuration = new androidx.camera.camera2.adapter.PipeCameraPresenceSource(m283cameraIdsFlowSeavPBo$default, kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.ExecutorsKt.from(cameraExecutor)), emptyList, context);
        onCameraIdsUpdated(emptyList);
    }

    private final androidx.camera.camera2.config.CameraAppComponent getHighSpeedVideoFpsRanges() {
        return (androidx.camera.camera2.config.CameraAppComponent) this.getHighSpeedVideoSizesFor.getValue();
    }

    @Override // androidx.camera.core.impl.CameraPresenceMonitor
    public final void onCameraIdsUpdated(java.util.List<java.lang.String> cameraIds) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraIds, "");
        if (this.getOutputFormats.get()) {
            return;
        }
        java.util.Set<java.lang.String> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(cameraIds);
        synchronized (this.getInputSizeshNQ4ISI) {
            if (this.getOutputFormats.get()) {
                return;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.getInputFormats, highResolutionOutputSizeshNQ4ISI)) {
                return;
            }
            androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                java.util.Objects.toString(this.getInputFormats);
                java.util.Objects.toString(highResolutionOutputSizeshNQ4ISI);
            }
            this.getInputFormats = highResolutionOutputSizeshNQ4ISI;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @Override // androidx.camera.core.impl.CameraFactory.Interrogator
    public final java.util.List<java.lang.String> getAvailableCameraIds(java.util.List<java.lang.String> cameraIds) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraIds, "");
        if (this.getOutputFormats.get()) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        return kotlin.collections.CollectionsKt.toList(getHighResolutionOutputSizeshNQ4ISI(cameraIds));
    }

    private final java.util.Set<java.lang.String> getHighResolutionOutputSizeshNQ4ISI(java.util.List<java.lang.String> p0) {
        return new java.util.LinkedHashSet(androidx.camera.camera2.internal.CameraCompatibilityFilter.getBackwardCompatibleCameraIds(getHighSpeedVideoFpsRanges().getCameraDevices(), androidx.camera.camera2.internal.CameraSelectionOptimizer.INSTANCE.getSelectedAvailableCameraIds(getHighSpeedVideoFpsRanges(), this.getHighResolutionOutputSizeshNQ4ISI, kotlin.collections.CollectionsKt.toList(p0), this.getHighSpeedVideoFpsRangesFor)));
    }

    @Override // androidx.camera.core.impl.CameraFactory
    public final androidx.camera.core.impl.CameraInternal getCamera(java.lang.String cameraId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
        if (this.getOutputFormats.get()) {
            throw new androidx.camera.core.impl.CameraUpdateException("CameraFactory has been shut down.");
        }
        return getHighSpeedVideoFpsRanges().cameraBuilder().config(new androidx.camera.camera2.config.CameraConfig(androidx.camera.camera2.pipe.CameraId.m393constructorimpl(cameraId), null)).streamSpecsCalculator(this.getHighSpeedVideoFpsRangesFor).build().getCameraInternal();
    }

    @Override // androidx.camera.core.impl.CameraFactory
    public final java.util.Set<java.lang.String> getAvailableCameraIds() {
        synchronized (this.getInputSizeshNQ4ISI) {
            if (this.getOutputFormats.get()) {
                return kotlin.collections.SetsKt.emptySet();
            }
            return new java.util.LinkedHashSet(this.getInputFormats);
        }
    }

    @Override // androidx.camera.core.impl.CameraFactory
    public final androidx.camera.core.concurrent.CameraCoordinator getCameraCoordinator() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.core.impl.CameraFactory
    public final java.lang.Object getCameraManager() {
        return getHighSpeedVideoFpsRanges();
    }

    @Override // androidx.camera.core.impl.CameraFactory
    public final androidx.camera.core.impl.Observable<java.util.List<androidx.camera.core.CameraIdentifier>> getCameraPresenceSource() {
        return this.getOutputMinFrameDuration;
    }

    @Override // androidx.camera.core.impl.CameraFactory
    public final void shutdown() {
        if (this.getOutputFormats.getAndSet(true)) {
            return;
        }
        this.Camera2StreamConfigurationMap.shutdown();
        this.getOutputMinFrameDuration.stopMonitoring();
        if (this.getHighSpeedVideoFpsRanges.isInitialized()) {
            this.getHighSpeedVideoFpsRanges.getValue().shutdown();
        }
    }

    public static /* synthetic */ androidx.camera.camera2.config.CameraAppComponent $r8$lambda$XdM0ky82a6o_01qy6QMeRMWkwsQ(android.content.Context context, androidx.camera.core.impl.CameraThreadConfig cameraThreadConfig, androidx.camera.camera2.adapter.CameraFactoryAdapter cameraFactoryAdapter, androidx.camera.camera2.impl.CameraInteropStateCallbackRepository cameraInteropStateCallbackRepository) {
        androidx.camera.camera2.pipe.core.Debug debug = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
        android.os.Trace.beginSection("CameraFactoryAdapter#appComponent");
        androidx.camera.camera2.pipe.core.SystemTimeSource systemTimeSource = new androidx.camera.camera2.pipe.core.SystemTimeSource();
        androidx.camera.camera2.pipe.core.Timestamps timestamps = androidx.camera.camera2.pipe.core.Timestamps.INSTANCE;
        long mo885nowvQl9yQU = systemTimeSource.mo885nowvQl9yQU();
        androidx.camera.camera2.config.CameraAppComponent build = androidx.camera.camera2.config.DaggerCameraAppComponent.builder().config(new androidx.camera.camera2.config.CameraAppConfig(context, cameraThreadConfig, cameraFactoryAdapter.getHighSpeedVideoFpsRanges.getValue(), cameraInteropStateCallbackRepository, cameraFactoryAdapter.Camera2StreamConfigurationMap, cameraFactoryAdapter.getHighSpeedVideoSizes)).build();
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            androidx.camera.camera2.pipe.core.Timestamps timestamps2 = androidx.camera.camera2.pipe.core.Timestamps.INSTANCE;
            androidx.camera.camera2.pipe.core.Timestamps timestamps3 = androidx.camera.camera2.pipe.core.Timestamps.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.lang.String.format(null, "%.3f ms", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(androidx.camera.camera2.pipe.core.DurationNs.m872constructorimpl(r0.mo885nowvQl9yQU() - mo885nowvQl9yQU) / 1000000.0d)}, 1)), "");
        }
        androidx.camera.camera2.pipe.core.Debug debug2 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
        android.os.Trace.endSection();
        return build;
    }
}
