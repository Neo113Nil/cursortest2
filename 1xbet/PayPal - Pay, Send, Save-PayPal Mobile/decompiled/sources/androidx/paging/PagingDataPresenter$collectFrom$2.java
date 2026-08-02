package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PagingDataPresenter$collectFrom$2", f = "PagingDataPresenter.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class PagingDataPresenter$collectFrom$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.paging.PagingData<T> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.paging.PagingDataPresenter<T> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.paging.PagingDataPresenter.access$setUiReceiver(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap.getUiReceiver());
            kotlinx.coroutines.flow.Flow flow$paging_common = this.Camera2StreamConfigurationMap.getFlow$paging_common();
            final androidx.paging.PagingDataPresenter<T> pagingDataPresenter = this.getHighSpeedVideoFpsRangesFor;
            final androidx.paging.PagingData<T> pagingData = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = 1;
            if (flow$paging_common.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.paging.PagingDataPresenter$collectFrom$2.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    kotlin.coroutines.CoroutineContext coroutineContext;
                    androidx.paging.PageEvent pageEvent = (androidx.paging.PageEvent) obj2;
                    androidx.paging.PagingLogger pagingLogger = androidx.paging.PagingLogger.INSTANCE;
                    if (pagingLogger.isLoggable(2)) {
                        pagingLogger.log(2, "Collected ".concat(java.lang.String.valueOf(pageEvent)), null);
                    }
                    coroutineContext = ((androidx.paging.PagingDataPresenter) pagingDataPresenter).getHighSpeedVideoFpsRangesFor;
                    java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(coroutineContext, new androidx.paging.PagingDataPresenter$collectFrom$2.AnonymousClass1.AnonymousClass2(pageEvent, pagingDataPresenter, pagingData, null), continuation);
                    return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PagingDataPresenter$collectFrom$2$1$2", f = "PagingDataPresenter.kt", i = {}, l = {137, 153, 165, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, 226}, m = "invokeSuspend", n = {}, s = {}, v = 1)
                /* renamed from: androidx.paging.PagingDataPresenter$collectFrom$2$1$2, reason: invalid class name */
                static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                    final /* synthetic */ androidx.paging.PagingData<T> Camera2StreamConfigurationMap;
                    final /* synthetic */ androidx.paging.PagingDataPresenter<T> getHighSpeedVideoFpsRanges;
                    int getHighSpeedVideoFpsRangesFor;
                    final /* synthetic */ androidx.paging.PageEvent<T> getHighSpeedVideoSizes;

                    /* JADX WARN: Code restructure failed: missing block: B:23:0x025e, code lost:
                    
                        if (r14.presentPagingDataEvent(r1.processEvent(r13.getHighSpeedVideoSizes), r13) != r0) goto L86;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:70:0x0119, code lost:
                    
                        if (r14.presentPagingDataEvent(r1.processEvent(r13.getHighSpeedVideoSizes), r13) == r0) goto L85;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:80:0x008e, code lost:
                    
                        if (r14 == r0) goto L85;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:87:0x00db, code lost:
                    
                        if (r14 == r0) goto L85;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:93:0x0101, code lost:
                    
                        if (kotlinx.coroutines.YieldKt.yield(r13) != r0) goto L35;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:99:0x0246, code lost:
                    
                        if (kotlinx.coroutines.YieldKt.yield(r13) != r0) goto L83;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:10:0x02a3  */
                    /* JADX WARN: Removed duplicated region for block: B:19:0x02bd A[LOOP:0: B:17:0x02b7->B:19:0x02bd, LOOP_END] */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        androidx.paging.MutableCombinedLoadStateCollection mutableCombinedLoadStateCollection;
                        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
                        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
                        java.lang.Object highResolutionOutputSizeshNQ4ISI;
                        java.lang.Object highResolutionOutputSizeshNQ4ISI2;
                        androidx.paging.PageStore pageStore;
                        androidx.paging.MutableCombinedLoadStateCollection mutableCombinedLoadStateCollection2;
                        androidx.paging.MutableCombinedLoadStateCollection mutableCombinedLoadStateCollection3;
                        boolean z;
                        androidx.paging.HintReceiver hintReceiver;
                        androidx.paging.PageStore pageStore2;
                        int i;
                        int i2;
                        androidx.paging.PageStore pageStore3;
                        int i3;
                        androidx.paging.PageStore pageStore4;
                        androidx.paging.PageStore pageStore5;
                        androidx.paging.PageStore pageStore6;
                        androidx.paging.PageEvent<T> pageEvent;
                        androidx.paging.internal.CopyOnWriteArrayList copyOnWriteArrayList;
                        java.util.Iterator<T> it;
                        androidx.paging.MutableCombinedLoadStateCollection mutableCombinedLoadStateCollection4;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        boolean z2 = true;
                        switch (this.getHighSpeedVideoFpsRangesFor) {
                            case 0:
                                kotlin.ResultKt.throwOnFailure(obj);
                                androidx.paging.PageEvent<T> pageEvent2 = this.getHighSpeedVideoSizes;
                                if (pageEvent2 instanceof androidx.paging.PageEvent.StaticList) {
                                    androidx.paging.PagingDataPresenter<T> pagingDataPresenter = this.getHighSpeedVideoFpsRanges;
                                    java.util.List listOf = kotlin.collections.CollectionsKt.listOf(new androidx.paging.TransformablePage(0, ((androidx.paging.PageEvent.StaticList) this.getHighSpeedVideoSizes).getData()));
                                    int placeholdersBefore = ((androidx.paging.PageEvent.StaticList) this.getHighSpeedVideoSizes).getPlaceholdersBefore();
                                    int placeholdersAfter = ((androidx.paging.PageEvent.StaticList) this.getHighSpeedVideoSizes).getPlaceholdersAfter();
                                    boolean z3 = (((androidx.paging.PageEvent.StaticList) this.getHighSpeedVideoSizes).getSourceLoadStates() == null && ((androidx.paging.PageEvent.StaticList) this.getHighSpeedVideoSizes).getMediatorLoadStates() == null) ? false : true;
                                    this.getHighSpeedVideoFpsRangesFor = 1;
                                    highResolutionOutputSizeshNQ4ISI2 = pagingDataPresenter.getHighResolutionOutputSizeshNQ4ISI(listOf, placeholdersBefore, placeholdersAfter, z3, ((androidx.paging.PageEvent.StaticList) this.getHighSpeedVideoSizes).getSourceLoadStates(), ((androidx.paging.PageEvent.StaticList) this.getHighSpeedVideoSizes).getMediatorLoadStates(), this.Camera2StreamConfigurationMap.getHintReceiver(), this);
                                    break;
                                } else if ((pageEvent2 instanceof androidx.paging.PageEvent.Insert) && ((androidx.paging.PageEvent.Insert) pageEvent2).getLoadType() == androidx.paging.LoadType.REFRESH) {
                                    this.getHighSpeedVideoFpsRangesFor = 2;
                                    highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(((androidx.paging.PageEvent.Insert) this.getHighSpeedVideoSizes).getPages(), ((androidx.paging.PageEvent.Insert) this.getHighSpeedVideoSizes).getPlaceholdersBefore(), ((androidx.paging.PageEvent.Insert) this.getHighSpeedVideoSizes).getPlaceholdersAfter(), true, ((androidx.paging.PageEvent.Insert) this.getHighSpeedVideoSizes).getSourceLoadStates(), ((androidx.paging.PageEvent.Insert) this.getHighSpeedVideoSizes).getMediatorLoadStates(), this.Camera2StreamConfigurationMap.getHintReceiver(), this);
                                    break;
                                } else {
                                    androidx.paging.PageEvent<T> pageEvent3 = this.getHighSpeedVideoSizes;
                                    if (pageEvent3 instanceof androidx.paging.PageEvent.Insert) {
                                        mutableStateFlow2 = ((androidx.paging.PagingDataPresenter) this.getHighSpeedVideoFpsRanges).getOutputMinFrameDuration;
                                        if (((java.lang.Boolean) mutableStateFlow2.getValue()).booleanValue()) {
                                            this.getHighSpeedVideoFpsRangesFor = 3;
                                            break;
                                        }
                                        androidx.paging.PagingDataPresenter<T> pagingDataPresenter2 = this.getHighSpeedVideoFpsRanges;
                                        pageStore = ((androidx.paging.PagingDataPresenter) pagingDataPresenter2).getHighResolutionOutputSizeshNQ4ISI;
                                        this.getHighSpeedVideoFpsRangesFor = 4;
                                        break;
                                    } else if (pageEvent3 instanceof androidx.paging.PageEvent.Drop) {
                                        mutableStateFlow = ((androidx.paging.PagingDataPresenter) this.getHighSpeedVideoFpsRanges).getOutputMinFrameDuration;
                                        if (((java.lang.Boolean) mutableStateFlow.getValue()).booleanValue()) {
                                            this.getHighSpeedVideoFpsRangesFor = 5;
                                            break;
                                        }
                                        androidx.paging.PagingDataPresenter<T> pagingDataPresenter3 = this.getHighSpeedVideoFpsRanges;
                                        pageStore6 = ((androidx.paging.PagingDataPresenter) pagingDataPresenter3).getHighResolutionOutputSizeshNQ4ISI;
                                        this.getHighSpeedVideoFpsRangesFor = 6;
                                        break;
                                    } else {
                                        if (pageEvent3 instanceof androidx.paging.PageEvent.LoadStateUpdate) {
                                            mutableCombinedLoadStateCollection = ((androidx.paging.PagingDataPresenter) this.getHighSpeedVideoFpsRanges).Camera2StreamConfigurationMap;
                                            mutableCombinedLoadStateCollection.set(((androidx.paging.PageEvent.LoadStateUpdate) this.getHighSpeedVideoSizes).getSource(), ((androidx.paging.PageEvent.LoadStateUpdate) this.getHighSpeedVideoSizes).getMediator());
                                        }
                                        pageEvent = this.getHighSpeedVideoSizes;
                                        if (!(pageEvent instanceof androidx.paging.PageEvent.Insert) || (pageEvent instanceof androidx.paging.PageEvent.Drop) || (pageEvent instanceof androidx.paging.PageEvent.StaticList)) {
                                            copyOnWriteArrayList = ((androidx.paging.PagingDataPresenter) this.getHighSpeedVideoFpsRanges).getHighSpeedVideoSizesFor;
                                            it = copyOnWriteArrayList.iterator();
                                            while (it.hasNext()) {
                                                ((kotlin.jvm.functions.Function0) it.next()).invoke();
                                            }
                                        }
                                        return kotlin.Unit.INSTANCE;
                                    }
                                    return coroutine_suspended;
                                }
                                break;
                            case 1:
                            case 2:
                                kotlin.ResultKt.throwOnFailure(obj);
                                pageEvent = this.getHighSpeedVideoSizes;
                                if (!(pageEvent instanceof androidx.paging.PageEvent.Insert)) {
                                    break;
                                }
                                copyOnWriteArrayList = ((androidx.paging.PagingDataPresenter) this.getHighSpeedVideoFpsRanges).getHighSpeedVideoSizesFor;
                                it = copyOnWriteArrayList.iterator();
                                while (it.hasNext()) {
                                }
                                return kotlin.Unit.INSTANCE;
                            case 3:
                                kotlin.ResultKt.throwOnFailure(obj);
                                androidx.paging.PagingDataPresenter<T> pagingDataPresenter22 = this.getHighSpeedVideoFpsRanges;
                                pageStore = ((androidx.paging.PagingDataPresenter) pagingDataPresenter22).getHighResolutionOutputSizeshNQ4ISI;
                                this.getHighSpeedVideoFpsRangesFor = 4;
                                break;
                            case 4:
                                kotlin.ResultKt.throwOnFailure(obj);
                                mutableCombinedLoadStateCollection2 = ((androidx.paging.PagingDataPresenter) this.getHighSpeedVideoFpsRanges).Camera2StreamConfigurationMap;
                                mutableCombinedLoadStateCollection2.set(((androidx.paging.PageEvent.Insert) this.getHighSpeedVideoSizes).getSourceLoadStates(), ((androidx.paging.PageEvent.Insert) this.getHighSpeedVideoSizes).getMediatorLoadStates());
                                mutableCombinedLoadStateCollection3 = ((androidx.paging.PagingDataPresenter) this.getHighSpeedVideoFpsRanges).Camera2StreamConfigurationMap;
                                androidx.paging.CombinedLoadStates value = mutableCombinedLoadStateCollection3.getStateFlow().getValue();
                                androidx.paging.LoadStates source = value != null ? value.getSource() : null;
                                if (source == null) {
                                    throw new java.lang.IllegalStateException("PagingDataPresenter.combinedLoadStatesCollection.stateFlow should not hold null CombinedLoadStates after Insert event.".toString());
                                }
                                boolean z4 = ((((androidx.paging.PageEvent.Insert) this.getHighSpeedVideoSizes).getLoadType() == androidx.paging.LoadType.PREPEND && source.getPrepend().getEndOfPaginationReached()) || (((androidx.paging.PageEvent.Insert) this.getHighSpeedVideoSizes).getLoadType() == androidx.paging.LoadType.APPEND && source.getAppend().getEndOfPaginationReached())) ? false : true;
                                java.util.List<androidx.paging.TransformablePage<T>> pages = ((androidx.paging.PageEvent.Insert) this.getHighSpeedVideoSizes).getPages();
                                if (!(pages instanceof java.util.Collection) || !pages.isEmpty()) {
                                    java.util.Iterator<T> it2 = pages.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            if (!((androidx.paging.TransformablePage) it2.next()).getData().isEmpty()) {
                                                z2 = false;
                                            }
                                        }
                                    }
                                }
                                if (!z4) {
                                    ((androidx.paging.PagingDataPresenter) this.getHighSpeedVideoFpsRanges).getInputFormats = false;
                                } else {
                                    z = ((androidx.paging.PagingDataPresenter) this.getHighSpeedVideoFpsRanges).getInputFormats;
                                    if (z || z2) {
                                        if (!z2) {
                                            i2 = ((androidx.paging.PagingDataPresenter) this.getHighSpeedVideoFpsRanges).getInputSizeshNQ4ISI;
                                            pageStore3 = ((androidx.paging.PagingDataPresenter) this.getHighSpeedVideoFpsRanges).getHighResolutionOutputSizeshNQ4ISI;
                                            if (i2 >= pageStore3.getPlaceholdersBefore()) {
                                                i3 = ((androidx.paging.PagingDataPresenter) this.getHighSpeedVideoFpsRanges).getInputSizeshNQ4ISI;
                                                pageStore4 = ((androidx.paging.PagingDataPresenter) this.getHighSpeedVideoFpsRanges).getHighResolutionOutputSizeshNQ4ISI;
                                                int placeholdersBefore2 = pageStore4.getPlaceholdersBefore();
                                                pageStore5 = ((androidx.paging.PagingDataPresenter) this.getHighSpeedVideoFpsRanges).getHighResolutionOutputSizeshNQ4ISI;
                                                if (i3 <= placeholdersBefore2 + pageStore5.getDataCount()) {
                                                    ((androidx.paging.PagingDataPresenter) this.getHighSpeedVideoFpsRanges).getInputFormats = false;
                                                }
                                            }
                                        }
                                        hintReceiver = ((androidx.paging.PagingDataPresenter) this.getHighSpeedVideoFpsRanges).getHighSpeedVideoFpsRanges;
                                        if (hintReceiver != null) {
                                            pageStore2 = ((androidx.paging.PagingDataPresenter) this.getHighSpeedVideoFpsRanges).getHighResolutionOutputSizeshNQ4ISI;
                                            i = ((androidx.paging.PagingDataPresenter) this.getHighSpeedVideoFpsRanges).getInputSizeshNQ4ISI;
                                            hintReceiver.accessHint(pageStore2.accessHintForPresenterIndex(i));
                                        }
                                    }
                                }
                                pageEvent = this.getHighSpeedVideoSizes;
                                if (!(pageEvent instanceof androidx.paging.PageEvent.Insert)) {
                                }
                                copyOnWriteArrayList = ((androidx.paging.PagingDataPresenter) this.getHighSpeedVideoFpsRanges).getHighSpeedVideoSizesFor;
                                it = copyOnWriteArrayList.iterator();
                                while (it.hasNext()) {
                                }
                                return kotlin.Unit.INSTANCE;
                            case 5:
                                kotlin.ResultKt.throwOnFailure(obj);
                                androidx.paging.PagingDataPresenter<T> pagingDataPresenter32 = this.getHighSpeedVideoFpsRanges;
                                pageStore6 = ((androidx.paging.PagingDataPresenter) pagingDataPresenter32).getHighResolutionOutputSizeshNQ4ISI;
                                this.getHighSpeedVideoFpsRangesFor = 6;
                                break;
                            case 6:
                                kotlin.ResultKt.throwOnFailure(obj);
                                mutableCombinedLoadStateCollection4 = ((androidx.paging.PagingDataPresenter) this.getHighSpeedVideoFpsRanges).Camera2StreamConfigurationMap;
                                mutableCombinedLoadStateCollection4.set(((androidx.paging.PageEvent.Drop) this.getHighSpeedVideoSizes).getLoadType(), false, androidx.paging.LoadState.NotLoading.INSTANCE.getIncomplete$paging_common());
                                ((androidx.paging.PagingDataPresenter) this.getHighSpeedVideoFpsRanges).getInputFormats = false;
                                pageEvent = this.getHighSpeedVideoSizes;
                                if (!(pageEvent instanceof androidx.paging.PageEvent.Insert)) {
                                }
                                copyOnWriteArrayList = ((androidx.paging.PagingDataPresenter) this.getHighSpeedVideoFpsRanges).getHighSpeedVideoSizesFor;
                                it = copyOnWriteArrayList.iterator();
                                while (it.hasNext()) {
                                }
                                return kotlin.Unit.INSTANCE;
                            default:
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        return ((androidx.paging.PagingDataPresenter$collectFrom$2.AnonymousClass1.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                        return new androidx.paging.PagingDataPresenter$collectFrom$2.AnonymousClass1.AnonymousClass2(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(androidx.paging.PageEvent<T> pageEvent, androidx.paging.PagingDataPresenter<T> pagingDataPresenter, androidx.paging.PagingData<T> pagingData, kotlin.coroutines.Continuation<? super androidx.paging.PagingDataPresenter$collectFrom$2.AnonymousClass1.AnonymousClass2> continuation) {
                        super(2, continuation);
                        this.getHighSpeedVideoSizes = pageEvent;
                        this.getHighSpeedVideoFpsRanges = pagingDataPresenter;
                        this.Camera2StreamConfigurationMap = pagingData;
                    }
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

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.paging.PagingDataPresenter$collectFrom$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.paging.PagingDataPresenter$collectFrom$2(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PagingDataPresenter$collectFrom$2(androidx.paging.PagingDataPresenter<T> pagingDataPresenter, androidx.paging.PagingData<T> pagingData, kotlin.coroutines.Continuation<? super androidx.paging.PagingDataPresenter$collectFrom$2> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoFpsRangesFor = pagingDataPresenter;
        this.Camera2StreamConfigurationMap = pagingData;
    }
}
