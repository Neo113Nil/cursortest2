package androidx.paging;

/* JADX INFO: Add missing generic type declarations: [Value] */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "Value", "", "Landroidx/paging/SimpleProducerScope;", "Landroidx/paging/PagingData;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PageFetcher$flow$1", f = "PageFetcher.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class PageFetcher$flow$1<Value> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.paging.SimpleProducerScope<androidx.paging.PagingData<Value>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.paging.PageFetcher<Key, Value> getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.paging.RemoteMediator<Key, Value> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.paging.ConflatedEventBus conflatedEventBus;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.paging.SimpleProducerScope simpleProducerScope = (androidx.paging.SimpleProducerScope) this.getHighSpeedVideoFpsRangesFor;
            androidx.paging.RemoteMediator<Key, Value> remoteMediator = this.getHighSpeedVideoSizes;
            androidx.paging.RemoteMediatorAccessor RemoteMediatorAccessor = remoteMediator != 0 ? androidx.paging.RemoteMediatorAccessorKt.RemoteMediatorAccessor(simpleProducerScope, remoteMediator) : null;
            conflatedEventBus = ((androidx.paging.PageFetcher) this.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoFpsRanges;
            this.Camera2StreamConfigurationMap = 1;
            if (androidx.paging.FlowExtKt.simpleTransformLatest(kotlinx.coroutines.flow.FlowKt.filterNotNull(androidx.paging.FlowExtKt.simpleScan(kotlinx.coroutines.flow.FlowKt.onStart(conflatedEventBus.getFlow(), new androidx.paging.PageFetcher$flow$1.AnonymousClass1(RemoteMediatorAccessor, null)), null, new androidx.paging.PageFetcher$flow$1.AnonymousClass2(RemoteMediatorAccessor, this.getHighResolutionOutputSizeshNQ4ISI, null))), new androidx.paging.PageFetcher$flow$1$invokeSuspend$$inlined$simpleMapLatest$1(null, this.getHighResolutionOutputSizeshNQ4ISI, RemoteMediatorAccessor)).collect(new androidx.paging.PageFetcher$flow$1.AnonymousClass4(simpleProducerScope), this) == coroutine_suspended) {
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

    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PageFetcher$flow$1$1", f = "PageFetcher.kt", i = {}, l = {59, 59}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.paging.PageFetcher$flow$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super java.lang.Boolean>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.paging.RemoteMediatorAccessor<Key, Value> getHighResolutionOutputSizeshNQ4ISI;
        private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
        
            if (r1.emit(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4), r6) != r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x003a, code lost:
        
            if (r7 != r0) goto L14;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.flow.FlowCollector flowCollector;
            androidx.paging.RemoteMediator.InitializeAction initializeAction;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoFpsRangesFor;
                androidx.paging.RemoteMediatorAccessor<Key, Value> remoteMediatorAccessor = this.getHighResolutionOutputSizeshNQ4ISI;
                if (remoteMediatorAccessor != 0) {
                    this.getHighSpeedVideoFpsRangesFor = flowCollector;
                    this.getHighSpeedVideoSizes = 1;
                    obj = remoteMediatorAccessor.initialize(this);
                } else {
                    initializeAction = null;
                    boolean z = initializeAction == androidx.paging.RemoteMediator.InitializeAction.LAUNCH_INITIAL_REFRESH;
                    this.getHighSpeedVideoFpsRangesFor = null;
                    this.getHighSpeedVideoSizes = 2;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            initializeAction = (androidx.paging.RemoteMediator.InitializeAction) obj;
            if (initializeAction == androidx.paging.RemoteMediator.InitializeAction.LAUNCH_INITIAL_REFRESH) {
            }
            this.getHighSpeedVideoFpsRangesFor = null;
            this.getHighSpeedVideoSizes = 2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Boolean> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.paging.PageFetcher$flow$1.AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.paging.PageFetcher$flow$1.AnonymousClass1 anonymousClass1 = new androidx.paging.PageFetcher$flow$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            anonymousClass1.getHighSpeedVideoFpsRangesFor = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.paging.RemoteMediatorAccessor<Key, Value> remoteMediatorAccessor, kotlin.coroutines.Continuation<? super androidx.paging.PageFetcher$flow$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = remoteMediatorAccessor;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [Key] */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, d2 = {"<anonymous>", "Landroidx/paging/PageFetcher$GenerationInfo;", "Key", "Value", "", "previousGeneration", "triggerRemoteRefresh", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PageFetcher$flow$1$2", f = "PageFetcher.kt", i = {0, 1, 1}, l = {71, 75}, m = "invokeSuspend", n = {"previousGeneration", "previousGeneration", "pagingSource"}, s = {"L$0", "L$0", "L$1"}, v = 1)
    /* renamed from: androidx.paging.PageFetcher$flow$1$2, reason: invalid class name */
    static final class AnonymousClass2<Key> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<androidx.paging.PageFetcher.GenerationInfo<Key, Value>, java.lang.Boolean, kotlin.coroutines.Continuation<? super androidx.paging.PageFetcher.GenerationInfo<Key, Value>>, java.lang.Object> {
        /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.paging.RemoteMediatorAccessor<Key, Value> getHighResolutionOutputSizeshNQ4ISI;
        /* synthetic */ boolean getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        java.lang.Object getHighSpeedVideoSizes;
        final /* synthetic */ androidx.paging.PageFetcher<Key, Value> getInputFormats;

        /* JADX WARN: Removed duplicated region for block: B:11:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00fd  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0082  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            androidx.paging.PageFetcher.GenerationInfo generationInfo;
            androidx.paging.PageFetcherSnapshot<Key, Value> highSpeedVideoFpsRanges;
            androidx.paging.RemoteMediatorAccessor<Key, Value> remoteMediatorAccessor;
            androidx.paging.PagingSource pagingSource;
            androidx.paging.PagingState<Key, Value> pagingState;
            androidx.paging.PageFetcherSnapshot<Key, Value> highSpeedVideoFpsRanges2;
            androidx.paging.PagingSource pagingSource2;
            java.util.List<androidx.paging.PagingSource.LoadResult.Page<Key, Value>> pages;
            androidx.paging.PagingState<Key, Value> Camera2StreamConfigurationMap;
            java.util.List<androidx.paging.PagingSource.LoadResult.Page<Key, Value>> pages2;
            java.lang.Object refreshKey;
            androidx.paging.PagingConfig pagingConfig;
            androidx.paging.ConflatedEventBus conflatedEventBus;
            kotlinx.coroutines.CompletableJob Job$default;
            kotlinx.coroutines.Job getHighSpeedVideoFpsRanges;
            androidx.paging.PageFetcherSnapshot<Key, Value> highSpeedVideoFpsRanges3;
            androidx.paging.PagingState<Key, Value> Camera2StreamConfigurationMap2;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.paging.PageFetcher.GenerationInfo generationInfo2 = (androidx.paging.PageFetcher.GenerationInfo) this.Camera2StreamConfigurationMap;
                if (this.getHighSpeedVideoFpsRanges && (remoteMediatorAccessor = this.getHighResolutionOutputSizeshNQ4ISI) != null) {
                    remoteMediatorAccessor.allowRefresh();
                }
                androidx.paging.PageFetcher<Key, Value> pageFetcher = this.getInputFormats;
                androidx.paging.PagingSource<Key, Value> pagingSource$paging_common = (generationInfo2 == null || (highSpeedVideoFpsRanges = generationInfo2.getHighSpeedVideoFpsRanges()) == null) ? null : highSpeedVideoFpsRanges.getPagingSource$paging_common();
                this.Camera2StreamConfigurationMap = generationInfo2;
                this.getHighSpeedVideoFpsRangesFor = 1;
                java.lang.Object access$generateNewPagingSource = androidx.paging.PageFetcher.access$generateNewPagingSource(pageFetcher, pagingSource$paging_common, this);
                if (access$generateNewPagingSource != coroutine_suspended) {
                    generationInfo = generationInfo2;
                    obj = access$generateNewPagingSource;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pagingSource2 = (androidx.paging.PagingSource) this.getHighSpeedVideoSizes;
                generationInfo = (androidx.paging.PageFetcher.GenerationInfo) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                pagingState = (androidx.paging.PagingState) obj;
                pagingSource = pagingSource2;
                pages = pagingState != null ? pagingState.getPages() : null;
                if ((pages != null || pages.isEmpty()) && generationInfo != null && (Camera2StreamConfigurationMap = generationInfo.Camera2StreamConfigurationMap()) != null && (pages2 = Camera2StreamConfigurationMap.getPages()) != null && (!pages2.isEmpty())) {
                    pagingState = generationInfo.Camera2StreamConfigurationMap();
                }
                if ((pagingState != null ? pagingState.getAnchorPosition() : null) == null) {
                    if (((generationInfo == null || (Camera2StreamConfigurationMap2 = generationInfo.Camera2StreamConfigurationMap()) == null) ? null : Camera2StreamConfigurationMap2.getAnchorPosition()) != null) {
                        pagingState = generationInfo.Camera2StreamConfigurationMap();
                    }
                }
                if (pagingState == null) {
                    refreshKey = ((androidx.paging.PageFetcher) this.getInputFormats).getHighSpeedVideoSizes;
                } else {
                    refreshKey = pagingSource.getRefreshKey(pagingState);
                    androidx.paging.PagingLogger pagingLogger = androidx.paging.PagingLogger.INSTANCE;
                    if (pagingLogger.isLoggable(3)) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Refresh key ");
                        sb.append(refreshKey);
                        sb.append(" returned from PagingSource ");
                        sb.append(pagingSource);
                        pagingLogger.log(3, sb.toString(), null);
                    }
                }
                java.lang.Object obj2 = refreshKey;
                if (generationInfo != null && (highSpeedVideoFpsRanges3 = generationInfo.getHighSpeedVideoFpsRanges()) != null) {
                    highSpeedVideoFpsRanges3.close();
                }
                if (generationInfo != null && (getHighSpeedVideoFpsRanges = generationInfo.getGetHighSpeedVideoFpsRanges()) != null) {
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(getHighSpeedVideoFpsRanges, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                }
                pagingConfig = ((androidx.paging.PageFetcher) this.getInputFormats).getHighSpeedVideoFpsRangesFor;
                conflatedEventBus = ((androidx.paging.PageFetcher) this.getInputFormats).Camera2StreamConfigurationMap;
                androidx.paging.PageFetcherSnapshot pageFetcherSnapshot = new androidx.paging.PageFetcherSnapshot(obj2, pagingSource, pagingConfig, conflatedEventBus.getFlow(), this.getHighResolutionOutputSizeshNQ4ISI, pagingState, new androidx.paging.PageFetcher$flow$1.AnonymousClass2.AnonymousClass1(this.getInputFormats));
                Job$default = kotlinx.coroutines.JobKt__JobKt.Job$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
                return new androidx.paging.PageFetcher.GenerationInfo(pageFetcherSnapshot, pagingState, Job$default);
            }
            generationInfo = (androidx.paging.PageFetcher.GenerationInfo) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.paging.PagingSource pagingSource3 = (androidx.paging.PagingSource) obj;
            if (generationInfo == null || (highSpeedVideoFpsRanges2 = generationInfo.getHighSpeedVideoFpsRanges()) == null) {
                pagingSource = pagingSource3;
                pagingState = null;
                pages = pagingState != null ? pagingState.getPages() : null;
                if (pages != null) {
                }
                pagingState = generationInfo.Camera2StreamConfigurationMap();
                if ((pagingState != null ? pagingState.getAnchorPosition() : null) == null) {
                }
                if (pagingState == null) {
                }
                java.lang.Object obj22 = refreshKey;
                if (generationInfo != null) {
                    highSpeedVideoFpsRanges3.close();
                }
                if (generationInfo != null) {
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(getHighSpeedVideoFpsRanges, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                }
                pagingConfig = ((androidx.paging.PageFetcher) this.getInputFormats).getHighSpeedVideoFpsRangesFor;
                conflatedEventBus = ((androidx.paging.PageFetcher) this.getInputFormats).Camera2StreamConfigurationMap;
                androidx.paging.PageFetcherSnapshot pageFetcherSnapshot2 = new androidx.paging.PageFetcherSnapshot(obj22, pagingSource, pagingConfig, conflatedEventBus.getFlow(), this.getHighResolutionOutputSizeshNQ4ISI, pagingState, new androidx.paging.PageFetcher$flow$1.AnonymousClass2.AnonymousClass1(this.getInputFormats));
                Job$default = kotlinx.coroutines.JobKt__JobKt.Job$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
                return new androidx.paging.PageFetcher.GenerationInfo(pageFetcherSnapshot2, pagingState, Job$default);
            }
            this.Camera2StreamConfigurationMap = generationInfo;
            this.getHighSpeedVideoSizes = pagingSource3;
            this.getHighSpeedVideoFpsRangesFor = 2;
            java.lang.Object currentPagingState = highSpeedVideoFpsRanges2.currentPagingState(this);
            if (currentPagingState != coroutine_suspended) {
                pagingSource2 = pagingSource3;
                obj = currentPagingState;
                pagingState = (androidx.paging.PagingState) obj;
                pagingSource = pagingSource2;
                pages = pagingState != null ? pagingState.getPages() : null;
                if (pages != null) {
                }
                pagingState = generationInfo.Camera2StreamConfigurationMap();
                if ((pagingState != null ? pagingState.getAnchorPosition() : null) == null) {
                }
                if (pagingState == null) {
                }
                java.lang.Object obj222 = refreshKey;
                if (generationInfo != null) {
                }
                if (generationInfo != null) {
                }
                pagingConfig = ((androidx.paging.PageFetcher) this.getInputFormats).getHighSpeedVideoFpsRangesFor;
                conflatedEventBus = ((androidx.paging.PageFetcher) this.getInputFormats).Camera2StreamConfigurationMap;
                androidx.paging.PageFetcherSnapshot pageFetcherSnapshot22 = new androidx.paging.PageFetcherSnapshot(obj222, pagingSource, pagingConfig, conflatedEventBus.getFlow(), this.getHighResolutionOutputSizeshNQ4ISI, pagingState, new androidx.paging.PageFetcher$flow$1.AnonymousClass2.AnonymousClass1(this.getInputFormats));
                Job$default = kotlinx.coroutines.JobKt__JobKt.Job$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
                return new androidx.paging.PageFetcher.GenerationInfo(pageFetcherSnapshot22, pagingState, Job$default);
            }
            return coroutine_suspended;
        }

        @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: androidx.paging.PageFetcher$flow$1$2$1, reason: invalid class name */
        static final /* synthetic */ class AnonymousClass1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
            public final void getHighSpeedVideoFpsRanges() {
                ((androidx.paging.PageFetcher) this.receiver).refresh();
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                getHighSpeedVideoFpsRanges();
                return kotlin.Unit.INSTANCE;
            }

            AnonymousClass1(java.lang.Object obj) {
                super(0, obj, androidx.paging.PageFetcher.class, com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ACTION_REFRESH, "refresh()V", 0);
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Boolean bool, java.lang.Object obj2) {
            boolean booleanValue = bool.booleanValue();
            androidx.paging.PageFetcher$flow$1.AnonymousClass2 anonymousClass2 = new androidx.paging.PageFetcher$flow$1.AnonymousClass2(this.getHighResolutionOutputSizeshNQ4ISI, this.getInputFormats, (kotlin.coroutines.Continuation) obj2);
            anonymousClass2.Camera2StreamConfigurationMap = (androidx.paging.PageFetcher.GenerationInfo) obj;
            anonymousClass2.getHighSpeedVideoFpsRanges = booleanValue;
            return anonymousClass2.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(androidx.paging.RemoteMediatorAccessor<Key, Value> remoteMediatorAccessor, androidx.paging.PageFetcher<Key, Value> pageFetcher, kotlin.coroutines.Continuation<? super androidx.paging.PageFetcher$flow$1.AnonymousClass2> continuation) {
            super(3, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = remoteMediatorAccessor;
            this.getInputFormats = pageFetcher;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.paging.PageFetcher$flow$1$4, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass4 implements kotlinx.coroutines.flow.FlowCollector, kotlin.jvm.internal.FunctionAdapter {
        final /* synthetic */ androidx.paging.SimpleProducerScope<androidx.paging.PagingData<Value>> getHighSpeedVideoFpsRanges;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            java.lang.Object send = this.getHighSpeedVideoFpsRanges.send((androidx.paging.PagingData) obj, continuation);
            return send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : kotlin.Unit.INSTANCE;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final kotlin.Function<?> getFunctionDelegate() {
            return new kotlin.jvm.internal.FunctionReferenceImpl(2, this.getHighSpeedVideoFpsRanges, androidx.paging.SimpleProducerScope.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof kotlinx.coroutines.flow.FlowCollector) && (obj instanceof kotlin.jvm.internal.FunctionAdapter)) {
                return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        AnonymousClass4(androidx.paging.SimpleProducerScope<androidx.paging.PagingData<Value>> simpleProducerScope) {
            this.getHighSpeedVideoFpsRanges = simpleProducerScope;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.paging.PageFetcher$flow$1) create((androidx.paging.SimpleProducerScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.paging.PageFetcher$flow$1 pageFetcher$flow$1 = new androidx.paging.PageFetcher$flow$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        pageFetcher$flow$1.getHighSpeedVideoFpsRangesFor = obj;
        return pageFetcher$flow$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcher$flow$1(androidx.paging.RemoteMediator<Key, Value> remoteMediator, androidx.paging.PageFetcher<Key, Value> pageFetcher, kotlin.coroutines.Continuation<? super androidx.paging.PageFetcher$flow$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = remoteMediator;
        this.getHighResolutionOutputSizeshNQ4ISI = pageFetcher;
    }
}
