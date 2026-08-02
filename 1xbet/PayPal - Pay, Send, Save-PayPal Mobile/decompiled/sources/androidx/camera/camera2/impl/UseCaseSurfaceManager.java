package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJA\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010'\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\"\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010/R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R \u00104\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000f028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00103R$\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00103R\u001e\u00106\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107"}, d2 = {"Landroidx/camera/camera2/impl/UseCaseSurfaceManager;", "Landroidx/camera/camera2/pipe/CameraSurfaceManager$SurfaceListener;", "Landroidx/camera/camera2/impl/UseCaseThreads;", "threads", "Landroidx/camera/camera2/pipe/CameraPipe;", "cameraPipe", "Landroidx/camera/camera2/compat/workaround/InactiveSurfaceCloser;", "inactiveSurfaceCloser", "Landroidx/camera/camera2/adapter/SessionConfigAdapter;", "sessionConfigAdapter", "<init>", "(Landroidx/camera/camera2/impl/UseCaseThreads;Landroidx/camera/camera2/pipe/CameraPipe;Landroidx/camera/camera2/compat/workaround/InactiveSurfaceCloser;Landroidx/camera/camera2/adapter/SessionConfigAdapter;)V", "Landroidx/camera/camera2/pipe/CameraGraph;", "graph", "", "Landroidx/camera/core/impl/DeferrableSurface;", "Landroidx/camera/camera2/pipe/StreamId;", "surfaceToStreamMap", "", "timeoutMillis", "Lkotlinx/coroutines/Deferred;", "", "setupAsync", "(Landroidx/camera/camera2/pipe/CameraGraph;Landroidx/camera/camera2/adapter/SessionConfigAdapter;Ljava/util/Map;J)Lkotlinx/coroutines/Deferred;", "", "stopAsync", "()Lkotlinx/coroutines/Deferred;", "awaitSetupCompletion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/view/Surface;", "surface", "onSurfaceActive", "(Landroid/view/Surface;)V", "onSurfaceInactive", "getHighSpeedVideoFpsRangesFor", "()V", "getOutputMinFrameDuration", "Landroidx/camera/camera2/impl/UseCaseThreads;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Landroidx/camera/camera2/pipe/CameraPipe;", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/compat/workaround/InactiveSurfaceCloser;", "getHighSpeedVideoFpsRanges", "getOutputFormats", "Landroidx/camera/camera2/adapter/SessionConfigAdapter;", "", "Ljava/lang/Object;", "getHighSpeedVideoSizesFor", "Lkotlinx/coroutines/Deferred;", "", "Ljava/util/Map;", "getInputSizeshNQ4ISI", "Lkotlinx/coroutines/CompletableDeferred;", "getInputFormats", "Lkotlinx/coroutines/CompletableDeferred;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@androidx.camera.camera2.config.UseCaseCameraScope
/* loaded from: classes6.dex */
public class UseCaseSurfaceManager implements androidx.camera.camera2.pipe.CameraSurfaceManager.SurfaceListener {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.util.Map<android.view.Surface, ? extends androidx.camera.core.impl.DeferrableSurface> getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.Map<android.view.Surface, androidx.camera.core.impl.DeferrableSurface> getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.CameraPipe Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private kotlinx.coroutines.Deferred<java.lang.Boolean> getOutputMinFrameDuration;
    private kotlinx.coroutines.CompletableDeferred<kotlin.Unit> getInputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.camera.camera2.adapter.SessionConfigAdapter getHighSpeedVideoSizes;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.UseCaseThreads getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public UseCaseSurfaceManager(androidx.camera.camera2.impl.UseCaseThreads useCaseThreads, androidx.camera.camera2.pipe.CameraPipe cameraPipe, androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser inactiveSurfaceCloser, androidx.camera.camera2.adapter.SessionConfigAdapter sessionConfigAdapter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCaseThreads, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraPipe, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inactiveSurfaceCloser, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfigAdapter, "");
        this.getHighResolutionOutputSizeshNQ4ISI = useCaseThreads;
        this.Camera2StreamConfigurationMap = cameraPipe;
        this.getHighSpeedVideoFpsRanges = inactiveSurfaceCloser;
        this.getHighSpeedVideoSizes = sessionConfigAdapter;
        this.getHighSpeedVideoFpsRangesFor = new java.lang.Object();
        this.getInputSizeshNQ4ISI = new java.util.LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$getSurfaces(androidx.camera.camera2.impl.UseCaseSurfaceManager useCaseSurfaceManager, java.util.List list, long j, kotlin.coroutines.Continuation continuation) {
        androidx.camera.camera2.impl.UseCaseSurfaceManager$getSurfaces$1 useCaseSurfaceManager$getSurfaces$1;
        int i;
        if (continuation instanceof androidx.camera.camera2.impl.UseCaseSurfaceManager$getSurfaces$1) {
            useCaseSurfaceManager$getSurfaces$1 = (androidx.camera.camera2.impl.UseCaseSurfaceManager$getSurfaces$1) continuation;
            if ((useCaseSurfaceManager$getSurfaces$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                useCaseSurfaceManager$getSurfaces$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = useCaseSurfaceManager$getSurfaces$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = useCaseSurfaceManager$getSurfaces$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.camera.camera2.impl.UseCaseSurfaceManager$getSurfaces$2 useCaseSurfaceManager$getSurfaces$2 = new androidx.camera.camera2.impl.UseCaseSurfaceManager$getSurfaces$2(list, null);
                    useCaseSurfaceManager$getSurfaces$1.Camera2StreamConfigurationMap = 1;
                    obj = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(j, useCaseSurfaceManager$getSurfaces$2, useCaseSurfaceManager$getSurfaces$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.util.List list2 = (java.util.List) obj;
                return list2 != null ? kotlin.collections.CollectionsKt.emptyList() : list2;
            }
        }
        useCaseSurfaceManager$getSurfaces$1 = new androidx.camera.camera2.impl.UseCaseSurfaceManager$getSurfaces$1(useCaseSurfaceManager, continuation);
        java.lang.Object obj2 = useCaseSurfaceManager$getSurfaces$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = useCaseSurfaceManager$getSurfaces$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        java.util.List list22 = (java.util.List) obj2;
        if (list22 != null) {
        }
    }

    public static /* synthetic */ kotlinx.coroutines.Deferred setupAsync$default(androidx.camera.camera2.impl.UseCaseSurfaceManager useCaseSurfaceManager, androidx.camera.camera2.pipe.CameraGraph cameraGraph, androidx.camera.camera2.adapter.SessionConfigAdapter sessionConfigAdapter, java.util.Map map, long j, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setupAsync");
        }
        if ((i & 8) != 0) {
            j = 5000;
        }
        return useCaseSurfaceManager.setupAsync(cameraGraph, sessionConfigAdapter, map, j);
    }

    public final kotlinx.coroutines.Deferred<java.lang.Boolean> setupAsync(androidx.camera.camera2.pipe.CameraGraph graph, androidx.camera.camera2.adapter.SessionConfigAdapter sessionConfigAdapter, java.util.Map<androidx.camera.core.impl.DeferrableSurface, androidx.camera.camera2.pipe.StreamId> surfaceToStreamMap, long timeoutMillis) {
        kotlinx.coroutines.CompletableDeferred CompletableDeferred;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graph, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfigAdapter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surfaceToStreamMap, "");
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            if (this.getOutputMinFrameDuration != null) {
                throw new java.lang.IllegalStateException("Surfaces should only be set up once!".toString());
            }
            if (this.getInputFormats != null) {
                throw new java.lang.IllegalStateException("Surfaces being setup after stopped!".toString());
            }
            if (this.getHighSpeedVideoSizesFor != null) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            final java.util.List<androidx.camera.core.impl.DeferrableSurface> deferrableSurfaces = sessionConfigAdapter.getDeferrableSurfaces();
            try {
                androidx.camera.core.impl.DeferrableSurfaces.incrementAll(deferrableSurfaces);
                CompletableDeferred = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(this.getHighResolutionOutputSizeshNQ4ISI.getScope(), null, null, new androidx.camera.camera2.impl.UseCaseSurfaceManager$setupAsync$1$deferred$1(sessionConfigAdapter, this, deferrableSurfaces, timeoutMillis, surfaceToStreamMap, graph, null), 3, null);
                CompletableDeferred.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: androidx.camera.camera2.impl.UseCaseSurfaceManager$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.camera.camera2.impl.UseCaseSurfaceManager.$r8$lambda$WqGGjk2MKSoMCSgph_xn1w_vBKc(deferrableSurfaces, (java.lang.Throwable) obj);
                    }
                });
                this.getOutputMinFrameDuration = CompletableDeferred;
            } catch (androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException e) {
                androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isWarnEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighResolutionOutputSizeshNQ4ISI.getScope(), null, null, new androidx.camera.camera2.impl.UseCaseSurfaceManager$setupAsync$1$4(sessionConfigAdapter, e, null), 3, null);
                CompletableDeferred = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred(java.lang.Boolean.FALSE);
            }
        }
        return CompletableDeferred;
    }

    public final kotlinx.coroutines.Deferred<kotlin.Unit> stopAsync() {
        kotlinx.coroutines.CompletableDeferred<kotlin.Unit> completableDeferred;
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            completableDeferred = this.getInputFormats;
            if (completableDeferred != null) {
                androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isWarnEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
            } else {
                kotlinx.coroutines.Deferred<java.lang.Boolean> deferred = this.getOutputMinFrameDuration;
                if (deferred != null) {
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) deferred, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                }
                this.getHighSpeedVideoFpsRanges.closeAll();
                this.getHighSpeedVideoSizesFor = null;
                completableDeferred = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                this.getInputFormats = completableDeferred;
                getHighSpeedVideoFpsRangesFor();
            }
        }
        return completableDeferred;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor(androidx.camera.camera2.impl.UseCaseSurfaceManager useCaseSurfaceManager, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        androidx.camera.camera2.impl.UseCaseSurfaceManager$awaitSetupCompletion$1 useCaseSurfaceManager$awaitSetupCompletion$1;
        int i;
        try {
            if (continuation instanceof androidx.camera.camera2.impl.UseCaseSurfaceManager$awaitSetupCompletion$1) {
                useCaseSurfaceManager$awaitSetupCompletion$1 = (androidx.camera.camera2.impl.UseCaseSurfaceManager$awaitSetupCompletion$1) continuation;
                if ((useCaseSurfaceManager$awaitSetupCompletion$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    useCaseSurfaceManager$awaitSetupCompletion$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = useCaseSurfaceManager$awaitSetupCompletion$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = useCaseSurfaceManager$awaitSetupCompletion$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i == 0) {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    synchronized (useCaseSurfaceManager.getHighSpeedVideoFpsRangesFor) {
                        kotlinx.coroutines.Deferred<java.lang.Boolean> deferred = useCaseSurfaceManager.getOutputMinFrameDuration;
                        if (deferred == null || useCaseSurfaceManager.getInputFormats != null) {
                            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                        }
                        useCaseSurfaceManager$awaitSetupCompletion$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        java.lang.Object await = deferred.await(useCaseSurfaceManager$awaitSetupCompletion$1);
                        return await == coroutine_suspended ? coroutine_suspended : await;
                    }
                }
            }
            if (i == 0) {
            }
        } catch (java.util.concurrent.CancellationException unused) {
            androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isWarnEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
        }
        useCaseSurfaceManager$awaitSetupCompletion$1 = new androidx.camera.camera2.impl.UseCaseSurfaceManager$awaitSetupCompletion$1(useCaseSurfaceManager, continuation);
        java.lang.Object obj2 = useCaseSurfaceManager$awaitSetupCompletion$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = useCaseSurfaceManager$awaitSetupCompletion$1.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.camera2.pipe.CameraSurfaceManager.SurfaceListener
    public void onSurfaceActive(android.view.Surface surface) {
        androidx.camera.core.impl.DeferrableSurface deferrableSurface;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surface, "");
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            java.util.Map<android.view.Surface, ? extends androidx.camera.core.impl.DeferrableSurface> map = this.getHighSpeedVideoSizesFor;
            if (map != null && (deferrableSurface = map.get(surface)) != null) {
                if (!this.getInputSizeshNQ4ISI.containsKey(surface)) {
                    androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                    if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                        java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                    }
                    this.getInputSizeshNQ4ISI.put(surface, deferrableSurface);
                    try {
                        deferrableSurface.incrementUseCount();
                    } catch (androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException e) {
                        androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                        androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException surfaceClosedException = e;
                        if (androidx.camera.core.Logger.isWarnEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                            java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                        }
                        androidx.camera.camera2.adapter.SessionConfigAdapter sessionConfigAdapter = this.getHighSpeedVideoSizes;
                        androidx.camera.core.impl.DeferrableSurface deferrableSurface2 = e.getDeferrableSurface();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deferrableSurface2, "");
                        sessionConfigAdapter.reportSurfaceInvalid(deferrableSurface2);
                    }
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.CameraSurfaceManager.SurfaceListener
    public void onSurfaceInactive(android.view.Surface surface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surface, "");
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            androidx.camera.core.impl.DeferrableSurface remove = this.getInputSizeshNQ4ISI.remove(surface);
            if (remove != null) {
                androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
                this.getHighSpeedVideoFpsRanges.onSurfaceInactive(remove);
                try {
                    remove.decrementUseCount();
                } catch (java.lang.IllegalStateException e) {
                    androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                    java.lang.IllegalStateException illegalStateException = e;
                    if (androidx.camera.core.Logger.isWarnEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                        java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                    }
                }
                getHighSpeedVideoFpsRangesFor();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            if (this.getInputSizeshNQ4ISI.isEmpty() && this.getHighSpeedVideoSizesFor == null) {
                androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
                this.Camera2StreamConfigurationMap.cameraSurfaceManager().removeListener(this);
                kotlinx.coroutines.CompletableDeferred<kotlin.Unit> completableDeferred = this.getInputFormats;
                if (completableDeferred != null) {
                    completableDeferred.complete(kotlin.Unit.INSTANCE);
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WqGGjk2MKSoMCSgph_xn1w_vBKc(java.util.List list, java.lang.Throwable th) {
        androidx.camera.core.impl.DeferrableSurfaces.decrementAll(list);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ boolean access$areValid(androidx.camera.camera2.impl.UseCaseSurfaceManager useCaseSurfaceManager, java.util.List list) {
        return (list.isEmpty() || list.contains(null)) ? false : true;
    }

    public java.lang.Object awaitSetupCompletion(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return getHighSpeedVideoFpsRangesFor(this, continuation);
    }
}
