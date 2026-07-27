package androidx.compose.runtime;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* compiled from: Recomposer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "parentFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 1}, l = {592, IronSourceError.ERROR_BN_INSTANCE_INIT_EXCEPTION, IronSourceError.ERROR_BN_RELOAD_SKIP_INVISIBLE}, m = "invokeSuspend", n = {"recomposeCoroutineScope", "frameSignal", "frameLoop", "frameLoop"}, s = {"L$0", "L$1", "L$2", "L$0"})
/* loaded from: classes.dex */
final class Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 extends SuspendLambda implements Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoroutineContext $recomposeCoroutineContext;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(CoroutineContext coroutineContext, Recomposer recomposer, Continuation<? super Recomposer$runRecomposeConcurrentlyAndApplyChanges$2> continuation) {
        super(3, continuation);
        this.$recomposeCoroutineContext = coroutineContext;
        this.this$0 = recomposer;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(CoroutineScope coroutineScope, MonotonicFrameClock monotonicFrameClock, Continuation<? super Unit> continuation) {
        Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 recomposer$runRecomposeConcurrentlyAndApplyChanges$2 = new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(this.$recomposeCoroutineContext, this.this$0, continuation);
        recomposer$runRecomposeConcurrentlyAndApplyChanges$2.L$0 = coroutineScope;
        recomposer$runRecomposeConcurrentlyAndApplyChanges$2.L$1 = monotonicFrameClock;
        return recomposer$runRecomposeConcurrentlyAndApplyChanges$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0198 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ad -> B:17:0x0039). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Job launch$default;
        CoroutineScope coroutineScope;
        ProduceFrameSignal produceFrameSignal;
        boolean shouldKeepRecomposing;
        Object awaitWorkAvailable;
        boolean hasConcurrentFrameWorkLocked;
        Continuation<Unit> requestFrameLocked;
        int i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                launch$default = (Job) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = null;
                this.label = 3;
                if (JobKt.cancelAndJoin(launch$default, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            launch$default = (Job) this.L$2;
            produceFrameSignal = (ProduceFrameSignal) this.L$1;
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = coroutineScope;
            Object obj2 = this.this$0.stateLock;
            Recomposer recomposer = this.this$0;
            synchronized (obj2) {
                if (!recomposer.snapshotInvalidations.isEmpty()) {
                    List list = recomposer.snapshotInvalidations;
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        Set<? extends Object> set = (Set) list.get(i3);
                        List list2 = recomposer.knownCompositions;
                        int size2 = list2.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            ((ControlledComposition) list2.get(i4)).recordModificationsOf(set);
                        }
                    }
                    recomposer.snapshotInvalidations.clear();
                }
                List list3 = recomposer.compositionInvalidations;
                int size3 = list3.size();
                int i5 = 0;
                while (i5 < size3) {
                    ControlledComposition controlledComposition = (ControlledComposition) list3.get(i5);
                    i = recomposer.concurrentCompositionsOutstanding;
                    recomposer.concurrentCompositionsOutstanding = i + 1;
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, CompositionKt.getRecomposeCoroutineContext(controlledComposition), null, new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$1$1(recomposer, controlledComposition, null), 2, null);
                    i5++;
                    recomposer = recomposer;
                }
                Recomposer recomposer2 = recomposer;
                recomposer2.compositionInvalidations.clear();
                if (recomposer2.deriveStateLocked() == null) {
                    hasConcurrentFrameWorkLocked = recomposer2.getHasConcurrentFrameWorkLocked();
                    requestFrameLocked = hasConcurrentFrameWorkLocked ? produceFrameSignal.requestFrameLocked() : null;
                } else {
                    throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
                }
            }
            if (requestFrameLocked != null) {
                Result.Companion companion = Result.INSTANCE;
                requestFrameLocked.resumeWith(Result.m8079constructorimpl(Unit.INSTANCE));
            }
            coroutineScope = coroutineScope2;
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
                CoroutineScope coroutineScope22 = coroutineScope;
                Object obj22 = this.this$0.stateLock;
                Recomposer recomposer3 = this.this$0;
                synchronized (obj22) {
                }
            } else {
                this.L$0 = launch$default;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
                if (JobKt.cancelAndJoin(JobKt.getJob(coroutineScope.getCoroutineContext()), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.L$0 = null;
                this.label = 3;
                if (JobKt.cancelAndJoin(launch$default, this) == coroutine_suspended) {
                }
                return Unit.INSTANCE;
            }
        } else {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) this.L$1;
            boolean z = this.$recomposeCoroutineContext.get(Job.INSTANCE) == null;
            CoroutineContext coroutineContext = this.$recomposeCoroutineContext;
            if (!z) {
                throw new IllegalArgumentException(("recomposeCoroutineContext may not contain a Job; found " + coroutineContext.get(Job.INSTANCE)).toString());
            }
            CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(coroutineScope3.getCoroutineContext().plus(this.$recomposeCoroutineContext).plus(JobKt.Job(JobKt.getJob(coroutineScope3.getCoroutineContext()))));
            ProduceFrameSignal produceFrameSignal2 = new ProduceFrameSignal();
            launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1(this.this$0, monotonicFrameClock, produceFrameSignal2, null), 3, null);
            coroutineScope = CoroutineScope;
            produceFrameSignal = produceFrameSignal2;
            shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
            if (!shouldKeepRecomposing) {
            }
        }
    }
}
