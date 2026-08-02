package androidx.camera.camera2.pipe.core;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.core.MutexesKt$withLockLaunch$1", f = "Mutexes.kt", i = {0, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, 90}, m = "invokeSuspend", n = {"$this$withLockSuspend$iv", "$this$withLockSuspend$iv"}, s = {"L$0", "L$0"}, v = 1)
/* loaded from: classes6.dex */
final class MutexesKt$withLockLaunch$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.camera.camera2.pipe.core.CoroutineMutex getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
    
        if (androidx.camera.camera2.pipe.core.MutexesKt.access$lockAndSuspend(r8, r7) != r0) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.sync.Mutex mutex;
        kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2;
        kotlinx.coroutines.sync.Mutex mutex2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScopeKt.ensureActive((kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRangesFor);
                mutex = this.getHighSpeedVideoSizes.getMutex();
                function2 = this.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoFpsRangesFor = mutex;
                this.getHighResolutionOutputSizeshNQ4ISI = function2;
                this.getHighSpeedVideoFpsRanges = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (kotlinx.coroutines.sync.Mutex) this.getHighSpeedVideoFpsRangesFor;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(mutex2, null, 1, null);
                        return kotlin.Unit.INSTANCE;
                    } catch (java.lang.Throwable th) {
                        kotlinx.coroutines.sync.Mutex mutex3 = mutex2;
                        th = th;
                        mutex = mutex3;
                        kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(mutex, null, 1, null);
                        throw th;
                    }
                }
                function2 = (kotlin.jvm.functions.Function2) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlinx.coroutines.sync.Mutex mutex4 = (kotlinx.coroutines.sync.Mutex) this.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                mutex = mutex4;
            }
            this.getHighSpeedVideoFpsRangesFor = mutex;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getHighSpeedVideoFpsRanges = 2;
            if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(function2, this) != coroutine_suspended) {
                mutex2 = mutex;
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(mutex2, null, 1, null);
                return kotlin.Unit.INSTANCE;
            }
            return coroutine_suspended;
        } catch (java.lang.Throwable th2) {
            th = th2;
            kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(mutex, null, 1, null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.pipe.core.MutexesKt$withLockLaunch$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.camera.camera2.pipe.core.MutexesKt$withLockLaunch$1 mutexesKt$withLockLaunch$1 = new androidx.camera.camera2.pipe.core.MutexesKt$withLockLaunch$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
        mutexesKt$withLockLaunch$1.getHighSpeedVideoFpsRangesFor = obj;
        return mutexesKt$withLockLaunch$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MutexesKt$withLockLaunch$1(androidx.camera.camera2.pipe.core.CoroutineMutex coroutineMutex, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.core.MutexesKt$withLockLaunch$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = coroutineMutex;
        this.Camera2StreamConfigurationMap = function2;
    }
}
