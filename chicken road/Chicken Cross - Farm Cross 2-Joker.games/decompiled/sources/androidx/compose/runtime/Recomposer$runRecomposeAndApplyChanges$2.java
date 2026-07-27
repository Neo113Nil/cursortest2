package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Recomposer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "parentFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {436, 454}, m = "invokeSuspend", n = {"parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
/* loaded from: classes.dex */
final class Recomposer$runRecomposeAndApplyChanges$2 extends SuspendLambda implements Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, Continuation<? super Recomposer$runRecomposeAndApplyChanges$2> continuation) {
        super(3, continuation);
        this.this$0 = recomposer;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(CoroutineScope coroutineScope, MonotonicFrameClock monotonicFrameClock, Continuation<? super Unit> continuation) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.this$0, continuation);
        recomposer$runRecomposeAndApplyChanges$2.L$0 = monotonicFrameClock;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        r5 = r12;
        r6 = r13;
        r7 = r14;
        r8 = r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MonotonicFrameClock monotonicFrameClock;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2;
        LinkedHashSet linkedHashSet3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        LinkedHashSet linkedHashSet4;
        Object obj2;
        boolean hasFrameWorkLocked;
        boolean z;
        boolean hasFrameWorkLocked2;
        boolean shouldKeepRecomposing;
        Object awaitWorkAvailable;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            monotonicFrameClock = (MonotonicFrameClock) this.L$0;
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            arrayList3 = new ArrayList();
            linkedHashSet = new LinkedHashSet();
            linkedHashSet2 = new LinkedHashSet();
        } else if (i == 1) {
            ?? r2 = (Set) this.L$5;
            ?? r5 = (Set) this.L$4;
            ?? r6 = (List) this.L$3;
            ?? r7 = (List) this.L$2;
            ?? r8 = (List) this.L$1;
            MonotonicFrameClock monotonicFrameClock2 = (MonotonicFrameClock) this.L$0;
            ResultKt.throwOnFailure(obj);
            linkedHashSet4 = r2;
            linkedHashSet3 = r5;
            arrayList4 = r6;
            arrayList5 = r7;
            arrayList6 = r8;
            monotonicFrameClock = monotonicFrameClock2;
            obj2 = this.this$0.stateLock;
            Recomposer recomposer = this.this$0;
            synchronized (obj2) {
                hasFrameWorkLocked = recomposer.getHasFrameWorkLocked();
                z = false;
                if (!hasFrameWorkLocked) {
                    recomposer.recordComposerModificationsLocked();
                    hasFrameWorkLocked2 = recomposer.getHasFrameWorkLocked();
                    if (!hasFrameWorkLocked2) {
                        z = true;
                    }
                }
            }
            if (z) {
                linkedHashSet2 = linkedHashSet4;
                arrayList = arrayList6;
                arrayList2 = arrayList5;
                arrayList3 = arrayList4;
                linkedHashSet = linkedHashSet3;
            } else {
                final Recomposer recomposer2 = this.this$0;
                final ArrayList arrayList7 = arrayList6;
                final ArrayList arrayList8 = arrayList5;
                final LinkedHashSet linkedHashSet5 = linkedHashSet3;
                final LinkedHashSet linkedHashSet6 = linkedHashSet4;
                final ArrayList arrayList9 = arrayList4;
                this.L$0 = monotonicFrameClock;
                this.L$1 = arrayList6;
                this.L$2 = arrayList5;
                this.L$3 = arrayList4;
                this.L$4 = linkedHashSet3;
                linkedHashSet2 = linkedHashSet6;
                this.L$5 = linkedHashSet2;
                this.label = 2;
                if (monotonicFrameClock.withFrameNanos(new Function1<Long, CancellableContinuation<? super Unit>>() { // from class: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ CancellableContinuation<? super Unit> invoke(Long l) {
                        return invoke(l.longValue());
                    }

                    public final CancellableContinuation<Unit> invoke(long j) {
                        BroadcastFrameClock broadcastFrameClock;
                        Object beginSection;
                        List performInsertValues;
                        ControlledComposition performRecompose;
                        CancellableContinuation<Unit> deriveStateLocked;
                        BroadcastFrameClock broadcastFrameClock2;
                        broadcastFrameClock = Recomposer.this.broadcastFrameClock;
                        if (broadcastFrameClock.getHasAwaiters()) {
                            Recomposer recomposer3 = Recomposer.this;
                            beginSection = Trace.INSTANCE.beginSection("Recomposer:animation");
                            try {
                                broadcastFrameClock2 = recomposer3.broadcastFrameClock;
                                broadcastFrameClock2.sendFrame(j);
                                Snapshot.INSTANCE.sendApplyNotifications();
                                Unit unit = Unit.INSTANCE;
                            } finally {
                            }
                        }
                        Recomposer recomposer4 = Recomposer.this;
                        List<ControlledComposition> list = arrayList7;
                        List<MovableContentStateReference> list2 = arrayList8;
                        Set<ControlledComposition> set = linkedHashSet5;
                        List<ControlledComposition> list3 = arrayList9;
                        Set<ControlledComposition> set2 = linkedHashSet6;
                        beginSection = Trace.INSTANCE.beginSection("Recomposer:recompose");
                        try {
                            synchronized (recomposer4.stateLock) {
                                recomposer4.recordComposerModificationsLocked();
                                List list4 = recomposer4.compositionInvalidations;
                                int size = list4.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    list.add((ControlledComposition) list4.get(i2));
                                }
                                recomposer4.compositionInvalidations.clear();
                                Unit unit2 = Unit.INSTANCE;
                            }
                            IdentityArraySet identityArraySet = new IdentityArraySet();
                            IdentityArraySet identityArraySet2 = new IdentityArraySet();
                            while (true) {
                                if (list.isEmpty() && list2.isEmpty()) {
                                    break;
                                }
                                try {
                                    int size2 = list.size();
                                    for (int i3 = 0; i3 < size2; i3++) {
                                        ControlledComposition controlledComposition = list.get(i3);
                                        identityArraySet2.add(controlledComposition);
                                        performRecompose = recomposer4.performRecompose(controlledComposition, identityArraySet);
                                        if (performRecompose != null) {
                                            list3.add(performRecompose);
                                        }
                                    }
                                    list.clear();
                                    if (identityArraySet.isNotEmpty()) {
                                        synchronized (recomposer4.stateLock) {
                                            List list5 = recomposer4.knownCompositions;
                                            int size3 = list5.size();
                                            for (int i4 = 0; i4 < size3; i4++) {
                                                ControlledComposition controlledComposition2 = (ControlledComposition) list5.get(i4);
                                                if (!identityArraySet2.contains(controlledComposition2) && controlledComposition2.observesAnyOf(identityArraySet)) {
                                                    list.add(controlledComposition2);
                                                }
                                            }
                                            Unit unit3 = Unit.INSTANCE;
                                        }
                                    }
                                    if (list.isEmpty()) {
                                        Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$fillToInsert(list2, recomposer4);
                                        while (!list2.isEmpty()) {
                                            performInsertValues = recomposer4.performInsertValues(list2, identityArraySet);
                                            CollectionsKt.addAll(set, performInsertValues);
                                            Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$fillToInsert(list2, recomposer4);
                                        }
                                    }
                                } catch (Throwable th) {
                                    list.clear();
                                    throw th;
                                }
                            }
                            if (!list3.isEmpty()) {
                                recomposer4.changeCount = recomposer4.getChangeCount() + 1;
                                try {
                                    CollectionsKt.addAll(set2, list3);
                                    int size4 = list3.size();
                                    for (int i5 = 0; i5 < size4; i5++) {
                                        list3.get(i5).applyChanges();
                                    }
                                    list3.clear();
                                } catch (Throwable th2) {
                                    list3.clear();
                                    throw th2;
                                }
                            }
                            if (!set.isEmpty()) {
                                try {
                                    CollectionsKt.addAll(set2, set);
                                    Iterator<T> it = set.iterator();
                                    while (it.hasNext()) {
                                        ((ControlledComposition) it.next()).applyLateChanges();
                                    }
                                    set.clear();
                                } catch (Throwable th3) {
                                    set.clear();
                                    throw th3;
                                }
                            }
                            if (!set2.isEmpty()) {
                                try {
                                    Iterator<T> it2 = set2.iterator();
                                    while (it2.hasNext()) {
                                        ((ControlledComposition) it2.next()).changesApplied();
                                    }
                                    set2.clear();
                                } catch (Throwable th4) {
                                    set2.clear();
                                    throw th4;
                                }
                            }
                            recomposer4.discardUnusedValues();
                            synchronized (recomposer4.stateLock) {
                                deriveStateLocked = recomposer4.deriveStateLocked();
                            }
                            return deriveStateLocked;
                        } finally {
                        }
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                arrayList = arrayList6;
                arrayList2 = arrayList5;
                arrayList3 = arrayList4;
                linkedHashSet = linkedHashSet3;
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ?? r22 = (Set) this.L$5;
            ?? r52 = (Set) this.L$4;
            ?? r62 = (List) this.L$3;
            ?? r72 = (List) this.L$2;
            ?? r82 = (List) this.L$1;
            MonotonicFrameClock monotonicFrameClock3 = (MonotonicFrameClock) this.L$0;
            ResultKt.throwOnFailure(obj);
            linkedHashSet2 = r22;
            monotonicFrameClock = monotonicFrameClock3;
            linkedHashSet = r52;
            arrayList = r82;
            arrayList3 = r62;
            arrayList2 = r72;
        }
        shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
        if (shouldKeepRecomposing) {
            this.L$0 = monotonicFrameClock;
            this.L$1 = arrayList;
            this.L$2 = arrayList2;
            this.L$3 = arrayList3;
            this.L$4 = linkedHashSet;
            this.L$5 = linkedHashSet2;
            this.label = 1;
            awaitWorkAvailable = this.this$0.awaitWorkAvailable(this);
            if (awaitWorkAvailable == coroutine_suspended) {
                return coroutine_suspended;
            }
            arrayList6 = arrayList;
            arrayList5 = arrayList2;
            arrayList4 = arrayList3;
            linkedHashSet3 = linkedHashSet;
            linkedHashSet4 = linkedHashSet2;
            obj2 = this.this$0.stateLock;
            Recomposer recomposer3 = this.this$0;
            synchronized (obj2) {
            }
        } else {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer) {
        List list2;
        List list3;
        list.clear();
        synchronized (recomposer.stateLock) {
            list2 = recomposer.compositionValuesAwaitingInsert;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                list.add((MovableContentStateReference) list2.get(i));
            }
            list3 = recomposer.compositionValuesAwaitingInsert;
            list3.clear();
            Unit unit = Unit.INSTANCE;
        }
    }
}
