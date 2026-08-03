package androidx.compose.runtime;

/* compiled from: Recomposer.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "parentFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 1}, l = {840, 860, 861}, m = "invokeSuspend", n = {"recomposeCoroutineScope", "frameSignal", "frameLoop", "frameLoop"}, s = {"L$0", "L$1", "L$2", "L$0"})
/* loaded from: classes.dex */
final class Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.coroutines.CoroutineContext $recomposeCoroutineContext;
    private /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    final /* synthetic */ androidx.compose.runtime.Recomposer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(kotlin.coroutines.CoroutineContext coroutineContext, androidx.compose.runtime.Recomposer recomposer, kotlin.coroutines.Continuation<? super androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2> continuation) {
        super(3, continuation);
        this.$recomposeCoroutineContext = coroutineContext;
        this.this$0 = recomposer;
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 recomposer$runRecomposeConcurrentlyAndApplyChanges$2 = new androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(this.$recomposeCoroutineContext, this.this$0, continuation);
        recomposer$runRecomposeConcurrentlyAndApplyChanges$2.L$0 = coroutineScope;
        recomposer$runRecomposeConcurrentlyAndApplyChanges$2.L$1 = monotonicFrameClock;
        return recomposer$runRecomposeConcurrentlyAndApplyChanges$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0194 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0161  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00ad -> B:17:0x0039). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.CoroutineScope coroutineScope;
        androidx.compose.runtime.ProduceFrameSignal produceFrameSignal;
        boolean shouldKeepRecomposing;
        java.lang.Object awaitWorkAvailable;
        boolean hasConcurrentFrameWorkLocked;
        kotlin.coroutines.Continuation<kotlin.Unit> requestFrameLocked;
        int i;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.L$0;
            androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock = (androidx.compose.runtime.MonotonicFrameClock) this.L$1;
            boolean z = this.$recomposeCoroutineContext.get(kotlinx.coroutines.Job.INSTANCE) == null;
            kotlin.coroutines.CoroutineContext coroutineContext = this.$recomposeCoroutineContext;
            if (!z) {
                throw new java.lang.IllegalArgumentException(("recomposeCoroutineContext may not contain a Job; found " + coroutineContext.get(kotlinx.coroutines.Job.INSTANCE)).toString());
            }
            kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(coroutineScope2.getCoroutineContext().plus(this.$recomposeCoroutineContext).plus(kotlinx.coroutines.JobKt.Job(kotlinx.coroutines.JobKt.getJob(coroutineScope2.getCoroutineContext()))));
            androidx.compose.runtime.ProduceFrameSignal produceFrameSignal2 = new androidx.compose.runtime.ProduceFrameSignal();
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1(this.this$0, monotonicFrameClock, produceFrameSignal2, null), 3, null);
            coroutineScope = CoroutineScope;
            produceFrameSignal = produceFrameSignal2;
            shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
            if (!shouldKeepRecomposing) {
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                launch$default = (kotlinx.coroutines.Job) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                this.L$0 = null;
                this.label = 3;
                if (kotlinx.coroutines.JobKt.cancelAndJoin(launch$default, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
            launch$default = (kotlinx.coroutines.Job) this.L$2;
            produceFrameSignal = (androidx.compose.runtime.ProduceFrameSignal) this.L$1;
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope3 = coroutineScope;
            androidx.compose.runtime.Recomposer recomposer = this.this$0;
            androidx.compose.runtime.collection.IdentityArraySet identityArraySet = recomposer.snapshotInvalidations;
            if (identityArraySet.isNotEmpty()) {
                java.util.List knownCompositions = recomposer.getKnownCompositions();
                int size = knownCompositions.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((androidx.compose.runtime.ControlledComposition) knownCompositions.get(i3)).recordModificationsOf(identityArraySet);
                }
                recomposer.snapshotInvalidations = new androidx.compose.runtime.collection.IdentityArraySet();
            }
            java.util.List list = recomposer.compositionInvalidations;
            int size2 = list.size();
            int i4 = 0;
            while (i4 < size2) {
                androidx.compose.runtime.ControlledComposition controlledComposition = (androidx.compose.runtime.ControlledComposition) list.get(i4);
                synchronized (recomposer.stateLock) {
                    i = recomposer.concurrentCompositionsOutstanding;
                    recomposer.concurrentCompositionsOutstanding = i + 1;
                }
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope3, androidx.compose.runtime.CompositionKt.getRecomposeCoroutineContext(controlledComposition), null, new androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2(recomposer, controlledComposition, null), 2, null);
                i4++;
                size2 = size2;
                recomposer = recomposer;
            }
            androidx.compose.runtime.Recomposer recomposer2 = recomposer;
            recomposer2.compositionInvalidations.clear();
            if (recomposer2.deriveStateLocked() != null) {
                java.lang.Object obj2 = this.this$0.stateLock;
                androidx.compose.runtime.Recomposer recomposer3 = this.this$0;
                synchronized (obj2) {
                    hasConcurrentFrameWorkLocked = recomposer3.getHasConcurrentFrameWorkLocked();
                    requestFrameLocked = hasConcurrentFrameWorkLocked ? produceFrameSignal.requestFrameLocked() : null;
                }
                if (requestFrameLocked != null) {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    requestFrameLocked.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE));
                }
                coroutineScope = coroutineScope3;
                shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
                if (!shouldKeepRecomposing) {
                    this.L$0 = coroutineScope;
                    this.L$1 = produceFrameSignal;
                    this.L$2 = launch$default;
                    this.label = 1;
                    awaitWorkAvailable = this.this$0.awaitWorkAvailable(this);
                    if (awaitWorkAvailable == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    kotlinx.coroutines.CoroutineScope coroutineScope32 = coroutineScope;
                    androidx.compose.runtime.Recomposer recomposer4 = this.this$0;
                    androidx.compose.runtime.collection.IdentityArraySet identityArraySet2 = recomposer4.snapshotInvalidations;
                    if (identityArraySet2.isNotEmpty()) {
                    }
                    java.util.List list2 = recomposer4.compositionInvalidations;
                    int size22 = list2.size();
                    int i42 = 0;
                    while (i42 < size22) {
                    }
                    androidx.compose.runtime.Recomposer recomposer22 = recomposer4;
                    recomposer22.compositionInvalidations.clear();
                    if (recomposer22.deriveStateLocked() != null) {
                        throw new java.lang.IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
                    }
                } else {
                    this.L$0 = launch$default;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 2;
                    if (kotlinx.coroutines.JobKt.cancelAndJoin(kotlinx.coroutines.JobKt.getJob(coroutineScope.getCoroutineContext()), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.L$0 = null;
                    this.label = 3;
                    if (kotlinx.coroutines.JobKt.cancelAndJoin(launch$default, this) == coroutine_suspended) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
        }
    }
}
