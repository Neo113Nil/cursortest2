package androidx.compose.runtime;

/* compiled from: Recomposer.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "parentFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {540, 551}, m = "invokeSuspend", n = {"parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "alreadyComposed", "parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "alreadyComposed"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"})
/* loaded from: classes.dex */
final class Recomposer$runRecomposeAndApplyChanges$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    java.lang.Object L$6;
    java.lang.Object L$7;
    int label;
    final /* synthetic */ androidx.compose.runtime.Recomposer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Recomposer$runRecomposeAndApplyChanges$2(androidx.compose.runtime.Recomposer recomposer, kotlin.coroutines.Continuation<? super androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2> continuation) {
        super(3, continuation);
        this.this$0 = recomposer;
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2(this.this$0, continuation);
        recomposer$runRecomposeAndApplyChanges$2.L$0 = monotonicFrameClock;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0144  */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0126 -> B:6:0x0129). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0131 -> B:7:0x013f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        java.util.LinkedHashSet linkedHashSet;
        java.util.LinkedHashSet linkedHashSet2;
        androidx.compose.runtime.collection.IdentityArraySet identityArraySet;
        androidx.compose.runtime.collection.IdentityArraySet identityArraySet2;
        java.util.ArrayList arrayList4;
        java.util.ArrayList arrayList5;
        java.util.ArrayList arrayList6;
        java.util.LinkedHashSet linkedHashSet3;
        java.util.LinkedHashSet linkedHashSet4;
        androidx.compose.runtime.collection.IdentityArraySet identityArraySet3;
        boolean recordComposerModifications;
        boolean shouldKeepRecomposing;
        java.lang.Object awaitWorkAvailable;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            monotonicFrameClock = (androidx.compose.runtime.MonotonicFrameClock) this.L$0;
            arrayList = new java.util.ArrayList();
            arrayList2 = new java.util.ArrayList();
            arrayList3 = new java.util.ArrayList();
            linkedHashSet = new java.util.LinkedHashSet();
            linkedHashSet2 = new java.util.LinkedHashSet();
            identityArraySet = new androidx.compose.runtime.collection.IdentityArraySet();
            identityArraySet2 = new androidx.compose.runtime.collection.IdentityArraySet();
            shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
            if (!shouldKeepRecomposing) {
            }
        } else if (i == 1) {
            androidx.compose.runtime.collection.IdentityArraySet identityArraySet4 = (androidx.compose.runtime.collection.IdentityArraySet) this.L$7;
            androidx.compose.runtime.collection.IdentityArraySet identityArraySet5 = (androidx.compose.runtime.collection.IdentityArraySet) this.L$6;
            ?? r6 = (java.util.Set) this.L$5;
            ?? r7 = (java.util.Set) this.L$4;
            ?? r8 = (java.util.List) this.L$3;
            ?? r9 = (java.util.List) this.L$2;
            ?? r10 = (java.util.List) this.L$1;
            androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock2 = (androidx.compose.runtime.MonotonicFrameClock) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            linkedHashSet3 = r7;
            arrayList6 = r8;
            arrayList4 = r9;
            arrayList5 = r10;
            identityArraySet3 = identityArraySet4;
            identityArraySet = identityArraySet5;
            monotonicFrameClock = monotonicFrameClock2;
            linkedHashSet4 = r6;
            recordComposerModifications = this.this$0.recordComposerModifications();
            if (recordComposerModifications) {
            }
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.compose.runtime.collection.IdentityArraySet identityArraySet6 = (androidx.compose.runtime.collection.IdentityArraySet) this.L$7;
            androidx.compose.runtime.collection.IdentityArraySet identityArraySet7 = (androidx.compose.runtime.collection.IdentityArraySet) this.L$6;
            ?? r62 = (java.util.Set) this.L$5;
            ?? r72 = (java.util.Set) this.L$4;
            ?? r82 = (java.util.List) this.L$3;
            ?? r92 = (java.util.List) this.L$2;
            ?? r102 = (java.util.List) this.L$1;
            androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock3 = (androidx.compose.runtime.MonotonicFrameClock) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.ArrayList arrayList7 = r82;
            arrayList4 = r92;
            linkedHashSet2 = r62;
            linkedHashSet = r72;
            java.lang.Object obj2 = coroutine_suspended;
            identityArraySet2 = identityArraySet6;
            monotonicFrameClock = monotonicFrameClock3;
            identityArraySet = identityArraySet7;
            arrayList = r102;
            this.this$0.discardUnusedValues();
            arrayList3 = arrayList7;
            coroutine_suspended = obj2;
            arrayList2 = arrayList4;
            i2 = 1;
            shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
            if (!shouldKeepRecomposing) {
                this.L$0 = monotonicFrameClock;
                this.L$1 = arrayList;
                this.L$2 = arrayList2;
                this.L$3 = arrayList3;
                this.L$4 = linkedHashSet;
                this.L$5 = linkedHashSet2;
                this.L$6 = identityArraySet;
                this.L$7 = identityArraySet2;
                this.label = i2;
                awaitWorkAvailable = this.this$0.awaitWorkAvailable(this);
                if (awaitWorkAvailable == coroutine_suspended) {
                    return coroutine_suspended;
                }
                arrayList5 = arrayList;
                arrayList4 = arrayList2;
                arrayList6 = arrayList3;
                linkedHashSet3 = linkedHashSet;
                androidx.compose.runtime.collection.IdentityArraySet identityArraySet8 = identityArraySet2;
                linkedHashSet4 = linkedHashSet2;
                identityArraySet3 = identityArraySet8;
                recordComposerModifications = this.this$0.recordComposerModifications();
                if (recordComposerModifications) {
                    java.util.LinkedHashSet linkedHashSet5 = linkedHashSet4;
                    identityArraySet2 = identityArraySet3;
                    linkedHashSet2 = linkedHashSet5;
                    linkedHashSet = linkedHashSet3;
                    arrayList3 = arrayList6;
                    coroutine_suspended = coroutine_suspended;
                    arrayList = arrayList5;
                    arrayList2 = arrayList4;
                    i2 = 1;
                    shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
                    if (!shouldKeepRecomposing) {
                    }
                } else {
                    final androidx.compose.runtime.Recomposer recomposer = this.this$0;
                    final androidx.compose.runtime.collection.IdentityArraySet identityArraySet9 = identityArraySet;
                    final androidx.compose.runtime.collection.IdentityArraySet identityArraySet10 = identityArraySet3;
                    androidx.compose.runtime.collection.IdentityArraySet identityArraySet11 = identityArraySet3;
                    final java.util.ArrayList arrayList8 = arrayList5;
                    androidx.compose.runtime.collection.IdentityArraySet identityArraySet12 = identityArraySet;
                    final java.util.ArrayList arrayList9 = arrayList4;
                    final java.util.LinkedHashSet linkedHashSet6 = linkedHashSet4;
                    final java.util.LinkedHashSet linkedHashSet7 = linkedHashSet3;
                    java.lang.Object obj3 = coroutine_suspended;
                    java.util.LinkedHashSet linkedHashSet8 = linkedHashSet3;
                    final java.util.ArrayList arrayList10 = arrayList6;
                    arrayList7 = arrayList6;
                    this.L$0 = monotonicFrameClock;
                    this.L$1 = arrayList5;
                    this.L$2 = arrayList4;
                    this.L$3 = arrayList7;
                    this.L$4 = linkedHashSet8;
                    linkedHashSet2 = linkedHashSet6;
                    this.L$5 = linkedHashSet2;
                    this.L$6 = identityArraySet12;
                    identityArraySet2 = identityArraySet11;
                    this.L$7 = identityArraySet2;
                    this.label = 2;
                    java.lang.Object withFrameNanos = monotonicFrameClock.withFrameNanos(new kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit>() { // from class: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Long l) {
                            invoke(l.longValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(long j) {
                            boolean hasBroadcastFrameClockAwaiters;
                            java.lang.Object beginSection;
                            java.util.List performInsertValues;
                            androidx.compose.runtime.ControlledComposition performRecompose;
                            androidx.compose.runtime.BroadcastFrameClock broadcastFrameClock;
                            hasBroadcastFrameClockAwaiters = androidx.compose.runtime.Recomposer.this.getHasBroadcastFrameClockAwaiters();
                            if (hasBroadcastFrameClockAwaiters) {
                                androidx.compose.runtime.Recomposer recomposer2 = androidx.compose.runtime.Recomposer.this;
                                beginSection = androidx.compose.runtime.Trace.INSTANCE.beginSection("Recomposer:animation");
                                try {
                                    broadcastFrameClock = recomposer2.broadcastFrameClock;
                                    broadcastFrameClock.sendFrame(j);
                                    androidx.compose.runtime.snapshots.Snapshot.INSTANCE.sendApplyNotifications();
                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                } finally {
                                }
                            }
                            androidx.compose.runtime.Recomposer recomposer3 = androidx.compose.runtime.Recomposer.this;
                            androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object> identityArraySet13 = identityArraySet9;
                            androidx.compose.runtime.collection.IdentityArraySet<androidx.compose.runtime.ControlledComposition> identityArraySet14 = identityArraySet10;
                            java.util.List<androidx.compose.runtime.ControlledComposition> list = arrayList8;
                            java.util.List<androidx.compose.runtime.MovableContentStateReference> list2 = arrayList9;
                            java.util.Set<androidx.compose.runtime.ControlledComposition> set = linkedHashSet7;
                            java.util.List<androidx.compose.runtime.ControlledComposition> list3 = arrayList10;
                            java.util.Set<androidx.compose.runtime.ControlledComposition> set2 = linkedHashSet6;
                            beginSection = androidx.compose.runtime.Trace.INSTANCE.beginSection("Recomposer:recompose");
                            try {
                                recomposer3.recordComposerModifications();
                                synchronized (recomposer3.stateLock) {
                                    java.util.List list4 = recomposer3.compositionInvalidations;
                                    int size = list4.size();
                                    for (int i3 = 0; i3 < size; i3++) {
                                        list.add((androidx.compose.runtime.ControlledComposition) list4.get(i3));
                                    }
                                    recomposer3.compositionInvalidations.clear();
                                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                }
                                identityArraySet13.clear();
                                identityArraySet14.clear();
                                while (true) {
                                    if (!(!list.isEmpty()) && !(!list2.isEmpty())) {
                                        break;
                                    }
                                    try {
                                        try {
                                            int size2 = list.size();
                                            for (int i4 = 0; i4 < size2; i4++) {
                                                androidx.compose.runtime.ControlledComposition controlledComposition = list.get(i4);
                                                identityArraySet14.add(controlledComposition);
                                                performRecompose = recomposer3.performRecompose(controlledComposition, identityArraySet13);
                                                if (performRecompose != null) {
                                                    list3.add(performRecompose);
                                                }
                                            }
                                            list.clear();
                                            if (identityArraySet13.isNotEmpty()) {
                                                synchronized (recomposer3.stateLock) {
                                                    java.util.List knownCompositions = recomposer3.getKnownCompositions();
                                                    int size3 = knownCompositions.size();
                                                    for (int i5 = 0; i5 < size3; i5++) {
                                                        androidx.compose.runtime.ControlledComposition controlledComposition2 = (androidx.compose.runtime.ControlledComposition) knownCompositions.get(i5);
                                                        if (!identityArraySet14.contains(controlledComposition2) && controlledComposition2.observesAnyOf(identityArraySet13)) {
                                                            list.add(controlledComposition2);
                                                        }
                                                    }
                                                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                                                }
                                            }
                                            if (list.isEmpty()) {
                                                try {
                                                    androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$fillToInsert(list2, recomposer3);
                                                    while (!list2.isEmpty()) {
                                                        performInsertValues = recomposer3.performInsertValues(list2, identityArraySet13);
                                                        kotlin.collections.CollectionsKt.addAll(set, performInsertValues);
                                                        androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$fillToInsert(list2, recomposer3);
                                                    }
                                                } catch (java.lang.Exception e) {
                                                    androidx.compose.runtime.Recomposer.processCompositionError$default(recomposer3, e, null, true, 2, null);
                                                    androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2, identityArraySet13, identityArraySet14);
                                                    return;
                                                }
                                            }
                                        } catch (java.lang.Exception e2) {
                                            androidx.compose.runtime.Recomposer.processCompositionError$default(recomposer3, e2, null, true, 2, null);
                                            androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2, identityArraySet13, identityArraySet14);
                                            list.clear();
                                            return;
                                        }
                                    } catch (java.lang.Throwable th) {
                                        list.clear();
                                        throw th;
                                    }
                                }
                                if (!list3.isEmpty()) {
                                    recomposer3.changeCount = recomposer3.getChangeCount() + 1;
                                    try {
                                        int size4 = list3.size();
                                        for (int i6 = 0; i6 < size4; i6++) {
                                            set2.add(list3.get(i6));
                                        }
                                        int size5 = list3.size();
                                        for (int i7 = 0; i7 < size5; i7++) {
                                            list3.get(i7).applyChanges();
                                        }
                                    } catch (java.lang.Exception e3) {
                                        androidx.compose.runtime.Recomposer.processCompositionError$default(recomposer3, e3, null, false, 6, null);
                                        androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2, identityArraySet13, identityArraySet14);
                                        return;
                                    } finally {
                                        list3.clear();
                                    }
                                }
                                try {
                                    if (!set.isEmpty()) {
                                        try {
                                            kotlin.collections.CollectionsKt.addAll(set2, set);
                                            java.util.Iterator<T> it = set.iterator();
                                            while (it.hasNext()) {
                                                ((androidx.compose.runtime.ControlledComposition) it.next()).applyLateChanges();
                                            }
                                        } catch (java.lang.Exception e4) {
                                            androidx.compose.runtime.Recomposer.processCompositionError$default(recomposer3, e4, null, false, 6, null);
                                            androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2, identityArraySet13, identityArraySet14);
                                            set.clear();
                                            return;
                                        }
                                    }
                                    try {
                                        if (!set2.isEmpty()) {
                                            try {
                                                java.util.Iterator<T> it2 = set2.iterator();
                                                while (it2.hasNext()) {
                                                    ((androidx.compose.runtime.ControlledComposition) it2.next()).changesApplied();
                                                }
                                            } catch (java.lang.Exception e5) {
                                                androidx.compose.runtime.Recomposer.processCompositionError$default(recomposer3, e5, null, false, 6, null);
                                                androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend$clearRecompositionState(list, list2, list3, set, set2, identityArraySet13, identityArraySet14);
                                                set2.clear();
                                                return;
                                            }
                                        }
                                        synchronized (recomposer3.stateLock) {
                                            recomposer3.deriveStateLocked();
                                        }
                                        androidx.compose.runtime.snapshots.Snapshot.INSTANCE.notifyObjectsInitialized();
                                        identityArraySet14.clear();
                                        identityArraySet13.clear();
                                        recomposer3.compositionsRemoved = null;
                                        kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                                    } finally {
                                        set2.clear();
                                    }
                                } finally {
                                    set.clear();
                                }
                            } finally {
                            }
                        }
                    }, this);
                    obj2 = obj3;
                    if (withFrameNanos == obj2) {
                        return obj2;
                    }
                    linkedHashSet = linkedHashSet8;
                    identityArraySet = identityArraySet12;
                    arrayList = arrayList5;
                    this.this$0.discardUnusedValues();
                    arrayList3 = arrayList7;
                    coroutine_suspended = obj2;
                    arrayList2 = arrayList4;
                    i2 = 1;
                    shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
                    if (!shouldKeepRecomposing) {
                        return kotlin.Unit.INSTANCE;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$clearRecompositionState(java.util.List<androidx.compose.runtime.ControlledComposition> list, java.util.List<androidx.compose.runtime.MovableContentStateReference> list2, java.util.List<androidx.compose.runtime.ControlledComposition> list3, java.util.Set<androidx.compose.runtime.ControlledComposition> set, java.util.Set<androidx.compose.runtime.ControlledComposition> set2, androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object> identityArraySet, androidx.compose.runtime.collection.IdentityArraySet<androidx.compose.runtime.ControlledComposition> identityArraySet2) {
        list.clear();
        list2.clear();
        list3.clear();
        set.clear();
        set2.clear();
        identityArraySet.clear();
        identityArraySet2.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$fillToInsert(java.util.List<androidx.compose.runtime.MovableContentStateReference> list, androidx.compose.runtime.Recomposer recomposer) {
        java.util.List list2;
        java.util.List list3;
        list.clear();
        synchronized (recomposer.stateLock) {
            list2 = recomposer.compositionValuesAwaitingInsert;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                list.add((androidx.compose.runtime.MovableContentStateReference) list2.get(i));
            }
            list3 = recomposer.compositionValuesAwaitingInsert;
            list3.clear();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
