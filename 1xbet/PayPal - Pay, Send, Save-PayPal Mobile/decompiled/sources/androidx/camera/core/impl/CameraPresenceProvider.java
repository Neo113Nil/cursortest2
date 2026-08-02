package androidx.camera.core.impl;

@kotlin.Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 M2\u00020\u0001:\u0003NOMB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010#\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b#\u0010\u001bJ\u001d\u0010'\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020%¢\u0006\u0004\b)\u0010*R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010+R\u0014\u0010.\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010#\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u001d\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00100R\u001c\u00105\u001a\b\u0012\u0002\b\u0003\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00107\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00106R\u0018\u00109\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00108R$\u0010=\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 \u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010/\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010>R\u0018\u0010B\u001a\u00060?R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u00103\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010ER\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00130F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010GR\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020H0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010GR&\u0010@\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0J0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010L"}, d2 = {"Landroidx/camera/core/impl/CameraPresenceProvider;", "", "Ljava/util/concurrent/Executor;", "backgroundExecutor", "Ljava/util/concurrent/ScheduledExecutorService;", "scheduledExecutor", "<init>", "(Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V", "Landroidx/camera/core/impl/CameraValidator;", "cameraValidator", "Landroidx/camera/core/impl/CameraFactory;", "cameraFactory", "Landroidx/camera/core/impl/CameraRepository;", "cameraRepository", "", "startup", "(Landroidx/camera/core/impl/CameraValidator;Landroidx/camera/core/impl/CameraFactory;Landroidx/camera/core/impl/CameraRepository;)V", "shutdown", "()V", "Landroidx/camera/core/impl/InternalCameraPresenceListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addDependentInternalListener", "(Landroidx/camera/core/impl/InternalCameraPresenceListener;)V", "removeDependentInternalListener", "", "p0", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;)V", "Landroidx/camera/core/impl/CameraInfoInternal;", "getHighSpeedVideoFpsRanges", "(Landroidx/camera/core/impl/CameraInfoInternal;)V", "", "", "Landroidx/camera/core/CameraIdentifier;", "p1", "getHighSpeedVideoSizes", "(ILjava/util/List;)V", "Landroidx/camera/core/CameraPresenceListener;", "executor", "addCameraPresenceListener", "(Landroidx/camera/core/CameraPresenceListener;Ljava/util/concurrent/Executor;)V", "removeCameraPresenceListener", "(Landroidx/camera/core/CameraPresenceListener;)V", "Ljava/util/concurrent/Executor;", "getOutputSizes", "Ljava/util/concurrent/ScheduledExecutorService;", "Camera2StreamConfigurationMap", "getInputFormats", "Ljava/lang/Object;", "getOutputMinFrameDurationlomOqCM", "Ljava/util/concurrent/ScheduledFuture;", "getOutputSizeshNQ4ISI", "Ljava/util/concurrent/ScheduledFuture;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/core/impl/CameraFactory;", "getInputSizeshNQ4ISI", "Landroidx/camera/core/impl/CameraRepository;", "getOutputFormats", "Landroidx/camera/core/impl/Observable;", "getOutputStallDurationlomOqCM", "Landroidx/camera/core/impl/Observable;", "getOutputMinFrameDuration", "Landroidx/camera/core/impl/CameraValidator;", "Landroidx/camera/core/impl/CameraPresenceProvider$SourceObservableObserver;", "getOutputStallDuration", "Landroidx/camera/core/impl/CameraPresenceProvider$SourceObservableObserver;", "getHighSpeedVideoSizesFor", "Ljava/util/List;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/camera/core/impl/CameraPresenceProvider$ListenerWrapper;", "", "Landroidx/lifecycle/Observer;", "Landroidx/camera/core/CameraState;", "Ljava/util/Map;", "Companion", "ListenerWrapper", "SourceObservableObserver"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraPresenceProvider {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.camera.core.impl.CameraRepository getOutputFormats;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.camera.core.impl.CameraValidator getInputFormats;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.camera.core.impl.CameraFactory getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, androidx.view.Observer<androidx.camera.core.CameraState>> getOutputStallDuration;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.concurrent.Executor getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private volatile java.util.List<androidx.camera.core.CameraIdentifier> getOutputSizes;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoSizes;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicBoolean getOutputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.camera.core.impl.InternalCameraPresenceListener> getOutputStallDurationlomOqCM;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.camera.core.impl.CameraPresenceProvider.ListenerWrapper> getOutputMinFrameDurationlomOqCM;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final java.util.concurrent.ScheduledExecutorService Camera2StreamConfigurationMap;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.util.concurrent.ScheduledFuture<?> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final androidx.camera.core.impl.CameraPresenceProvider.SourceObservableObserver getHighSpeedVideoSizesFor;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private androidx.camera.core.impl.Observable<java.util.List<androidx.camera.core.CameraIdentifier>> getOutputMinFrameDuration;

    public CameraPresenceProvider(java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        this.getHighSpeedVideoFpsRangesFor = executor;
        this.Camera2StreamConfigurationMap = scheduledExecutorService;
        this.getHighSpeedVideoSizes = new java.lang.Object();
        this.getHighSpeedVideoFpsRanges = new java.lang.Object();
        this.getHighSpeedVideoSizesFor = new androidx.camera.core.impl.CameraPresenceProvider.SourceObservableObserver();
        this.getOutputSizes = kotlin.collections.CollectionsKt.emptyList();
        this.getOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.getOutputStallDurationlomOqCM = new java.util.concurrent.CopyOnWriteArrayList<>();
        this.getOutputMinFrameDurationlomOqCM = new java.util.concurrent.CopyOnWriteArrayList<>();
        this.getOutputStallDuration = new java.util.LinkedHashMap();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017"}, d2 = {"Landroidx/camera/core/impl/CameraPresenceProvider$ListenerWrapper;", "", "Landroidx/camera/core/CameraPresenceListener;", "p0", "Ljava/util/concurrent/Executor;", "p1", "<init>", "(Landroidx/camera/core/CameraPresenceListener;Ljava/util/concurrent/Executor;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Landroidx/camera/core/CameraPresenceListener;", "getHighSpeedVideoFpsRanges", "()Landroidx/camera/core/CameraPresenceListener;", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/Executor;", "()Ljava/util/concurrent/Executor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final /* data */ class ListenerWrapper {
        private final java.util.concurrent.Executor Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final androidx.camera.core.CameraPresenceListener getHighSpeedVideoFpsRanges;

        public ListenerWrapper(androidx.camera.core.CameraPresenceListener cameraPresenceListener, java.util.concurrent.Executor executor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraPresenceListener, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
            this.getHighSpeedVideoFpsRanges = cameraPresenceListener;
            this.Camera2StreamConfigurationMap = executor;
        }

        /* renamed from: Camera2StreamConfigurationMap, reason: from getter */
        public final java.util.concurrent.Executor getCamera2StreamConfigurationMap() {
            return this.Camera2StreamConfigurationMap;
        }

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from getter */
        public final androidx.camera.core.CameraPresenceListener getGetHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ListenerWrapper(getHighSpeedVideoFpsRanges=");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(", Camera2StreamConfigurationMap=");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (this.getHighSpeedVideoFpsRanges.hashCode() * 31) + this.Camera2StreamConfigurationMap.hashCode();
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof androidx.camera.core.impl.CameraPresenceProvider.ListenerWrapper)) {
                return false;
            }
            androidx.camera.core.impl.CameraPresenceProvider.ListenerWrapper listenerWrapper = (androidx.camera.core.impl.CameraPresenceProvider.ListenerWrapper) p0;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, listenerWrapper.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, listenerWrapper.Camera2StreamConfigurationMap);
        }
    }

    public final void startup(androidx.camera.core.impl.CameraValidator cameraValidator, androidx.camera.core.impl.CameraFactory cameraFactory, androidx.camera.core.impl.CameraRepository cameraRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraValidator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraFactory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraRepository, "");
        if (this.getOutputSizeshNQ4ISI.compareAndSet(false, true)) {
            androidx.camera.core.Logger.i("CameraPresencePrvdr", "Starting CameraPresenceProvider monitoring.");
            this.getInputFormats = cameraValidator;
            java.util.Set<java.lang.String> availableCameraIds = cameraFactory.getAvailableCameraIds();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(availableCameraIds, "");
            java.util.Set<java.lang.String> set = availableCameraIds;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set, 10));
            for (java.lang.String str : set) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(str);
                arrayList.add(androidx.camera.core.CameraIdentifier.Factory.create$default(str, null, null, 6, null));
            }
            this.getOutputSizes = arrayList;
            this.getInputSizeshNQ4ISI = cameraFactory;
            this.getOutputFormats = cameraRepository;
            this.getOutputMinFrameDuration = cameraFactory.getCameraPresenceSource();
            this.getHighSpeedVideoFpsRangesFor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.impl.CameraPresenceProvider$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.impl.CameraPresenceProvider.m1008$r8$lambda$te2u7cAesgfpnEhgwA1yKuyRHo(androidx.camera.core.impl.CameraPresenceProvider.this);
                }
            });
            androidx.camera.core.impl.Observable<java.util.List<androidx.camera.core.CameraIdentifier>> observable = this.getOutputMinFrameDuration;
            if (observable != null) {
                observable.addObserver(androidx.camera.core.impl.utils.executor.CameraXExecutors.newSequentialExecutor(this.getHighSpeedVideoFpsRangesFor), this.getHighSpeedVideoSizesFor);
            }
        }
    }

    public final void shutdown() {
        if (!this.getOutputSizeshNQ4ISI.getAndSet(false)) {
            androidx.camera.core.Logger.d("CameraPresencePrvdr", "Shutdown called when not monitoring. Ignoring.");
            return;
        }
        androidx.camera.core.Logger.i("CameraPresencePrvdr", "Shutting down CameraPresenceProvider monitoring.");
        synchronized (this.getHighSpeedVideoFpsRanges) {
            java.util.concurrent.ScheduledFuture<?> scheduledFuture = this.getHighResolutionOutputSizeshNQ4ISI;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        androidx.camera.core.impl.Observable<java.util.List<androidx.camera.core.CameraIdentifier>> observable = this.getOutputMinFrameDuration;
        if (observable != null) {
            observable.removeObserver(this.getHighSpeedVideoSizesFor);
        }
        synchronized (this.getHighSpeedVideoSizes) {
            if (!this.getOutputStallDuration.isEmpty()) {
                java.util.Map map = kotlin.collections.MapsKt.toMap(this.getOutputStallDuration);
                this.getOutputStallDuration.clear();
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                androidx.camera.core.impl.CameraRepository cameraRepository = this.getOutputFormats;
                if (cameraRepository != null) {
                    java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> cameras = cameraRepository.getCameras();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameras, "");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (androidx.camera.core.impl.CameraInternal cameraInternal : cameras) {
                        androidx.camera.core.impl.CameraInfoInternal camera2StreamConfigurationMap = cameraInternal != null ? cameraInternal.getCamera2StreamConfigurationMap() : null;
                        if (camera2StreamConfigurationMap != null) {
                            arrayList.add(camera2StreamConfigurationMap);
                        }
                    }
                    final java.util.ArrayList arrayList2 = arrayList;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Clearing all ");
                    sb.append(map.size());
                    sb.append(" state observers.");
                    androidx.camera.core.Logger.d("CameraPresencePrvdr", sb.toString());
                    for (java.util.Map.Entry entry : map.entrySet()) {
                        final java.lang.String str = (java.lang.String) entry.getKey();
                        final androidx.view.Observer observer = (androidx.view.Observer) entry.getValue();
                        androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.impl.CameraPresenceProvider$$ExternalSyntheticLambda3
                            @Override // java.lang.Runnable
                            public final void run() {
                                androidx.camera.core.impl.CameraPresenceProvider.$r8$lambda$t0eoGS01UsRMi5eVUUzlGpqblZ0(arrayList2, observer, str);
                            }
                        });
                    }
                }
            }
        }
        this.getInputFormats = null;
        this.getOutputStallDurationlomOqCM.clear();
        this.getOutputMinFrameDurationlomOqCM.clear();
        this.getOutputSizes = kotlin.collections.CollectionsKt.emptyList();
        this.getInputSizeshNQ4ISI = null;
        this.getOutputFormats = null;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/camera/core/impl/CameraPresenceProvider$SourceObservableObserver;", "Landroidx/camera/core/impl/Observable$Observer;", "", "Landroidx/camera/core/CameraIdentifier;", "<init>", "(Landroidx/camera/core/impl/CameraPresenceProvider;)V", "", "p0", "", "onError", "(Ljava/lang/Throwable;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class SourceObservableObserver implements androidx.camera.core.impl.Observable.Observer<java.util.List<? extends androidx.camera.core.CameraIdentifier>> {
        public SourceObservableObserver() {
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public final /* synthetic */ void onNewData(java.util.List<? extends androidx.camera.core.CameraIdentifier> list) {
            androidx.camera.core.impl.CameraFactory cameraFactory;
            androidx.camera.core.impl.CameraRepository cameraRepository;
            androidx.camera.core.impl.CameraValidator cameraValidator;
            java.util.ArrayList emptyList;
            java.util.List<? extends androidx.camera.core.CameraIdentifier> list2 = list;
            if (!androidx.camera.core.impl.CameraPresenceProvider.this.getOutputSizeshNQ4ISI.get() || (cameraFactory = androidx.camera.core.impl.CameraPresenceProvider.this.getInputSizeshNQ4ISI) == null || (cameraRepository = androidx.camera.core.impl.CameraPresenceProvider.this.getOutputFormats) == null || (cameraValidator = androidx.camera.core.impl.CameraPresenceProvider.this.getInputFormats) == null) {
                return;
            }
            if (list2 != null) {
                java.util.List<? extends androidx.camera.core.CameraIdentifier> list3 = list2;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                java.util.Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((androidx.camera.core.CameraIdentifier) it.next()).getInternalId());
                }
                emptyList = arrayList;
            } else {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            if (cameraFactory instanceof androidx.camera.core.impl.CameraFactory.Interrogator) {
                try {
                    java.util.List list4 = androidx.camera.core.impl.CameraPresenceProvider.this.getOutputSizes;
                    java.util.List<java.lang.String> availableCameraIds = ((androidx.camera.core.impl.CameraFactory.Interrogator) cameraFactory).getAvailableCameraIds(emptyList);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(availableCameraIds, "");
                    java.util.List<java.lang.String> list5 = availableCameraIds;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list5, 10));
                    for (java.lang.String str : list5) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
                        arrayList2.add(androidx.camera.core.CameraIdentifier.Factory.create$default(str, null, null, 6, null));
                    }
                    java.util.Set<androidx.camera.core.CameraIdentifier> minus = kotlin.collections.SetsKt.minus(kotlin.collections.CollectionsKt.toSet(list4), (java.lang.Iterable) kotlin.collections.CollectionsKt.toSet(arrayList2));
                    if (!minus.isEmpty()) {
                        java.util.LinkedHashSet<androidx.camera.core.impl.CameraInternal> cameras = cameraRepository.getCameras();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameras, "");
                        if (cameraValidator.isChangeInvalid(cameras, minus)) {
                            androidx.camera.core.Logger.w("CameraPresencePrvdr", "Camera removal update invalid. Aborting.");
                            return;
                        }
                    }
                } catch (java.lang.Exception e) {
                    androidx.camera.core.Logger.w("CameraPresencePrvdr", "Failed to interrogate camera factory. Falling back to full update.", e);
                }
            }
            try {
                cameraFactory.onCameraIdsUpdated(emptyList);
                java.util.Set<java.lang.String> availableCameraIds2 = cameraFactory.getAvailableCameraIds();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(availableCameraIds2, "");
                java.util.Set<java.lang.String> set = availableCameraIds2;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set, 10));
                for (java.lang.String str2 : set) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(str2);
                    arrayList3.add(androidx.camera.core.CameraIdentifier.Factory.create$default(str2, null, null, 6, null));
                }
                java.util.ArrayList arrayList4 = arrayList3;
                if (kotlin.jvm.internal.Intrinsics.areEqual(arrayList4, androidx.camera.core.impl.CameraPresenceProvider.this.getOutputSizes)) {
                    return;
                }
                androidx.camera.core.impl.CameraPresenceProvider.access$processFilteredCameraIdUpdate(androidx.camera.core.impl.CameraPresenceProvider.this, arrayList4);
            } catch (java.lang.Exception e2) {
                androidx.camera.core.Logger.w("CameraPresencePrvdr", "CameraFactory failed to update. The camera list may be stale until the next update.", e2);
            }
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public final void onError(java.lang.Throwable p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            if (androidx.camera.core.impl.CameraPresenceProvider.this.getOutputSizeshNQ4ISI.get()) {
                androidx.camera.core.Logger.e("CameraPresencePrvdr", "Error from source camera presence observable. Triggering refresh.", p0);
                androidx.camera.core.impl.Observable observable = androidx.camera.core.impl.CameraPresenceProvider.this.getOutputMinFrameDuration;
                if (observable != null) {
                    observable.fetchData();
                }
            }
        }
    }

    public final void addDependentInternalListener(androidx.camera.core.impl.InternalCameraPresenceListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        this.getOutputStallDurationlomOqCM.add(listener);
    }

    public final void removeDependentInternalListener(androidx.camera.core.impl.InternalCameraPresenceListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        this.getOutputStallDurationlomOqCM.remove(listener);
    }

    private final void getHighSpeedVideoFpsRangesFor(java.lang.String p0) {
        androidx.camera.core.impl.CameraRepository cameraRepository = this.getOutputFormats;
        if (cameraRepository == null) {
            return;
        }
        try {
            androidx.camera.core.impl.CameraInternal camera = cameraRepository.getCamera(p0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(camera, "");
            androidx.camera.core.impl.CameraInfoInternal camera2StreamConfigurationMap = camera.getCamera2StreamConfigurationMap();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(camera2StreamConfigurationMap, "");
            getHighSpeedVideoFpsRanges(camera2StreamConfigurationMap);
        } catch (java.lang.IllegalArgumentException unused) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CameraInternal not found for ");
            sb.append(p0);
            sb.append(". Cannot setup state observer.");
            androidx.camera.core.Logger.w("CameraPresencePrvdr", sb.toString());
        }
    }

    private final void getHighSpeedVideoFpsRanges(final androidx.camera.core.impl.CameraInfoInternal p0) {
        final java.lang.String cameraId = p0.getCameraId();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cameraId, "");
        if (this.getOutputSizeshNQ4ISI.get()) {
            synchronized (this.getHighSpeedVideoSizes) {
                if (this.getOutputStallDuration.containsKey(cameraId)) {
                    return;
                }
                final androidx.view.Observer<androidx.camera.core.CameraState> observer = new androidx.view.Observer() { // from class: androidx.camera.core.impl.CameraPresenceProvider$$ExternalSyntheticLambda10
                    @Override // androidx.view.Observer
                    public final void onChanged(java.lang.Object obj) {
                        androidx.camera.core.impl.CameraPresenceProvider.$r8$lambda$NKb5tywml7fLh72E80xwb7S7jCQ(androidx.camera.core.impl.CameraPresenceProvider.this, cameraId, (androidx.camera.core.CameraState) obj);
                    }
                };
                androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.impl.CameraPresenceProvider$$ExternalSyntheticLambda11
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.impl.CameraInfoInternal.this.getCameraState().observeForever(observer);
                    }
                });
                this.getOutputStallDuration.put(cameraId, observer);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Registered state observer for camera: ");
                sb.append(cameraId);
                androidx.camera.core.Logger.d("CameraPresencePrvdr", sb.toString());
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
    }

    private final void getHighSpeedVideoSizes(final int p0, final java.util.List<androidx.camera.core.CameraIdentifier> p1) {
        if (p0 > 0 && this.getOutputSizeshNQ4ISI.get()) {
            this.getHighResolutionOutputSizeshNQ4ISI = this.Camera2StreamConfigurationMap.schedule(new java.lang.Runnable() { // from class: androidx.camera.core.impl.CameraPresenceProvider$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    r0.getHighSpeedVideoFpsRangesFor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.impl.CameraPresenceProvider$$ExternalSyntheticLambda9
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.camera.core.impl.CameraPresenceProvider.$r8$lambda$ougxnBvQAPKxbEvMJlj_ZPCmIxY(androidx.camera.core.impl.CameraPresenceProvider.this, r2, r3);
                        }
                    });
                }
            }, p0 == 3 ? 0L : 400L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } else if (p0 <= 0) {
            androidx.camera.core.Logger.w("CameraPresencePrvdr", "Exhausted all retries for camera list refresh.");
        }
    }

    private final void getHighSpeedVideoSizes(java.lang.String p0) {
        synchronized (this.getHighSpeedVideoSizes) {
            final androidx.view.Observer<androidx.camera.core.CameraState> remove = this.getOutputStallDuration.remove(p0);
            androidx.camera.core.impl.CameraRepository cameraRepository = this.getOutputFormats;
            if (remove != null && cameraRepository != null) {
                try {
                    final androidx.camera.core.impl.CameraInternal camera = cameraRepository.getCamera(p0);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(camera, "");
                    androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.impl.CameraPresenceProvider$$ExternalSyntheticLambda4
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.camera.core.impl.CameraInternal.this.getCamera2StreamConfigurationMap().getCameraState().removeObserver(remove);
                        }
                    });
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Removed state observer for: ");
                    sb.append(p0);
                    androidx.camera.core.Logger.d("CameraPresencePrvdr", sb.toString());
                } catch (java.lang.IllegalArgumentException unused) {
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void addCameraPresenceListener(final androidx.camera.core.CameraPresenceListener listener, java.util.concurrent.Executor executor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        this.getOutputMinFrameDurationlomOqCM.add(new androidx.camera.core.impl.CameraPresenceProvider.ListenerWrapper(listener, executor));
        executor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.impl.CameraPresenceProvider$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.impl.CameraPresenceProvider.$r8$lambda$BscuJl6k0EvV8pGpFPAQYqSaQDA(androidx.camera.core.impl.CameraPresenceProvider.this, listener);
            }
        });
    }

    public final void removeCameraPresenceListener(final androidx.camera.core.CameraPresenceListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        kotlin.collections.CollectionsKt.removeAll((java.util.List) this.getOutputMinFrameDurationlomOqCM, new kotlin.jvm.functions.Function1() { // from class: androidx.camera.core.impl.CameraPresenceProvider$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                boolean areEqual;
                areEqual = kotlin.jvm.internal.Intrinsics.areEqual(((androidx.camera.core.impl.CameraPresenceProvider.ListenerWrapper) obj).getGetHighSpeedVideoFpsRanges(), androidx.camera.core.CameraPresenceListener.this);
                return java.lang.Boolean.valueOf(areEqual);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$BscuJl6k0EvV8pGpFPAQYqSaQDA(androidx.camera.core.impl.CameraPresenceProvider cameraPresenceProvider, androidx.camera.core.CameraPresenceListener cameraPresenceListener) {
        java.util.Set<androidx.camera.core.CameraIdentifier> set = kotlin.collections.CollectionsKt.toSet(cameraPresenceProvider.getOutputSizes);
        if (set.isEmpty()) {
            return;
        }
        cameraPresenceListener.onCamerasAdded(set);
    }

    /* renamed from: $r8$lambda$JuGR6QCPogNqVPIA0bnDaAcAw-o, reason: not valid java name */
    public static /* synthetic */ void m1007$r8$lambda$JuGR6QCPogNqVPIA0bnDaAcAwo(androidx.camera.core.impl.CameraPresenceProvider cameraPresenceProvider) {
        synchronized (cameraPresenceProvider.getHighSpeedVideoFpsRanges) {
            java.util.concurrent.ScheduledFuture<?> scheduledFuture = cameraPresenceProvider.getHighResolutionOutputSizeshNQ4ISI;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            androidx.camera.core.Logger.d("CameraPresencePrvdr", "Starting new refresh-with-retries sequence.");
            cameraPresenceProvider.getHighSpeedVideoSizes(3, cameraPresenceProvider.getOutputSizes);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void $r8$lambda$NKb5tywml7fLh72E80xwb7S7jCQ(final androidx.camera.core.impl.CameraPresenceProvider cameraPresenceProvider, java.lang.String str, androidx.camera.core.CameraState cameraState) {
        if (!cameraPresenceProvider.getOutputSizeshNQ4ISI.get()) {
            androidx.camera.core.Logger.d("CameraPresencePrvdr", "Ignore camera state change handling since already stop monitoring");
            return;
        }
        if (cameraState.getError() != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Camera ");
            sb.append(str);
            sb.append(" state changed to ");
            sb.append(cameraState.getType());
            sb.append(" with error: ");
            androidx.camera.core.CameraState.StateError error = cameraState.getError();
            sb.append(error != null ? java.lang.Integer.valueOf(error.getCode()) : null);
            sb.append(". Triggering refresh.");
            androidx.camera.core.Logger.w("CameraPresencePrvdr", sb.toString());
            cameraPresenceProvider.getHighSpeedVideoFpsRangesFor.execute(new java.lang.Runnable() { // from class: androidx.camera.core.impl.CameraPresenceProvider$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.impl.CameraPresenceProvider.m1007$r8$lambda$JuGR6QCPogNqVPIA0bnDaAcAwo(androidx.camera.core.impl.CameraPresenceProvider.this);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$ougxnBvQAPKxbEvMJlj_ZPCmIxY(androidx.camera.core.impl.CameraPresenceProvider cameraPresenceProvider, java.util.List list, int i) {
        if (cameraPresenceProvider.getOutputSizeshNQ4ISI.get() && kotlin.jvm.internal.Intrinsics.areEqual(cameraPresenceProvider.getOutputSizes, list)) {
            androidx.camera.core.Logger.d("CameraPresencePrvdr", "Triggering refresh. Attempts left: ".concat(java.lang.String.valueOf(i)));
            androidx.camera.core.impl.Observable<java.util.List<androidx.camera.core.CameraIdentifier>> observable = cameraPresenceProvider.getOutputMinFrameDuration;
            if (observable != null) {
                observable.fetchData();
            }
            cameraPresenceProvider.getHighSpeedVideoSizes(i - 1, list);
        }
    }

    public static /* synthetic */ void $r8$lambda$t0eoGS01UsRMi5eVUUzlGpqblZ0(java.util.List list, androidx.view.Observer observer, java.lang.String str) {
        java.lang.Object obj;
        androidx.view.LiveData<androidx.camera.core.CameraState> cameraState;
        try {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((androidx.camera.core.impl.CameraInfoInternal) obj).getCameraId(), str)) {
                        break;
                    }
                }
            }
            androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal = (androidx.camera.core.impl.CameraInfoInternal) obj;
            if (cameraInfoInternal == null || (cameraState = cameraInfoInternal.getCameraState()) == null) {
                return;
            }
            cameraState.removeObserver(observer);
        } catch (java.lang.IllegalArgumentException unused) {
        }
    }

    /* renamed from: $r8$lambda$te2u7cAesgfp-nEhgwA1yKuyRHo, reason: not valid java name */
    public static /* synthetic */ void m1008$r8$lambda$te2u7cAesgfpnEhgwA1yKuyRHo(androidx.camera.core.impl.CameraPresenceProvider cameraPresenceProvider) {
        java.util.Iterator<T> it = cameraPresenceProvider.getOutputSizes.iterator();
        while (it.hasNext()) {
            cameraPresenceProvider.getHighSpeedVideoFpsRangesFor(((androidx.camera.core.CameraIdentifier) it.next()).getInternalId());
        }
    }

    public static final /* synthetic */ void access$processFilteredCameraIdUpdate(androidx.camera.core.impl.CameraPresenceProvider cameraPresenceProvider, java.util.List list) {
        java.util.List list2 = kotlin.collections.CollectionsKt.toList(cameraPresenceProvider.getOutputSizes);
        if (kotlin.jvm.internal.Intrinsics.areEqual(list, list2)) {
            return;
        }
        synchronized (cameraPresenceProvider.getHighSpeedVideoFpsRanges) {
            if (cameraPresenceProvider.getHighResolutionOutputSizeshNQ4ISI != null) {
                androidx.camera.core.Logger.d("CameraPresencePrvdr", "Camera list updated. Cancelling any pending retries.");
                java.util.concurrent.ScheduledFuture<?> scheduledFuture = cameraPresenceProvider.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.jvm.internal.Intrinsics.checkNotNull(scheduledFuture);
                scheduledFuture.cancel(false);
                cameraPresenceProvider.getHighResolutionOutputSizeshNQ4ISI = null;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        java.util.List list3 = list2;
        java.util.Set set = kotlin.collections.CollectionsKt.toSet(list3);
        java.util.List list4 = list;
        java.util.Set set2 = kotlin.collections.CollectionsKt.toSet(list4);
        final java.util.Set minus = kotlin.collections.SetsKt.minus(set2, (java.lang.Iterable) set);
        final java.util.Set minus2 = kotlin.collections.SetsKt.minus(set, (java.lang.Iterable) set2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
        java.util.Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList2.add(((androidx.camera.core.CameraIdentifier) it.next()).getInternalId());
        }
        java.util.ArrayList arrayList3 = arrayList2;
        try {
            java.util.Iterator it2 = minus2.iterator();
            while (it2.hasNext()) {
                cameraPresenceProvider.getHighSpeedVideoSizes(((androidx.camera.core.CameraIdentifier) it2.next()).getInternalId());
            }
            androidx.camera.core.impl.CameraRepository cameraRepository = cameraPresenceProvider.getOutputFormats;
            if (cameraRepository != null) {
                androidx.camera.core.Logger.d("CameraPresencePrvdr", "Updating CameraRepository...");
                cameraRepository.onCamerasUpdated(arrayList3);
                arrayList.add(cameraRepository);
                androidx.camera.core.Logger.d("CameraPresencePrvdr", "CameraRepository updated successfully.");
            }
            if (!cameraPresenceProvider.getOutputStallDurationlomOqCM.isEmpty()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("Updating ");
                sb.append(cameraPresenceProvider.getOutputStallDurationlomOqCM.size());
                sb.append(" dependent listeners...");
                androidx.camera.core.Logger.d("CameraPresencePrvdr", sb.toString());
                for (androidx.camera.core.impl.InternalCameraPresenceListener internalCameraPresenceListener : cameraPresenceProvider.getOutputStallDurationlomOqCM) {
                    internalCameraPresenceListener.onCamerasUpdated(arrayList3);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(internalCameraPresenceListener);
                    arrayList.add(internalCameraPresenceListener);
                }
            }
            cameraPresenceProvider.getOutputSizes = list;
            java.util.Iterator it3 = minus.iterator();
            while (it3.hasNext()) {
                cameraPresenceProvider.getHighSpeedVideoFpsRangesFor(((androidx.camera.core.CameraIdentifier) it3.next()).getInternalId());
            }
            if (!minus.isEmpty()) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Notifying ");
                sb2.append(minus.size());
                sb2.append(" cameras added.");
                androidx.camera.core.Logger.i("CameraPresencePrvdr", sb2.toString());
                for (final androidx.camera.core.impl.CameraPresenceProvider.ListenerWrapper listenerWrapper : cameraPresenceProvider.getOutputMinFrameDurationlomOqCM) {
                    listenerWrapper.getCamera2StreamConfigurationMap().execute(new java.lang.Runnable() { // from class: androidx.camera.core.impl.CameraPresenceProvider$$ExternalSyntheticLambda5
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.camera.core.impl.CameraPresenceProvider.ListenerWrapper.this.getGetHighSpeedVideoFpsRanges().onCamerasAdded(minus);
                        }
                    });
                }
            }
            if (minus2.isEmpty()) {
                return;
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Notifying ");
            sb3.append(minus2.size());
            sb3.append(" cameras removed.");
            androidx.camera.core.Logger.i("CameraPresencePrvdr", sb3.toString());
            for (final androidx.camera.core.impl.CameraPresenceProvider.ListenerWrapper listenerWrapper2 : cameraPresenceProvider.getOutputMinFrameDurationlomOqCM) {
                listenerWrapper2.getCamera2StreamConfigurationMap().execute(new java.lang.Runnable() { // from class: androidx.camera.core.impl.CameraPresenceProvider$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.impl.CameraPresenceProvider.ListenerWrapper.this.getGetHighSpeedVideoFpsRanges().onCamerasRemoved(minus2);
                    }
                });
            }
        } catch (java.lang.Exception e) {
            androidx.camera.core.Logger.e("CameraPresencePrvdr", "A core module failed to update. Rolling back changes.", e);
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
            java.util.Iterator it4 = list3.iterator();
            while (it4.hasNext()) {
                arrayList4.add(((androidx.camera.core.CameraIdentifier) it4.next()).getInternalId());
            }
            java.util.ArrayList arrayList5 = arrayList4;
            for (androidx.camera.core.impl.InternalCameraPresenceListener internalCameraPresenceListener2 : kotlin.collections.CollectionsKt.asReversedMutable(arrayList)) {
                try {
                    internalCameraPresenceListener2.onCamerasUpdated(arrayList5);
                } catch (java.lang.Exception e2) {
                    androidx.camera.core.Logger.e("CameraPresencePrvdr", "Failed to rollback listener: ".concat(java.lang.String.valueOf(internalCameraPresenceListener2)), e2);
                }
            }
            java.util.Iterator it5 = minus2.iterator();
            while (it5.hasNext()) {
                cameraPresenceProvider.getHighSpeedVideoFpsRangesFor(((androidx.camera.core.CameraIdentifier) it5.next()).getInternalId());
            }
            java.util.Iterator it6 = minus.iterator();
            while (it6.hasNext()) {
                cameraPresenceProvider.getHighSpeedVideoSizes(((androidx.camera.core.CameraIdentifier) it6.next()).getInternalId());
            }
        }
    }
}
