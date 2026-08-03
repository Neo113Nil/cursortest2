package androidx.room;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: CoroutinesRoom.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\r\u0012\t\u0012\u0007H\u0002¢\u0006\u0002\b\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/jvm/JvmSuppressWildcards;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1", f = "CoroutinesRoom.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class CoroutinesRoom$Companion$createFlow$1<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.util.concurrent.Callable<R> $callable;
    final /* synthetic */ androidx.room.RoomDatabase $db;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ java.lang.String[] $tableNames;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutinesRoom$Companion$createFlow$1(boolean z, androidx.room.RoomDatabase roomDatabase, java.lang.String[] strArr, java.util.concurrent.Callable<R> callable, kotlin.coroutines.Continuation<? super androidx.room.CoroutinesRoom$Companion$createFlow$1> continuation) {
        super(2, continuation);
        this.$inTransaction = z;
        this.$db = roomDatabase;
        this.$tableNames = strArr;
        this.$callable = callable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.room.CoroutinesRoom$Companion$createFlow$1 coroutinesRoom$Companion$createFlow$1 = new androidx.room.CoroutinesRoom$Companion$createFlow$1(this.$inTransaction, this.$db, this.$tableNames, this.$callable, continuation);
        coroutinesRoom$Companion$createFlow$1.L$0 = obj;
        return coroutinesRoom$Companion$createFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<R> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.room.CoroutinesRoom$Companion$createFlow$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* compiled from: CoroutinesRoom.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1", f = "CoroutinesRoom.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> $$this$flow;
        final /* synthetic */ java.util.concurrent.Callable<R> $callable;
        final /* synthetic */ androidx.room.RoomDatabase $db;
        final /* synthetic */ boolean $inTransaction;
        final /* synthetic */ java.lang.String[] $tableNames;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z, androidx.room.RoomDatabase roomDatabase, kotlinx.coroutines.flow.FlowCollector<R> flowCollector, java.lang.String[] strArr, java.util.concurrent.Callable<R> callable, kotlin.coroutines.Continuation<? super androidx.room.CoroutinesRoom$Companion$createFlow$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$inTransaction = z;
            this.$db = roomDatabase;
            this.$$this$flow = flowCollector;
            this.$tableNames = strArr;
            this.$callable = callable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.room.CoroutinesRoom$Companion$createFlow$1.AnonymousClass1 anonymousClass1 = new androidx.room.CoroutinesRoom$Companion$createFlow$1.AnonymousClass1(this.$inTransaction, this.$db, this.$$this$flow, this.$tableNames, this.$callable, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.room.CoroutinesRoom$Companion$createFlow$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r7v0, types: [androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.CoroutineDispatcher transactionDispatcher;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
                final kotlinx.coroutines.channels.Channel Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(-1, null, null, 6, null);
                final java.lang.String[] strArr = this.$tableNames;
                ?? r7 = new androidx.room.InvalidationTracker.Observer(strArr) { // from class: androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1
                    @Override // androidx.room.InvalidationTracker.Observer
                    public void onInvalidated(java.util.Set<java.lang.String> tables) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tables, "tables");
                        Channel$default.mo10716trySendJP2dKIU(kotlin.Unit.INSTANCE);
                    }
                };
                Channel$default.mo10716trySendJP2dKIU(kotlin.Unit.INSTANCE);
                androidx.room.TransactionElement transactionElement = (androidx.room.TransactionElement) coroutineScope.getCoroutineContext().get(androidx.room.TransactionElement.INSTANCE);
                if (transactionElement == null || (transactionDispatcher = transactionElement.getTransactionDispatcher()) == null) {
                    transactionDispatcher = this.$inTransaction ? androidx.room.CoroutinesRoomKt.getTransactionDispatcher(this.$db) : androidx.room.CoroutinesRoomKt.getQueryDispatcher(this.$db);
                }
                kotlinx.coroutines.channels.Channel Channel$default2 = kotlinx.coroutines.channels.ChannelKt.Channel$default(0, null, null, 7, null);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, transactionDispatcher, null, new androidx.room.CoroutinesRoom$Companion$createFlow$1.AnonymousClass1.C00651(this.$db, r7, Channel$default, this.$callable, Channel$default2, null), 2, null);
                this.label = 1;
                if (kotlinx.coroutines.flow.FlowKt.emitAll(this.$$this$flow, Channel$default2, this) == coroutine_suspended) {
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

        /* compiled from: CoroutinesRoom.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1", f = "CoroutinesRoom.kt", i = {}, l = {127, 129}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00651 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ java.util.concurrent.Callable<R> $callable;
            final /* synthetic */ androidx.room.RoomDatabase $db;
            final /* synthetic */ androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1 $observer;
            final /* synthetic */ kotlinx.coroutines.channels.Channel<kotlin.Unit> $observerChannel;
            final /* synthetic */ kotlinx.coroutines.channels.Channel<R> $resultChannel;
            java.lang.Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00651(androidx.room.RoomDatabase roomDatabase, androidx.room.CoroutinesRoom$Companion$createFlow$1$1$observer$1 coroutinesRoom$Companion$createFlow$1$1$observer$1, kotlinx.coroutines.channels.Channel<kotlin.Unit> channel, java.util.concurrent.Callable<R> callable, kotlinx.coroutines.channels.Channel<R> channel2, kotlin.coroutines.Continuation<? super androidx.room.CoroutinesRoom$Companion$createFlow$1.AnonymousClass1.C00651> continuation) {
                super(2, continuation);
                this.$db = roomDatabase;
                this.$observer = coroutinesRoom$Companion$createFlow$1$1$observer$1;
                this.$observerChannel = channel;
                this.$callable = callable;
                this.$resultChannel = channel2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new androidx.room.CoroutinesRoom$Companion$createFlow$1.AnonymousClass1.C00651(this.$db, this.$observer, this.$observerChannel, this.$callable, this.$resultChannel, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((androidx.room.CoroutinesRoom$Companion$createFlow$1.AnonymousClass1.C00651) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x004a A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0056 A[Catch: all -> 0x007f, TRY_LEAVE, TryCatch #0 {all -> 0x007f, blocks: (B:7:0x0012, B:9:0x003d, B:14:0x004e, B:16:0x0056, B:25:0x0023, B:27:0x0037), top: B:2:0x0008 }] */
            /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006c -> B:8:0x0015). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlinx.coroutines.channels.ChannelIterator<kotlin.Unit> it;
                kotlinx.coroutines.channels.ChannelIterator<kotlin.Unit> channelIterator;
                java.lang.Object hasNext;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        this.$db.getInvalidationTracker().addObserver(this.$observer);
                        it = this.$observerChannel.iterator();
                        this.L$0 = it;
                        this.label = 1;
                        hasNext = it.hasNext(this);
                        if (hasNext == coroutine_suspended) {
                        }
                    } else if (i == 1) {
                        channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        it = channelIterator;
                        this.L$0 = it;
                        this.label = 1;
                        hasNext = it.hasNext(this);
                        if (hasNext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        channelIterator = it;
                        obj = hasNext;
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            channelIterator.next();
                            R call = this.$callable.call();
                            this.L$0 = channelIterator;
                            this.label = 2;
                            if (this.$resultChannel.send(call, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            it = channelIterator;
                            this.L$0 = it;
                            this.label = 1;
                            hasNext = it.hasNext(this);
                            if (hasNext == coroutine_suspended) {
                            }
                        } else {
                            this.$db.getInvalidationTracker().removeObserver(this.$observer);
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                } catch (java.lang.Throwable th) {
                    this.$db.getInvalidationTracker().removeObserver(this.$observer);
                    throw th;
                }
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
            this.label = 1;
            if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.room.CoroutinesRoom$Companion$createFlow$1.AnonymousClass1(this.$inTransaction, this.$db, flowCollector, this.$tableNames, this.$callable, null), this) == coroutine_suspended) {
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
