package androidx.camera.camera2.pipe.internal;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.internal.GraphSessionLock$withTokenIn$1", f = "GraphSessionLock.kt", i = {0}, l = {105, 54}, m = "invokeSuspend", n = {"$this$acquireTokenAndSuspend$iv"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class GraphSessionLock$withTokenIn$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.camera.camera2.pipe.core.Token, kotlin.coroutines.Continuation<? super T>, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.camera.camera2.pipe.internal.GraphSessionLock getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.camera.camera2.pipe.internal.GraphSessionLock graphSessionLock;
        kotlinx.coroutines.sync.Mutex mutex;
        kotlinx.coroutines.sync.Mutex mutex2;
        java.lang.Object Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            graphSessionLock = this.getHighSpeedVideoSizes;
            mutex = graphSessionLock.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = mutex;
            this.getHighResolutionOutputSizeshNQ4ISI = graphSessionLock;
            this.Camera2StreamConfigurationMap = 1;
            if (androidx.camera.camera2.pipe.core.MutexesKt.access$lockAndSuspend(mutex, this) != coroutine_suspended) {
                mutex2 = mutex;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        graphSessionLock = (androidx.camera.camera2.pipe.internal.GraphSessionLock) this.getHighResolutionOutputSizeshNQ4ISI;
        mutex2 = (kotlinx.coroutines.sync.Mutex) this.getHighSpeedVideoFpsRanges;
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.Camera2StreamConfigurationMap = 2;
        Camera2StreamConfigurationMap = graphSessionLock.Camera2StreamConfigurationMap(new androidx.camera.camera2.pipe.core.MutexToken(mutex2), new androidx.camera.camera2.pipe.internal.GraphSessionLock$withTokenIn$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, null), this);
        return Camera2StreamConfigurationMap == coroutine_suspended ? coroutine_suspended : Camera2StreamConfigurationMap;
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "T", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Landroidx/camera/camera2/pipe/core/Token;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.internal.GraphSessionLock$withTokenIn$1$1", f = "GraphSessionLock.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.camera.camera2.pipe.internal.GraphSessionLock$withTokenIn$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.camera.camera2.pipe.core.Token, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
        /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
        final /* synthetic */ kotlin.jvm.functions.Function2<androidx.camera.camera2.pipe.core.Token, kotlin.coroutines.Continuation<? super T>, java.lang.Object> getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i != 0) {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return obj;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.camera.camera2.pipe.core.Token token = (androidx.camera.camera2.pipe.core.Token) this.Camera2StreamConfigurationMap;
            kotlin.jvm.functions.Function2<androidx.camera.camera2.pipe.core.Token, kotlin.coroutines.Continuation<? super T>, java.lang.Object> function2 = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRangesFor = 1;
            java.lang.Object invoke = function2.invoke(token, this);
            return invoke == coroutine_suspended ? coroutine_suspended : invoke;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(androidx.camera.camera2.pipe.core.Token token, java.lang.Object obj) {
            return ((androidx.camera.camera2.pipe.internal.GraphSessionLock$withTokenIn$1.AnonymousClass1) create(token, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.camera.camera2.pipe.internal.GraphSessionLock$withTokenIn$1.AnonymousClass1 anonymousClass1 = new androidx.camera.camera2.pipe.internal.GraphSessionLock$withTokenIn$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, continuation);
            anonymousClass1.Camera2StreamConfigurationMap = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.jvm.functions.Function2<? super androidx.camera.camera2.pipe.core.Token, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.internal.GraphSessionLock$withTokenIn$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = function2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Object obj) {
        return ((androidx.camera.camera2.pipe.internal.GraphSessionLock$withTokenIn$1) create(coroutineScope, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.pipe.internal.GraphSessionLock$withTokenIn$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GraphSessionLock$withTokenIn$1(androidx.camera.camera2.pipe.internal.GraphSessionLock graphSessionLock, kotlin.jvm.functions.Function2<? super androidx.camera.camera2.pipe.core.Token, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.internal.GraphSessionLock$withTokenIn$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = graphSessionLock;
        this.getHighSpeedVideoFpsRangesFor = function2;
    }
}
