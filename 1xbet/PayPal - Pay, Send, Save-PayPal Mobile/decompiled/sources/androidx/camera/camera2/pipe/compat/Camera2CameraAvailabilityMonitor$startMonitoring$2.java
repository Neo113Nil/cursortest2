package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Camera2CameraAvailabilityMonitor$startMonitoring$2;", "Landroidx/camera/camera2/pipe/compat/CameraAvailabilityMonitor$Session;", "", "timeoutMillis", "", "awaitAvailableCamera", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "close", "()V", "Lkotlinx/coroutines/CoroutineScope;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoFpsRanges", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlinx/coroutines/CompletableDeferred;", "getHighSpeedVideoSizes", "Ljava/util/concurrent/CopyOnWriteArrayList;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Camera2CameraAvailabilityMonitor$startMonitoring$2 implements androidx.camera.camera2.pipe.compat.CameraAvailabilityMonitor.Session {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRanges;
    private final java.util.concurrent.CopyOnWriteArrayList<kotlinx.coroutines.CompletableDeferred<kotlin.Unit>> getHighSpeedVideoSizes;

    Camera2CameraAvailabilityMonitor$startMonitoring$2(androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor camera2CameraAvailabilityMonitor, java.lang.String str) {
        androidx.camera.camera2.pipe.core.Threads threads;
        kotlinx.coroutines.Job job;
        threads = camera2CameraAvailabilityMonitor.getHighSpeedVideoFpsRanges;
        kotlinx.coroutines.CoroutineDispatcher backgroundDispatcher = threads.getBackgroundDispatcher();
        job = camera2CameraAvailabilityMonitor.getHighSpeedVideoSizes;
        kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(backgroundDispatcher.plus(kotlinx.coroutines.SupervisorKt.SupervisorJob(job)));
        this.getHighSpeedVideoFpsRanges = CoroutineScope;
        this.getHighSpeedVideoSizes = new java.util.concurrent.CopyOnWriteArrayList<>();
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2.AnonymousClass1(camera2CameraAvailabilityMonitor, str, this, null), 3, null);
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2$1", f = "RetryingCameraStateOpener.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2 getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.flow.Flow flow;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                flow = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
                final java.lang.String str = this.Camera2StreamConfigurationMap;
                final androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2 camera2CameraAvailabilityMonitor$startMonitoring$2 = this.getHighSpeedVideoSizes;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                if (flow.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor.startMonitoring.2.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                        java.lang.String m399unboximpl = ((androidx.camera.camera2.pipe.CameraId) obj2).m399unboximpl();
                        if (androidx.camera.camera2.pipe.CameraId.m395equalsimpl0(m399unboximpl, str)) {
                            if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE()) {
                                androidx.camera.camera2.pipe.CameraId.m398toStringimpl(m399unboximpl);
                            }
                            java.util.Iterator it = camera2CameraAvailabilityMonitor$startMonitoring$2.getHighSpeedVideoSizes.iterator();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "");
                            while (it.hasNext()) {
                                ((kotlinx.coroutines.CompletableDeferred) it.next()).complete(kotlin.Unit.INSTANCE);
                            }
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor camera2CameraAvailabilityMonitor, java.lang.String str, androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2 camera2CameraAvailabilityMonitor$startMonitoring$2, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = camera2CameraAvailabilityMonitor;
            this.Camera2StreamConfigurationMap = str;
            this.getHighSpeedVideoSizes = camera2CameraAvailabilityMonitor$startMonitoring$2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.camera.camera2.pipe.compat.CameraAvailabilityMonitor.Session
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object awaitAvailableCamera(long j, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1 camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1;
        int i;
        kotlinx.coroutines.CompletableDeferred<kotlin.Unit> completableDeferred;
        if (continuation instanceof androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1) {
            camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1 = (androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1) continuation;
            if ((camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CompletableDeferred<kotlin.Unit> CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                    this.getHighSpeedVideoSizes.add(CompletableDeferred$default);
                    androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$success$1 camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$success$1 = new androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$success$1(CompletableDeferred$default, null);
                    camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1.getHighSpeedVideoSizes = CompletableDeferred$default;
                    camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(j, camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$success$1, camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    completableDeferred = CompletableDeferred$default;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    completableDeferred = (kotlinx.coroutines.CompletableDeferred) camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                boolean z = obj != null;
                this.getHighSpeedVideoSizes.remove(completableDeferred);
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
            }
        }
        camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1 = new androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1(this, continuation);
        java.lang.Object obj2 = camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        if (obj2 != null) {
        }
        this.getHighSpeedVideoSizes.remove(completableDeferred);
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.getHighSpeedVideoFpsRanges, null, 1, null);
    }
}
