package androidx.compose.material3.internal;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.internal.InternalMutatorMutex$mutateWith$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {179, 142}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes6.dex */
final class InternalMutatorMutex$mutateWith$2<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ T getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.MutatePriority getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.material3.internal.InternalMutatorMutex getHighSpeedVideoSizesFor;
    private /* synthetic */ java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.Mutex] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.material3.internal.InternalMutatorMutex.Mutator mutator;
        kotlinx.coroutines.sync.Mutex mutex;
        java.lang.Object obj2;
        kotlin.jvm.functions.Function2 function2;
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
                    kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getInputFormats;
                    androidx.compose.foundation.MutatePriority mutatePriority = this.getHighSpeedVideoSizes;
                    kotlin.coroutines.CoroutineContext.Element element = coroutineScope.getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(element);
                    mutator = new androidx.compose.material3.internal.InternalMutatorMutex.Mutator(mutatePriority, (kotlinx.coroutines.Job) element);
                    androidx.compose.material3.internal.InternalMutatorMutex.access$tryMutateOrCancel(this.getHighSpeedVideoSizesFor, mutator);
                    mutex = this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRanges;
                    kotlin.jvm.functions.Function2 function22 = this.Camera2StreamConfigurationMap;
                    java.lang.Object obj3 = this.getHighSpeedVideoFpsRangesFor;
                    androidx.compose.material3.internal.InternalMutatorMutex internalMutatorMutex3 = this.getHighSpeedVideoSizesFor;
                    this.getInputFormats = mutator;
                    this.getHighResolutionOutputSizeshNQ4ISI = mutex;
                    this.getHighSpeedVideoFpsRanges = function22;
                    this.getOutputMinFrameDuration = obj3;
                    this.getInputSizeshNQ4ISI = internalMutatorMutex3;
                    this.getOutputFormats = 1;
                    if (mutex.lock(null, this) != coroutine_suspended) {
                        obj2 = obj3;
                        function2 = function22;
                        internalMutatorMutex = internalMutatorMutex3;
                    }
                    return coroutine_suspended;
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    internalMutatorMutex2 = (androidx.compose.material3.internal.InternalMutatorMutex) this.getHighSpeedVideoFpsRanges;
                    mutex2 = (kotlinx.coroutines.sync.Mutex) this.getHighResolutionOutputSizeshNQ4ISI;
                    mutator2 = (androidx.compose.material3.internal.InternalMutatorMutex.Mutator) this.getInputFormats;
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
                internalMutatorMutex = (androidx.compose.material3.internal.InternalMutatorMutex) this.getInputSizeshNQ4ISI;
                obj2 = this.getOutputMinFrameDuration;
                kotlin.jvm.functions.Function2 function23 = (kotlin.jvm.functions.Function2) this.getHighSpeedVideoFpsRanges;
                kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) this.getHighResolutionOutputSizeshNQ4ISI;
                androidx.compose.material3.internal.InternalMutatorMutex.Mutator mutator3 = (androidx.compose.material3.internal.InternalMutatorMutex.Mutator) this.getInputFormats;
                kotlin.ResultKt.throwOnFailure(obj);
                mutex = mutex3;
                function2 = function23;
                mutator = mutator3;
                this.getInputFormats = mutator;
                this.getHighResolutionOutputSizeshNQ4ISI = mutex;
                this.getHighSpeedVideoFpsRanges = internalMutatorMutex;
                this.getOutputMinFrameDuration = null;
                this.getInputSizeshNQ4ISI = null;
                this.getOutputFormats = 2;
                java.lang.Object invoke = function2.invoke(obj2, this);
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
        return ((androidx.compose.material3.internal.InternalMutatorMutex$mutateWith$2) create(coroutineScope, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.material3.internal.InternalMutatorMutex$mutateWith$2 internalMutatorMutex$mutateWith$2 = new androidx.compose.material3.internal.InternalMutatorMutex$mutateWith$2(this.getHighSpeedVideoSizes, this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
        internalMutatorMutex$mutateWith$2.getInputFormats = obj;
        return internalMutatorMutex$mutateWith$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    InternalMutatorMutex$mutateWith$2(androidx.compose.foundation.MutatePriority mutatePriority, androidx.compose.material3.internal.InternalMutatorMutex internalMutatorMutex, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, T t, kotlin.coroutines.Continuation<? super androidx.compose.material3.internal.InternalMutatorMutex$mutateWith$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = mutatePriority;
        this.getHighSpeedVideoSizesFor = internalMutatorMutex;
        this.Camera2StreamConfigurationMap = function2;
        this.getHighSpeedVideoFpsRangesFor = t;
    }
}
