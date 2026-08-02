package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.UseCaseSurfaceManager$setupAsync$1$deferred$1", f = "UseCaseSurfaceManager.kt", i = {0}, l = {97}, m = "invokeSuspend", n = {"$this$async"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class UseCaseSurfaceManager$setupAsync$1$deferred$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    final /* synthetic */ androidx.camera.camera2.pipe.CameraGraph Camera2StreamConfigurationMap;
    final /* synthetic */ java.util.Map<androidx.camera.core.impl.DeferrableSurface, androidx.camera.camera2.pipe.StreamId> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.List<androidx.camera.core.impl.DeferrableSurface> getHighSpeedVideoFpsRanges;
    final /* synthetic */ long getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.camera.camera2.adapter.SessionConfigAdapter getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    final /* synthetic */ androidx.camera.camera2.impl.UseCaseSurfaceManager getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope;
        java.lang.Object obj2;
        androidx.camera.camera2.compat.workaround.InactiveSurfaceCloser inactiveSurfaceCloser;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScope coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.getInputSizeshNQ4ISI;
                if (!this.getHighSpeedVideoSizes.isSessionConfigValid()) {
                    throw new java.lang.IllegalStateException("Check failed.");
                }
                this.getInputSizeshNQ4ISI = coroutineScope2;
                this.getOutputFormats = 1;
                java.lang.Object access$getSurfaces = androidx.camera.camera2.impl.UseCaseSurfaceManager.access$getSurfaces(this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this);
                if (access$getSurfaces == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope = coroutineScope2;
                obj = access$getSurfaces;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getInputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            java.util.List list = (java.util.List) obj;
            if (!kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope) || list.isEmpty()) {
                androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isInfoEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                    kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
            }
            if (androidx.camera.camera2.impl.UseCaseSurfaceManager.access$areValid(this.getOutputMinFrameDuration, list)) {
                obj2 = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRangesFor;
                androidx.camera.camera2.impl.UseCaseSurfaceManager useCaseSurfaceManager = this.getOutputMinFrameDuration;
                java.util.List<androidx.camera.core.impl.DeferrableSurface> list2 = this.getHighSpeedVideoFpsRanges;
                synchronized (obj2) {
                    java.util.List<androidx.camera.core.impl.DeferrableSurface> list3 = list2;
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10)), 16));
                    for (java.lang.Object obj3 : list3) {
                        java.lang.Object obj4 = list.get(list2.indexOf((androidx.camera.core.impl.DeferrableSurface) obj3));
                        if (obj4 == null) {
                            throw new java.lang.IllegalStateException("Required value was null.".toString());
                        }
                        linkedHashMap.put((android.view.Surface) obj4, obj3);
                    }
                    useCaseSurfaceManager.getHighSpeedVideoSizesFor = linkedHashMap;
                    useCaseSurfaceManager.Camera2StreamConfigurationMap.cameraSurfaceManager().addListener(useCaseSurfaceManager);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
                java.util.Map<androidx.camera.core.impl.DeferrableSurface, androidx.camera.camera2.pipe.StreamId> map = this.getHighResolutionOutputSizeshNQ4ISI;
                java.util.List<androidx.camera.core.impl.DeferrableSurface> list4 = this.getHighSpeedVideoFpsRanges;
                androidx.camera.camera2.pipe.CameraGraph cameraGraph = this.Camera2StreamConfigurationMap;
                androidx.camera.camera2.impl.UseCaseSurfaceManager useCaseSurfaceManager2 = this.getOutputMinFrameDuration;
                for (java.util.Map.Entry<androidx.camera.core.impl.DeferrableSurface, androidx.camera.camera2.pipe.StreamId> entry : map.entrySet()) {
                    int m761unboximpl = entry.getValue().m761unboximpl();
                    android.view.Surface surface = (android.view.Surface) list.get(list4.indexOf(entry.getKey()));
                    androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                    if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                        java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                        androidx.camera.camera2.pipe.StreamId.m760toStringimpl(m761unboximpl);
                    }
                    cameraGraph.mo390setSurfaceNYG5g8E(m761unboximpl, surface);
                    inactiveSurfaceCloser = useCaseSurfaceManager2.getHighSpeedVideoFpsRanges;
                    inactiveSurfaceCloser.mo74configurehB7JTeY(m761unboximpl, entry.getKey(), cameraGraph);
                }
                androidx.camera.camera2.impl.Camera2Logger camera2Logger3 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                if (androidx.camera.core.Logger.isInfoEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                    java.lang.String unused3 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
            }
            androidx.camera.camera2.impl.Camera2Logger camera2Logger4 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isWarnEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused4 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
            this.getHighSpeedVideoSizes.reportSurfaceInvalid(this.getHighSpeedVideoFpsRanges.get(list.indexOf(null)));
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
        } catch (androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException e) {
            androidx.camera.camera2.impl.Camera2Logger camera2Logger5 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isWarnEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused5 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
            androidx.camera.camera2.adapter.SessionConfigAdapter sessionConfigAdapter = this.getHighSpeedVideoSizes;
            androidx.camera.core.impl.DeferrableSurface deferrableSurface = e.getDeferrableSurface();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(deferrableSurface, "");
            sessionConfigAdapter.reportSurfaceInvalid(deferrableSurface);
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
        } catch (kotlinx.coroutines.TimeoutCancellationException unused6) {
            androidx.camera.camera2.impl.Camera2Logger camera2Logger6 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isWarnEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused7 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((androidx.camera.camera2.impl.UseCaseSurfaceManager$setupAsync$1$deferred$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.camera.camera2.impl.UseCaseSurfaceManager$setupAsync$1$deferred$1 useCaseSurfaceManager$setupAsync$1$deferred$1 = new androidx.camera.camera2.impl.UseCaseSurfaceManager$setupAsync$1$deferred$1(this.getHighSpeedVideoSizes, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
        useCaseSurfaceManager$setupAsync$1$deferred$1.getInputSizeshNQ4ISI = obj;
        return useCaseSurfaceManager$setupAsync$1$deferred$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UseCaseSurfaceManager$setupAsync$1$deferred$1(androidx.camera.camera2.adapter.SessionConfigAdapter sessionConfigAdapter, androidx.camera.camera2.impl.UseCaseSurfaceManager useCaseSurfaceManager, java.util.List<? extends androidx.camera.core.impl.DeferrableSurface> list, long j, java.util.Map<androidx.camera.core.impl.DeferrableSurface, androidx.camera.camera2.pipe.StreamId> map, androidx.camera.camera2.pipe.CameraGraph cameraGraph, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.UseCaseSurfaceManager$setupAsync$1$deferred$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = sessionConfigAdapter;
        this.getOutputMinFrameDuration = useCaseSurfaceManager;
        this.getHighSpeedVideoFpsRanges = list;
        this.getHighSpeedVideoFpsRangesFor = j;
        this.getHighResolutionOutputSizeshNQ4ISI = map;
        this.Camera2StreamConfigurationMap = cameraGraph;
    }
}
