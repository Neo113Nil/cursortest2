package androidx.compose.runtime;

/* compiled from: Recomposer.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", i = {0, 0}, l = {1003}, m = "invokeSuspend", n = {"callingJob", "unregisterApplyObserver"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
final class Recomposer$recompositionRunner$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $block;
    final /* synthetic */ androidx.compose.runtime.MonotonicFrameClock $parentFrameClock;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    final /* synthetic */ androidx.compose.runtime.Recomposer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Recomposer$recompositionRunner$2(androidx.compose.runtime.Recomposer recomposer, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.compose.runtime.MonotonicFrameClock, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock, kotlin.coroutines.Continuation<? super androidx.compose.runtime.Recomposer$recompositionRunner$2> continuation) {
        super(2, continuation);
        this.this$0 = recomposer;
        this.$block = function3;
        this.$parentFrameClock = monotonicFrameClock;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.runtime.Recomposer$recompositionRunner$2 recomposer$recompositionRunner$2 = new androidx.compose.runtime.Recomposer$recompositionRunner$2(this.this$0, this.$block, this.$parentFrameClock, continuation);
        recomposer$recompositionRunner$2.L$0 = obj;
        return recomposer$recompositionRunner$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.runtime.Recomposer$recompositionRunner$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Job job;
        androidx.compose.runtime.Recomposer.RecomposerInfoImpl recomposerInfoImpl;
        androidx.compose.runtime.snapshots.ObserverHandle observerHandle;
        java.lang.Throwable th;
        java.util.List knownCompositions;
        java.lang.Object obj2;
        kotlinx.coroutines.Job job2;
        androidx.compose.runtime.Recomposer.RecomposerInfoImpl recomposerInfoImpl2;
        kotlinx.coroutines.Job job3;
        androidx.compose.runtime.Recomposer.RecomposerInfoImpl recomposerInfoImpl3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            job = kotlinx.coroutines.JobKt.getJob(((kotlinx.coroutines.CoroutineScope) this.L$0).getCoroutineContext());
            this.this$0.registerRunnerJob(job);
            androidx.compose.runtime.snapshots.Snapshot.Companion companion = androidx.compose.runtime.snapshots.Snapshot.INSTANCE;
            final androidx.compose.runtime.Recomposer recomposer = this.this$0;
            androidx.compose.runtime.snapshots.ObserverHandle registerApplyObserver = companion.registerApplyObserver(new kotlin.jvm.functions.Function2<java.util.Set<? extends java.lang.Object>, androidx.compose.runtime.snapshots.Snapshot, kotlin.Unit>() { // from class: androidx.compose.runtime.Recomposer$recompositionRunner$2$unregisterApplyObserver$1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.util.Set<? extends java.lang.Object> set, androidx.compose.runtime.snapshots.Snapshot snapshot) {
                    invoke2(set, snapshot);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(java.util.Set<? extends java.lang.Object> set, androidx.compose.runtime.snapshots.Snapshot snapshot) {
                    kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
                    kotlinx.coroutines.CancellableContinuation cancellableContinuation;
                    int i2;
                    java.lang.Object obj3 = androidx.compose.runtime.Recomposer.this.stateLock;
                    androidx.compose.runtime.Recomposer recomposer2 = androidx.compose.runtime.Recomposer.this;
                    synchronized (obj3) {
                        mutableStateFlow = recomposer2._state;
                        if (((androidx.compose.runtime.Recomposer.State) mutableStateFlow.getValue()).compareTo(androidx.compose.runtime.Recomposer.State.Idle) >= 0) {
                            if (set instanceof androidx.compose.runtime.collection.IdentityArraySet) {
                                androidx.compose.runtime.collection.IdentityArraySet identityArraySet = (androidx.compose.runtime.collection.IdentityArraySet) set;
                                java.lang.Object[] values = identityArraySet.getValues();
                                int size = identityArraySet.size();
                                while (i2 < size) {
                                    java.lang.Object obj4 = values[i2];
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                    if (obj4 instanceof androidx.compose.runtime.snapshots.StateObjectImpl) {
                                        androidx.compose.runtime.snapshots.ReaderKind.Companion companion2 = androidx.compose.runtime.snapshots.ReaderKind.INSTANCE;
                                        i2 = ((androidx.compose.runtime.snapshots.StateObjectImpl) obj4).m1746isReadInh_f27i8$runtime_release(androidx.compose.runtime.snapshots.ReaderKind.m1734constructorimpl(1)) ? 0 : i2 + 1;
                                    }
                                    recomposer2.snapshotInvalidations.add(obj4);
                                }
                            } else {
                                for (java.lang.Object obj5 : set) {
                                    if (obj5 instanceof androidx.compose.runtime.snapshots.StateObjectImpl) {
                                        androidx.compose.runtime.snapshots.ReaderKind.Companion companion3 = androidx.compose.runtime.snapshots.ReaderKind.INSTANCE;
                                        if (!((androidx.compose.runtime.snapshots.StateObjectImpl) obj5).m1746isReadInh_f27i8$runtime_release(androidx.compose.runtime.snapshots.ReaderKind.m1734constructorimpl(1))) {
                                        }
                                    }
                                    recomposer2.snapshotInvalidations.add(obj5);
                                }
                            }
                            cancellableContinuation = recomposer2.deriveStateLocked();
                        } else {
                            cancellableContinuation = null;
                        }
                    }
                    if (cancellableContinuation != null) {
                        kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                        cancellableContinuation.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE));
                    }
                }
            });
            androidx.compose.runtime.Recomposer.Companion companion2 = androidx.compose.runtime.Recomposer.INSTANCE;
            recomposerInfoImpl = this.this$0.recomposerInfo;
            companion2.addRunning(recomposerInfoImpl);
            try {
                java.lang.Object obj3 = this.this$0.stateLock;
                androidx.compose.runtime.Recomposer recomposer2 = this.this$0;
                synchronized (obj3) {
                    knownCompositions = recomposer2.getKnownCompositions();
                }
                int size = knownCompositions.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((androidx.compose.runtime.ControlledComposition) knownCompositions.get(i2)).invalidateAll();
                }
                this.L$0 = job;
                this.L$1 = registerApplyObserver;
                this.label = 1;
                if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.runtime.Recomposer$recompositionRunner$2.AnonymousClass3(this.$block, this.$parentFrameClock, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                observerHandle = registerApplyObserver;
            } catch (java.lang.Throwable th2) {
                observerHandle = registerApplyObserver;
                th = th2;
                observerHandle.dispose();
                obj2 = this.this$0.stateLock;
                androidx.compose.runtime.Recomposer recomposer3 = this.this$0;
                synchronized (obj2) {
                }
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            observerHandle = (androidx.compose.runtime.snapshots.ObserverHandle) this.L$1;
            job = (kotlinx.coroutines.Job) this.L$0;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (java.lang.Throwable th3) {
                th = th3;
                observerHandle.dispose();
                obj2 = this.this$0.stateLock;
                androidx.compose.runtime.Recomposer recomposer32 = this.this$0;
                synchronized (obj2) {
                    job2 = recomposer32.runnerJob;
                    if (job2 == job) {
                        recomposer32.runnerJob = null;
                    }
                    recomposer32.deriveStateLocked();
                }
                androidx.compose.runtime.Recomposer.Companion companion3 = androidx.compose.runtime.Recomposer.INSTANCE;
                recomposerInfoImpl2 = this.this$0.recomposerInfo;
                companion3.removeRunning(recomposerInfoImpl2);
                throw th;
            }
        }
        observerHandle.dispose();
        java.lang.Object obj4 = this.this$0.stateLock;
        androidx.compose.runtime.Recomposer recomposer4 = this.this$0;
        synchronized (obj4) {
            job3 = recomposer4.runnerJob;
            if (job3 == job) {
                recomposer4.runnerJob = null;
            }
            recomposer4.deriveStateLocked();
        }
        androidx.compose.runtime.Recomposer.Companion companion4 = androidx.compose.runtime.Recomposer.INSTANCE;
        recomposerInfoImpl3 = this.this$0.recomposerInfo;
        companion4.removeRunning(recomposerInfoImpl3);
        return kotlin.Unit.INSTANCE;
    }

    /* compiled from: Recomposer.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$3", f = "Recomposer.kt", i = {}, l = {1004}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$3, reason: invalid class name */
    static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $block;
        final /* synthetic */ androidx.compose.runtime.MonotonicFrameClock $parentFrameClock;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(kotlin.jvm.functions.Function3<? super kotlinx.coroutines.CoroutineScope, ? super androidx.compose.runtime.MonotonicFrameClock, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock, kotlin.coroutines.Continuation<? super androidx.compose.runtime.Recomposer$recompositionRunner$2.AnonymousClass3> continuation) {
            super(2, continuation);
            this.$block = function3;
            this.$parentFrameClock = monotonicFrameClock;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.compose.runtime.Recomposer$recompositionRunner$2.AnonymousClass3 anonymousClass3 = new androidx.compose.runtime.Recomposer$recompositionRunner$2.AnonymousClass3(this.$block, this.$parentFrameClock, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.runtime.Recomposer$recompositionRunner$2.AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
                kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function3 = this.$block;
                androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock = this.$parentFrameClock;
                this.label = 1;
                if (function3.invoke(coroutineScope, monotonicFrameClock, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }
    }
}
