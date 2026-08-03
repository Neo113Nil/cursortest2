package androidx.compose.animation.core;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: InternalMutatorMutex.kt */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "R", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.animation.core.MutatorMutex$mutateWith$2", f = "InternalMutatorMutex.kt", i = {0, 0, 1, 1}, l = {184, 171}, m = "invokeSuspend", n = {"mutator", "$this$withLock_u24default$iv", "mutator", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes.dex */
final class MutatorMutex$mutateWith$2<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $block;
    final /* synthetic */ androidx.compose.animation.core.MutatePriority $priority;
    final /* synthetic */ T $receiver;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    int label;
    final /* synthetic */ androidx.compose.animation.core.MutatorMutex this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MutatorMutex$mutateWith$2(androidx.compose.animation.core.MutatePriority mutatePriority, androidx.compose.animation.core.MutatorMutex mutatorMutex, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, T t, kotlin.coroutines.Continuation<? super androidx.compose.animation.core.MutatorMutex$mutateWith$2> continuation) {
        super(2, continuation);
        this.$priority = mutatePriority;
        this.this$0 = mutatorMutex;
        this.$block = function2;
        this.$receiver = t;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.animation.core.MutatorMutex$mutateWith$2 mutatorMutex$mutateWith$2 = new androidx.compose.animation.core.MutatorMutex$mutateWith$2(this.$priority, this.this$0, this.$block, this.$receiver, continuation);
        mutatorMutex$mutateWith$2.L$0 = obj;
        return mutatorMutex$mutateWith$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super R> continuation) {
        return ((androidx.compose.animation.core.MutatorMutex$mutateWith$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.Mutex] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.sync.Mutex mutex;
        kotlin.jvm.functions.Function2 function2;
        java.lang.Object obj2;
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
                    function2 = this.$block;
                    java.lang.Object obj3 = this.$receiver;
                    androidx.compose.animation.core.MutatorMutex mutatorMutex3 = this.this$0;
                    this.L$0 = mutator3;
                    this.L$1 = mutex;
                    this.L$2 = function2;
                    this.L$3 = obj3;
                    this.L$4 = mutatorMutex3;
                    this.label = 1;
                    if (mutex.lock(null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj2 = obj3;
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
                    mutatorMutex = (androidx.compose.animation.core.MutatorMutex) this.L$4;
                    obj2 = this.L$3;
                    function2 = (kotlin.jvm.functions.Function2) this.L$2;
                    kotlinx.coroutines.sync.Mutex mutex3 = (kotlinx.coroutines.sync.Mutex) this.L$1;
                    mutator = (androidx.compose.animation.core.MutatorMutex.Mutator) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    mutex = mutex3;
                }
                this.L$0 = mutator;
                this.L$1 = mutex;
                this.L$2 = mutatorMutex;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 2;
                java.lang.Object invoke = function2.invoke(obj2, this);
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
