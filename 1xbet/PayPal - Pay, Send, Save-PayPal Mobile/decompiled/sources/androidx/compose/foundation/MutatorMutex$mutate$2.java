package androidx.compose.foundation;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.MutatorMutex$mutate$2", f = "MutatorMutex.kt", i = {0, 0, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, 127}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 1)
/* loaded from: classes.dex */
final class MutatorMutex$mutate$2<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.MutatePriority Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super R>, java.lang.Object> getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.foundation.MutatorMutex getHighSpeedVideoSizesFor;
    private /* synthetic */ java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.Mutex] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.foundation.MutatorMutex.Mutator mutator;
        kotlinx.coroutines.sync.Mutex mutex;
        kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super R>, java.lang.Object> function1;
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
                    androidx.compose.foundation.MutatePriority mutatePriority = this.Camera2StreamConfigurationMap;
                    kotlin.coroutines.CoroutineContext.Element element = coroutineScope.getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(element);
                    mutator = new androidx.compose.foundation.MutatorMutex.Mutator(mutatePriority, (kotlinx.coroutines.Job) element);
                    this.getHighSpeedVideoSizesFor.getHighSpeedVideoSizes(mutator);
                    mutex = this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRanges;
                    kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super R>, java.lang.Object> function12 = this.getHighSpeedVideoSizes;
                    androidx.compose.foundation.MutatorMutex mutatorMutex3 = this.getHighSpeedVideoSizesFor;
                    this.getOutputFormats = mutator;
                    this.getHighResolutionOutputSizeshNQ4ISI = mutex;
                    this.getHighSpeedVideoFpsRanges = function12;
                    this.getHighSpeedVideoFpsRangesFor = mutatorMutex3;
                    this.getOutputMinFrameDuration = 1;
                    if (mutex.lock(null, this) != coroutine_suspended) {
                        function1 = function12;
                        mutatorMutex = mutatorMutex3;
                    }
                    return coroutine_suspended;
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutatorMutex2 = (androidx.compose.foundation.MutatorMutex) this.getHighSpeedVideoFpsRanges;
                    mutex2 = (kotlinx.coroutines.sync.Mutex) this.getHighResolutionOutputSizeshNQ4ISI;
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
                mutatorMutex = (androidx.compose.foundation.MutatorMutex) this.getHighSpeedVideoFpsRangesFor;
                function1 = (kotlin.jvm.functions.Function1) this.getHighSpeedVideoFpsRanges;
                kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) this.getHighResolutionOutputSizeshNQ4ISI;
                androidx.compose.foundation.MutatorMutex.Mutator mutator3 = (androidx.compose.foundation.MutatorMutex.Mutator) this.getOutputFormats;
                kotlin.ResultKt.throwOnFailure(obj);
                mutex = mutex3;
                mutator = mutator3;
                this.getOutputFormats = mutator;
                this.getHighResolutionOutputSizeshNQ4ISI = mutex;
                this.getHighSpeedVideoFpsRanges = mutatorMutex;
                this.getHighSpeedVideoFpsRangesFor = null;
                this.getOutputMinFrameDuration = 2;
                java.lang.Object invoke = function1.invoke(this);
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
        return ((androidx.compose.foundation.MutatorMutex$mutate$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new androidx.compose.foundation.MutatorMutex$mutate$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizes, continuation);
        mutatorMutex$mutate$2.getOutputFormats = obj;
        return mutatorMutex$mutate$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MutatorMutex$mutate$2(androidx.compose.foundation.MutatePriority mutatePriority, androidx.compose.foundation.MutatorMutex mutatorMutex, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super androidx.compose.foundation.MutatorMutex$mutate$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = mutatePriority;
        this.getHighSpeedVideoSizesFor = mutatorMutex;
        this.getHighSpeedVideoSizes = function1;
    }
}
