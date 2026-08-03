package androidx.compose.runtime;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: SnapshotFlow.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {144, 148, 170}, m = "invokeSuspend", n = {"$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "found", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
/* loaded from: classes.dex */
final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<T> $block;
    int I$0;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(kotlin.jvm.functions.Function0<? extends T> function0, kotlin.coroutines.Continuation<? super androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1> continuation) {
        super(2, continuation);
        this.$block = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 snapshotStateKt__SnapshotFlowKt$snapshotFlow$1 = new androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(this.$block, continuation);
        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$snapshotFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00eb A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:14:0x00e7, B:16:0x00eb, B:20:0x00f5, B:24:0x0103, B:30:0x0119, B:32:0x0122, B:42:0x0140, B:43:0x0143, B:56:0x004d, B:26:0x010e, B:29:0x0116, B:38:0x013b, B:39:0x013e), top: B:55:0x004d, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0103 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #1 {all -> 0x0052, blocks: (B:14:0x00e7, B:16:0x00eb, B:20:0x00f5, B:24:0x0103, B:30:0x0119, B:32:0x0122, B:42:0x0140, B:43:0x0143, B:56:0x004d, B:26:0x010e, B:29:0x0116, B:38:0x013b, B:39:0x013e), top: B:55:0x004d, inners: #5 }] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v5 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.runtime.snapshots.ObserverHandle observerHandle;
        ?? r10;
        final androidx.collection.MutableScatterSet mutableScatterSet;
        kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function1;
        final kotlinx.coroutines.channels.Channel Channel$default;
        java.lang.Object invoke;
        androidx.compose.runtime.snapshots.ObserverHandle observerHandle2;
        ?? r11;
        androidx.collection.MutableScatterSet mutableScatterSet2;
        kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function12;
        kotlinx.coroutines.channels.Channel channel;
        java.lang.Object obj2;
        int i;
        java.util.Set set;
        boolean intersects$SnapshotStateKt__SnapshotFlowKt;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    invoke = this.L$5;
                    observerHandle = (androidx.compose.runtime.snapshots.ObserverHandle) this.L$4;
                    Channel$default = (kotlinx.coroutines.channels.Channel) this.L$3;
                    function1 = (kotlin.jvm.functions.Function1) this.L$2;
                    mutableScatterSet = (androidx.collection.MutableScatterSet) this.L$1;
                    r10 = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
                } else if (i2 == 2) {
                    i = this.I$0;
                    obj2 = this.L$5;
                    observerHandle2 = (androidx.compose.runtime.snapshots.ObserverHandle) this.L$4;
                    channel = (kotlinx.coroutines.channels.Channel) this.L$3;
                    function12 = (kotlin.jvm.functions.Function1) this.L$2;
                    mutableScatterSet2 = (androidx.collection.MutableScatterSet) this.L$1;
                    kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        r11 = flowCollector;
                        set = (java.util.Set) obj;
                        do {
                            if (i == 0) {
                                intersects$SnapshotStateKt__SnapshotFlowKt = androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.intersects$SnapshotStateKt__SnapshotFlowKt(mutableScatterSet2, set);
                                if (!intersects$SnapshotStateKt__SnapshotFlowKt) {
                                    i = 0;
                                    set = (java.util.Set) kotlinx.coroutines.channels.ChannelResult.m12323getOrNullimpl(channel.mo12311tryReceivePtdJZtk());
                                }
                            }
                            i = 1;
                            set = (java.util.Set) kotlinx.coroutines.channels.ChannelResult.m12323getOrNullimpl(channel.mo12311tryReceivePtdJZtk());
                        } while (set != null);
                        if (i != 0) {
                            mutableScatterSet2.clear();
                            androidx.compose.runtime.snapshots.Snapshot takeSnapshot = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.takeSnapshot(function12);
                            kotlin.jvm.functions.Function0<T> function0 = this.$block;
                            try {
                                try {
                                    invoke = function0.invoke();
                                    takeSnapshot.dispose();
                                    if (!kotlin.jvm.internal.Intrinsics.areEqual(invoke, obj2)) {
                                        this.L$0 = r11;
                                        this.L$1 = mutableScatterSet2;
                                        this.L$2 = function12;
                                        this.L$3 = channel;
                                        this.L$4 = observerHandle2;
                                        this.L$5 = invoke;
                                        this.label = 3;
                                        if (r11.emit(invoke, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        observerHandle = observerHandle2;
                                        Channel$default = channel;
                                        function1 = function12;
                                        mutableScatterSet = mutableScatterSet2;
                                        r10 = r11;
                                    }
                                } finally {
                                }
                                androidx.compose.runtime.snapshots.Snapshot makeCurrent = takeSnapshot.makeCurrent();
                            } finally {
                            }
                        }
                        invoke = obj2;
                        observerHandle = observerHandle2;
                        Channel$default = channel;
                        function1 = function12;
                        mutableScatterSet = mutableScatterSet2;
                        r10 = r11;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        observerHandle = observerHandle2;
                        observerHandle.dispose();
                        throw th;
                    }
                } else {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    invoke = this.L$5;
                    observerHandle = (androidx.compose.runtime.snapshots.ObserverHandle) this.L$4;
                    Channel$default = (kotlinx.coroutines.channels.Channel) this.L$3;
                    function1 = (kotlin.jvm.functions.Function1) this.L$2;
                    mutableScatterSet = (androidx.collection.MutableScatterSet) this.L$1;
                    r10 = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
                }
                kotlin.ResultKt.throwOnFailure(obj);
            } else {
                kotlin.ResultKt.throwOnFailure(obj);
                r10 = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
                mutableScatterSet = new androidx.collection.MutableScatterSet(0, 1, null);
                function1 = new kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit>() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj3) {
                        invoke2(obj3);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(java.lang.Object obj3) {
                        if (obj3 instanceof androidx.compose.runtime.snapshots.StateObjectImpl) {
                            androidx.compose.runtime.snapshots.ReaderKind.Companion companion = androidx.compose.runtime.snapshots.ReaderKind.INSTANCE;
                            ((androidx.compose.runtime.snapshots.StateObjectImpl) obj3).m1747recordReadInh_f27i8$runtime_release(androidx.compose.runtime.snapshots.ReaderKind.m1734constructorimpl(4));
                        }
                        mutableScatterSet.add(obj3);
                    }
                };
                Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
                observerHandle = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.registerApplyObserver(new kotlin.jvm.functions.Function2<java.util.Set<? extends java.lang.Object>, androidx.compose.runtime.snapshots.Snapshot, kotlin.Unit>() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.util.Set<? extends java.lang.Object> set2, androidx.compose.runtime.snapshots.Snapshot snapshot) {
                        invoke2(set2, snapshot);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(java.util.Set<? extends java.lang.Object> set2, androidx.compose.runtime.snapshots.Snapshot snapshot) {
                        java.util.Set<? extends java.lang.Object> set3 = set2;
                        if ((set3 instanceof java.util.Collection) && set3.isEmpty()) {
                            return;
                        }
                        for (java.lang.Object obj3 : set3) {
                            if (obj3 instanceof androidx.compose.runtime.snapshots.StateObjectImpl) {
                                androidx.compose.runtime.snapshots.ReaderKind.Companion companion = androidx.compose.runtime.snapshots.ReaderKind.INSTANCE;
                                if (((androidx.compose.runtime.snapshots.StateObjectImpl) obj3).m1746isReadInh_f27i8$runtime_release(androidx.compose.runtime.snapshots.ReaderKind.m1734constructorimpl(4))) {
                                }
                            }
                            Channel$default.mo10716trySendJP2dKIU(set2);
                            return;
                        }
                    }
                });
                androidx.compose.runtime.snapshots.Snapshot takeSnapshot2 = androidx.compose.runtime.snapshots.Snapshot.INSTANCE.takeSnapshot(function1);
                kotlin.jvm.functions.Function0<T> function02 = this.$block;
                try {
                    androidx.compose.runtime.snapshots.Snapshot makeCurrent2 = takeSnapshot2.makeCurrent();
                    try {
                        invoke = function02.invoke();
                        takeSnapshot2.dispose();
                        this.L$0 = r10;
                        this.L$1 = mutableScatterSet;
                        this.L$2 = function1;
                        this.L$3 = Channel$default;
                        this.L$4 = observerHandle;
                        this.L$5 = invoke;
                        this.label = 1;
                        if (r10.emit(invoke, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } finally {
                    }
                } finally {
                }
            }
            this.L$0 = r10;
            this.L$1 = mutableScatterSet;
            this.L$2 = function1;
            this.L$3 = Channel$default;
            this.L$4 = observerHandle;
            this.L$5 = invoke;
            this.I$0 = 0;
            this.label = 2;
            obj = Channel$default.receive(this);
            if (obj != coroutine_suspended) {
                return coroutine_suspended;
            }
            r11 = r10;
            mutableScatterSet2 = mutableScatterSet;
            function12 = function1;
            channel = Channel$default;
            observerHandle2 = observerHandle;
            obj2 = invoke;
            i = 0;
            set = (java.util.Set) obj;
            do {
                if (i == 0) {
                }
                i = 1;
                set = (java.util.Set) kotlinx.coroutines.channels.ChannelResult.m12323getOrNullimpl(channel.mo12311tryReceivePtdJZtk());
            } while (set != null);
            if (i != 0) {
            }
            invoke = obj2;
            observerHandle = observerHandle2;
            Channel$default = channel;
            function1 = function12;
            mutableScatterSet = mutableScatterSet2;
            r10 = r11;
            this.L$0 = r10;
            this.L$1 = mutableScatterSet;
            this.L$2 = function1;
            this.L$3 = Channel$default;
            this.L$4 = observerHandle;
            this.L$5 = invoke;
            this.I$0 = 0;
            this.label = 2;
            obj = Channel$default.receive(this);
            if (obj != coroutine_suspended) {
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            observerHandle.dispose();
            throw th;
        }
    }
}
