package androidx.camera.camera2.pipe.internal;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001/B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001cR\u0014\u0010\u001a\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u001a\u0010%\u001a\u00020\u00138\u0017X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020)8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020)8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010+"}, d2 = {"Landroidx/camera/camera2/pipe/internal/CameraBackendsImpl;", "Landroidx/camera/camera2/pipe/CameraBackends;", "Landroidx/camera/camera2/pipe/CameraBackendId;", "defaultBackendId", "", "Landroidx/camera/camera2/pipe/CameraBackendFactory;", "cameraBackends", "Landroid/content/Context;", "cameraPipeContext", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "Landroidx/camera/camera2/pipe/internal/CameraPipeLifetime;", "cameraPipeLifetime", "<init>", "(Ljava/lang/String;Ljava/util/Map;Landroid/content/Context;Landroidx/camera/camera2/pipe/core/Threads;Landroidx/camera/camera2/pipe/internal/CameraPipeLifetime;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "shutdown", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "backendId", "Landroidx/camera/camera2/pipe/CameraBackend;", "get-SG3A4s8", "(Ljava/lang/String;)Landroidx/camera/camera2/pipe/CameraBackend;", "get", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;", "Landroid/content/Context;", "getHighResolutionOutputSizeshNQ4ISI", "getOutputFormats", "Landroidx/camera/camera2/pipe/core/Threads;", "", "getHighSpeedVideoSizes", "Ljava/lang/Object;", "", "getInputSizeshNQ4ISI", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "Landroidx/camera/camera2/pipe/CameraBackend;", "getDefault", "()Landroidx/camera/camera2/pipe/CameraBackend;", "", "getAllIds", "()Ljava/util/Set;", "allIds", "getActiveIds", "activeIds", "CameraBackendContext"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraBackendsImpl implements androidx.camera.camera2.pipe.CameraBackends {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final androidx.camera.camera2.pipe.CameraBackend default;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Map<androidx.camera.camera2.pipe.CameraBackendId, androidx.camera.camera2.pipe.CameraBackend> getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Map<androidx.camera.camera2.pipe.CameraBackendId, androidx.camera.camera2.pipe.CameraBackendFactory> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.Object getHighSpeedVideoSizes;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.core.Threads getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    private CameraBackendsImpl(java.lang.String str, java.util.Map<androidx.camera.camera2.pipe.CameraBackendId, ? extends androidx.camera.camera2.pipe.CameraBackendFactory> map, android.content.Context context, androidx.camera.camera2.pipe.core.Threads threads, androidx.camera.camera2.pipe.internal.CameraPipeLifetime cameraPipeLifetime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threads, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraPipeLifetime, "");
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = map;
        this.getHighResolutionOutputSizeshNQ4ISI = context;
        this.getHighSpeedVideoFpsRanges = threads;
        this.getHighSpeedVideoSizes = new java.lang.Object();
        this.getInputSizeshNQ4ISI = new java.util.LinkedHashMap();
        cameraPipeLifetime.addShutdownAction(androidx.camera.camera2.pipe.internal.CameraPipeLifetime.ShutdownType.CAMERA, new java.lang.Runnable() { // from class: androidx.camera.camera2.pipe.internal.CameraBackendsImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new androidx.camera.camera2.pipe.internal.CameraBackendsImpl$1$1(androidx.camera.camera2.pipe.internal.CameraBackendsImpl.this, null), 1, null);
            }
        });
        androidx.camera.camera2.pipe.CameraBackend mo239getSG3A4s8 = mo239getSG3A4s8(str);
        if (mo239getSG3A4s8 != null) {
            this.default = mo239getSG3A4s8;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to load the default backend for ");
        sb.append((java.lang.Object) androidx.camera.camera2.pipe.CameraBackendId.m237toStringimpl(str));
        sb.append("! Available backends are ");
        sb.append(map.keySet());
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }

    @Override // androidx.camera.camera2.pipe.CameraBackends
    public final androidx.camera.camera2.pipe.CameraBackend getDefault() {
        return this.default;
    }

    @Override // androidx.camera.camera2.pipe.CameraBackends
    public final java.util.Set<androidx.camera.camera2.pipe.CameraBackendId> getAllIds() {
        return this.Camera2StreamConfigurationMap.keySet();
    }

    @Override // androidx.camera.camera2.pipe.CameraBackends
    public final java.util.Set<androidx.camera.camera2.pipe.CameraBackendId> getActiveIds() {
        java.util.Set<androidx.camera.camera2.pipe.CameraBackendId> keySet;
        synchronized (this.getHighSpeedVideoSizes) {
            keySet = this.getInputSizeshNQ4ISI.keySet();
        }
        return keySet;
    }

    @Override // androidx.camera.camera2.pipe.CameraBackends
    public final java.lang.Object shutdown(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
        java.util.Map<androidx.camera.camera2.pipe.CameraBackendId, androidx.camera.camera2.pipe.CameraBackend> map = this.getInputSizeshNQ4ISI;
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        java.util.Iterator<java.util.Map.Entry<androidx.camera.camera2.pipe.CameraBackendId, androidx.camera.camera2.pipe.CameraBackend>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue().shutdownAsync());
        }
        java.lang.Object joinAll = kotlinx.coroutines.AwaitKt.joinAll(arrayList, continuation);
        return joinAll == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? joinAll : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.camera.camera2.pipe.CameraBackends
    /* renamed from: get-SG3A4s8 */
    public final androidx.camera.camera2.pipe.CameraBackend mo239getSG3A4s8(java.lang.String backendId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backendId, "");
        synchronized (this.getHighSpeedVideoSizes) {
            androidx.camera.camera2.pipe.CameraBackend cameraBackend = this.getInputSizeshNQ4ISI.get(androidx.camera.camera2.pipe.CameraBackendId.m232boximpl(backendId));
            if (cameraBackend != null) {
                return cameraBackend;
            }
            androidx.camera.camera2.pipe.CameraBackendFactory cameraBackendFactory = this.Camera2StreamConfigurationMap.get(androidx.camera.camera2.pipe.CameraBackendId.m232boximpl(backendId));
            androidx.camera.camera2.pipe.CameraBackend create = cameraBackendFactory != null ? cameraBackendFactory.create(new androidx.camera.camera2.pipe.internal.CameraBackendsImpl.CameraBackendContext(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this)) : null;
            if (create != null) {
                if (!androidx.camera.camera2.pipe.CameraBackendId.m235equalsimpl0(backendId, create.mo223getIdQwmhuAM())) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected backend id! Expected ");
                    sb.append((java.lang.Object) androidx.camera.camera2.pipe.CameraBackendId.m237toStringimpl(backendId));
                    sb.append(" but it was actually ");
                    sb.append((java.lang.Object) androidx.camera.camera2.pipe.CameraBackendId.m237toStringimpl(create.mo223getIdQwmhuAM()));
                    throw new java.lang.IllegalStateException(sb.toString().toString());
                }
                this.getInputSizeshNQ4ISI.put(androidx.camera.camera2.pipe.CameraBackendId.m232boximpl(backendId), create);
            }
            return create;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/camera/camera2/pipe/internal/CameraBackendsImpl$CameraBackendContext;", "Landroidx/camera/camera2/pipe/CameraContext;", "Landroid/content/Context;", "appContext", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "Landroidx/camera/camera2/pipe/CameraBackends;", "cameraBackends", "<init>", "(Landroid/content/Context;Landroidx/camera/camera2/pipe/core/Threads;Landroidx/camera/camera2/pipe/CameraBackends;)V", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "Landroidx/camera/camera2/pipe/core/Threads;", "getThreads", "()Landroidx/camera/camera2/pipe/core/Threads;", "Landroidx/camera/camera2/pipe/CameraBackends;", "getCameraBackends", "()Landroidx/camera/camera2/pipe/CameraBackends;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CameraBackendContext implements androidx.camera.camera2.pipe.CameraContext {
        private final android.content.Context appContext;
        private final androidx.camera.camera2.pipe.CameraBackends cameraBackends;
        private final androidx.camera.camera2.pipe.core.Threads threads;

        public CameraBackendContext(android.content.Context context, androidx.camera.camera2.pipe.core.Threads threads, androidx.camera.camera2.pipe.CameraBackends cameraBackends) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threads, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraBackends, "");
            this.appContext = context;
            this.threads = threads;
            this.cameraBackends = cameraBackends;
        }

        @Override // androidx.camera.camera2.pipe.CameraContext
        public final android.content.Context getAppContext() {
            return this.appContext;
        }

        @Override // androidx.camera.camera2.pipe.CameraContext
        public final androidx.camera.camera2.pipe.core.Threads getThreads() {
            return this.threads;
        }

        @Override // androidx.camera.camera2.pipe.CameraContext
        public final androidx.camera.camera2.pipe.CameraBackends getCameraBackends() {
            return this.cameraBackends;
        }
    }

    public /* synthetic */ CameraBackendsImpl(java.lang.String str, java.util.Map map, @androidx.camera.camera2.pipe.config.CameraPipeContext android.content.Context context, androidx.camera.camera2.pipe.core.Threads threads, androidx.camera.camera2.pipe.internal.CameraPipeLifetime cameraPipeLifetime, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, context, threads, cameraPipeLifetime);
    }
}
