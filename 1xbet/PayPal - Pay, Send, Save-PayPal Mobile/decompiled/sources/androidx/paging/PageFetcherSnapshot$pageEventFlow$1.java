package androidx.paging;

/* JADX INFO: Add missing generic type declarations: [Value] */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "Value", "", "Landroidx/paging/SimpleProducerScope;", "Landroidx/paging/PageEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1", f = "PageFetcherSnapshot.kt", i = {0, 0, 0, 0, 1, 2, 2, 2}, l = {647, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, 659}, m = "invokeSuspend", n = {"$this$cancelableChannelFlow", "it", "this_$iv", "$this$withLock_u24default$iv$iv", "$this$cancelableChannelFlow", "$this$cancelableChannelFlow", "this_$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$0", "L$1", "L$2"}, v = 1)
/* loaded from: classes7.dex */
final class PageFetcherSnapshot$pageEventFlow$1<Value> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.paging.SimpleProducerScope<androidx.paging.PageEvent<Value>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.paging.PageFetcherSnapshot<Key, Value> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Removed duplicated region for block: B:11:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.paging.SimpleProducerScope simpleProducerScope;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        androidx.paging.RemoteMediatorConnection remoteMediatorConnection;
        androidx.paging.PagingState pagingState;
        androidx.paging.PageFetcherSnapshotState.Holder holder;
        kotlinx.coroutines.sync.Mutex mutex;
        androidx.paging.PageFetcherSnapshotState.Holder holder2;
        java.lang.Object highSpeedVideoSizes;
        androidx.paging.SimpleProducerScope simpleProducerScope2;
        kotlinx.coroutines.sync.Mutex mutex2;
        androidx.paging.PageFetcherSnapshotState.Holder holder3;
        kotlinx.coroutines.sync.Mutex mutex3;
        androidx.paging.SimpleProducerScope simpleProducerScope3;
        androidx.paging.PageFetcherSnapshotState.Holder holder4;
        androidx.paging.LoadState loadState;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                simpleProducerScope = (androidx.paging.SimpleProducerScope) this.getOutputMinFrameDuration;
                atomicBoolean = ((androidx.paging.PageFetcherSnapshot) this.getHighSpeedVideoFpsRangesFor).getOutputFormats;
                if (!atomicBoolean.compareAndSet(false, true)) {
                    throw new java.lang.IllegalStateException("Attempt to collect twice from pageEventFlow, which is an illegal operation. Did you forget to call Flow<PagingData<*>>.cachedIn(coroutineScope)?".toString());
                }
                androidx.paging.SimpleProducerScope simpleProducerScope4 = simpleProducerScope;
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(simpleProducerScope4, null, null, new androidx.paging.PageFetcherSnapshot$pageEventFlow$1.AnonymousClass2(this.getHighSpeedVideoFpsRangesFor, simpleProducerScope, null), 3, null);
                kotlinx.coroutines.channels.Channel Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(0, null, null, 6, null);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(simpleProducerScope4, null, null, new androidx.paging.PageFetcherSnapshot$pageEventFlow$1.AnonymousClass3(this.getHighSpeedVideoFpsRangesFor, Channel$default, null), 3, null);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(simpleProducerScope4, null, null, new androidx.paging.PageFetcherSnapshot$pageEventFlow$1.AnonymousClass4(Channel$default, this.getHighSpeedVideoFpsRangesFor, null), 3, null);
                remoteMediatorConnection = this.getHighSpeedVideoFpsRangesFor.getRemoteMediatorConnection();
                if (remoteMediatorConnection != null) {
                    androidx.paging.PageFetcherSnapshot<Key, Value> pageFetcherSnapshot = this.getHighSpeedVideoFpsRangesFor;
                    pagingState = ((androidx.paging.PageFetcherSnapshot) pageFetcherSnapshot).getHighSpeedVideoFpsRangesFor;
                    if (pagingState == null) {
                        holder = ((androidx.paging.PageFetcherSnapshot) pageFetcherSnapshot).getInputFormats;
                        mutex = holder.getHighSpeedVideoFpsRangesFor;
                        this.getOutputMinFrameDuration = simpleProducerScope;
                        this.Camera2StreamConfigurationMap = remoteMediatorConnection;
                        this.getHighResolutionOutputSizeshNQ4ISI = holder;
                        this.getHighSpeedVideoFpsRanges = mutex;
                        this.getHighSpeedVideoSizes = 1;
                        if (mutex.lock(null, this) != coroutine_suspended) {
                            holder2 = holder;
                        }
                        return coroutine_suspended;
                    }
                    remoteMediatorConnection.requestRefreshIfAllowed(pagingState);
                }
                this.getOutputMinFrameDuration = simpleProducerScope;
                this.Camera2StreamConfigurationMap = null;
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                this.getHighSpeedVideoFpsRanges = null;
                this.getHighSpeedVideoSizes = 2;
                highSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(this);
                if (highSpeedVideoSizes != coroutine_suspended) {
                    simpleProducerScope2 = simpleProducerScope;
                    holder3 = ((androidx.paging.PageFetcherSnapshot) this.getHighSpeedVideoFpsRangesFor).getInputFormats;
                    mutex3 = holder3.getHighSpeedVideoFpsRangesFor;
                    this.getOutputMinFrameDuration = simpleProducerScope2;
                    this.Camera2StreamConfigurationMap = holder3;
                    this.getHighResolutionOutputSizeshNQ4ISI = mutex3;
                    this.getHighSpeedVideoSizes = 3;
                    if (mutex3.lock(null, this) != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (kotlinx.coroutines.sync.Mutex) this.getHighResolutionOutputSizeshNQ4ISI;
                    holder4 = (androidx.paging.PageFetcherSnapshotState.Holder) this.Camera2StreamConfigurationMap;
                    simpleProducerScope3 = (androidx.paging.SimpleProducerScope) this.getOutputMinFrameDuration;
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        loadState = holder4.getHighSpeedVideoFpsRanges.getSourceLoadStates().get(androidx.paging.LoadType.REFRESH);
                        mutex2.unlock(null);
                        if (!(loadState instanceof androidx.paging.LoadState.Error)) {
                            androidx.paging.PageFetcherSnapshot.access$startConsumingHints(this.getHighSpeedVideoFpsRangesFor, simpleProducerScope3);
                        }
                        return kotlin.Unit.INSTANCE;
                    } finally {
                    }
                }
                simpleProducerScope2 = (androidx.paging.SimpleProducerScope) this.getOutputMinFrameDuration;
                kotlin.ResultKt.throwOnFailure(obj);
                holder3 = ((androidx.paging.PageFetcherSnapshot) this.getHighSpeedVideoFpsRangesFor).getInputFormats;
                mutex3 = holder3.getHighSpeedVideoFpsRangesFor;
                this.getOutputMinFrameDuration = simpleProducerScope2;
                this.Camera2StreamConfigurationMap = holder3;
                this.getHighResolutionOutputSizeshNQ4ISI = mutex3;
                this.getHighSpeedVideoSizes = 3;
                if (mutex3.lock(null, this) != coroutine_suspended) {
                    simpleProducerScope3 = simpleProducerScope2;
                    mutex2 = mutex3;
                    holder4 = holder3;
                    loadState = holder4.getHighSpeedVideoFpsRanges.getSourceLoadStates().get(androidx.paging.LoadType.REFRESH);
                    mutex2.unlock(null);
                    if (!(loadState instanceof androidx.paging.LoadState.Error)) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            mutex = (kotlinx.coroutines.sync.Mutex) this.getHighSpeedVideoFpsRanges;
            holder2 = (androidx.paging.PageFetcherSnapshotState.Holder) this.getHighResolutionOutputSizeshNQ4ISI;
            remoteMediatorConnection = (androidx.paging.RemoteMediatorConnection) this.Camera2StreamConfigurationMap;
            simpleProducerScope = (androidx.paging.SimpleProducerScope) this.getOutputMinFrameDuration;
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.paging.PagingState currentPagingState$paging_common = holder2.getHighSpeedVideoFpsRanges.currentPagingState$paging_common(null);
            mutex2.unlock(null);
            pagingState = currentPagingState$paging_common;
            remoteMediatorConnection.requestRefreshIfAllowed(pagingState);
            this.getOutputMinFrameDuration = simpleProducerScope;
            this.Camera2StreamConfigurationMap = null;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getHighSpeedVideoFpsRanges = null;
            this.getHighSpeedVideoSizes = 2;
            highSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(this);
            if (highSpeedVideoSizes != coroutine_suspended) {
            }
            return coroutine_suspended;
        } finally {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2", f = "PageFetcherSnapshot.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.paging.PageFetcherSnapshot<Key, Value> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.paging.SimpleProducerScope<androidx.paging.PageEvent<Value>> getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;

        @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1, reason: invalid class name */
        static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
            final /* synthetic */ androidx.paging.SimpleProducerScope<androidx.paging.PageEvent<Value>> getHighSpeedVideoFpsRangesFor;

            /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(androidx.paging.PageEvent<Value> pageEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1 pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1;
                int i;
                if (continuation instanceof androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1) {
                    pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1 = (androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1) continuation;
                    if ((pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                        pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1.getHighSpeedVideoSizes -= 2147483648;
                        java.lang.Object obj = pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1.getHighSpeedVideoSizes;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            androidx.paging.SimpleProducerScope<androidx.paging.PageEvent<Value>> simpleProducerScope = this.getHighSpeedVideoFpsRangesFor;
                            pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1.getHighSpeedVideoSizes = 1;
                            if (simpleProducerScope.send(pageEvent, pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1) == coroutine_suspended) {
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
                pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1 = new androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2$1$emit$1(this, continuation);
                java.lang.Object obj2 = pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pageFetcherSnapshot$pageEventFlow$1$2$1$emit$1.getHighSpeedVideoSizes;
                if (i != 0) {
                }
                return kotlin.Unit.INSTANCE;
            }

            AnonymousClass1(androidx.paging.SimpleProducerScope<androidx.paging.PageEvent<Value>> simpleProducerScope) {
                this.getHighSpeedVideoFpsRangesFor = simpleProducerScope;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.channels.Channel channel;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                channel = ((androidx.paging.PageFetcherSnapshot) this.getHighResolutionOutputSizeshNQ4ISI).getOutputMinFrameDuration;
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (kotlinx.coroutines.flow.FlowKt.consumeAsFlow(channel).collect(new androidx.paging.PageFetcherSnapshot$pageEventFlow$1.AnonymousClass2.AnonymousClass1(this.getHighSpeedVideoFpsRanges), this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.paging.PageFetcherSnapshot$pageEventFlow$1.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.paging.PageFetcherSnapshot$pageEventFlow$1.AnonymousClass2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(androidx.paging.PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, androidx.paging.SimpleProducerScope<androidx.paging.PageEvent<Value>> simpleProducerScope, kotlin.coroutines.Continuation<? super androidx.paging.PageFetcherSnapshot$pageEventFlow$1.AnonymousClass2> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = pageFetcherSnapshot;
            this.getHighSpeedVideoFpsRanges = simpleProducerScope;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3", f = "PageFetcherSnapshot.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ kotlinx.coroutines.channels.Channel<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.paging.PageFetcherSnapshot<Key, Value> getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.flow.Flow flow;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                flow = ((androidx.paging.PageFetcherSnapshot) this.getHighSpeedVideoSizes).getHighSpeedVideoSizes;
                final kotlinx.coroutines.channels.Channel<kotlin.Unit> channel = this.getHighResolutionOutputSizeshNQ4ISI;
                this.Camera2StreamConfigurationMap = 1;
                if (flow.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.paging.PageFetcherSnapshot.pageEventFlow.1.3.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                        channel.mo9266trySendJP2dKIU((kotlin.Unit) obj2);
                        return kotlin.Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.paging.PageFetcherSnapshot$pageEventFlow$1.AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.paging.PageFetcherSnapshot$pageEventFlow$1.AnonymousClass3(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(androidx.paging.PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, kotlinx.coroutines.channels.Channel<kotlin.Unit> channel, kotlin.coroutines.Continuation<? super androidx.paging.PageFetcherSnapshot$pageEventFlow$1.AnonymousClass3> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = pageFetcherSnapshot;
            this.getHighResolutionOutputSizeshNQ4ISI = channel;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4", f = "PageFetcherSnapshot.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.paging.PageFetcherSnapshot<Key, Value> Camera2StreamConfigurationMap;
        private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlinx.coroutines.channels.Channel<kotlin.Unit> getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1, reason: invalid class name */
        static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
            final /* synthetic */ kotlinx.coroutines.CoroutineScope getHighResolutionOutputSizeshNQ4ISI;
            final /* synthetic */ androidx.paging.PageFetcherSnapshot<Key, Value> getHighSpeedVideoFpsRanges;

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                return getHighSpeedVideoFpsRanges(continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:132:0x0315, code lost:
            
                if (r2.lock(null, r0) != r1) goto L179;
             */
            /* JADX WARN: Code restructure failed: missing block: B:179:0x01f7, code lost:
            
                if (r2.lock(null, r0) != r1) goto L192;
             */
            /* JADX WARN: Code restructure failed: missing block: B:81:0x0422, code lost:
            
                if (r2.lock(null, r0) != r1) goto L194;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:100:0x03ad  */
            /* JADX WARN: Removed duplicated region for block: B:104:0x011c  */
            /* JADX WARN: Removed duplicated region for block: B:107:0x0389  */
            /* JADX WARN: Removed duplicated region for block: B:108:0x038b  */
            /* JADX WARN: Removed duplicated region for block: B:109:0x013b  */
            /* JADX WARN: Removed duplicated region for block: B:118:0x0348  */
            /* JADX WARN: Removed duplicated region for block: B:128:0x0154  */
            /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
            /* JADX WARN: Removed duplicated region for block: B:131:0x02fc  */
            /* JADX WARN: Removed duplicated region for block: B:133:0x016c  */
            /* JADX WARN: Removed duplicated region for block: B:139:0x02f4  */
            /* JADX WARN: Removed duplicated region for block: B:144:0x0191  */
            /* JADX WARN: Removed duplicated region for block: B:150:0x029f  */
            /* JADX WARN: Removed duplicated region for block: B:151:0x02a3  */
            /* JADX WARN: Removed duplicated region for block: B:155:0x01ad  */
            /* JADX WARN: Removed duplicated region for block: B:158:0x027f  */
            /* JADX WARN: Removed duplicated region for block: B:159:0x0281  */
            /* JADX WARN: Removed duplicated region for block: B:160:0x01cc  */
            /* JADX WARN: Removed duplicated region for block: B:178:0x01dc  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x053c  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0509  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x0504  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x04af  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x04b3  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0491  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x0493  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x0455  */
            /* JADX WARN: Removed duplicated region for block: B:77:0x00c3  */
            /* JADX WARN: Removed duplicated region for block: B:80:0x0408  */
            /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
            /* JADX WARN: Removed duplicated region for block: B:88:0x0400  */
            /* JADX WARN: Removed duplicated region for block: B:93:0x0100  */
            /* JADX WARN: Removed duplicated region for block: B:99:0x03a9  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
            /* JADX WARN: Type inference failed for: r2v0, types: [int] */
            /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r2v16, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r2v3, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r2v41, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r2v70, types: [kotlinx.coroutines.sync.Mutex] */
            /* JADX WARN: Type inference failed for: r2v88 */
            /* JADX WARN: Type inference failed for: r2v89 */
            /* JADX WARN: Type inference failed for: r2v91 */
            /* JADX WARN: Type inference failed for: r2v92 */
            /* JADX WARN: Type inference failed for: r2v94 */
            /* JADX WARN: Type inference failed for: r2v95 */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object getHighSpeedVideoFpsRanges(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1 pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;
                ?? r2;
                androidx.paging.PageFetcherSnapshotState.Holder holder;
                androidx.paging.PageFetcherSnapshot pageFetcherSnapshot;
                kotlinx.coroutines.sync.Mutex mutex;
                androidx.paging.HintHandler hintHandler;
                androidx.paging.LoadStates loadStates;
                androidx.paging.PageFetcherSnapshot pageFetcherSnapshot2;
                kotlinx.coroutines.CoroutineScope coroutineScope;
                androidx.paging.LoadType loadType;
                androidx.paging.LoadStates loadStates2;
                kotlinx.coroutines.CoroutineScope coroutineScope2;
                androidx.paging.LoadType loadType2;
                androidx.paging.PageFetcherSnapshot pageFetcherSnapshot3;
                androidx.paging.PageFetcherSnapshotState.Holder holder2;
                androidx.paging.LoadStates loadStates3;
                kotlinx.coroutines.sync.Mutex mutex2;
                kotlinx.coroutines.CoroutineScope coroutineScope3;
                androidx.paging.PageFetcherSnapshotState.Holder holder3;
                java.lang.Object highResolutionOutputSizeshNQ4ISI;
                kotlinx.coroutines.CoroutineScope coroutineScope4;
                androidx.paging.PageFetcherSnapshot pageFetcherSnapshot4;
                androidx.paging.PageFetcherSnapshotState.Holder holder4;
                kotlinx.coroutines.sync.Mutex mutex3;
                androidx.paging.PageFetcherSnapshot pageFetcherSnapshot5;
                androidx.paging.LoadType loadType3;
                androidx.paging.PageFetcherSnapshot pageFetcherSnapshot6;
                androidx.paging.ViewportHint viewportHint;
                androidx.paging.LoadType loadType4;
                androidx.paging.PageFetcherSnapshot pageFetcherSnapshot7;
                androidx.paging.LoadType loadType5;
                kotlinx.coroutines.CoroutineScope coroutineScope5;
                androidx.paging.LoadStates loadStates4;
                androidx.paging.PageFetcherSnapshotState.Holder holder5;
                kotlinx.coroutines.sync.Mutex mutex4;
                androidx.paging.LoadType loadType6;
                androidx.paging.LoadStates loadStates5;
                kotlinx.coroutines.CoroutineScope coroutineScope6;
                androidx.paging.LoadType loadType7;
                androidx.paging.PageFetcherSnapshot pageFetcherSnapshot8;
                androidx.paging.PageFetcherSnapshotState.Holder holder6;
                androidx.paging.LoadStates loadStates6;
                kotlinx.coroutines.sync.Mutex mutex5;
                kotlinx.coroutines.CoroutineScope coroutineScope7;
                androidx.paging.PageFetcherSnapshotState.Holder holder7;
                java.lang.Object highResolutionOutputSizeshNQ4ISI2;
                kotlinx.coroutines.CoroutineScope coroutineScope8;
                androidx.paging.PageFetcherSnapshot pageFetcherSnapshot9;
                androidx.paging.PageFetcherSnapshotState.Holder holder8;
                kotlinx.coroutines.sync.Mutex mutex6;
                androidx.paging.PageFetcherSnapshot pageFetcherSnapshot10;
                androidx.paging.LoadType loadType8;
                androidx.paging.PageFetcherSnapshot pageFetcherSnapshot11;
                androidx.paging.ViewportHint viewportHint2;
                androidx.paging.LoadType loadType9;
                androidx.paging.PageFetcherSnapshot pageFetcherSnapshot12;
                androidx.paging.LoadType loadType10;
                kotlinx.coroutines.CoroutineScope coroutineScope9;
                androidx.paging.LoadStates loadStates7;
                androidx.paging.PageFetcherSnapshotState.Holder holder9;
                kotlinx.coroutines.sync.Mutex mutex7;
                androidx.paging.LoadType loadType11;
                androidx.paging.PageFetcherSnapshot pageFetcherSnapshot13;
                kotlinx.coroutines.CoroutineScope coroutineScope10;
                androidx.paging.LoadType loadType12;
                androidx.paging.PageFetcherSnapshotState.Holder holder10;
                androidx.paging.PageFetcherSnapshotState.Holder holder11;
                kotlinx.coroutines.sync.Mutex mutex8;
                kotlinx.coroutines.CoroutineScope coroutineScope11;
                java.lang.Object highResolutionOutputSizeshNQ4ISI3;
                kotlinx.coroutines.CoroutineScope coroutineScope12;
                androidx.paging.PageFetcherSnapshot pageFetcherSnapshot14;
                androidx.paging.PageFetcherSnapshotState.Holder holder12;
                androidx.paging.PageFetcherSnapshot pageFetcherSnapshot15;
                androidx.paging.LoadType loadType13;
                androidx.paging.LoadType loadType14;
                kotlinx.coroutines.sync.Mutex mutex9;
                androidx.paging.PageFetcherSnapshot pageFetcherSnapshot16;
                androidx.paging.ViewportHint viewportHint3;
                androidx.paging.LoadType loadType15;
                kotlinx.coroutines.CoroutineScope coroutineScope13;
                androidx.paging.PageFetcherSnapshotState.Holder holder13;
                androidx.paging.PageFetcherSnapshot pageFetcherSnapshot17;
                kotlinx.coroutines.sync.Mutex mutex10;
                androidx.paging.PageFetcherSnapshotState.Holder holder14;
                androidx.paging.LoadState loadState;
                try {
                    try {
                        try {
                            if (continuation instanceof androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) {
                                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1 = (androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) continuation;
                                if ((pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputSizeshNQ4ISI -= 2147483648;
                                    java.lang.Object obj = pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getOutputFormats;
                                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    r2 = pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputSizeshNQ4ISI;
                                    switch (r2) {
                                        case 0:
                                            kotlin.ResultKt.throwOnFailure(obj);
                                            holder = this.getHighSpeedVideoFpsRanges.getInputFormats;
                                            pageFetcherSnapshot = this.getHighSpeedVideoFpsRanges;
                                            mutex = holder.getHighSpeedVideoFpsRangesFor;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes = holder;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor = pageFetcherSnapshot;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = mutex;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputSizeshNQ4ISI = 1;
                                            break;
                                        case 1:
                                            mutex = (kotlinx.coroutines.sync.Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                                            pageFetcherSnapshot = (androidx.paging.PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor;
                                            holder = (androidx.paging.PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes;
                                            kotlin.ResultKt.throwOnFailure(obj);
                                            try {
                                                androidx.paging.PageFetcherSnapshotState pageFetcherSnapshotState = holder.getHighSpeedVideoFpsRanges;
                                                androidx.paging.LoadStates snapshot = pageFetcherSnapshotState.getSourceLoadStates().snapshot();
                                                hintHandler = pageFetcherSnapshot.getHighSpeedVideoFpsRanges;
                                                kotlin.Pair pair = kotlin.TuplesKt.to(snapshot, pageFetcherSnapshotState.currentPagingState$paging_common(hintHandler.getLastAccessHint()));
                                                mutex.unlock(null);
                                                loadStates = (androidx.paging.LoadStates) pair.component1();
                                                androidx.paging.PagingState pagingState = (androidx.paging.PagingState) pair.component2();
                                                androidx.paging.RemoteMediatorConnection remoteMediatorConnection = this.getHighSpeedVideoFpsRanges.getRemoteMediatorConnection();
                                                if (remoteMediatorConnection != null) {
                                                    remoteMediatorConnection.retryFailed(pagingState);
                                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                                }
                                                pageFetcherSnapshot2 = this.getHighSpeedVideoFpsRanges;
                                                coroutineScope = this.getHighResolutionOutputSizeshNQ4ISI;
                                                loadType = androidx.paging.LoadType.REFRESH;
                                                if (loadStates.getRefresh() instanceof androidx.paging.LoadState.Error) {
                                                    if (loadType != androidx.paging.LoadType.REFRESH) {
                                                        holder2 = pageFetcherSnapshot2.getInputFormats;
                                                        kotlinx.coroutines.sync.Mutex mutex11 = holder2.getHighSpeedVideoFpsRangesFor;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes = loadStates;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor = pageFetcherSnapshot2;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = coroutineScope;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges = loadType;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Camera2StreamConfigurationMap = holder2;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizesFor = mutex11;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputSizeshNQ4ISI = 2;
                                                        if (mutex11.lock(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutine_suspended) {
                                                            loadStates3 = loadStates;
                                                            mutex2 = mutex11;
                                                            coroutineScope3 = coroutineScope;
                                                            holder3 = holder2;
                                                            androidx.paging.PageFetcherSnapshotState pageFetcherSnapshotState2 = holder3.getHighSpeedVideoFpsRanges;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes = loadStates3;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor = pageFetcherSnapshot2;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = coroutineScope3;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges = loadType;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Camera2StreamConfigurationMap = mutex2;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizesFor = null;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputSizeshNQ4ISI = 3;
                                                            highResolutionOutputSizeshNQ4ISI = pageFetcherSnapshot2.getHighResolutionOutputSizeshNQ4ISI(pageFetcherSnapshotState2, loadType, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1);
                                                            if (highResolutionOutputSizeshNQ4ISI == coroutine_suspended) {
                                                                loadType2 = loadType;
                                                                coroutineScope4 = coroutineScope3;
                                                                pageFetcherSnapshot4 = pageFetcherSnapshot2;
                                                                r2 = mutex2;
                                                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                                                r2.unlock(null);
                                                                coroutineScope2 = coroutineScope4;
                                                                pageFetcherSnapshot3 = pageFetcherSnapshot4;
                                                                loadStates2 = loadStates3;
                                                                if (androidx.paging.PageFetcherSnapshot$pageEventFlow$1.AnonymousClass4.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[loadType2.ordinal()] == 1) {
                                                                    pageFetcherSnapshot6 = pageFetcherSnapshot3;
                                                                    viewportHint = null;
                                                                    loadType4 = loadType2;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes = loadStates2;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor = pageFetcherSnapshot3;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = coroutineScope2;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges = loadType2;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Camera2StreamConfigurationMap = null;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizesFor = null;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getOutputMinFrameDuration = null;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputFormats = null;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputSizeshNQ4ISI = 5;
                                                                    if (androidx.paging.PageFetcherSnapshot.access$retryLoadError(pageFetcherSnapshot6, loadType4, viewportHint, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutine_suspended) {
                                                                        pageFetcherSnapshot7 = pageFetcherSnapshot3;
                                                                        loadType5 = loadType2;
                                                                        coroutineScope5 = coroutineScope2;
                                                                        loadStates4 = loadStates2;
                                                                        if (loadType5 == androidx.paging.LoadType.REFRESH) {
                                                                            holder5 = pageFetcherSnapshot7.getInputFormats;
                                                                            mutex4 = holder5.getHighSpeedVideoFpsRangesFor;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes = loadStates4;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor = pageFetcherSnapshot7;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = coroutineScope5;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges = holder5;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Camera2StreamConfigurationMap = mutex4;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputSizeshNQ4ISI = 6;
                                                                            break;
                                                                        }
                                                                        coroutineScope = coroutineScope5;
                                                                        pageFetcherSnapshot2 = pageFetcherSnapshot7;
                                                                        loadStates = loadStates4;
                                                                    }
                                                                } else {
                                                                    holder4 = pageFetcherSnapshot3.getInputFormats;
                                                                    mutex3 = holder4.getHighSpeedVideoFpsRangesFor;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes = loadStates2;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor = pageFetcherSnapshot3;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = coroutineScope2;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges = loadType2;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Camera2StreamConfigurationMap = holder4;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizesFor = mutex3;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getOutputMinFrameDuration = loadType2;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputFormats = pageFetcherSnapshot3;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputSizeshNQ4ISI = 4;
                                                                    if (mutex3.lock(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutine_suspended) {
                                                                        pageFetcherSnapshot5 = pageFetcherSnapshot3;
                                                                        loadType3 = loadType2;
                                                                        try {
                                                                            viewportHint = holder4.getHighSpeedVideoFpsRanges.getFailedHintsByLoadType$paging_common().get(loadType3);
                                                                            mutex3.unlock(null);
                                                                            pageFetcherSnapshot6 = pageFetcherSnapshot3;
                                                                            loadType4 = loadType2;
                                                                            loadType2 = loadType3;
                                                                            pageFetcherSnapshot3 = pageFetcherSnapshot5;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes = loadStates2;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor = pageFetcherSnapshot3;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = coroutineScope2;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges = loadType2;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Camera2StreamConfigurationMap = null;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizesFor = null;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getOutputMinFrameDuration = null;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputFormats = null;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputSizeshNQ4ISI = 5;
                                                                            if (androidx.paging.PageFetcherSnapshot.access$retryLoadError(pageFetcherSnapshot6, loadType4, viewportHint, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutine_suspended) {
                                                                            }
                                                                        } finally {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        return coroutine_suspended;
                                                    }
                                                    loadStates2 = loadStates;
                                                    coroutineScope2 = coroutineScope;
                                                    loadType2 = loadType;
                                                    pageFetcherSnapshot3 = pageFetcherSnapshot2;
                                                    if (androidx.paging.PageFetcherSnapshot$pageEventFlow$1.AnonymousClass4.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[loadType2.ordinal()] == 1) {
                                                    }
                                                }
                                                loadType6 = androidx.paging.LoadType.PREPEND;
                                                if (loadStates.getPrepend() instanceof androidx.paging.LoadState.Error) {
                                                    if (loadType6 != androidx.paging.LoadType.REFRESH) {
                                                        holder6 = pageFetcherSnapshot2.getInputFormats;
                                                        kotlinx.coroutines.sync.Mutex mutex12 = holder6.getHighSpeedVideoFpsRangesFor;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes = loadStates;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor = pageFetcherSnapshot2;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = coroutineScope;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges = loadType6;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Camera2StreamConfigurationMap = holder6;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizesFor = mutex12;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputSizeshNQ4ISI = 7;
                                                        if (mutex12.lock(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutine_suspended) {
                                                            loadStates6 = loadStates;
                                                            mutex5 = mutex12;
                                                            coroutineScope7 = coroutineScope;
                                                            holder7 = holder6;
                                                            androidx.paging.PageFetcherSnapshotState pageFetcherSnapshotState3 = holder7.getHighSpeedVideoFpsRanges;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes = loadStates6;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor = pageFetcherSnapshot2;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = coroutineScope7;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges = loadType6;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Camera2StreamConfigurationMap = mutex5;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizesFor = null;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputSizeshNQ4ISI = 8;
                                                            highResolutionOutputSizeshNQ4ISI2 = pageFetcherSnapshot2.getHighResolutionOutputSizeshNQ4ISI(pageFetcherSnapshotState3, loadType6, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1);
                                                            if (highResolutionOutputSizeshNQ4ISI2 == coroutine_suspended) {
                                                                loadType7 = loadType6;
                                                                coroutineScope8 = coroutineScope7;
                                                                pageFetcherSnapshot9 = pageFetcherSnapshot2;
                                                                r2 = mutex5;
                                                                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                                                                r2.unlock(null);
                                                                coroutineScope6 = coroutineScope8;
                                                                pageFetcherSnapshot8 = pageFetcherSnapshot9;
                                                                loadStates5 = loadStates6;
                                                                if (androidx.paging.PageFetcherSnapshot$pageEventFlow$1.AnonymousClass4.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[loadType7.ordinal()] == 1) {
                                                                    pageFetcherSnapshot11 = pageFetcherSnapshot8;
                                                                    viewportHint2 = null;
                                                                    loadType9 = loadType7;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes = loadStates5;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor = pageFetcherSnapshot8;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = coroutineScope6;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges = loadType7;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Camera2StreamConfigurationMap = null;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizesFor = null;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getOutputMinFrameDuration = null;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputFormats = null;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputSizeshNQ4ISI = 10;
                                                                    if (androidx.paging.PageFetcherSnapshot.access$retryLoadError(pageFetcherSnapshot11, loadType9, viewportHint2, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutine_suspended) {
                                                                        pageFetcherSnapshot12 = pageFetcherSnapshot8;
                                                                        loadType10 = loadType7;
                                                                        coroutineScope9 = coroutineScope6;
                                                                        loadStates7 = loadStates5;
                                                                        if (loadType10 == androidx.paging.LoadType.REFRESH) {
                                                                            holder9 = pageFetcherSnapshot12.getInputFormats;
                                                                            mutex7 = holder9.getHighSpeedVideoFpsRangesFor;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes = loadStates7;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor = pageFetcherSnapshot12;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = coroutineScope9;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges = holder9;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Camera2StreamConfigurationMap = mutex7;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputSizeshNQ4ISI = 11;
                                                                            break;
                                                                        }
                                                                        coroutineScope = coroutineScope9;
                                                                        pageFetcherSnapshot2 = pageFetcherSnapshot12;
                                                                        loadStates = loadStates7;
                                                                    }
                                                                } else {
                                                                    holder8 = pageFetcherSnapshot8.getInputFormats;
                                                                    mutex6 = holder8.getHighSpeedVideoFpsRangesFor;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes = loadStates5;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor = pageFetcherSnapshot8;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = coroutineScope6;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges = loadType7;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Camera2StreamConfigurationMap = holder8;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizesFor = mutex6;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getOutputMinFrameDuration = loadType7;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputFormats = pageFetcherSnapshot8;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputSizeshNQ4ISI = 9;
                                                                    if (mutex6.lock(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutine_suspended) {
                                                                        pageFetcherSnapshot10 = pageFetcherSnapshot8;
                                                                        loadType8 = loadType7;
                                                                        try {
                                                                            viewportHint2 = holder8.getHighSpeedVideoFpsRanges.getFailedHintsByLoadType$paging_common().get(loadType8);
                                                                            mutex6.unlock(null);
                                                                            pageFetcherSnapshot11 = pageFetcherSnapshot8;
                                                                            loadType9 = loadType7;
                                                                            loadType7 = loadType8;
                                                                            pageFetcherSnapshot8 = pageFetcherSnapshot10;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes = loadStates5;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor = pageFetcherSnapshot8;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = coroutineScope6;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges = loadType7;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Camera2StreamConfigurationMap = null;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizesFor = null;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getOutputMinFrameDuration = null;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputFormats = null;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputSizeshNQ4ISI = 10;
                                                                            if (androidx.paging.PageFetcherSnapshot.access$retryLoadError(pageFetcherSnapshot11, loadType9, viewportHint2, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutine_suspended) {
                                                                            }
                                                                        } finally {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        return coroutine_suspended;
                                                    }
                                                    loadStates5 = loadStates;
                                                    coroutineScope6 = coroutineScope;
                                                    loadType7 = loadType6;
                                                    pageFetcherSnapshot8 = pageFetcherSnapshot2;
                                                    if (androidx.paging.PageFetcherSnapshot$pageEventFlow$1.AnonymousClass4.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[loadType7.ordinal()] == 1) {
                                                    }
                                                }
                                                loadType11 = androidx.paging.LoadType.APPEND;
                                                if (loadStates.getAppend() instanceof androidx.paging.LoadState.Error) {
                                                    if (loadType11 != androidx.paging.LoadType.REFRESH) {
                                                        holder10 = pageFetcherSnapshot2.getInputFormats;
                                                        kotlinx.coroutines.sync.Mutex mutex13 = holder10.getHighSpeedVideoFpsRangesFor;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes = pageFetcherSnapshot2;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor = coroutineScope;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = loadType11;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges = holder10;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Camera2StreamConfigurationMap = mutex13;
                                                        pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputSizeshNQ4ISI = 12;
                                                        if (mutex13.lock(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutine_suspended) {
                                                            kotlinx.coroutines.CoroutineScope coroutineScope14 = coroutineScope;
                                                            holder11 = holder10;
                                                            mutex8 = mutex13;
                                                            coroutineScope11 = coroutineScope14;
                                                            androidx.paging.PageFetcherSnapshotState pageFetcherSnapshotState4 = holder11.getHighSpeedVideoFpsRanges;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes = pageFetcherSnapshot2;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor = coroutineScope11;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = loadType11;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges = mutex8;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Camera2StreamConfigurationMap = null;
                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputSizeshNQ4ISI = 13;
                                                            highResolutionOutputSizeshNQ4ISI3 = pageFetcherSnapshot2.getHighResolutionOutputSizeshNQ4ISI(pageFetcherSnapshotState4, loadType11, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1);
                                                            if (highResolutionOutputSizeshNQ4ISI3 == coroutine_suspended) {
                                                                loadType12 = loadType11;
                                                                coroutineScope12 = coroutineScope11;
                                                                pageFetcherSnapshot14 = pageFetcherSnapshot2;
                                                                r2 = mutex8;
                                                                kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                                                                r2.unlock(null);
                                                                coroutineScope10 = coroutineScope12;
                                                                pageFetcherSnapshot13 = pageFetcherSnapshot14;
                                                                if (androidx.paging.PageFetcherSnapshot$pageEventFlow$1.AnonymousClass4.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[loadType12.ordinal()] == 1) {
                                                                    pageFetcherSnapshot16 = pageFetcherSnapshot13;
                                                                    viewportHint3 = null;
                                                                    loadType15 = loadType12;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes = pageFetcherSnapshot13;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor = coroutineScope10;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = loadType12;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges = null;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Camera2StreamConfigurationMap = null;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizesFor = null;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getOutputMinFrameDuration = null;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputSizeshNQ4ISI = 15;
                                                                    if (androidx.paging.PageFetcherSnapshot.access$retryLoadError(pageFetcherSnapshot16, loadType15, viewportHint3, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutine_suspended) {
                                                                        coroutineScope13 = coroutineScope10;
                                                                        if (loadType12 == androidx.paging.LoadType.REFRESH) {
                                                                            holder13 = pageFetcherSnapshot13.getInputFormats;
                                                                            kotlinx.coroutines.sync.Mutex mutex14 = holder13.getHighSpeedVideoFpsRangesFor;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes = pageFetcherSnapshot13;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor = coroutineScope13;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = holder13;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges = mutex14;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputSizeshNQ4ISI = 16;
                                                                            if (mutex14.lock(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutine_suspended) {
                                                                                pageFetcherSnapshot17 = pageFetcherSnapshot13;
                                                                                mutex10 = mutex14;
                                                                                holder14 = holder13;
                                                                                try {
                                                                                    loadState = holder14.getHighSpeedVideoFpsRanges.getSourceLoadStates().get(androidx.paging.LoadType.REFRESH);
                                                                                    mutex10.unlock(null);
                                                                                    if (!(loadState instanceof androidx.paging.LoadState.Error)) {
                                                                                        androidx.paging.PageFetcherSnapshot.access$startConsumingHints(pageFetcherSnapshot17, coroutineScope13);
                                                                                    }
                                                                                } finally {
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    holder12 = pageFetcherSnapshot13.getInputFormats;
                                                                    kotlinx.coroutines.sync.Mutex mutex15 = holder12.getHighSpeedVideoFpsRangesFor;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes = pageFetcherSnapshot13;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor = coroutineScope10;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = loadType12;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges = holder12;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Camera2StreamConfigurationMap = mutex15;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizesFor = loadType12;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getOutputMinFrameDuration = pageFetcherSnapshot13;
                                                                    pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputSizeshNQ4ISI = 14;
                                                                    if (mutex15.lock(null, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutine_suspended) {
                                                                        pageFetcherSnapshot15 = pageFetcherSnapshot13;
                                                                        loadType13 = loadType12;
                                                                        loadType14 = loadType13;
                                                                        mutex9 = mutex15;
                                                                        try {
                                                                            viewportHint3 = holder12.getHighSpeedVideoFpsRanges.getFailedHintsByLoadType$paging_common().get(loadType14);
                                                                            mutex9.unlock(null);
                                                                            loadType15 = loadType13;
                                                                            loadType12 = loadType14;
                                                                            pageFetcherSnapshot16 = pageFetcherSnapshot13;
                                                                            pageFetcherSnapshot13 = pageFetcherSnapshot15;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes = pageFetcherSnapshot13;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor = coroutineScope10;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = loadType12;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges = null;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Camera2StreamConfigurationMap = null;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizesFor = null;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getOutputMinFrameDuration = null;
                                                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputSizeshNQ4ISI = 15;
                                                                            if (androidx.paging.PageFetcherSnapshot.access$retryLoadError(pageFetcherSnapshot16, loadType15, viewportHint3, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutine_suspended) {
                                                                            }
                                                                        } finally {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        return coroutine_suspended;
                                                    }
                                                    pageFetcherSnapshot13 = pageFetcherSnapshot2;
                                                    coroutineScope10 = coroutineScope;
                                                    loadType12 = loadType11;
                                                    if (androidx.paging.PageFetcherSnapshot$pageEventFlow$1.AnonymousClass4.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[loadType12.ordinal()] == 1) {
                                                    }
                                                }
                                                return kotlin.Unit.INSTANCE;
                                            } finally {
                                            }
                                        case 2:
                                            kotlinx.coroutines.sync.Mutex mutex16 = (kotlinx.coroutines.sync.Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizesFor;
                                            holder3 = (androidx.paging.PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Camera2StreamConfigurationMap;
                                            loadType = (androidx.paging.LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges;
                                            coroutineScope3 = (kotlinx.coroutines.CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                                            androidx.paging.PageFetcherSnapshot pageFetcherSnapshot18 = (androidx.paging.PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor;
                                            androidx.paging.LoadStates loadStates8 = (androidx.paging.LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes;
                                            kotlin.ResultKt.throwOnFailure(obj);
                                            pageFetcherSnapshot2 = pageFetcherSnapshot18;
                                            loadStates3 = loadStates8;
                                            mutex2 = mutex16;
                                            androidx.paging.PageFetcherSnapshotState pageFetcherSnapshotState22 = holder3.getHighSpeedVideoFpsRanges;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes = loadStates3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor = pageFetcherSnapshot2;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = coroutineScope3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges = loadType;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Camera2StreamConfigurationMap = mutex2;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizesFor = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputSizeshNQ4ISI = 3;
                                            highResolutionOutputSizeshNQ4ISI = pageFetcherSnapshot2.getHighResolutionOutputSizeshNQ4ISI(pageFetcherSnapshotState22, loadType, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1);
                                            if (highResolutionOutputSizeshNQ4ISI == coroutine_suspended) {
                                            }
                                            break;
                                        case 3:
                                            kotlinx.coroutines.sync.Mutex mutex17 = (kotlinx.coroutines.sync.Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Camera2StreamConfigurationMap;
                                            loadType2 = (androidx.paging.LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges;
                                            coroutineScope4 = (kotlinx.coroutines.CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                                            pageFetcherSnapshot4 = (androidx.paging.PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor;
                                            loadStates3 = (androidx.paging.LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes;
                                            kotlin.ResultKt.throwOnFailure(obj);
                                            r2 = mutex17;
                                            kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
                                            r2.unlock(null);
                                            coroutineScope2 = coroutineScope4;
                                            pageFetcherSnapshot3 = pageFetcherSnapshot4;
                                            loadStates2 = loadStates3;
                                            if (androidx.paging.PageFetcherSnapshot$pageEventFlow$1.AnonymousClass4.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[loadType2.ordinal()] == 1) {
                                            }
                                            break;
                                        case 4:
                                            pageFetcherSnapshot3 = (androidx.paging.PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputFormats;
                                            loadType2 = (androidx.paging.LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getOutputMinFrameDuration;
                                            mutex3 = (kotlinx.coroutines.sync.Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizesFor;
                                            holder4 = (androidx.paging.PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Camera2StreamConfigurationMap;
                                            loadType3 = (androidx.paging.LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges;
                                            coroutineScope2 = (kotlinx.coroutines.CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                                            pageFetcherSnapshot5 = (androidx.paging.PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor;
                                            loadStates2 = (androidx.paging.LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes;
                                            kotlin.ResultKt.throwOnFailure(obj);
                                            viewportHint = holder4.getHighSpeedVideoFpsRanges.getFailedHintsByLoadType$paging_common().get(loadType3);
                                            mutex3.unlock(null);
                                            pageFetcherSnapshot6 = pageFetcherSnapshot3;
                                            loadType4 = loadType2;
                                            loadType2 = loadType3;
                                            pageFetcherSnapshot3 = pageFetcherSnapshot5;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes = loadStates2;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor = pageFetcherSnapshot3;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = coroutineScope2;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges = loadType2;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Camera2StreamConfigurationMap = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizesFor = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getOutputMinFrameDuration = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputFormats = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputSizeshNQ4ISI = 5;
                                            if (androidx.paging.PageFetcherSnapshot.access$retryLoadError(pageFetcherSnapshot6, loadType4, viewportHint, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutine_suspended) {
                                            }
                                            return coroutine_suspended;
                                        case 5:
                                            loadType5 = (androidx.paging.LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges;
                                            kotlinx.coroutines.CoroutineScope coroutineScope15 = (kotlinx.coroutines.CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                                            androidx.paging.PageFetcherSnapshot pageFetcherSnapshot19 = (androidx.paging.PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor;
                                            androidx.paging.LoadStates loadStates9 = (androidx.paging.LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes;
                                            kotlin.ResultKt.throwOnFailure(obj);
                                            loadStates4 = loadStates9;
                                            pageFetcherSnapshot7 = pageFetcherSnapshot19;
                                            coroutineScope5 = coroutineScope15;
                                            if (loadType5 == androidx.paging.LoadType.REFRESH) {
                                            }
                                            coroutineScope = coroutineScope5;
                                            pageFetcherSnapshot2 = pageFetcherSnapshot7;
                                            loadStates = loadStates4;
                                            loadType6 = androidx.paging.LoadType.PREPEND;
                                            if (loadStates.getPrepend() instanceof androidx.paging.LoadState.Error) {
                                            }
                                            loadType11 = androidx.paging.LoadType.APPEND;
                                            if (loadStates.getAppend() instanceof androidx.paging.LoadState.Error) {
                                            }
                                            return kotlin.Unit.INSTANCE;
                                        case 6:
                                            mutex4 = (kotlinx.coroutines.sync.Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Camera2StreamConfigurationMap;
                                            holder5 = (androidx.paging.PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges;
                                            coroutineScope5 = (kotlinx.coroutines.CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                                            pageFetcherSnapshot7 = (androidx.paging.PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor;
                                            loadStates4 = (androidx.paging.LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes;
                                            kotlin.ResultKt.throwOnFailure(obj);
                                            try {
                                                androidx.paging.LoadState loadState2 = holder5.getHighSpeedVideoFpsRanges.getSourceLoadStates().get(androidx.paging.LoadType.REFRESH);
                                                mutex4.unlock(null);
                                                if (!(loadState2 instanceof androidx.paging.LoadState.Error)) {
                                                    androidx.paging.PageFetcherSnapshot.access$startConsumingHints(pageFetcherSnapshot7, coroutineScope5);
                                                }
                                                coroutineScope = coroutineScope5;
                                                pageFetcherSnapshot2 = pageFetcherSnapshot7;
                                                loadStates = loadStates4;
                                                loadType6 = androidx.paging.LoadType.PREPEND;
                                                if (loadStates.getPrepend() instanceof androidx.paging.LoadState.Error) {
                                                }
                                                loadType11 = androidx.paging.LoadType.APPEND;
                                                if (loadStates.getAppend() instanceof androidx.paging.LoadState.Error) {
                                                }
                                                return kotlin.Unit.INSTANCE;
                                            } finally {
                                            }
                                        case 7:
                                            kotlinx.coroutines.sync.Mutex mutex18 = (kotlinx.coroutines.sync.Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizesFor;
                                            holder7 = (androidx.paging.PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Camera2StreamConfigurationMap;
                                            loadType6 = (androidx.paging.LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges;
                                            coroutineScope7 = (kotlinx.coroutines.CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                                            androidx.paging.PageFetcherSnapshot pageFetcherSnapshot20 = (androidx.paging.PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor;
                                            androidx.paging.LoadStates loadStates10 = (androidx.paging.LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes;
                                            kotlin.ResultKt.throwOnFailure(obj);
                                            pageFetcherSnapshot2 = pageFetcherSnapshot20;
                                            loadStates6 = loadStates10;
                                            mutex5 = mutex18;
                                            androidx.paging.PageFetcherSnapshotState pageFetcherSnapshotState32 = holder7.getHighSpeedVideoFpsRanges;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes = loadStates6;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor = pageFetcherSnapshot2;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = coroutineScope7;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges = loadType6;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Camera2StreamConfigurationMap = mutex5;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizesFor = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputSizeshNQ4ISI = 8;
                                            highResolutionOutputSizeshNQ4ISI2 = pageFetcherSnapshot2.getHighResolutionOutputSizeshNQ4ISI(pageFetcherSnapshotState32, loadType6, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1);
                                            if (highResolutionOutputSizeshNQ4ISI2 == coroutine_suspended) {
                                            }
                                            break;
                                        case 8:
                                            kotlinx.coroutines.sync.Mutex mutex19 = (kotlinx.coroutines.sync.Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Camera2StreamConfigurationMap;
                                            loadType7 = (androidx.paging.LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges;
                                            coroutineScope8 = (kotlinx.coroutines.CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                                            pageFetcherSnapshot9 = (androidx.paging.PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor;
                                            loadStates6 = (androidx.paging.LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes;
                                            kotlin.ResultKt.throwOnFailure(obj);
                                            r2 = mutex19;
                                            kotlin.Unit unit32 = kotlin.Unit.INSTANCE;
                                            r2.unlock(null);
                                            coroutineScope6 = coroutineScope8;
                                            pageFetcherSnapshot8 = pageFetcherSnapshot9;
                                            loadStates5 = loadStates6;
                                            if (androidx.paging.PageFetcherSnapshot$pageEventFlow$1.AnonymousClass4.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[loadType7.ordinal()] == 1) {
                                            }
                                            break;
                                        case 9:
                                            pageFetcherSnapshot8 = (androidx.paging.PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputFormats;
                                            loadType7 = (androidx.paging.LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getOutputMinFrameDuration;
                                            mutex6 = (kotlinx.coroutines.sync.Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizesFor;
                                            holder8 = (androidx.paging.PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Camera2StreamConfigurationMap;
                                            loadType8 = (androidx.paging.LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges;
                                            coroutineScope6 = (kotlinx.coroutines.CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                                            pageFetcherSnapshot10 = (androidx.paging.PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor;
                                            loadStates5 = (androidx.paging.LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes;
                                            kotlin.ResultKt.throwOnFailure(obj);
                                            viewportHint2 = holder8.getHighSpeedVideoFpsRanges.getFailedHintsByLoadType$paging_common().get(loadType8);
                                            mutex6.unlock(null);
                                            pageFetcherSnapshot11 = pageFetcherSnapshot8;
                                            loadType9 = loadType7;
                                            loadType7 = loadType8;
                                            pageFetcherSnapshot8 = pageFetcherSnapshot10;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes = loadStates5;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor = pageFetcherSnapshot8;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = coroutineScope6;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges = loadType7;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Camera2StreamConfigurationMap = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizesFor = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getOutputMinFrameDuration = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputFormats = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputSizeshNQ4ISI = 10;
                                            if (androidx.paging.PageFetcherSnapshot.access$retryLoadError(pageFetcherSnapshot11, loadType9, viewportHint2, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutine_suspended) {
                                            }
                                            return coroutine_suspended;
                                        case 10:
                                            loadType10 = (androidx.paging.LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges;
                                            kotlinx.coroutines.CoroutineScope coroutineScope16 = (kotlinx.coroutines.CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                                            androidx.paging.PageFetcherSnapshot pageFetcherSnapshot21 = (androidx.paging.PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor;
                                            androidx.paging.LoadStates loadStates11 = (androidx.paging.LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes;
                                            kotlin.ResultKt.throwOnFailure(obj);
                                            loadStates7 = loadStates11;
                                            pageFetcherSnapshot12 = pageFetcherSnapshot21;
                                            coroutineScope9 = coroutineScope16;
                                            if (loadType10 == androidx.paging.LoadType.REFRESH) {
                                            }
                                            coroutineScope = coroutineScope9;
                                            pageFetcherSnapshot2 = pageFetcherSnapshot12;
                                            loadStates = loadStates7;
                                            loadType11 = androidx.paging.LoadType.APPEND;
                                            if (loadStates.getAppend() instanceof androidx.paging.LoadState.Error) {
                                            }
                                            return kotlin.Unit.INSTANCE;
                                        case 11:
                                            mutex7 = (kotlinx.coroutines.sync.Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Camera2StreamConfigurationMap;
                                            holder9 = (androidx.paging.PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges;
                                            coroutineScope9 = (kotlinx.coroutines.CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                                            pageFetcherSnapshot12 = (androidx.paging.PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor;
                                            loadStates7 = (androidx.paging.LoadStates) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes;
                                            kotlin.ResultKt.throwOnFailure(obj);
                                            try {
                                                androidx.paging.LoadState loadState3 = holder9.getHighSpeedVideoFpsRanges.getSourceLoadStates().get(androidx.paging.LoadType.REFRESH);
                                                mutex7.unlock(null);
                                                if (!(loadState3 instanceof androidx.paging.LoadState.Error)) {
                                                    androidx.paging.PageFetcherSnapshot.access$startConsumingHints(pageFetcherSnapshot12, coroutineScope9);
                                                }
                                                coroutineScope = coroutineScope9;
                                                pageFetcherSnapshot2 = pageFetcherSnapshot12;
                                                loadStates = loadStates7;
                                                loadType11 = androidx.paging.LoadType.APPEND;
                                                if (loadStates.getAppend() instanceof androidx.paging.LoadState.Error) {
                                                }
                                                return kotlin.Unit.INSTANCE;
                                            } finally {
                                            }
                                        case 12:
                                            kotlinx.coroutines.sync.Mutex mutex20 = (kotlinx.coroutines.sync.Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Camera2StreamConfigurationMap;
                                            holder11 = (androidx.paging.PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges;
                                            loadType11 = (androidx.paging.LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                                            coroutineScope11 = (kotlinx.coroutines.CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor;
                                            androidx.paging.PageFetcherSnapshot pageFetcherSnapshot22 = (androidx.paging.PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes;
                                            kotlin.ResultKt.throwOnFailure(obj);
                                            pageFetcherSnapshot2 = pageFetcherSnapshot22;
                                            mutex8 = mutex20;
                                            androidx.paging.PageFetcherSnapshotState pageFetcherSnapshotState42 = holder11.getHighSpeedVideoFpsRanges;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes = pageFetcherSnapshot2;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor = coroutineScope11;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = loadType11;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges = mutex8;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Camera2StreamConfigurationMap = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputSizeshNQ4ISI = 13;
                                            highResolutionOutputSizeshNQ4ISI3 = pageFetcherSnapshot2.getHighResolutionOutputSizeshNQ4ISI(pageFetcherSnapshotState42, loadType11, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1);
                                            if (highResolutionOutputSizeshNQ4ISI3 == coroutine_suspended) {
                                            }
                                            break;
                                        case 13:
                                            kotlinx.coroutines.sync.Mutex mutex21 = (kotlinx.coroutines.sync.Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges;
                                            loadType12 = (androidx.paging.LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                                            coroutineScope12 = (kotlinx.coroutines.CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor;
                                            pageFetcherSnapshot14 = (androidx.paging.PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes;
                                            kotlin.ResultKt.throwOnFailure(obj);
                                            r2 = mutex21;
                                            kotlin.Unit unit42 = kotlin.Unit.INSTANCE;
                                            r2.unlock(null);
                                            coroutineScope10 = coroutineScope12;
                                            pageFetcherSnapshot13 = pageFetcherSnapshot14;
                                            if (androidx.paging.PageFetcherSnapshot$pageEventFlow$1.AnonymousClass4.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[loadType12.ordinal()] == 1) {
                                            }
                                            break;
                                        case 14:
                                            pageFetcherSnapshot13 = (androidx.paging.PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getOutputMinFrameDuration;
                                            loadType13 = (androidx.paging.LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizesFor;
                                            mutex9 = (kotlinx.coroutines.sync.Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Camera2StreamConfigurationMap;
                                            holder12 = (androidx.paging.PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges;
                                            loadType14 = (androidx.paging.LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                                            coroutineScope10 = (kotlinx.coroutines.CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor;
                                            pageFetcherSnapshot15 = (androidx.paging.PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes;
                                            kotlin.ResultKt.throwOnFailure(obj);
                                            viewportHint3 = holder12.getHighSpeedVideoFpsRanges.getFailedHintsByLoadType$paging_common().get(loadType14);
                                            mutex9.unlock(null);
                                            loadType15 = loadType13;
                                            loadType12 = loadType14;
                                            pageFetcherSnapshot16 = pageFetcherSnapshot13;
                                            pageFetcherSnapshot13 = pageFetcherSnapshot15;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes = pageFetcherSnapshot13;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor = coroutineScope10;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = loadType12;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.Camera2StreamConfigurationMap = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizesFor = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getOutputMinFrameDuration = null;
                                            pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputSizeshNQ4ISI = 15;
                                            if (androidx.paging.PageFetcherSnapshot.access$retryLoadError(pageFetcherSnapshot16, loadType15, viewportHint3, pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1) != coroutine_suspended) {
                                            }
                                            return coroutine_suspended;
                                        case 15:
                                            androidx.paging.LoadType loadType16 = (androidx.paging.LoadType) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                                            coroutineScope13 = (kotlinx.coroutines.CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor;
                                            androidx.paging.PageFetcherSnapshot pageFetcherSnapshot23 = (androidx.paging.PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes;
                                            kotlin.ResultKt.throwOnFailure(obj);
                                            loadType12 = loadType16;
                                            pageFetcherSnapshot13 = pageFetcherSnapshot23;
                                            if (loadType12 == androidx.paging.LoadType.REFRESH) {
                                            }
                                            return kotlin.Unit.INSTANCE;
                                        case 16:
                                            mutex10 = (kotlinx.coroutines.sync.Mutex) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRanges;
                                            holder14 = (androidx.paging.PageFetcherSnapshotState.Holder) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                                            coroutineScope13 = (kotlinx.coroutines.CoroutineScope) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoFpsRangesFor;
                                            pageFetcherSnapshot17 = (androidx.paging.PageFetcherSnapshot) pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getHighSpeedVideoSizes;
                                            kotlin.ResultKt.throwOnFailure(obj);
                                            loadState = holder14.getHighSpeedVideoFpsRanges.getSourceLoadStates().get(androidx.paging.LoadType.REFRESH);
                                            mutex10.unlock(null);
                                            if (!(loadState instanceof androidx.paging.LoadState.Error)) {
                                            }
                                            return kotlin.Unit.INSTANCE;
                                        default:
                                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                }
                            }
                            switch (r2) {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
                pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1 = new androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1(this, continuation);
                java.lang.Object obj2 = pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getOutputFormats;
                java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r2 = pageFetcherSnapshot$pageEventFlow$1$4$1$emit$1.getInputSizeshNQ4ISI;
            }

            @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1$WhenMappings */
            public static final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[androidx.paging.LoadType.values().length];
                    try {
                        iArr[androidx.paging.LoadType.REFRESH.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            AnonymousClass1(androidx.paging.PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, kotlinx.coroutines.CoroutineScope coroutineScope) {
                this.getHighSpeedVideoFpsRanges = pageFetcherSnapshot;
                this.getHighResolutionOutputSizeshNQ4ISI = coroutineScope;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighSpeedVideoSizes = 1;
                if (kotlinx.coroutines.flow.FlowKt.consumeAsFlow(this.getHighSpeedVideoFpsRangesFor).collect(new androidx.paging.PageFetcherSnapshot$pageEventFlow$1.AnonymousClass4.AnonymousClass1(this.Camera2StreamConfigurationMap, coroutineScope), this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.paging.PageFetcherSnapshot$pageEventFlow$1.AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1.AnonymousClass4 anonymousClass4 = new androidx.paging.PageFetcherSnapshot$pageEventFlow$1.AnonymousClass4(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
            anonymousClass4.getHighResolutionOutputSizeshNQ4ISI = obj;
            return anonymousClass4;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(kotlinx.coroutines.channels.Channel<kotlin.Unit> channel, androidx.paging.PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, kotlin.coroutines.Continuation<? super androidx.paging.PageFetcherSnapshot$pageEventFlow$1.AnonymousClass4> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = channel;
            this.Camera2StreamConfigurationMap = pageFetcherSnapshot;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.paging.PageFetcherSnapshot$pageEventFlow$1) create((androidx.paging.SimpleProducerScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.paging.PageFetcherSnapshot$pageEventFlow$1 pageFetcherSnapshot$pageEventFlow$1 = new androidx.paging.PageFetcherSnapshot$pageEventFlow$1(this.getHighSpeedVideoFpsRangesFor, continuation);
        pageFetcherSnapshot$pageEventFlow$1.getOutputMinFrameDuration = obj;
        return pageFetcherSnapshot$pageEventFlow$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshot$pageEventFlow$1(androidx.paging.PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, kotlin.coroutines.Continuation<? super androidx.paging.PageFetcherSnapshot$pageEventFlow$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = pageFetcherSnapshot;
    }
}
