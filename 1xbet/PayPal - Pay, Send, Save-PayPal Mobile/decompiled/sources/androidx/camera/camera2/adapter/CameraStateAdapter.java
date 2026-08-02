package androidx.camera.camera2.adapter;

@androidx.camera.camera2.config.CameraScope
@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\b\u0004\b\u0007\u0018\u0000 92\u00020\u0001:\u0002:9B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0000¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0$8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u001b0)8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010.R\u0016\u00101\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u00100R\u0018\u00102\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u0010\u0012\u001a\u0002048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u00105R&\u00108\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0004\u0012\u00020\u0018068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u00107"}, d2 = {"Landroidx/camera/camera2/adapter/CameraStateAdapter;", "", "<init>", "()V", "", "onRemoved", "Landroidx/camera/camera2/pipe/CameraGraph;", "cameraGraph", "onGraphUpdated", "(Landroidx/camera/camera2/pipe/CameraGraph;)V", "Landroidx/camera/camera2/pipe/GraphState;", "graphState", "onGraphStateUpdated", "(Landroidx/camera/camera2/pipe/CameraGraph;Landroidx/camera/camera2/pipe/GraphState;)V", "Landroidx/camera/core/impl/CameraInternal$State;", "p0", "Landroidx/camera/core/CameraState$StateError;", "p1", "getHighSpeedVideoFpsRangesFor", "(Landroidx/camera/core/impl/CameraInternal$State;Landroidx/camera/core/CameraState$StateError;)V", "currentState", "Landroidx/camera/camera2/adapter/CameraStateAdapter$CombinedCameraState;", "calculateNextState$camera_camera2", "(Landroidx/camera/core/impl/CameraInternal$State;Landroidx/camera/camera2/pipe/GraphState;)Landroidx/camera/camera2/adapter/CameraStateAdapter$CombinedCameraState;", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/Consumer;", "Landroidx/camera/core/CameraState;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addCameraStateListener$camera_camera2", "(Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)V", "removeCameraStateListener$camera_camera2", "(Landroidx/core/util/Consumer;)V", "getOutputFormats", "Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Landroidx/camera/core/impl/LiveDataObservable;", "cameraInternalState", "Landroidx/camera/core/impl/LiveDataObservable;", "getCameraInternalState$camera_camera2", "()Landroidx/camera/core/impl/LiveDataObservable;", "Landroidx/lifecycle/MutableLiveData;", "cameraState", "Landroidx/lifecycle/MutableLiveData;", "getCameraState$camera_camera2", "()Landroidx/lifecycle/MutableLiveData;", "Landroidx/camera/camera2/pipe/CameraGraph;", "Camera2StreamConfigurationMap", "Landroidx/camera/core/impl/CameraInternal$State;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/core/CameraState$StateError;", "", "Z", "", "Ljava/util/Map;", "getInputFormats", "Companion", "CombinedCameraState"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraStateAdapter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.adapter.CameraStateAdapter.Companion INSTANCE = new androidx.camera.camera2.adapter.CameraStateAdapter.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRangesFor;
    private androidx.camera.core.CameraState.StateError getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.camera.camera2.pipe.CameraGraph Camera2StreamConfigurationMap;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();
    private final androidx.camera.core.impl.LiveDataObservable<androidx.camera.core.impl.CameraInternal.State> cameraInternalState = new androidx.camera.core.impl.LiveDataObservable<>();
    private final androidx.view.MutableLiveData<androidx.camera.core.CameraState> cameraState = new androidx.view.MutableLiveData<>();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.camera.core.impl.CameraInternal.State getHighSpeedVideoSizes = androidx.camera.core.impl.CameraInternal.State.CLOSED;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Map<androidx.core.util.Consumer<androidx.camera.core.CameraState>, java.util.concurrent.Executor> getInputFormats = new java.util.LinkedHashMap();

    @javax.inject.Inject
    public CameraStateAdapter() {
        getHighSpeedVideoFpsRangesFor(androidx.camera.core.impl.CameraInternal.State.CLOSED, null);
    }

    public final androidx.camera.core.impl.LiveDataObservable<androidx.camera.core.impl.CameraInternal.State> getCameraInternalState$camera_camera2() {
        return this.cameraInternalState;
    }

    public final androidx.view.MutableLiveData<androidx.camera.core.CameraState> getCameraState$camera_camera2() {
        return this.cameraState;
    }

    public final void onRemoved() {
        androidx.camera.core.CameraState.StateError create = androidx.camera.core.CameraState.StateError.create(8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
        synchronized (this.getHighSpeedVideoFpsRanges) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                return;
            }
            androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            androidx.camera.core.impl.CameraInternal.State state = androidx.camera.core.impl.CameraInternal.State.CLOSED;
            this.getHighSpeedVideoSizes = state;
            this.getHighResolutionOutputSizeshNQ4ISI = create;
            getHighSpeedVideoFpsRangesFor(state, create);
            this.Camera2StreamConfigurationMap = null;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void onGraphUpdated(androidx.camera.camera2.pipe.CameraGraph cameraGraph) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraGraph, "");
        synchronized (this.getHighSpeedVideoFpsRanges) {
            androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                java.util.Objects.toString(this.Camera2StreamConfigurationMap);
                java.util.Objects.toString(cameraGraph);
            }
            if (this.getHighSpeedVideoSizes != androidx.camera.core.impl.CameraInternal.State.CLOSED) {
                getHighSpeedVideoFpsRangesFor(androidx.camera.core.impl.CameraInternal.State.CLOSING, null);
                getHighSpeedVideoFpsRangesFor(androidx.camera.core.impl.CameraInternal.State.CLOSED, null);
            }
            this.Camera2StreamConfigurationMap = cameraGraph;
            this.getHighSpeedVideoSizes = androidx.camera.core.impl.CameraInternal.State.CLOSED;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void onGraphStateUpdated(androidx.camera.camera2.pipe.CameraGraph cameraGraph, androidx.camera.camera2.pipe.GraphState graphState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraGraph, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphState, "");
        synchronized (this.getHighSpeedVideoFpsRanges) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isWarnEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
                return;
            }
            androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                java.util.Objects.toString(cameraGraph);
                java.util.Objects.toString(graphState);
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(cameraGraph, this.Camera2StreamConfigurationMap)) {
                androidx.camera.camera2.impl.Camera2Logger camera2Logger3 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused3 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
            } else {
                androidx.camera.camera2.adapter.CameraStateAdapter.CombinedCameraState calculateNextState$camera_camera2 = calculateNextState$camera_camera2(this.getHighSpeedVideoSizes, graphState);
                if (calculateNextState$camera_camera2 == null) {
                    androidx.camera.camera2.impl.Camera2Logger camera2Logger4 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                    if (androidx.camera.core.Logger.isWarnEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                        java.lang.String unused4 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                        androidx.camera.core.impl.CameraInternal.State unused5 = this.getHighSpeedVideoSizes;
                    }
                } else {
                    this.getHighSpeedVideoSizes = calculateNextState$camera_camera2.getState();
                    this.getHighResolutionOutputSizeshNQ4ISI = calculateNextState$camera_camera2.getError();
                    androidx.camera.camera2.impl.Camera2Logger camera2Logger5 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                    if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                        java.lang.String unused6 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                    }
                    getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    private final void getHighSpeedVideoFpsRangesFor(androidx.camera.core.impl.CameraInternal.State p0, androidx.camera.core.CameraState.StateError p1) {
        java.util.List<java.util.Map.Entry> list;
        this.cameraInternalState.postValue(p0);
        androidx.camera.camera2.adapter.CameraStateAdapter.Companion companion = INSTANCE;
        final androidx.camera.core.CameraState create = androidx.camera.core.CameraState.create(companion.toCameraState$camera_camera2(p0), p1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
        companion.setOrPostValue$camera_camera2(this.cameraState, create);
        synchronized (this.getHighSpeedVideoFpsRanges) {
            list = kotlin.collections.CollectionsKt.toList(this.getInputFormats.entrySet());
        }
        for (java.util.Map.Entry entry : list) {
            final androidx.core.util.Consumer consumer = (androidx.core.util.Consumer) entry.getKey();
            ((java.util.concurrent.Executor) entry.getValue()).execute(new java.lang.Runnable() { // from class: androidx.camera.camera2.adapter.CameraStateAdapter$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.util.Consumer.this.accept(create);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.camera.camera2.adapter.CameraStateAdapter.CombinedCameraState calculateNextState$camera_camera2(androidx.camera.core.impl.CameraInternal.State currentState, androidx.camera.camera2.pipe.GraphState graphState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphState, "");
        int i = androidx.camera.camera2.adapter.CameraStateAdapter.WhenMappings.$EnumSwitchMapping$0[currentState.ordinal()];
        int i2 = 2;
        androidx.camera.core.CameraState.StateError stateError = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        java.lang.Object[] objArr4 = 0;
        java.lang.Object[] objArr5 = 0;
        java.lang.Object[] objArr6 = 0;
        java.lang.Object[] objArr7 = 0;
        java.lang.Object[] objArr8 = 0;
        java.lang.Object[] objArr9 = 0;
        java.lang.Object[] objArr10 = 0;
        java.lang.Object[] objArr11 = 0;
        java.lang.Object[] objArr12 = 0;
        java.lang.Object[] objArr13 = 0;
        java.lang.Object[] objArr14 = 0;
        java.lang.Object[] objArr15 = 0;
        java.lang.Object[] objArr16 = 0;
        java.lang.Object[] objArr17 = 0;
        java.lang.Object[] objArr18 = 0;
        java.lang.Object[] objArr19 = 0;
        java.lang.Object[] objArr20 = 0;
        java.lang.Object[] objArr21 = 0;
        if (i == 1) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(graphState, androidx.camera.camera2.pipe.GraphState.GraphStateStarting.INSTANCE)) {
                return new androidx.camera.camera2.adapter.CameraStateAdapter.CombinedCameraState(androidx.camera.core.impl.CameraInternal.State.OPENING, objArr4 == true ? 1 : 0, i2, objArr3 == true ? 1 : 0);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(graphState, androidx.camera.camera2.pipe.GraphState.GraphStateStarted.INSTANCE)) {
                return new androidx.camera.camera2.adapter.CameraStateAdapter.CombinedCameraState(androidx.camera.core.impl.CameraInternal.State.OPEN, objArr2 == true ? 1 : 0, i2, objArr == true ? 1 : 0);
            }
            return null;
        }
        if (i == 2) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(graphState, androidx.camera.camera2.pipe.GraphState.GraphStateStarted.INSTANCE)) {
                return new androidx.camera.camera2.adapter.CameraStateAdapter.CombinedCameraState(androidx.camera.core.impl.CameraInternal.State.OPEN, objArr10 == true ? 1 : 0, i2, objArr9 == true ? 1 : 0);
            }
            if (graphState instanceof androidx.camera.camera2.pipe.GraphState.GraphStateError) {
                androidx.camera.camera2.pipe.GraphState.GraphStateError graphStateError = (androidx.camera.camera2.pipe.GraphState.GraphStateError) graphState;
                if (graphStateError.getWillAttemptRetry()) {
                    return new androidx.camera.camera2.adapter.CameraStateAdapter.CombinedCameraState(androidx.camera.core.impl.CameraInternal.State.OPENING, INSTANCE.m32toCameraStateError90vkdD0$camera_camera2(graphStateError.getCameraError()));
                }
                androidx.camera.camera2.adapter.CameraStateAdapter.Companion companion = INSTANCE;
                if (companion.m31isRecoverableError90vkdD0$camera_camera2(graphStateError.getCameraError())) {
                    return new androidx.camera.camera2.adapter.CameraStateAdapter.CombinedCameraState(androidx.camera.core.impl.CameraInternal.State.PENDING_OPEN, companion.m32toCameraStateError90vkdD0$camera_camera2(graphStateError.getCameraError()));
                }
                return new androidx.camera.camera2.adapter.CameraStateAdapter.CombinedCameraState(androidx.camera.core.impl.CameraInternal.State.CLOSING, companion.m32toCameraStateError90vkdD0$camera_camera2(graphStateError.getCameraError()));
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(graphState, androidx.camera.camera2.pipe.GraphState.GraphStateStopping.INSTANCE)) {
                return new androidx.camera.camera2.adapter.CameraStateAdapter.CombinedCameraState(androidx.camera.core.impl.CameraInternal.State.CLOSING, objArr8 == true ? 1 : 0, i2, objArr7 == true ? 1 : 0);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(graphState, androidx.camera.camera2.pipe.GraphState.GraphStateStopped.INSTANCE)) {
                return new androidx.camera.camera2.adapter.CameraStateAdapter.CombinedCameraState(androidx.camera.core.impl.CameraInternal.State.CLOSED, objArr6 == true ? 1 : 0, i2, objArr5 == true ? 1 : 0);
            }
            return null;
        }
        if (i == 3) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(graphState, androidx.camera.camera2.pipe.GraphState.GraphStateStopping.INSTANCE)) {
                return new androidx.camera.camera2.adapter.CameraStateAdapter.CombinedCameraState(androidx.camera.core.impl.CameraInternal.State.CLOSING, objArr14 == true ? 1 : 0, i2, objArr13 == true ? 1 : 0);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(graphState, androidx.camera.camera2.pipe.GraphState.GraphStateStopped.INSTANCE)) {
                return new androidx.camera.camera2.adapter.CameraStateAdapter.CombinedCameraState(androidx.camera.core.impl.CameraInternal.State.CLOSED, objArr12 == true ? 1 : 0, i2, objArr11 == true ? 1 : 0);
            }
            if (!(graphState instanceof androidx.camera.camera2.pipe.GraphState.GraphStateError)) {
                return null;
            }
            androidx.camera.camera2.adapter.CameraStateAdapter.Companion companion2 = INSTANCE;
            androidx.camera.camera2.pipe.GraphState.GraphStateError graphStateError2 = (androidx.camera.camera2.pipe.GraphState.GraphStateError) graphState;
            if (companion2.m31isRecoverableError90vkdD0$camera_camera2(graphStateError2.getCameraError())) {
                return new androidx.camera.camera2.adapter.CameraStateAdapter.CombinedCameraState(androidx.camera.core.impl.CameraInternal.State.PENDING_OPEN, companion2.m32toCameraStateError90vkdD0$camera_camera2(graphStateError2.getCameraError()));
            }
            return new androidx.camera.camera2.adapter.CameraStateAdapter.CombinedCameraState(androidx.camera.core.impl.CameraInternal.State.CLOSED, companion2.m32toCameraStateError90vkdD0$camera_camera2(graphStateError2.getCameraError()));
        }
        if (i == 4) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(graphState, androidx.camera.camera2.pipe.GraphState.GraphStateStopped.INSTANCE)) {
                return new androidx.camera.camera2.adapter.CameraStateAdapter.CombinedCameraState(androidx.camera.core.impl.CameraInternal.State.CLOSED, objArr18 == true ? 1 : 0, i2, objArr17 == true ? 1 : 0);
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(graphState, androidx.camera.camera2.pipe.GraphState.GraphStateStarting.INSTANCE)) {
                return new androidx.camera.camera2.adapter.CameraStateAdapter.CombinedCameraState(androidx.camera.core.impl.CameraInternal.State.OPENING, objArr16 == true ? 1 : 0, i2, objArr15 == true ? 1 : 0);
            }
            if (graphState instanceof androidx.camera.camera2.pipe.GraphState.GraphStateError) {
                return new androidx.camera.camera2.adapter.CameraStateAdapter.CombinedCameraState(androidx.camera.core.impl.CameraInternal.State.CLOSING, INSTANCE.m32toCameraStateError90vkdD0$camera_camera2(((androidx.camera.camera2.pipe.GraphState.GraphStateError) graphState).getCameraError()));
            }
            return null;
        }
        if (i != 5) {
            return null;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(graphState, androidx.camera.camera2.pipe.GraphState.GraphStateStarting.INSTANCE)) {
            return new androidx.camera.camera2.adapter.CameraStateAdapter.CombinedCameraState(androidx.camera.core.impl.CameraInternal.State.OPENING, stateError, i2, objArr21 == true ? 1 : 0);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(graphState, androidx.camera.camera2.pipe.GraphState.GraphStateStarted.INSTANCE)) {
            return new androidx.camera.camera2.adapter.CameraStateAdapter.CombinedCameraState(androidx.camera.core.impl.CameraInternal.State.OPEN, objArr20 == true ? 1 : 0, i2, objArr19 == true ? 1 : 0);
        }
        if (!(graphState instanceof androidx.camera.camera2.pipe.GraphState.GraphStateError)) {
            return null;
        }
        androidx.camera.camera2.adapter.CameraStateAdapter.Companion companion3 = INSTANCE;
        androidx.camera.camera2.pipe.GraphState.GraphStateError graphStateError3 = (androidx.camera.camera2.pipe.GraphState.GraphStateError) graphState;
        if (companion3.m31isRecoverableError90vkdD0$camera_camera2(graphStateError3.getCameraError())) {
            return new androidx.camera.camera2.adapter.CameraStateAdapter.CombinedCameraState(androidx.camera.core.impl.CameraInternal.State.PENDING_OPEN, companion3.m32toCameraStateError90vkdD0$camera_camera2(graphStateError3.getCameraError()));
        }
        return new androidx.camera.camera2.adapter.CameraStateAdapter.CombinedCameraState(androidx.camera.core.impl.CameraInternal.State.CLOSED, companion3.m32toCameraStateError90vkdD0$camera_camera2(graphStateError3.getCameraError()));
    }

    public final void addCameraStateListener$camera_camera2(java.util.concurrent.Executor executor, androidx.core.util.Consumer<androidx.camera.core.CameraState> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        synchronized (this.getHighSpeedVideoFpsRanges) {
            this.getInputFormats.put(listener, executor);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void removeCameraStateListener$camera_camera2(androidx.core.util.Consumer<androidx.camera.core.CameraState> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        synchronized (this.getHighSpeedVideoFpsRanges) {
            this.getInputFormats.remove(listener);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Landroidx/camera/camera2/adapter/CameraStateAdapter$CombinedCameraState;", "", "Landroidx/camera/core/impl/CameraInternal$State;", "state", "Landroidx/camera/core/CameraState$StateError;", "error", "<init>", "(Landroidx/camera/core/impl/CameraInternal$State;Landroidx/camera/core/CameraState$StateError;)V", "component1", "()Landroidx/camera/core/impl/CameraInternal$State;", "component2", "()Landroidx/camera/core/CameraState$StateError;", "copy", "(Landroidx/camera/core/impl/CameraInternal$State;Landroidx/camera/core/CameraState$StateError;)Landroidx/camera/camera2/adapter/CameraStateAdapter$CombinedCameraState;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/camera/core/impl/CameraInternal$State;", "getState", "Landroidx/camera/core/CameraState$StateError;", "getError"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CombinedCameraState {
        private final androidx.camera.core.CameraState.StateError error;
        private final androidx.camera.core.impl.CameraInternal.State state;

        public CombinedCameraState(androidx.camera.core.impl.CameraInternal.State state, androidx.camera.core.CameraState.StateError stateError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
            this.state = state;
            this.error = stateError;
        }

        public /* synthetic */ CombinedCameraState(androidx.camera.core.impl.CameraInternal.State state, androidx.camera.core.CameraState.StateError stateError, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(state, (i & 2) != 0 ? null : stateError);
        }

        public final androidx.camera.core.impl.CameraInternal.State getState() {
            return this.state;
        }

        public final androidx.camera.core.CameraState.StateError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CombinedCameraState(state=");
            sb.append(this.state);
            sb.append(", error=");
            sb.append(this.error);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.state.hashCode();
            androidx.camera.core.CameraState.StateError stateError = this.error;
            return (hashCode * 31) + (stateError == null ? 0 : stateError.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.camera.camera2.adapter.CameraStateAdapter.CombinedCameraState)) {
                return false;
            }
            androidx.camera.camera2.adapter.CameraStateAdapter.CombinedCameraState combinedCameraState = (androidx.camera.camera2.adapter.CameraStateAdapter.CombinedCameraState) other;
            return this.state == combinedCameraState.state && kotlin.jvm.internal.Intrinsics.areEqual(this.error, combinedCameraState.error);
        }

        public final androidx.camera.camera2.adapter.CameraStateAdapter.CombinedCameraState copy(androidx.camera.core.impl.CameraInternal.State state, androidx.camera.core.CameraState.StateError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
            return new androidx.camera.camera2.adapter.CameraStateAdapter.CombinedCameraState(state, error);
        }

        /* renamed from: component2, reason: from getter */
        public final androidx.camera.core.CameraState.StateError getError() {
            return this.error;
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.camera.core.impl.CameraInternal.State getState() {
            return this.state;
        }

        public static /* synthetic */ androidx.camera.camera2.adapter.CameraStateAdapter.CombinedCameraState copy$default(androidx.camera.camera2.adapter.CameraStateAdapter.CombinedCameraState combinedCameraState, androidx.camera.core.impl.CameraInternal.State state, androidx.camera.core.CameraState.StateError stateError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                state = combinedCameraState.state;
            }
            if ((i & 2) != 0) {
                stateError = combinedCameraState.error;
            }
            return combinedCameraState.copy(state, stateError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0016\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/camera/camera2/adapter/CameraStateAdapter$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/CameraError;", "Landroidx/camera/core/CameraState$StateError;", "toCameraStateError-90vkdD0$camera_camera2", "(I)Landroidx/camera/core/CameraState$StateError;", "toCameraStateError", "Landroidx/camera/core/impl/CameraInternal$State;", "Landroidx/camera/core/CameraState$Type;", "toCameraState$camera_camera2", "(Landroidx/camera/core/impl/CameraInternal$State;)Landroidx/camera/core/CameraState$Type;", "cameraError", "", "isRecoverableError-90vkdD0$camera_camera2", "(I)Z", "isRecoverableError", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/camera/core/CameraState;", "cameraState", "", "setOrPostValue$camera_camera2", "(Landroidx/lifecycle/MutableLiveData;Landroidx/camera/core/CameraState;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: toCameraStateError-90vkdD0$camera_camera2, reason: not valid java name */
        public final androidx.camera.core.CameraState.StateError m32toCameraStateError90vkdD0$camera_camera2(int i) {
            int i2 = 6;
            if (!androidx.camera.camera2.pipe.CameraError.m322equalsimpl0(i, androidx.camera.camera2.pipe.CameraError.INSTANCE.m342getERROR_UNDETERMINEDv7Vf74A())) {
                if (!androidx.camera.camera2.pipe.CameraError.m322equalsimpl0(i, androidx.camera.camera2.pipe.CameraError.INSTANCE.m333getERROR_CAMERA_IN_USEv7Vf74A())) {
                    if (androidx.camera.camera2.pipe.CameraError.m322equalsimpl0(i, androidx.camera.camera2.pipe.CameraError.INSTANCE.m334getERROR_CAMERA_LIMIT_EXCEEDEDv7Vf74A())) {
                        i2 = 1;
                    } else if (androidx.camera.camera2.pipe.CameraError.m322equalsimpl0(i, androidx.camera.camera2.pipe.CameraError.INSTANCE.m331getERROR_CAMERA_DISABLEDv7Vf74A())) {
                        i2 = 5;
                    } else if (androidx.camera.camera2.pipe.CameraError.m322equalsimpl0(i, androidx.camera.camera2.pipe.CameraError.INSTANCE.m330getERROR_CAMERA_DEVICEv7Vf74A())) {
                        i2 = 3;
                    } else if (!androidx.camera.camera2.pipe.CameraError.m322equalsimpl0(i, androidx.camera.camera2.pipe.CameraError.INSTANCE.m337getERROR_CAMERA_SERVICEv7Vf74A())) {
                        if (!androidx.camera.camera2.pipe.CameraError.m322equalsimpl0(i, androidx.camera.camera2.pipe.CameraError.INSTANCE.m332getERROR_CAMERA_DISCONNECTEDv7Vf74A())) {
                            if (!androidx.camera.camera2.pipe.CameraError.m322equalsimpl0(i, androidx.camera.camera2.pipe.CameraError.INSTANCE.m340getERROR_ILLEGAL_ARGUMENT_EXCEPTIONv7Vf74A()) && !androidx.camera.camera2.pipe.CameraError.m322equalsimpl0(i, androidx.camera.camera2.pipe.CameraError.INSTANCE.m341getERROR_SECURITY_EXCEPTIONv7Vf74A())) {
                                if (androidx.camera.camera2.pipe.CameraError.m322equalsimpl0(i, androidx.camera.camera2.pipe.CameraError.INSTANCE.m339getERROR_GRAPH_CONFIGv7Vf74A())) {
                                    i2 = 4;
                                } else if (androidx.camera.camera2.pipe.CameraError.m322equalsimpl0(i, androidx.camera.camera2.pipe.CameraError.INSTANCE.m338getERROR_DO_NOT_DISTURB_ENABLEDv7Vf74A())) {
                                    i2 = 7;
                                } else if (!androidx.camera.camera2.pipe.CameraError.m322equalsimpl0(i, androidx.camera.camera2.pipe.CameraError.INSTANCE.m343getERROR_UNKNOWN_EXCEPTIONv7Vf74A()) && !androidx.camera.camera2.pipe.CameraError.m322equalsimpl0(i, androidx.camera.camera2.pipe.CameraError.INSTANCE.m335getERROR_CAMERA_OPENERv7Vf74A()) && !androidx.camera.camera2.pipe.CameraError.m322equalsimpl0(i, androidx.camera.camera2.pipe.CameraError.INSTANCE.m336getERROR_CAMERA_OPEN_TIMEOUTv7Vf74A())) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected CameraError: ");
                                    sb.append((java.lang.Object) androidx.camera.camera2.pipe.CameraError.m325toStringimpl(i));
                                    throw new java.lang.IllegalArgumentException(sb.toString());
                                }
                            }
                        }
                    }
                }
                i2 = 2;
            }
            androidx.camera.core.CameraState.StateError create = androidx.camera.core.CameraState.StateError.create(i2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
            return create;
        }

        public final androidx.camera.core.CameraState.Type toCameraState$camera_camera2(androidx.camera.core.impl.CameraInternal.State state) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
            int i = androidx.camera.camera2.adapter.CameraStateAdapter.Companion.WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i == 1) {
                return androidx.camera.core.CameraState.Type.CLOSED;
            }
            if (i == 2) {
                return androidx.camera.core.CameraState.Type.OPENING;
            }
            if (i == 3) {
                return androidx.camera.core.CameraState.Type.OPEN;
            }
            if (i == 4) {
                return androidx.camera.core.CameraState.Type.CLOSING;
            }
            if (i == 5) {
                return androidx.camera.core.CameraState.Type.PENDING_OPEN;
            }
            throw new java.lang.IllegalArgumentException("Unexpected CameraInternal state: ".concat(java.lang.String.valueOf(state)));
        }

        /* renamed from: isRecoverableError-90vkdD0$camera_camera2, reason: not valid java name */
        public final boolean m31isRecoverableError90vkdD0$camera_camera2(int cameraError) {
            return androidx.camera.camera2.pipe.CameraError.m322equalsimpl0(cameraError, androidx.camera.camera2.pipe.CameraError.INSTANCE.m332getERROR_CAMERA_DISCONNECTEDv7Vf74A()) || androidx.camera.camera2.pipe.CameraError.m322equalsimpl0(cameraError, androidx.camera.camera2.pipe.CameraError.INSTANCE.m333getERROR_CAMERA_IN_USEv7Vf74A()) || androidx.camera.camera2.pipe.CameraError.m322equalsimpl0(cameraError, androidx.camera.camera2.pipe.CameraError.INSTANCE.m334getERROR_CAMERA_LIMIT_EXCEEDEDv7Vf74A()) || androidx.camera.camera2.pipe.CameraError.m322equalsimpl0(cameraError, androidx.camera.camera2.pipe.CameraError.INSTANCE.m330getERROR_CAMERA_DEVICEv7Vf74A());
        }

        public final void setOrPostValue$camera_camera2(androidx.view.MutableLiveData<androidx.camera.core.CameraState> mutableLiveData, androidx.camera.core.CameraState cameraState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableLiveData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraState, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                mutableLiveData.setValue(cameraState);
            } else {
                mutableLiveData.postValue(cameraState);
            }
        }

        @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[androidx.camera.core.impl.CameraInternal.State.values().length];
                try {
                    iArr[androidx.camera.core.impl.CameraInternal.State.CLOSED.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[androidx.camera.core.impl.CameraInternal.State.OPENING.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[androidx.camera.core.impl.CameraInternal.State.OPEN.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[androidx.camera.core.impl.CameraInternal.State.CLOSING.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[androidx.camera.core.impl.CameraInternal.State.PENDING_OPEN.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.camera.core.impl.CameraInternal.State.values().length];
            try {
                iArr[androidx.camera.core.impl.CameraInternal.State.CLOSED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.camera.core.impl.CameraInternal.State.OPENING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.camera.core.impl.CameraInternal.State.OPEN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.camera.core.impl.CameraInternal.State.CLOSING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.camera.core.impl.CameraInternal.State.PENDING_OPEN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
