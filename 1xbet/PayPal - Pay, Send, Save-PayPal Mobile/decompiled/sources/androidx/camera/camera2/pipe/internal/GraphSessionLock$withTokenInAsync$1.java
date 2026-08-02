package androidx.camera.camera2.pipe.internal;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.internal.GraphSessionLock$withTokenInAsync$1", f = "GraphSessionLock.kt", i = {0, 0, 1}, l = {105, 64, 67}, m = "invokeSuspend", n = {"$this$asyncUndispatched", "$this$acquireTokenAndSuspend$iv", "$this$asyncUndispatched"}, s = {"L$0", "L$1", "L$0"}, v = 1)
/* loaded from: classes6.dex */
final class GraphSessionLock$withTokenInAsync$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.camera.camera2.pipe.internal.GraphSessionLock getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.camera.camera2.pipe.core.Token, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends T>>, java.lang.Object> getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0079, code lost:
    
        if (r10 != r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.sync.Mutex mutex;
        kotlinx.coroutines.sync.Mutex mutex2;
        kotlinx.coroutines.CoroutineScope coroutineScope;
        androidx.camera.camera2.pipe.internal.GraphSessionLock graphSessionLock;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.getInputSizeshNQ4ISI;
            androidx.camera.camera2.pipe.internal.GraphSessionLock graphSessionLock2 = this.getHighResolutionOutputSizeshNQ4ISI;
            mutex = graphSessionLock2.getHighSpeedVideoFpsRanges;
            this.getInputSizeshNQ4ISI = coroutineScope2;
            this.getHighSpeedVideoFpsRangesFor = mutex;
            this.Camera2StreamConfigurationMap = graphSessionLock2;
            this.getHighSpeedVideoSizes = 1;
            if (androidx.camera.camera2.pipe.core.MutexesKt.access$lockAndSuspend(mutex, this) != coroutine_suspended) {
                mutex2 = mutex;
                coroutineScope = coroutineScope2;
                graphSessionLock = graphSessionLock2;
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return obj;
            }
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getInputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScopeKt.ensureActive(coroutineScope);
            this.getInputSizeshNQ4ISI = null;
            this.getHighSpeedVideoSizes = 3;
            java.lang.Object await = ((kotlinx.coroutines.Deferred) obj).await(this);
            return await == coroutine_suspended ? coroutine_suspended : await;
        }
        androidx.camera.camera2.pipe.internal.GraphSessionLock graphSessionLock3 = (androidx.camera.camera2.pipe.internal.GraphSessionLock) this.Camera2StreamConfigurationMap;
        mutex2 = (kotlinx.coroutines.sync.Mutex) this.getHighSpeedVideoFpsRangesFor;
        kotlinx.coroutines.CoroutineScope coroutineScope3 = (kotlinx.coroutines.CoroutineScope) this.getInputSizeshNQ4ISI;
        kotlin.ResultKt.throwOnFailure(obj);
        graphSessionLock = graphSessionLock3;
        coroutineScope = coroutineScope3;
        this.getInputSizeshNQ4ISI = coroutineScope;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoSizes = 2;
        obj = graphSessionLock.Camera2StreamConfigurationMap(new androidx.camera.camera2.pipe.core.MutexToken(mutex2), new androidx.camera.camera2.pipe.internal.GraphSessionLock$withTokenInAsync$1$deferred$1(this.getHighSpeedVideoFpsRanges, null), this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Object obj) {
        return ((androidx.camera.camera2.pipe.internal.GraphSessionLock$withTokenInAsync$1) create(coroutineScope, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.camera.camera2.pipe.internal.GraphSessionLock$withTokenInAsync$1 graphSessionLock$withTokenInAsync$1 = new androidx.camera.camera2.pipe.internal.GraphSessionLock$withTokenInAsync$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
        graphSessionLock$withTokenInAsync$1.getInputSizeshNQ4ISI = obj;
        return graphSessionLock$withTokenInAsync$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GraphSessionLock$withTokenInAsync$1(androidx.camera.camera2.pipe.internal.GraphSessionLock graphSessionLock, kotlin.jvm.functions.Function2<? super androidx.camera.camera2.pipe.core.Token, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<? extends T>>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.internal.GraphSessionLock$withTokenInAsync$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = graphSessionLock;
        this.getHighSpeedVideoFpsRanges = function2;
    }
}
