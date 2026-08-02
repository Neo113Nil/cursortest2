package androidx.compose.material;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, 103}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 1)
/* loaded from: classes6.dex */
final class InternalMutatorMutex$mutate$2<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.MutatePriority Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super R>, java.lang.Object> getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getInputFormats;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.material.InternalMutatorMutex getOutputFormats;

    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.Mutex] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.material.InternalMutatorMutex.Mutator mutator;
        kotlinx.coroutines.sync.Mutex mutex;
        kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super R>, java.lang.Object> function1;
        androidx.compose.material.InternalMutatorMutex internalMutatorMutex;
        androidx.compose.material.InternalMutatorMutex.Mutator mutator2;
        java.lang.Throwable th;
        androidx.compose.material.InternalMutatorMutex internalMutatorMutex2;
        kotlinx.coroutines.sync.Mutex mutex2;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        java.util.concurrent.atomic.AtomicReference atomicReference2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.getInputFormats;
        try {
            try {
                if (r1 == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getInputSizeshNQ4ISI;
                    androidx.compose.foundation.MutatePriority mutatePriority = this.Camera2StreamConfigurationMap;
                    kotlin.coroutines.CoroutineContext.Element element = coroutineScope.getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(element);
                    mutator = new androidx.compose.material.InternalMutatorMutex.Mutator(mutatePriority, (kotlinx.coroutines.Job) element);
                    androidx.compose.material.InternalMutatorMutex.access$tryMutateOrCancel(this.getOutputFormats, mutator);
                    mutex = this.getOutputFormats.Camera2StreamConfigurationMap;
                    kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super R>, java.lang.Object> function12 = this.getHighSpeedVideoFpsRanges;
                    androidx.compose.material.InternalMutatorMutex internalMutatorMutex3 = this.getOutputFormats;
                    this.getInputSizeshNQ4ISI = mutator;
                    this.getHighSpeedVideoFpsRangesFor = mutex;
                    this.getHighResolutionOutputSizeshNQ4ISI = function12;
                    this.getHighSpeedVideoSizes = internalMutatorMutex3;
                    this.getInputFormats = 1;
                    if (mutex.lock(null, this) != coroutine_suspended) {
                        function1 = function12;
                        internalMutatorMutex = internalMutatorMutex3;
                    }
                    return coroutine_suspended;
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    internalMutatorMutex2 = (androidx.compose.material.InternalMutatorMutex) this.getHighResolutionOutputSizeshNQ4ISI;
                    mutex2 = (kotlinx.coroutines.sync.Mutex) this.getHighSpeedVideoFpsRangesFor;
                    mutator2 = (androidx.compose.material.InternalMutatorMutex.Mutator) this.getInputSizeshNQ4ISI;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        atomicReference2 = internalMutatorMutex2.getHighSpeedVideoFpsRanges;
                        androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference2, mutator2, null);
                        mutex2.unlock(null);
                        return obj;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        atomicReference = internalMutatorMutex2.getHighSpeedVideoFpsRanges;
                        androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, mutator2, null);
                        throw th;
                    }
                }
                internalMutatorMutex = (androidx.compose.material.InternalMutatorMutex) this.getHighSpeedVideoSizes;
                function1 = (kotlin.jvm.functions.Function1) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) this.getHighSpeedVideoFpsRangesFor;
                androidx.compose.material.InternalMutatorMutex.Mutator mutator3 = (androidx.compose.material.InternalMutatorMutex.Mutator) this.getInputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                mutex = mutex3;
                mutator = mutator3;
                this.getInputSizeshNQ4ISI = mutator;
                this.getHighSpeedVideoFpsRangesFor = mutex;
                this.getHighResolutionOutputSizeshNQ4ISI = internalMutatorMutex;
                this.getHighSpeedVideoSizes = null;
                this.getInputFormats = 2;
                java.lang.Object invoke = function1.invoke(this);
                if (invoke != coroutine_suspended) {
                    internalMutatorMutex2 = internalMutatorMutex;
                    mutex2 = mutex;
                    obj = invoke;
                    mutator2 = mutator;
                    atomicReference2 = internalMutatorMutex2.getHighSpeedVideoFpsRanges;
                    androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference2, mutator2, null);
                    mutex2.unlock(null);
                    return obj;
                }
                return coroutine_suspended;
            } catch (java.lang.Throwable th3) {
                mutator2 = mutator;
                th = th3;
                internalMutatorMutex2 = internalMutatorMutex;
                atomicReference = internalMutatorMutex2.getHighSpeedVideoFpsRanges;
                androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, mutator2, null);
                throw th;
            }
        } catch (java.lang.Throwable th4) {
            r1.unlock(null);
            throw th4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Object obj) {
        return ((androidx.compose.material.InternalMutatorMutex$mutate$2) create(coroutineScope, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.material.InternalMutatorMutex$mutate$2 internalMutatorMutex$mutate$2 = new androidx.compose.material.InternalMutatorMutex$mutate$2(this.Camera2StreamConfigurationMap, this.getOutputFormats, this.getHighSpeedVideoFpsRanges, continuation);
        internalMutatorMutex$mutate$2.getInputSizeshNQ4ISI = obj;
        return internalMutatorMutex$mutate$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    InternalMutatorMutex$mutate$2(androidx.compose.foundation.MutatePriority mutatePriority, androidx.compose.material.InternalMutatorMutex internalMutatorMutex, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super androidx.compose.material.InternalMutatorMutex$mutate$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = mutatePriority;
        this.getOutputFormats = internalMutatorMutex;
        this.getHighSpeedVideoFpsRanges = function1;
    }
}
