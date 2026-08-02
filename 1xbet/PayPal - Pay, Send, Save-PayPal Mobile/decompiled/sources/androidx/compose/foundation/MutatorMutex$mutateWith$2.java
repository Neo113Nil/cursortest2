package androidx.compose.foundation;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", i = {0, 0, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, 167}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 1)
/* loaded from: classes.dex */
final class MutatorMutex$mutateWith$2<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
    final /* synthetic */ T Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.MutatePriority getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    final /* synthetic */ androidx.compose.foundation.MutatorMutex getInputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.Mutex] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.foundation.MutatorMutex.Mutator mutator;
        kotlinx.coroutines.sync.Mutex mutex;
        java.lang.Object obj2;
        kotlin.jvm.functions.Function2 function2;
        androidx.compose.foundation.MutatorMutex mutatorMutex;
        androidx.compose.foundation.MutatorMutex.Mutator mutator2;
        java.lang.Throwable th;
        androidx.compose.foundation.MutatorMutex mutatorMutex2;
        kotlinx.coroutines.sync.Mutex mutex2;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        java.util.concurrent.atomic.AtomicReference atomicReference2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.getOutputMinFrameDuration;
        try {
            try {
                if (r1 == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputFormats;
                    androidx.compose.foundation.MutatePriority mutatePriority = this.getHighSpeedVideoFpsRangesFor;
                    kotlin.coroutines.CoroutineContext.Element element = coroutineScope.getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(element);
                    mutator = new androidx.compose.foundation.MutatorMutex.Mutator(mutatePriority, (kotlinx.coroutines.Job) element);
                    this.getInputSizeshNQ4ISI.getHighSpeedVideoSizes(mutator);
                    mutex = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
                    kotlin.jvm.functions.Function2 function22 = this.getHighSpeedVideoSizes;
                    java.lang.Object obj3 = this.Camera2StreamConfigurationMap;
                    androidx.compose.foundation.MutatorMutex mutatorMutex3 = this.getInputSizeshNQ4ISI;
                    this.getOutputFormats = mutator;
                    this.getHighSpeedVideoFpsRanges = mutex;
                    this.getHighResolutionOutputSizeshNQ4ISI = function22;
                    this.getInputFormats = obj3;
                    this.getHighSpeedVideoSizesFor = mutatorMutex3;
                    this.getOutputMinFrameDuration = 1;
                    if (mutex.lock(null, this) != coroutine_suspended) {
                        obj2 = obj3;
                        function2 = function22;
                        mutatorMutex = mutatorMutex3;
                    }
                    return coroutine_suspended;
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutatorMutex2 = (androidx.compose.foundation.MutatorMutex) this.getHighResolutionOutputSizeshNQ4ISI;
                    mutex2 = (kotlinx.coroutines.sync.Mutex) this.getHighSpeedVideoFpsRanges;
                    mutator2 = (androidx.compose.foundation.MutatorMutex.Mutator) this.getOutputFormats;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        atomicReference2 = mutatorMutex2.getHighResolutionOutputSizeshNQ4ISI;
                        androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference2, mutator2, null);
                        mutex2.unlock(null);
                        return obj;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        atomicReference = mutatorMutex2.getHighResolutionOutputSizeshNQ4ISI;
                        androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, mutator2, null);
                        throw th;
                    }
                }
                mutatorMutex = (androidx.compose.foundation.MutatorMutex) this.getHighSpeedVideoSizesFor;
                obj2 = this.getInputFormats;
                kotlin.jvm.functions.Function2 function23 = (kotlin.jvm.functions.Function2) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) this.getHighSpeedVideoFpsRanges;
                androidx.compose.foundation.MutatorMutex.Mutator mutator3 = (androidx.compose.foundation.MutatorMutex.Mutator) this.getOutputFormats;
                kotlin.ResultKt.throwOnFailure(obj);
                mutex = mutex3;
                function2 = function23;
                mutator = mutator3;
                this.getOutputFormats = mutator;
                this.getHighSpeedVideoFpsRanges = mutex;
                this.getHighResolutionOutputSizeshNQ4ISI = mutatorMutex;
                this.getInputFormats = null;
                this.getHighSpeedVideoSizesFor = null;
                this.getOutputMinFrameDuration = 2;
                java.lang.Object invoke = function2.invoke(obj2, this);
                if (invoke != coroutine_suspended) {
                    mutatorMutex2 = mutatorMutex;
                    mutex2 = mutex;
                    obj = invoke;
                    mutator2 = mutator;
                    atomicReference2 = mutatorMutex2.getHighResolutionOutputSizeshNQ4ISI;
                    androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference2, mutator2, null);
                    mutex2.unlock(null);
                    return obj;
                }
                return coroutine_suspended;
            } catch (java.lang.Throwable th3) {
                mutator2 = mutator;
                th = th3;
                mutatorMutex2 = mutatorMutex;
                atomicReference = mutatorMutex2.getHighResolutionOutputSizeshNQ4ISI;
                androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, mutator2, null);
                throw th;
            }
        } catch (java.lang.Throwable th4) {
            r1.unlock(null);
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super R> continuation) {
        return ((androidx.compose.foundation.MutatorMutex$mutateWith$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.MutatorMutex$mutateWith$2 mutatorMutex$mutateWith$2 = new androidx.compose.foundation.MutatorMutex$mutateWith$2(this.getHighSpeedVideoFpsRangesFor, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
        mutatorMutex$mutateWith$2.getOutputFormats = obj;
        return mutatorMutex$mutateWith$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MutatorMutex$mutateWith$2(androidx.compose.foundation.MutatePriority mutatePriority, androidx.compose.foundation.MutatorMutex mutatorMutex, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, T t, kotlin.coroutines.Continuation<? super androidx.compose.foundation.MutatorMutex$mutateWith$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = mutatePriority;
        this.getInputSizeshNQ4ISI = mutatorMutex;
        this.getHighSpeedVideoSizes = function2;
        this.Camera2StreamConfigurationMap = t;
    }
}
