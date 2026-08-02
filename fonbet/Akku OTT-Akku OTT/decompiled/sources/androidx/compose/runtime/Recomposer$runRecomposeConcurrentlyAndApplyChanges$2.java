package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.C1124z0;
import kotlinx.coroutines.InterfaceC1120x0;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/K;", "Landroidx/compose/runtime/MonotonicFrameClock;", "parentFrameClock", "", "<anonymous>", "(Lkotlinx/coroutines/K;Landroidx/compose/runtime/MonotonicFrameClock;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 1}, l = {999, 1019, 1020}, m = "invokeSuspend", n = {"recomposeCoroutineScope", "frameSignal", "frameLoop", "frameLoop"}, s = {"L$0", "L$1", "L$2", "L$0"})
@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 3 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n+ 4 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1894:1\n34#2,4:1895\n496#3:1899\n497#3,5:1901\n495#3,9:1906\n504#3,2:1918\n507#3:1921\n508#3,7:1931\n33#4:1900\n33#4:1927\n33#4:1938\n34#5,3:1915\n38#5:1920\n424#6,5:1922\n429#6,3:1928\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2\n*L\n990#1:1895,4\n1002#1:1899\n1002#1:1901,5\n1002#1:1906,9\n1002#1:1918,2\n1002#1:1921\n1002#1:1931,7\n1002#1:1900\n1003#1:1927\n1014#1:1938\n1002#1:1915,3\n1002#1:1920\n1002#1:1922,5\n1002#1:1928,3\n*E\n"})
/* loaded from: classes.dex */
public final class Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 extends SuspendLambda implements Function3<kotlinx.coroutines.K, MonotonicFrameClock, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoroutineContext $recomposeCoroutineContext;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(CoroutineContext coroutineContext, Recomposer recomposer, Continuation<? super Recomposer$runRecomposeConcurrentlyAndApplyChanges$2> continuation) {
        super(3, continuation);
        this.$recomposeCoroutineContext = coroutineContext;
        this.this$0 = recomposer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0198, code lost:
    
        if (com.google.common.base.r.c(r2, r17) == r0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b3, code lost:
    
        if (r10 == r0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x018d, code lost:
    
        if (com.google.common.base.r.c(r5, r17) == r0) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0179  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x00b3 -> B:17:0x00b7). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.K a;
        InterfaceC1120x0 c;
        ProduceFrameSignal produceFrameSignal;
        boolean shouldKeepRecomposing;
        Object awaitWorkAvailable;
        MutableScatterSet mutableScatterSet;
        boolean hasConcurrentFrameWorkLocked;
        Continuation<Unit> requestFrameLocked;
        int i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        int i3 = 0;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.K k = (kotlinx.coroutines.K) this.L$0;
            MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) this.L$1;
            CoroutineContext coroutineContext = this.$recomposeCoroutineContext;
            InterfaceC1120x0.a aVar = InterfaceC1120x0.a.a;
            boolean z = coroutineContext.get(aVar) == null;
            CoroutineContext coroutineContext2 = this.$recomposeCoroutineContext;
            if (!z) {
                PreconditionsKt.throwIllegalArgumentException("recomposeCoroutineContext may not contain a Job; found " + coroutineContext2.get(aVar));
            }
            a = kotlinx.coroutines.L.a(k.getCoroutineContext().plus(this.$recomposeCoroutineContext).plus(new C1124z0(com.google.common.base.r.e(k.getCoroutineContext()))));
            ProduceFrameSignal produceFrameSignal2 = new ProduceFrameSignal();
            c = C1082i.c(k, null, null, new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1(this.this$0, monotonicFrameClock, produceFrameSignal2, null), 3);
            produceFrameSignal = produceFrameSignal2;
            shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
            if (shouldKeepRecomposing) {
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            c = (InterfaceC1120x0) this.L$2;
            produceFrameSignal = (ProduceFrameSignal) this.L$1;
            a = (kotlinx.coroutines.K) this.L$0;
            ResultKt.throwOnFailure(obj);
            Recomposer recomposer = this.this$0;
            synchronized (recomposer.stateLock) {
                mutableScatterSet = recomposer.snapshotInvalidations;
                if (mutableScatterSet.isNotEmpty()) {
                    recomposer.snapshotInvalidations = new MutableScatterSet(i3, 1, null);
                }
            }
            Set<? extends Object> wrapIntoSet = ScatterSetWrapperKt.wrapIntoSet(mutableScatterSet);
            if (!wrapIntoSet.isEmpty()) {
                List knownCompositionsLocked = recomposer.knownCompositionsLocked();
                int size = knownCompositionsLocked.size();
                for (int i4 = i3; i4 < size; i4++) {
                    ((ControlledComposition) knownCompositionsLocked.get(i4)).recordModificationsOf(wrapIntoSet);
                }
            }
            MutableVector mutableVector = recomposer.compositionInvalidations;
            Object[] objArr = mutableVector.content;
            int size2 = mutableVector.getSize();
            for (int i5 = i3; i5 < size2; i5++) {
                ControlledComposition controlledComposition = (ControlledComposition) objArr[i5];
                synchronized (recomposer.stateLock) {
                    i = recomposer.concurrentCompositionsOutstanding;
                    recomposer.concurrentCompositionsOutstanding = i + 1;
                }
                C1082i.c(a, CompositionKt.getRecomposeCoroutineContext(controlledComposition), null, new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2(recomposer, controlledComposition, null), 2);
            }
            recomposer.compositionInvalidations.clear();
            synchronized (recomposer.stateLock) {
                if (recomposer.deriveStateLocked() != null) {
                    throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                }
                Unit unit = Unit.INSTANCE;
            }
            Object obj2 = this.this$0.stateLock;
            Recomposer recomposer2 = this.this$0;
            synchronized (obj2) {
                hasConcurrentFrameWorkLocked = recomposer2.getHasConcurrentFrameWorkLocked();
                requestFrameLocked = hasConcurrentFrameWorkLocked ? produceFrameSignal.requestFrameLocked() : null;
            }
            if (requestFrameLocked != null) {
                Result.Companion companion = Result.INSTANCE;
                requestFrameLocked.resumeWith(Result.m1716constructorimpl(Unit.INSTANCE));
            }
            i3 = 0;
            shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
            if (shouldKeepRecomposing) {
                InterfaceC1120x0 e = com.google.common.base.r.e(a.getCoroutineContext());
                this.L$0 = c;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
            } else {
                Recomposer recomposer3 = this.this$0;
                this.L$0 = a;
                this.L$1 = produceFrameSignal;
                this.L$2 = c;
                this.label = 1;
                awaitWorkAvailable = recomposer3.awaitWorkAvailable(this);
            }
            return coroutine_suspended;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        c = (InterfaceC1120x0) this.L$0;
        ResultKt.throwOnFailure(obj);
        this.L$0 = null;
        this.label = 3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(kotlinx.coroutines.K k, MonotonicFrameClock monotonicFrameClock, Continuation<? super Unit> continuation) {
        Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 recomposer$runRecomposeConcurrentlyAndApplyChanges$2 = new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(this.$recomposeCoroutineContext, this.this$0, continuation);
        recomposer$runRecomposeConcurrentlyAndApplyChanges$2.L$0 = k;
        recomposer$runRecomposeConcurrentlyAndApplyChanges$2.L$1 = monotonicFrameClock;
        return recomposer$runRecomposeConcurrentlyAndApplyChanges$2.invokeSuspend(Unit.INSTANCE);
    }
}
