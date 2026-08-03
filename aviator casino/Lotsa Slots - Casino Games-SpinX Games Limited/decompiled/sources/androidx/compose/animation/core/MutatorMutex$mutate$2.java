package androidx.compose.animation.core;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: InternalMutatorMutex.kt */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {184, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes.dex */
final class MutatorMutex$mutate$2<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super R>, java.lang.Object> $block;
    final /* synthetic */ androidx.compose.animation.core.MutatePriority $priority;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    int label;
    final /* synthetic */ androidx.compose.animation.core.MutatorMutex this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MutatorMutex$mutate$2(androidx.compose.animation.core.MutatePriority mutatePriority, androidx.compose.animation.core.MutatorMutex mutatorMutex, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super androidx.compose.animation.core.MutatorMutex$mutate$2> continuation) {
        super(2, continuation);
        this.$priority = mutatePriority;
        this.this$0 = mutatorMutex;
        this.$block = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.animation.core.MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new androidx.compose.animation.core.MutatorMutex$mutate$2(this.$priority, this.this$0, this.$block, continuation);
        mutatorMutex$mutate$2.L$0 = obj;
        return mutatorMutex$mutate$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super R> continuation) {
        return ((androidx.compose.animation.core.MutatorMutex$mutate$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.Mutex] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.sync.Mutex mutex;
        kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super R>, java.lang.Object> function1;
        androidx.compose.animation.core.MutatorMutex.Mutator mutator;
        androidx.compose.animation.core.MutatorMutex mutatorMutex;
        androidx.compose.animation.core.MutatorMutex.Mutator mutator2;
        java.lang.Throwable th;
        androidx.compose.animation.core.MutatorMutex mutatorMutex2;
        kotlinx.coroutines.sync.Mutex mutex2;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        java.util.concurrent.atomic.AtomicReference atomicReference2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.label;
        try {
            try {
                if (r1 == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
                    androidx.compose.animation.core.MutatePriority mutatePriority = this.$priority;
                    kotlin.coroutines.CoroutineContext.Element element = coroutineScope.getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(element);
                    androidx.compose.animation.core.MutatorMutex.Mutator mutator3 = new androidx.compose.animation.core.MutatorMutex.Mutator(mutatePriority, (kotlinx.coroutines.Job) element);
                    this.this$0.tryMutateOrCancel(mutator3);
                    mutex = this.this$0.mutex;
                    kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super R>, java.lang.Object> function12 = this.$block;
                    androidx.compose.animation.core.MutatorMutex mutatorMutex3 = this.this$0;
                    this.L$0 = mutator3;
                    this.L$1 = mutex;
                    this.L$2 = function12;
                    this.L$3 = mutatorMutex3;
                    this.label = 1;
                    if (mutex.lock(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    function1 = function12;
                    mutator = mutator3;
                    mutatorMutex = mutatorMutex3;
                } else {
                    if (r1 != 1) {
                        if (r1 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutatorMutex2 = (androidx.compose.animation.core.MutatorMutex) this.L$2;
                        mutex2 = (kotlinx.coroutines.sync.Mutex) this.L$1;
                        mutator2 = (androidx.compose.animation.core.MutatorMutex.Mutator) this.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            atomicReference2 = mutatorMutex2.currentMutator;
                            androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(atomicReference2, mutator2, null);
                            mutex2.unlock(null);
                            return obj;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            atomicReference = mutatorMutex2.currentMutator;
                            androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(atomicReference, mutator2, null);
                            throw th;
                        }
                    }
                    mutatorMutex = (androidx.compose.animation.core.MutatorMutex) this.L$3;
                    function1 = (kotlin.jvm.functions.Function1) this.L$2;
                    kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) this.L$1;
                    mutator = (androidx.compose.animation.core.MutatorMutex.Mutator) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    mutex = mutex3;
                }
                this.L$0 = mutator;
                this.L$1 = mutex;
                this.L$2 = mutatorMutex;
                this.L$3 = null;
                this.label = 2;
                java.lang.Object invoke = function1.invoke(this);
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutatorMutex2 = mutatorMutex;
                mutex2 = mutex;
                obj = invoke;
                mutator2 = mutator;
                atomicReference2 = mutatorMutex2.currentMutator;
                androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(atomicReference2, mutator2, null);
                mutex2.unlock(null);
                return obj;
            } catch (java.lang.Throwable th3) {
                mutator2 = mutator;
                th = th3;
                mutatorMutex2 = mutatorMutex;
                atomicReference = mutatorMutex2.currentMutator;
                androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(atomicReference, mutator2, null);
                throw th;
            }
        } catch (java.lang.Throwable th4) {
            r1.unlock(null);
            throw th4;
        }
    }
}
