package androidx.compose.material3.internal;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.internal.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {179, 103}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes6.dex */
final class InternalMutatorMutex$mutate$2<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.MutatePriority Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super R>, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    final /* synthetic */ androidx.compose.material3.internal.InternalMutatorMutex getOutputMinFrameDuration;

    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.Mutex] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.material3.internal.InternalMutatorMutex.Mutator mutator;
        kotlinx.coroutines.sync.Mutex mutex;
        kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super R>, java.lang.Object> function1;
        androidx.compose.material3.internal.InternalMutatorMutex internalMutatorMutex;
        androidx.compose.material3.internal.InternalMutatorMutex.Mutator mutator2;
        java.lang.Throwable th;
        androidx.compose.material3.internal.InternalMutatorMutex internalMutatorMutex2;
        kotlinx.coroutines.sync.Mutex mutex2;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        java.util.concurrent.atomic.AtomicReference atomicReference2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.getOutputFormats;
        try {
            try {
                if (r1 == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getInputSizeshNQ4ISI;
                    androidx.compose.foundation.MutatePriority mutatePriority = this.Camera2StreamConfigurationMap;
                    kotlin.coroutines.CoroutineContext.Element element = coroutineScope.getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(element);
                    mutator = new androidx.compose.material3.internal.InternalMutatorMutex.Mutator(mutatePriority, (kotlinx.coroutines.Job) element);
                    androidx.compose.material3.internal.InternalMutatorMutex.access$tryMutateOrCancel(this.getOutputMinFrameDuration, mutator);
                    mutex = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRanges;
                    kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super R>, java.lang.Object> function12 = this.getHighResolutionOutputSizeshNQ4ISI;
                    androidx.compose.material3.internal.InternalMutatorMutex internalMutatorMutex3 = this.getOutputMinFrameDuration;
                    this.getInputSizeshNQ4ISI = mutator;
                    this.getHighSpeedVideoSizes = mutex;
                    this.getHighSpeedVideoFpsRangesFor = function12;
                    this.getHighSpeedVideoFpsRanges = internalMutatorMutex3;
                    this.getOutputFormats = 1;
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
                    internalMutatorMutex2 = (androidx.compose.material3.internal.InternalMutatorMutex) this.getHighSpeedVideoFpsRangesFor;
                    mutex2 = (kotlinx.coroutines.sync.Mutex) this.getHighSpeedVideoSizes;
                    mutator2 = (androidx.compose.material3.internal.InternalMutatorMutex.Mutator) this.getInputSizeshNQ4ISI;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        atomicReference2 = internalMutatorMutex2.getHighResolutionOutputSizeshNQ4ISI;
                        androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference2, mutator2, null);
                        mutex2.unlock(null);
                        return obj;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        atomicReference = internalMutatorMutex2.getHighResolutionOutputSizeshNQ4ISI;
                        androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, mutator2, null);
                        throw th;
                    }
                }
                internalMutatorMutex = (androidx.compose.material3.internal.InternalMutatorMutex) this.getHighSpeedVideoFpsRanges;
                function1 = (kotlin.jvm.functions.Function1) this.getHighSpeedVideoFpsRangesFor;
                kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) this.getHighSpeedVideoSizes;
                androidx.compose.material3.internal.InternalMutatorMutex.Mutator mutator3 = (androidx.compose.material3.internal.InternalMutatorMutex.Mutator) this.getInputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                mutex = mutex3;
                mutator = mutator3;
                this.getInputSizeshNQ4ISI = mutator;
                this.getHighSpeedVideoSizes = mutex;
                this.getHighSpeedVideoFpsRangesFor = internalMutatorMutex;
                this.getHighSpeedVideoFpsRanges = null;
                this.getOutputFormats = 2;
                java.lang.Object invoke = function1.invoke(this);
                if (invoke != coroutine_suspended) {
                    internalMutatorMutex2 = internalMutatorMutex;
                    mutex2 = mutex;
                    obj = invoke;
                    mutator2 = mutator;
                    atomicReference2 = internalMutatorMutex2.getHighResolutionOutputSizeshNQ4ISI;
                    androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference2, mutator2, null);
                    mutex2.unlock(null);
                    return obj;
                }
                return coroutine_suspended;
            } catch (java.lang.Throwable th3) {
                mutator2 = mutator;
                th = th3;
                internalMutatorMutex2 = internalMutatorMutex;
                atomicReference = internalMutatorMutex2.getHighResolutionOutputSizeshNQ4ISI;
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
        return ((androidx.compose.material3.internal.InternalMutatorMutex$mutate$2) create(coroutineScope, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.material3.internal.InternalMutatorMutex$mutate$2 internalMutatorMutex$mutate$2 = new androidx.compose.material3.internal.InternalMutatorMutex$mutate$2(this.Camera2StreamConfigurationMap, this.getOutputMinFrameDuration, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        internalMutatorMutex$mutate$2.getInputSizeshNQ4ISI = obj;
        return internalMutatorMutex$mutate$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    InternalMutatorMutex$mutate$2(androidx.compose.foundation.MutatePriority mutatePriority, androidx.compose.material3.internal.InternalMutatorMutex internalMutatorMutex, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super androidx.compose.material3.internal.InternalMutatorMutex$mutate$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = mutatePriority;
        this.getOutputMinFrameDuration = internalMutatorMutex;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
    }
}
