package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0003#$%B[\u0012(\u0010\u0007\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R6\u0010\u0012\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR#\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001e0\u001d8\u0007¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\""}, d2 = {"Landroidx/paging/PageFetcher;", "", "Key", "Value", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Landroidx/paging/PagingSource;", "pagingSourceFactory", "initialKey", "Landroidx/paging/PagingConfig;", "config", "Landroidx/paging/RemoteMediator;", "remoteMediator", "<init>", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Landroidx/paging/PagingConfig;Landroidx/paging/RemoteMediator;)V", "", com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ACTION_REFRESH, "()V", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Object;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Landroidx/paging/PagingConfig;", "Landroidx/paging/ConflatedEventBus;", "", "Landroidx/paging/ConflatedEventBus;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Lkotlinx/coroutines/flow/Flow;", "getFlow", "()Lkotlinx/coroutines/flow/Flow;", "PagerUiReceiver", "PagerHintReceiver", "GenerationInfo"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PageFetcher<Key, Value> {
    private final androidx.paging.ConflatedEventBus<kotlin.Unit> Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<Value>> flow;
    private final kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super androidx.paging.PagingSource<Key, Value>>, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.paging.PagingConfig getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final Key getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.paging.ConflatedEventBus<java.lang.Boolean> getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public PageFetcher(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super androidx.paging.PagingSource<Key, Value>>, ? extends java.lang.Object> function1, Key key, androidx.paging.PagingConfig pagingConfig, androidx.paging.RemoteMediator<Key, Value> remoteMediator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagingConfig, "");
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoSizes = key;
        this.getHighSpeedVideoFpsRangesFor = pagingConfig;
        this.getHighSpeedVideoFpsRanges = new androidx.paging.ConflatedEventBus<>(null, 1, null);
        this.Camera2StreamConfigurationMap = new androidx.paging.ConflatedEventBus<>(null, 1, null);
        this.flow = androidx.paging.SimpleChannelFlowKt.simpleChannelFlow(new androidx.paging.PageFetcher$flow$1(remoteMediator, this, null));
    }

    public /* synthetic */ PageFetcher(kotlin.jvm.functions.Function1 function1, java.lang.Object obj, androidx.paging.PagingConfig pagingConfig, androidx.paging.RemoteMediator remoteMediator, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, obj, pagingConfig, (i & 8) != 0 ? null : remoteMediator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$generateNewPagingSource(androidx.paging.PageFetcher pageFetcher, androidx.paging.PagingSource pagingSource, kotlin.coroutines.Continuation continuation) {
        androidx.paging.PageFetcher$generateNewPagingSource$1 pageFetcher$generateNewPagingSource$1;
        int i;
        androidx.paging.PagingSource pagingSource2;
        if (continuation instanceof androidx.paging.PageFetcher$generateNewPagingSource$1) {
            pageFetcher$generateNewPagingSource$1 = (androidx.paging.PageFetcher$generateNewPagingSource$1) continuation;
            if ((pageFetcher$generateNewPagingSource$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                pageFetcher$generateNewPagingSource$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = pageFetcher$generateNewPagingSource$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pageFetcher$generateNewPagingSource$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super androidx.paging.PagingSource<Key, Value>>, java.lang.Object> function1 = pageFetcher.getHighResolutionOutputSizeshNQ4ISI;
                    pageFetcher$generateNewPagingSource$1.getHighSpeedVideoSizes = pagingSource;
                    pageFetcher$generateNewPagingSource$1.getHighSpeedVideoFpsRanges = 1;
                    obj = function1.invoke(pageFetcher$generateNewPagingSource$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pagingSource = (androidx.paging.PagingSource) pageFetcher$generateNewPagingSource$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                pagingSource2 = (androidx.paging.PagingSource) obj;
                if (pagingSource2 instanceof androidx.paging.CompatLegacyPagingSource) {
                    ((androidx.paging.CompatLegacyPagingSource) pagingSource2).setPageSize(pageFetcher.getHighSpeedVideoFpsRangesFor.pageSize);
                }
                if (pagingSource2 != pagingSource) {
                    throw new java.lang.IllegalStateException("An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource.".toString());
                }
                pagingSource2.registerInvalidatedCallback(new androidx.paging.PageFetcher$generateNewPagingSource$3(pageFetcher));
                if (pagingSource != null) {
                    pagingSource.unregisterInvalidatedCallback(new androidx.paging.PageFetcher$generateNewPagingSource$4(pageFetcher));
                }
                if (pagingSource != null) {
                    pagingSource.invalidate();
                }
                androidx.paging.PagingLogger pagingLogger = androidx.paging.PagingLogger.INSTANCE;
                if (pagingLogger.isLoggable(3)) {
                    pagingLogger.log(3, "Generated new PagingSource ".concat(java.lang.String.valueOf(pagingSource2)), null);
                }
                return pagingSource2;
            }
        }
        pageFetcher$generateNewPagingSource$1 = new androidx.paging.PageFetcher$generateNewPagingSource$1(pageFetcher, continuation);
        java.lang.Object obj2 = pageFetcher$generateNewPagingSource$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pageFetcher$generateNewPagingSource$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        pagingSource2 = (androidx.paging.PagingSource) obj2;
        if (pagingSource2 instanceof androidx.paging.CompatLegacyPagingSource) {
        }
        if (pagingSource2 != pagingSource) {
        }
    }

    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<Value>> getFlow() {
        return this.flow;
    }

    public final void refresh() {
        this.getHighSpeedVideoFpsRanges.send(java.lang.Boolean.TRUE);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/paging/PageFetcher$PagerUiReceiver;", "Landroidx/paging/UiReceiver;", "Landroidx/paging/ConflatedEventBus;", "", "retryEventBus", "<init>", "(Landroidx/paging/PageFetcher;Landroidx/paging/ConflatedEventBus;)V", "retry", "()V", com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ACTION_REFRESH, "Camera2StreamConfigurationMap", "Landroidx/paging/ConflatedEventBus;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class PagerUiReceiver implements androidx.paging.UiReceiver {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final androidx.paging.ConflatedEventBus<kotlin.Unit> getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ androidx.paging.PageFetcher<Key, Value> getHighSpeedVideoFpsRangesFor;

        public PagerUiReceiver(androidx.paging.PageFetcher pageFetcher, androidx.paging.ConflatedEventBus<kotlin.Unit> conflatedEventBus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(conflatedEventBus, "");
            this.getHighSpeedVideoFpsRangesFor = pageFetcher;
            this.getHighSpeedVideoFpsRangesFor = conflatedEventBus;
        }

        @Override // androidx.paging.UiReceiver
        public final void retry() {
            this.getHighSpeedVideoFpsRangesFor.send(kotlin.Unit.INSTANCE);
        }

        @Override // androidx.paging.UiReceiver
        public final void refresh() {
            this.getHighSpeedVideoFpsRangesFor.refresh();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/paging/PageFetcher$PagerHintReceiver;", "", "Key", "Value", "Landroidx/paging/HintReceiver;", "Landroidx/paging/PageFetcherSnapshot;", "pageFetcherSnapshot", "<init>", "(Landroidx/paging/PageFetcher;Landroidx/paging/PageFetcherSnapshot;)V", "Landroidx/paging/ViewportHint;", "viewportHint", "", "accessHint", "(Landroidx/paging/ViewportHint;)V", "Landroidx/paging/PageFetcherSnapshot;", "getPageFetcherSnapshot$paging_common", "()Landroidx/paging/PageFetcherSnapshot;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class PagerHintReceiver<Key, Value> implements androidx.paging.HintReceiver {
        final /* synthetic */ androidx.paging.PageFetcher<Key, Value> getHighSpeedVideoFpsRangesFor;
        private final androidx.paging.PageFetcherSnapshot<Key, Value> pageFetcherSnapshot;

        public PagerHintReceiver(androidx.paging.PageFetcher pageFetcher, androidx.paging.PageFetcherSnapshot<Key, Value> pageFetcherSnapshot) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageFetcherSnapshot, "");
            this.getHighSpeedVideoFpsRangesFor = pageFetcher;
            this.pageFetcherSnapshot = pageFetcherSnapshot;
        }

        public final androidx.paging.PageFetcherSnapshot<Key, Value> getPageFetcherSnapshot$paging_common() {
            return this.pageFetcherSnapshot;
        }

        @Override // androidx.paging.HintReceiver
        public final void accessHint(androidx.paging.ViewportHint viewportHint) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewportHint, "");
            this.pageFetcherSnapshot.accessHint(viewportHint);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001B9\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR(\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000f\u0010\u0012R\u001a\u0010\f\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/paging/PageFetcher$GenerationInfo;", "", "Key", "Value", "Landroidx/paging/PageFetcherSnapshot;", "p0", "Landroidx/paging/PagingState;", "p1", "Lkotlinx/coroutines/Job;", "p2", "<init>", "(Landroidx/paging/PageFetcherSnapshot;Landroidx/paging/PagingState;Lkotlinx/coroutines/Job;)V", "getHighSpeedVideoFpsRanges", "Landroidx/paging/PageFetcherSnapshot;", "()Landroidx/paging/PageFetcherSnapshot;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "Landroidx/paging/PagingState;", "()Landroidx/paging/PagingState;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/Job;", "getHighSpeedVideoFpsRangesFor", "()Lkotlinx/coroutines/Job;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class GenerationInfo<Key, Value> {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final kotlinx.coroutines.Job getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final androidx.paging.PageFetcherSnapshot<Key, Value> Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final androidx.paging.PagingState<Key, Value> getHighResolutionOutputSizeshNQ4ISI;

        public GenerationInfo(androidx.paging.PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, androidx.paging.PagingState<Key, Value> pagingState, kotlinx.coroutines.Job job) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageFetcherSnapshot, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(job, "");
            this.Camera2StreamConfigurationMap = pageFetcherSnapshot;
            this.getHighResolutionOutputSizeshNQ4ISI = pagingState;
            this.getHighSpeedVideoFpsRanges = job;
        }

        public final androidx.paging.PageFetcherSnapshot<Key, Value> getHighSpeedVideoFpsRanges() {
            return this.Camera2StreamConfigurationMap;
        }

        public final androidx.paging.PagingState<Key, Value> Camera2StreamConfigurationMap() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from getter */
        public final kotlinx.coroutines.Job getGetHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoFpsRanges;
        }
    }

    public static final /* synthetic */ kotlinx.coroutines.flow.Flow access$injectRemoteEvents(androidx.paging.PageFetcher pageFetcher, androidx.paging.PageFetcherSnapshot pageFetcherSnapshot, kotlinx.coroutines.Job job, androidx.paging.RemoteMediatorAccessor remoteMediatorAccessor) {
        if (remoteMediatorAccessor == null) {
            return pageFetcherSnapshot.getPageEventFlow();
        }
        return androidx.paging.CancelableChannelFlowKt.cancelableChannelFlow(job, new androidx.paging.PageFetcher$injectRemoteEvents$1(remoteMediatorAccessor, pageFetcherSnapshot, new androidx.paging.MutableLoadStateCollection(), null));
    }
}
