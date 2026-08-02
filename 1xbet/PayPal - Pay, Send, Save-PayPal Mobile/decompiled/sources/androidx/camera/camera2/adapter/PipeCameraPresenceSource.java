package androidx.camera.camera2.adapter;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 #2\u00020\u0001:\u0001#B9\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u001b\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00030\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR\u0014\u0010\u001c\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\""}, d2 = {"Landroidx/camera/camera2/adapter/PipeCameraPresenceSource;", "Landroidx/camera/core/impl/AbstractCameraPresenceSource;", "Lkotlinx/coroutines/flow/Flow;", "", "Landroidx/camera/camera2/pipe/CameraId;", "idFlow", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "", "initialCameraIds", "Landroid/content/Context;", "context", "<init>", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Ljava/util/List;Landroid/content/Context;)V", "", "startMonitoring", "()V", "stopMonitoring", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/camera/core/CameraIdentifier;", "fetchData", "()Lcom/google/common/util/concurrent/ListenableFuture;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CoroutineScope;", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getHighSpeedVideoFpsRanges", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/hardware/camera2/CameraManager;", "Landroid/hardware/camera2/CameraManager;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PipeCameraPresenceSource extends androidx.camera.core.impl.AbstractCameraPresenceSource {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.hardware.camera2.CameraManager getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicBoolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.Flow<java.util.List<androidx.camera.camera2.pipe.CameraId>> getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PipeCameraPresenceSource(kotlinx.coroutines.flow.Flow<? extends java.util.List<androidx.camera.camera2.pipe.CameraId>> flow, kotlinx.coroutines.CoroutineScope coroutineScope, java.util.List<java.lang.String> list, android.content.Context context) {
        super(list);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoSizes = flow;
        this.Camera2StreamConfigurationMap = coroutineScope;
        this.getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicBoolean(false);
        java.lang.Object systemService = context.getSystemService(com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA);
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        this.getHighSpeedVideoFpsRanges = (android.hardware.camera2.CameraManager) systemService;
    }

    @Override // androidx.camera.core.impl.AbstractCameraPresenceSource
    public final void startMonitoring() {
        if (this.getHighSpeedVideoFpsRangesFor.compareAndSet(false, true)) {
            kotlinx.coroutines.Job job = this.getHighResolutionOutputSizeshNQ4ISI;
            if (job != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
            kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
            booleanRef.element = true;
            final kotlinx.coroutines.flow.Flow<java.util.List<androidx.camera.camera2.pipe.CameraId>> flow = this.getHighSpeedVideoSizes;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.m24097catch(kotlinx.coroutines.flow.FlowKt.onEach(new kotlinx.coroutines.flow.Flow<java.util.List<? extends androidx.camera.core.CameraIdentifier>>() { // from class: androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$$inlined$map$1

                @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRanges;

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                        androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                        int i;
                        if (continuation instanceof androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                            anonymousClass1 = (androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                            if ((anonymousClass1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.getHighSpeedVideoFpsRanges -= 2147483648;
                                java.lang.Object obj2 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.getHighSpeedVideoFpsRanges;
                                if (i != 0) {
                                    kotlin.ResultKt.throwOnFailure(obj2);
                                    kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoFpsRanges;
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    java.util.Iterator<T> it = ((java.util.List) obj).iterator();
                                    while (it.hasNext()) {
                                        androidx.camera.core.CameraIdentifier cameraIdentifier = null;
                                        try {
                                            cameraIdentifier = androidx.camera.core.CameraIdentifier.Factory.create$default(((androidx.camera.camera2.pipe.CameraId) it.next()).m399unboximpl(), null, null, 6, null);
                                        } catch (java.lang.Exception e) {
                                        }
                                        if (cameraIdentifier != null) {
                                            arrayList.add(cameraIdentifier);
                                        }
                                    }
                                    anonymousClass1.getHighSpeedVideoFpsRanges = 1;
                                    if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.ResultKt.throwOnFailure(obj2);
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                        }
                        anonymousClass1 = new androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                        java.lang.Object obj22 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = anonymousClass1.getHighSpeedVideoFpsRanges;
                        if (i != 0) {
                        }
                        return kotlin.Unit.INSTANCE;
                    }

                    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$$inlined$map$1$2", f = "PipeCameraPresenceSource.kt", i = {}, l = {50}, m = "emit", n = {}, s = {}, v = 1)
                    /* renamed from: androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                        /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
                        int getHighSpeedVideoFpsRanges;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                            this.getHighResolutionOutputSizeshNQ4ISI = obj;
                            this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
                            return androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                        }

                        public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                            super(continuation);
                        }
                    }

                    public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                        this.getHighSpeedVideoFpsRanges = flowCollector;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.util.List<? extends androidx.camera.core.CameraIdentifier>> flowCollector, kotlin.coroutines.Continuation continuation) {
                    java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$$inlined$map$1.AnonymousClass2(flowCollector), continuation);
                    return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
                }
            }, new androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$2(this, booleanRef, null)), new androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$3(this, null)), this.Camera2StreamConfigurationMap);
        }
    }

    @Override // androidx.camera.core.impl.AbstractCameraPresenceSource
    public final void stopMonitoring() {
        if (this.getHighSpeedVideoFpsRangesFor.compareAndSet(true, false)) {
            kotlinx.coroutines.Job job = this.getHighResolutionOutputSizeshNQ4ISI;
            if (job != null) {
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            }
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        }
    }

    @Override // androidx.camera.core.impl.AbstractCameraPresenceSource, androidx.camera.core.impl.Observable
    public final com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.camera.core.CameraIdentifier>> fetchData() {
        com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.camera.core.CameraIdentifier>> future = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.adapter.PipeCameraPresenceSource$$ExternalSyntheticLambda0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                return androidx.camera.camera2.adapter.PipeCameraPresenceSource.$r8$lambda$pNibnT2Ln7rKug19LH2UnicKFAs(androidx.camera.camera2.adapter.PipeCameraPresenceSource.this, completer);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(future, "");
        return future;
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$pNibnT2Ln7rKug19LH2UnicKFAs(androidx.camera.camera2.adapter.PipeCameraPresenceSource pipeCameraPresenceSource, androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completer, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(pipeCameraPresenceSource.Camera2StreamConfigurationMap, null, null, new androidx.camera.camera2.adapter.PipeCameraPresenceSource$fetchData$1$1(pipeCameraPresenceSource, completer, null), 3, null);
        return "FetchData for PipeCameraPresence0";
    }
}
