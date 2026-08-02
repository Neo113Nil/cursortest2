package androidx.camera.camera2.pipe.core;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.core.MutexesKt$withLockAsync$1", f = "Mutexes.kt", i = {0, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, 69}, m = "invokeSuspend", n = {"$this$withLockSuspend$iv", "$this$withLockSuspend$iv"}, s = {"L$0", "L$0"}, v = 1)
/* loaded from: classes6.dex */
final class MutexesKt$withLockAsync$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
    final /* synthetic */ androidx.camera.camera2.pipe.core.CoroutineMutex Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        if (androidx.camera.camera2.pipe.core.MutexesKt.access$lockAndSuspend(r8, r7) != r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.sync.Mutex mutex;
        kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> function2;
        kotlinx.coroutines.sync.Mutex mutex2;
        java.lang.Throwable th;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScopeKt.ensureActive((kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRanges);
                mutex = this.Camera2StreamConfigurationMap.getMutex();
                function2 = this.getHighSpeedVideoSizes;
                this.getHighSpeedVideoFpsRanges = mutex;
                this.getHighSpeedVideoFpsRangesFor = function2;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (kotlinx.coroutines.sync.Mutex) this.getHighSpeedVideoFpsRanges;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(mutex2, null, 1, null);
                        return obj;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(mutex2, null, 1, null);
                        throw th;
                    }
                }
                function2 = (kotlin.jvm.functions.Function2) this.getHighSpeedVideoFpsRangesFor;
                kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) this.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                mutex = mutex3;
            }
            this.getHighSpeedVideoFpsRanges = mutex;
            this.getHighSpeedVideoFpsRangesFor = null;
            this.getHighResolutionOutputSizeshNQ4ISI = 2;
            java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(function2, this);
            if (coroutineScope != coroutine_suspended) {
                mutex2 = mutex;
                obj = coroutineScope;
                kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(mutex2, null, 1, null);
                return obj;
            }
            return coroutine_suspended;
        } catch (java.lang.Throwable th3) {
            mutex2 = mutex;
            th = th3;
            kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(mutex2, null, 1, null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Object obj) {
        return ((androidx.camera.camera2.pipe.core.MutexesKt$withLockAsync$1) create(coroutineScope, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.camera.camera2.pipe.core.MutexesKt$withLockAsync$1 mutexesKt$withLockAsync$1 = new androidx.camera.camera2.pipe.core.MutexesKt$withLockAsync$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
        mutexesKt$withLockAsync$1.getHighSpeedVideoFpsRanges = obj;
        return mutexesKt$withLockAsync$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MutexesKt$withLockAsync$1(androidx.camera.camera2.pipe.core.CoroutineMutex coroutineMutex, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.core.MutexesKt$withLockAsync$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = coroutineMutex;
        this.getHighSpeedVideoSizes = function2;
    }
}
