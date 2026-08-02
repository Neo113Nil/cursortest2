package androidx.camera.camera2.adapter;

@androidx.camera.camera2.config.CameraScope
@kotlin.Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010\u0014J\u0017\u0010\"\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\"\u0010\u0014J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H\u0016¢\u0006\u0004\b'\u0010(J\u0015\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\bH\u0016¢\u0006\u0004\b-\u0010.J\u001d\u00102\u001a\u00020\u00122\f\u00101\u001a\b\u0012\u0004\u0012\u0002000/H\u0016¢\u0006\u0004\b2\u00103J\u001d\u00105\u001a\u00020\u00122\f\u00104\u001a\b\u0012\u0004\u0012\u0002000/H\u0016¢\u0006\u0004\b5\u00103J\u0017\u00107\u001a\u00020\u00122\u0006\u00106\u001a\u000200H\u0016¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u00122\u0006\u00106\u001a\u000200H\u0016¢\u0006\u0004\b9\u00108J\u0017\u0010:\u001a\u00020\u00122\u0006\u00106\u001a\u000200H\u0016¢\u0006\u0004\b:\u00108J\u0017\u0010;\u001a\u00020\u00122\u0006\u00106\u001a\u000200H\u0016¢\u0006\u0004\b;\u00108J\u000f\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b=\u0010>J\u0019\u0010@\u001a\u00020\u00122\b\u0010?\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0012H\u0016¢\u0006\u0004\bB\u0010\u001dJ\u000f\u0010C\u001a\u00020\u0010H\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010K\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010SR\u0014\u0010V\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010UR\u0016\u0010H\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010WR\u0014\u0010Z\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010YR\u0018\u0010\\\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010P\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010_"}, d2 = {"Landroidx/camera/camera2/adapter/CameraInternalAdapter;", "Landroidx/camera/core/impl/CameraInternal;", "Landroidx/camera/camera2/config/CameraConfig;", "config", "Landroidx/camera/camera2/impl/UseCaseManager;", "useCaseManager", "Landroidx/camera/core/impl/CameraInfoInternal;", "cameraInfo", "Landroidx/camera/core/impl/CameraControlInternal;", "cameraController", "Landroidx/camera/camera2/impl/UseCaseThreads;", "threads", "Landroidx/camera/camera2/adapter/CameraStateAdapter;", "cameraStateAdapter", "<init>", "(Landroidx/camera/camera2/config/CameraConfig;Landroidx/camera/camera2/impl/UseCaseManager;Landroidx/camera/core/impl/CameraInfoInternal;Landroidx/camera/core/impl/CameraControlInternal;Landroidx/camera/camera2/impl/UseCaseThreads;Landroidx/camera/camera2/adapter/CameraStateAdapter;)V", "", "createImmediately", "", "setCameraGraphCreationMode$camera_camera2", "(Z)V", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "getDeferredCameraGraphConfig$camera_camera2", "()Landroidx/camera/camera2/pipe/CameraGraph$Config;", "Landroidx/camera/camera2/pipe/CameraGraph;", "cameraGraph", "resumeDeferredCameraGraphCreation$camera_camera2", "(Landroidx/camera/camera2/pipe/CameraGraph;)V", "open", "()V", "close", "isPrimary", "setPrimary", "enabled", "setActiveResumingMode", "Lcom/google/common/util/concurrent/ListenableFuture;", "Ljava/lang/Void;", "release", "()Lcom/google/common/util/concurrent/ListenableFuture;", "getCameraInfoInternal", "()Landroidx/camera/core/impl/CameraInfoInternal;", "Landroidx/camera/core/impl/Observable;", "Landroidx/camera/core/impl/CameraInternal$State;", "getCameraState", "()Landroidx/camera/core/impl/Observable;", "getCameraControlInternal", "()Landroidx/camera/core/impl/CameraControlInternal;", "", "Landroidx/camera/core/UseCase;", "useCasesToAdd", "attachUseCases", "(Ljava/util/Collection;)V", "useCasesToRemove", "detachUseCases", "useCase", "onUseCaseActive", "(Landroidx/camera/core/UseCase;)V", "onUseCaseUpdated", "onUseCaseReset", "onUseCaseInactive", "Landroidx/camera/core/impl/CameraConfig;", "getExtendedConfig", "()Landroidx/camera/core/impl/CameraConfig;", "cameraConfig", "setExtendedConfig", "(Landroidx/camera/core/impl/CameraConfig;)V", "onRemoved", "isRemoved", "()Z", "", "toString", "()Ljava/lang/String;", "getOutputFormats", "Landroidx/camera/camera2/impl/UseCaseManager;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Landroidx/camera/core/impl/CameraInfoInternal;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/core/impl/CameraControlInternal;", "getHighSpeedVideoSizesFor", "Landroidx/camera/camera2/impl/UseCaseThreads;", "getHighSpeedVideoFpsRanges", "Landroidx/camera/camera2/adapter/CameraStateAdapter;", "Landroidx/camera/camera2/pipe/CameraId;", "Ljava/lang/String;", "getOutputMinFrameDuration", "Landroidx/camera/core/impl/CameraConfig;", "", com.visa.cbp.getEncExpo.warmup, "getInputSizeshNQ4ISI", "Landroidx/camera/core/impl/SessionProcessor;", "getInputFormats", "Landroidx/camera/core/impl/SessionProcessor;", "Lkotlinx/atomicfu/AtomicBoolean;", "Lkotlinx/atomicfu/AtomicBoolean;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraInternalAdapter implements androidx.camera.core.impl.CameraInternal {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.String getOutputMinFrameDuration;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.camera2.adapter.CameraStateAdapter getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.camera.core.impl.CameraConfig getOutputFormats;
    private final androidx.camera.core.impl.CameraControlInternal getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.camera.core.impl.CameraInfoInternal Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.UseCaseThreads getHighSpeedVideoFpsRanges;
    private androidx.camera.core.impl.SessionProcessor getInputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.atomicfu.AtomicBoolean getHighSpeedVideoSizesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.UseCaseManager getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final int getInputSizeshNQ4ISI;

    @javax.inject.Inject
    public CameraInternalAdapter(androidx.camera.camera2.config.CameraConfig cameraConfig, androidx.camera.camera2.impl.UseCaseManager useCaseManager, androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.camera.core.impl.CameraControlInternal cameraControlInternal, androidx.camera.camera2.impl.UseCaseThreads useCaseThreads, androidx.camera.camera2.adapter.CameraStateAdapter cameraStateAdapter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfoInternal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraControlInternal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseThreads, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraStateAdapter, "");
        this.getHighResolutionOutputSizeshNQ4ISI = useCaseManager;
        this.Camera2StreamConfigurationMap = cameraInfoInternal;
        this.getHighSpeedVideoFpsRangesFor = cameraControlInternal;
        this.getHighSpeedVideoFpsRanges = useCaseThreads;
        this.getHighSpeedVideoSizes = cameraStateAdapter;
        this.getOutputMinFrameDuration = cameraConfig.getCameraId();
        androidx.camera.core.impl.CameraConfig defaultConfig = androidx.camera.core.impl.CameraConfigs.defaultConfig();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultConfig, "");
        this.getOutputFormats = defaultConfig;
        this.getInputSizeshNQ4ISI = androidx.camera.camera2.adapter.CameraInternalAdapterKt.getCameraAdapterIds().incrementAndGet();
        this.getHighSpeedVideoSizesFor = kotlinx.atomicfu.AtomicFU.atomic(false);
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            androidx.camera.camera2.pipe.CameraId.m398toStringimpl(this.getOutputMinFrameDuration);
        }
    }

    public final void setCameraGraphCreationMode$camera_camera2(boolean createImmediately) {
        this.getHighResolutionOutputSizeshNQ4ISI.setCameraGraphCreationMode$camera_camera2(createImmediately);
    }

    public final androidx.camera.camera2.pipe.CameraGraph.Config getDeferredCameraGraphConfig$camera_camera2() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getDeferredCameraGraphConfig$camera_camera2();
    }

    public final void resumeDeferredCameraGraphCreation$camera_camera2(androidx.camera.camera2.pipe.CameraGraph cameraGraph) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraGraph, "");
        this.getHighResolutionOutputSizeshNQ4ISI.resumeDeferredComponentCreation$camera_camera2(cameraGraph);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void open() {
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void close() {
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void setPrimary(boolean isPrimary) {
        this.getHighResolutionOutputSizeshNQ4ISI.setPrimary(isPrimary);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void setActiveResumingMode(boolean enabled) {
        this.getHighResolutionOutputSizeshNQ4ISI.setActiveResumeMode(enabled);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> release() {
        kotlinx.coroutines.Job launch$default;
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRanges.getScope(), null, null, new androidx.camera.camera2.adapter.CameraInternalAdapter$release$1(this, null), 3, null);
        return androidx.camera.camera2.adapter.CoroutineAdaptersKt.asListenableFuture$default(launch$default, (java.lang.Object) null, 1, (java.lang.Object) null);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    /* renamed from: getCameraInfoInternal, reason: from getter */
    public final androidx.camera.core.impl.CameraInfoInternal getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final androidx.camera.core.impl.Observable<androidx.camera.core.impl.CameraInternal.State> getCameraState() {
        return this.getHighSpeedVideoSizes.getCameraInternalState$camera_camera2();
    }

    @Override // androidx.camera.core.impl.CameraInternal
    /* renamed from: getCameraControlInternal, reason: from getter */
    public final androidx.camera.core.impl.CameraControlInternal getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void attachUseCases(java.util.Collection<androidx.camera.core.UseCase> useCasesToAdd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCasesToAdd, "");
        this.getHighResolutionOutputSizeshNQ4ISI.attach(kotlin.collections.CollectionsKt.toList(useCasesToAdd));
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void detachUseCases(java.util.Collection<androidx.camera.core.UseCase> useCasesToRemove) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCasesToRemove, "");
        this.getHighResolutionOutputSizeshNQ4ISI.detach(kotlin.collections.CollectionsKt.toList(useCasesToRemove));
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void onUseCaseActive(androidx.camera.core.UseCase useCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI.activate(useCase);
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void onUseCaseUpdated(androidx.camera.core.UseCase useCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI.update(useCase);
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void onUseCaseReset(androidx.camera.core.UseCase useCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI.reset(useCase);
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public final void onUseCaseInactive(androidx.camera.core.UseCase useCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI.deactivate(useCase);
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    /* renamed from: getExtendedConfig, reason: from getter */
    public final androidx.camera.core.impl.CameraConfig getGetOutputFormats() {
        return this.getOutputFormats;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void setExtendedConfig(androidx.camera.core.impl.CameraConfig cameraConfig) {
        androidx.camera.core.impl.CameraConfig cameraConfig2;
        if (cameraConfig == null) {
            cameraConfig2 = androidx.camera.core.impl.CameraConfigs.defaultConfig();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraConfig2, "");
        } else {
            cameraConfig2 = cameraConfig;
        }
        this.getOutputFormats = cameraConfig2;
        androidx.camera.core.impl.SessionProcessor sessionProcessor = cameraConfig != null ? cameraConfig.getSessionProcessor(null) : null;
        this.getInputFormats = sessionProcessor;
        this.getHighResolutionOutputSizeshNQ4ISI.setSessionProcessor$camera_camera2(sessionProcessor);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final void onRemoved() {
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
        }
        if (this.getHighSpeedVideoSizesFor.compareAndSet(false, true)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRanges.getScope(), null, null, new androidx.camera.camera2.adapter.CameraInternalAdapter$onRemoved$2(this, null), 3, null);
        }
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public final boolean isRemoved() {
        return this.getHighSpeedVideoSizesFor.getValue();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CameraInternalAdapter<");
        sb.append((java.lang.Object) androidx.camera.camera2.pipe.CameraId.m398toStringimpl(this.getOutputMinFrameDuration));
        sb.append('(');
        sb.append(this.getInputSizeshNQ4ISI);
        sb.append(")>");
        return sb.toString();
    }
}
