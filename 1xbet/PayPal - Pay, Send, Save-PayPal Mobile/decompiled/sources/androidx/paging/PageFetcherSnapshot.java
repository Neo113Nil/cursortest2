package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B{\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0086@¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\nH\u0082@¢\u0006\u0004\b\"\u0010\u001bJ \u0010\"\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020#H\u0082@¢\u0006\u0004\b\"\u0010$J7\u0010(\u001a\u00020'2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00018\u00002\u0014\u0010&\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010%H\u0002¢\u0006\u0004\b(\u0010)J(\u0010 \u001a\u00020\n*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*2\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b \u0010+J0\u0010 \u001a\u00020\n*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020,H\u0082@¢\u0006\u0004\b \u0010-J9\u0010\"\u001a\u0004\u0018\u00018\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020.2\u0006\u0010&\u001a\u00020.H\u0002¢\u0006\u0004\b\"\u0010/R\u001c\u0010\u0004\u001a\u0004\u0018\u00018\u00008\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b1\u00102R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u00105R\u0014\u00107\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u00106R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b8\u00109R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b;\u0010<R\"\u0010(\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010?R\u0014\u0010B\u001a\u00020@8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u0010AR\u0018\u0010=\u001a\u00060Cj\u0002`D8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010ER \u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010G0F8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010HR \u0010J\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010I8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bM\u0010NR&\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010G0\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u00109\u001a\u0004\bP\u0010Q"}, d2 = {"Landroidx/paging/PageFetcherSnapshot;", "", "Key", "Value", "initialKey", "Landroidx/paging/PagingSource;", "pagingSource", "Landroidx/paging/PagingConfig;", "config", "Lkotlinx/coroutines/flow/Flow;", "", "retryFlow", "Landroidx/paging/RemoteMediatorConnection;", "remoteMediatorConnection", "Landroidx/paging/PagingState;", "previousPagingState", "Lkotlin/Function0;", "jumpCallback", "<init>", "(Ljava/lang/Object;Landroidx/paging/PagingSource;Landroidx/paging/PagingConfig;Lkotlinx/coroutines/flow/Flow;Landroidx/paging/RemoteMediatorConnection;Landroidx/paging/PagingState;Lkotlin/jvm/functions/Function0;)V", "Landroidx/paging/ViewportHint;", "viewportHint", "accessHint", "(Landroidx/paging/ViewportHint;)V", "close", "()V", "currentPagingState", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/paging/LoadType;", "p0", "p1", "Landroidx/paging/PagingSource$LoadParams;", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/paging/LoadType;Ljava/lang/Object;)Landroidx/paging/PagingSource$LoadParams;", "getHighSpeedVideoSizes", "Landroidx/paging/GenerationalViewportHint;", "(Landroidx/paging/LoadType;Landroidx/paging/GenerationalViewportHint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/paging/PagingSource$LoadResult;", "p2", "", "getHighSpeedVideoFpsRangesFor", "(Landroidx/paging/LoadType;Ljava/lang/Object;Landroidx/paging/PagingSource$LoadResult;)Ljava/lang/String;", "Landroidx/paging/PageFetcherSnapshotState;", "(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/paging/LoadState$Error;", "(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Landroidx/paging/LoadState$Error;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;II)Ljava/lang/Object;", "Ljava/lang/Object;", "getInitialKey$paging_common", "()Ljava/lang/Object;", "Landroidx/paging/PagingSource;", "getPagingSource$paging_common", "()Landroidx/paging/PagingSource;", "Landroidx/paging/PagingConfig;", "Camera2StreamConfigurationMap", "getOutputMinFrameDuration", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/RemoteMediatorConnection;", "getRemoteMediatorConnection", "()Landroidx/paging/RemoteMediatorConnection;", "getOutputFormats", "Landroidx/paging/PagingState;", "Lkotlin/jvm/functions/Function0;", "Landroidx/paging/HintHandler;", "Landroidx/paging/HintHandler;", "getHighSpeedVideoFpsRanges", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/paging/internal/getHighSpeedVideoFpsRangesFor;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lkotlinx/coroutines/channels/Channel;", "Landroidx/paging/PageEvent;", "Lkotlinx/coroutines/channels/Channel;", "Landroidx/paging/PageFetcherSnapshotState$Holder;", "getInputFormats", "Landroidx/paging/PageFetcherSnapshotState$Holder;", "Lkotlinx/coroutines/CompletableJob;", "getHighSpeedVideoSizesFor", "Lkotlinx/coroutines/CompletableJob;", "pageEventFlow", "getPageEventFlow", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PageFetcherSnapshot<Key, Value> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.paging.HintHandler getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.paging.PagingConfig Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicBoolean getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<androidx.paging.PageEvent<Value>> getOutputMinFrameDuration;
    private final kotlinx.coroutines.CompletableJob getHighSpeedVideoSizesFor;
    private final androidx.paging.PageFetcherSnapshotState.Holder<Key, Value> getInputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.paging.PagingState<Key, Value> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.Flow<kotlin.Unit> getHighSpeedVideoSizes;
    private final Key initialKey;
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PageEvent<Value>> pageEventFlow;
    private final androidx.paging.PagingSource<Key, Value> pagingSource;
    private final androidx.paging.RemoteMediatorConnection<Key, Value> remoteMediatorConnection;

    public PageFetcherSnapshot(Key key, androidx.paging.PagingSource<Key, Value> pagingSource, androidx.paging.PagingConfig pagingConfig, kotlinx.coroutines.flow.Flow<kotlin.Unit> flow, androidx.paging.RemoteMediatorConnection<Key, Value> remoteMediatorConnection, androidx.paging.PagingState<Key, Value> pagingState, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlinx.coroutines.CompletableJob Job$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagingSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagingConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.initialKey = key;
        this.pagingSource = pagingSource;
        this.Camera2StreamConfigurationMap = pagingConfig;
        this.getHighSpeedVideoSizes = flow;
        this.remoteMediatorConnection = remoteMediatorConnection;
        this.getHighSpeedVideoFpsRangesFor = pagingState;
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
        if (pagingConfig.jumpThreshold != Integer.MIN_VALUE && !pagingSource.getJumpingSupported()) {
            throw new java.lang.IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.".toString());
        }
        this.getHighSpeedVideoFpsRanges = new androidx.paging.HintHandler();
        this.getOutputFormats = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.getOutputMinFrameDuration = kotlinx.coroutines.channels.ChannelKt.Channel$default(-2, null, null, 6, null);
        this.getInputFormats = new androidx.paging.PageFetcherSnapshotState.Holder<>(pagingConfig);
        Job$default = kotlinx.coroutines.JobKt__JobKt.Job$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
        this.getHighSpeedVideoSizesFor = Job$default;
        this.pageEventFlow = kotlinx.coroutines.flow.FlowKt.onStart(androidx.paging.CancelableChannelFlowKt.cancelableChannelFlow(Job$default, new androidx.paging.PageFetcherSnapshot$pageEventFlow$1(this, null)), new androidx.paging.PageFetcherSnapshot$pageEventFlow$2(this, null));
    }

    public final Key getInitialKey$paging_common() {
        return this.initialKey;
    }

    public final androidx.paging.PagingSource<Key, Value> getPagingSource$paging_common() {
        return this.pagingSource;
    }

    public final androidx.paging.RemoteMediatorConnection<Key, Value> getRemoteMediatorConnection() {
        return this.remoteMediatorConnection;
    }

    public /* synthetic */ PageFetcherSnapshot(java.lang.Object obj, androidx.paging.PagingSource pagingSource, androidx.paging.PagingConfig pagingConfig, kotlinx.coroutines.flow.Flow flow, androidx.paging.RemoteMediatorConnection remoteMediatorConnection, androidx.paging.PagingState pagingState, kotlin.jvm.functions.Function0 function0, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, pagingSource, pagingConfig, flow, (i & 16) != 0 ? null : remoteMediatorConnection, (i & 32) != 0 ? null : pagingState, (i & 64) != 0 ? new kotlin.jvm.functions.Function0() { // from class: androidx.paging.PageFetcherSnapshot$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        } : function0);
    }

    public final kotlinx.coroutines.flow.Flow<androidx.paging.PageEvent<Value>> getPageEventFlow() {
        return this.pageEventFlow;
    }

    public final void accessHint(androidx.paging.ViewportHint viewportHint) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewportHint, "");
        this.getHighSpeedVideoFpsRanges.processHint(viewportHint);
    }

    public final void close() {
        kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) this.getHighSpeedVideoSizesFor, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object currentPagingState(kotlin.coroutines.Continuation<? super androidx.paging.PagingState<Key, Value>> continuation) {
        androidx.paging.PageFetcherSnapshot$currentPagingState$1 pageFetcherSnapshot$currentPagingState$1;
        int i;
        androidx.paging.PageFetcherSnapshotState.Holder<Key, Value> holder;
        kotlinx.coroutines.sync.Mutex mutex;
        try {
            if (continuation instanceof androidx.paging.PageFetcherSnapshot$currentPagingState$1) {
                pageFetcherSnapshot$currentPagingState$1 = (androidx.paging.PageFetcherSnapshot$currentPagingState$1) continuation;
                if ((pageFetcherSnapshot$currentPagingState$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    pageFetcherSnapshot$currentPagingState$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = pageFetcherSnapshot$currentPagingState$1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = pageFetcherSnapshot$currentPagingState$1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidx.paging.PageFetcherSnapshotState.Holder<Key, Value> holder2 = this.getInputFormats;
                        kotlinx.coroutines.sync.Mutex mutex2 = ((androidx.paging.PageFetcherSnapshotState.Holder) holder2).getHighSpeedVideoFpsRangesFor;
                        pageFetcherSnapshot$currentPagingState$1.getHighSpeedVideoFpsRanges = holder2;
                        pageFetcherSnapshot$currentPagingState$1.getHighSpeedVideoSizes = mutex2;
                        pageFetcherSnapshot$currentPagingState$1.getHighSpeedVideoFpsRangesFor = 1;
                        if (mutex2.lock(null, pageFetcherSnapshot$currentPagingState$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        holder = holder2;
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = (kotlinx.coroutines.sync.Mutex) pageFetcherSnapshot$currentPagingState$1.getHighSpeedVideoSizes;
                        holder = (androidx.paging.PageFetcherSnapshotState.Holder) pageFetcherSnapshot$currentPagingState$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return ((androidx.paging.PageFetcherSnapshotState.Holder) holder).getHighSpeedVideoFpsRanges.currentPagingState$paging_common(this.getHighSpeedVideoFpsRanges.getLastAccessHint());
                }
            }
            return ((androidx.paging.PageFetcherSnapshotState.Holder) holder).getHighSpeedVideoFpsRanges.currentPagingState$paging_common(this.getHighSpeedVideoFpsRanges.getLastAccessHint());
        } finally {
            mutex.unlock(null);
        }
        pageFetcherSnapshot$currentPagingState$1 = new androidx.paging.PageFetcherSnapshot$currentPagingState$1(this, continuation);
        java.lang.Object obj2 = pageFetcherSnapshot$currentPagingState$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pageFetcherSnapshot$currentPagingState$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
    }

    private final androidx.paging.PagingSource.LoadParams<Key> getHighResolutionOutputSizeshNQ4ISI(androidx.paging.LoadType p0, Key p1) {
        return androidx.paging.PagingSource.LoadParams.INSTANCE.create(p0, p1, p0 == androidx.paging.LoadType.REFRESH ? this.Camera2StreamConfigurationMap.initialLoadSize : this.Camera2StreamConfigurationMap.pageSize, this.Camera2StreamConfigurationMap.enablePlaceholders);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0112, code lost:
    
        if (r12 != r1) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0158 A[Catch: all -> 0x024f, TryCatch #4 {all -> 0x024f, blocks: (B:67:0x0130, B:69:0x0158, B:70:0x0169, B:72:0x0172), top: B:66:0x0130 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0172 A[Catch: all -> 0x024f, TRY_LEAVE, TryCatch #4 {all -> 0x024f, blocks: (B:67:0x0130, B:69:0x0158, B:70:0x0169, B:72:0x0172), top: B:66:0x0130 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r11v0, types: [androidx.paging.PageFetcherSnapshot, androidx.paging.PageFetcherSnapshot<Key, Value>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v38, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.paging.PageFetcherSnapshot$doInitialLoad$1 pageFetcherSnapshot$doInitialLoad$1;
        ?? r2;
        androidx.paging.PageFetcherSnapshotState.Holder<Key, Value> holder;
        kotlinx.coroutines.sync.Mutex mutex;
        androidx.paging.PageFetcherSnapshotState pageFetcherSnapshotState;
        androidx.paging.LoadType loadType;
        androidx.paging.PagingLogger pagingLogger;
        androidx.paging.PageFetcherSnapshotState.Holder<Key, Value> holder2;
        kotlinx.coroutines.sync.Mutex mutex2;
        androidx.paging.PagingSource.LoadResult loadResult;
        androidx.paging.PageFetcherSnapshotState.Holder<Key, Value> holder3;
        kotlinx.coroutines.sync.Mutex mutex3;
        androidx.paging.PagingSource.LoadResult loadResult2;
        boolean insert;
        androidx.paging.PagingSource.LoadResult loadResult3;
        androidx.paging.PageFetcherSnapshotState.Holder<Key, Value> holder4;
        kotlinx.coroutines.sync.Mutex mutex4;
        androidx.paging.PagingSource.LoadResult loadResult4;
        kotlinx.coroutines.channels.Channel<androidx.paging.PageEvent<Value>> channel;
        androidx.paging.PageEvent<Value> pageEvent$paging_common;
        androidx.paging.PageFetcherSnapshotState.Holder<Key, Value> holder5;
        kotlinx.coroutines.sync.Mutex mutex5;
        androidx.paging.PagingSource.LoadResult loadResult5;
        androidx.paging.PagingSource.LoadResult.Page page;
        androidx.paging.PageFetcherSnapshotState pageFetcherSnapshotState2;
        androidx.paging.LoadState.Error error;
        androidx.paging.LoadType loadType2;
        kotlinx.coroutines.sync.Mutex mutex6;
        try {
            try {
                if (continuation instanceof androidx.paging.PageFetcherSnapshot$doInitialLoad$1) {
                    pageFetcherSnapshot$doInitialLoad$1 = (androidx.paging.PageFetcherSnapshot$doInitialLoad$1) continuation;
                    if ((pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                        pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoSizes -= 2147483648;
                        java.lang.Object obj = pageFetcherSnapshot$doInitialLoad$1.Camera2StreamConfigurationMap;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        r2 = pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoSizes;
                        switch (r2) {
                            case 0:
                                kotlin.ResultKt.throwOnFailure(obj);
                                holder = this.getInputFormats;
                                kotlinx.coroutines.sync.Mutex mutex7 = ((androidx.paging.PageFetcherSnapshotState.Holder) holder).getHighSpeedVideoFpsRangesFor;
                                pageFetcherSnapshot$doInitialLoad$1.getHighResolutionOutputSizeshNQ4ISI = holder;
                                pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoFpsRangesFor = mutex7;
                                pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoSizes = 1;
                                if (mutex7.lock(null, pageFetcherSnapshot$doInitialLoad$1) != coroutine_suspended) {
                                    mutex = mutex7;
                                    pageFetcherSnapshotState = ((androidx.paging.PageFetcherSnapshotState.Holder) holder).getHighSpeedVideoFpsRanges;
                                    loadType = androidx.paging.LoadType.REFRESH;
                                    pageFetcherSnapshot$doInitialLoad$1.getHighResolutionOutputSizeshNQ4ISI = mutex;
                                    pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoFpsRangesFor = null;
                                    pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoSizes = 2;
                                    r2 = mutex;
                                    if (getHighResolutionOutputSizeshNQ4ISI(pageFetcherSnapshotState, loadType, pageFetcherSnapshot$doInitialLoad$1) == coroutine_suspended) {
                                    }
                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                    r2.unlock(null);
                                    androidx.paging.PagingSource.LoadParams<Key> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(androidx.paging.LoadType.REFRESH, this.initialKey);
                                    pagingLogger = androidx.paging.PagingLogger.INSTANCE;
                                    if (pagingLogger.isLoggable(3)) {
                                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Start REFRESH with loadKey ");
                                        sb.append(this.initialKey);
                                        sb.append(" on ");
                                        sb.append(this.pagingSource);
                                        pagingLogger.log(3, sb.toString(), null);
                                    }
                                    androidx.paging.PagingSource<Key, Value> pagingSource = this.pagingSource;
                                    pageFetcherSnapshot$doInitialLoad$1.getHighResolutionOutputSizeshNQ4ISI = null;
                                    pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoSizes = 3;
                                    obj = pagingSource.load(highResolutionOutputSizeshNQ4ISI, pageFetcherSnapshot$doInitialLoad$1);
                                    break;
                                }
                                return coroutine_suspended;
                            case 1:
                                kotlinx.coroutines.sync.Mutex mutex8 = (kotlinx.coroutines.sync.Mutex) pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoFpsRangesFor;
                                holder = (androidx.paging.PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doInitialLoad$1.getHighResolutionOutputSizeshNQ4ISI;
                                kotlin.ResultKt.throwOnFailure(obj);
                                mutex = mutex8;
                                pageFetcherSnapshotState = ((androidx.paging.PageFetcherSnapshotState.Holder) holder).getHighSpeedVideoFpsRanges;
                                loadType = androidx.paging.LoadType.REFRESH;
                                pageFetcherSnapshot$doInitialLoad$1.getHighResolutionOutputSizeshNQ4ISI = mutex;
                                pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoFpsRangesFor = null;
                                pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoSizes = 2;
                                r2 = mutex;
                                if (getHighResolutionOutputSizeshNQ4ISI(pageFetcherSnapshotState, loadType, pageFetcherSnapshot$doInitialLoad$1) == coroutine_suspended) {
                                }
                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                r2.unlock(null);
                                androidx.paging.PagingSource.LoadParams<Key> highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(androidx.paging.LoadType.REFRESH, this.initialKey);
                                pagingLogger = androidx.paging.PagingLogger.INSTANCE;
                                if (pagingLogger.isLoggable(3)) {
                                }
                                androidx.paging.PagingSource<Key, Value> pagingSource2 = this.pagingSource;
                                pageFetcherSnapshot$doInitialLoad$1.getHighResolutionOutputSizeshNQ4ISI = null;
                                pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoSizes = 3;
                                obj = pagingSource2.load(highResolutionOutputSizeshNQ4ISI2, pageFetcherSnapshot$doInitialLoad$1);
                                break;
                            case 2:
                                kotlinx.coroutines.sync.Mutex mutex9 = (kotlinx.coroutines.sync.Mutex) pageFetcherSnapshot$doInitialLoad$1.getHighResolutionOutputSizeshNQ4ISI;
                                kotlin.ResultKt.throwOnFailure(obj);
                                r2 = mutex9;
                                kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
                                r2.unlock(null);
                                androidx.paging.PagingSource.LoadParams<Key> highResolutionOutputSizeshNQ4ISI22 = getHighResolutionOutputSizeshNQ4ISI(androidx.paging.LoadType.REFRESH, this.initialKey);
                                pagingLogger = androidx.paging.PagingLogger.INSTANCE;
                                if (pagingLogger.isLoggable(3)) {
                                }
                                androidx.paging.PagingSource<Key, Value> pagingSource22 = this.pagingSource;
                                pageFetcherSnapshot$doInitialLoad$1.getHighResolutionOutputSizeshNQ4ISI = null;
                                pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoSizes = 3;
                                obj = pagingSource22.load(highResolutionOutputSizeshNQ4ISI22, pageFetcherSnapshot$doInitialLoad$1);
                                break;
                            case 3:
                                kotlin.ResultKt.throwOnFailure(obj);
                                androidx.paging.PagingSource.LoadResult loadResult6 = (androidx.paging.PagingSource.LoadResult) obj;
                                if (loadResult6 instanceof androidx.paging.PagingSource.LoadResult.Page) {
                                    holder3 = this.getInputFormats;
                                    mutex3 = ((androidx.paging.PageFetcherSnapshotState.Holder) holder3).getHighSpeedVideoFpsRangesFor;
                                    pageFetcherSnapshot$doInitialLoad$1.getHighResolutionOutputSizeshNQ4ISI = loadResult6;
                                    pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoFpsRangesFor = holder3;
                                    pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoFpsRanges = mutex3;
                                    pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoSizes = 4;
                                    if (mutex3.lock(null, pageFetcherSnapshot$doInitialLoad$1) != coroutine_suspended) {
                                        loadResult2 = loadResult6;
                                        try {
                                            androidx.paging.PageFetcherSnapshotState pageFetcherSnapshotState3 = ((androidx.paging.PageFetcherSnapshotState.Holder) holder3).getHighSpeedVideoFpsRanges;
                                            insert = pageFetcherSnapshotState3.insert(0, androidx.paging.LoadType.REFRESH, (androidx.paging.PagingSource.LoadResult.Page) loadResult2);
                                            pageFetcherSnapshotState3.getSourceLoadStates().set(androidx.paging.LoadType.REFRESH, androidx.paging.LoadState.NotLoading.INSTANCE.getIncomplete$paging_common());
                                            if (((androidx.paging.PagingSource.LoadResult.Page) loadResult2).getPrevKey() == null) {
                                                pageFetcherSnapshotState3.getSourceLoadStates().set(androidx.paging.LoadType.PREPEND, androidx.paging.LoadState.NotLoading.INSTANCE.getComplete$paging_common());
                                            }
                                            if (((androidx.paging.PagingSource.LoadResult.Page) loadResult2).getNextKey() == null) {
                                                pageFetcherSnapshotState3.getSourceLoadStates().set(androidx.paging.LoadType.APPEND, androidx.paging.LoadState.NotLoading.INSTANCE.getComplete$paging_common());
                                            }
                                            if (!insert) {
                                                androidx.paging.PagingLogger pagingLogger2 = androidx.paging.PagingLogger.INSTANCE;
                                                if (pagingLogger2.isLoggable(3)) {
                                                    pagingLogger2.log(3, getHighSpeedVideoFpsRangesFor(androidx.paging.LoadType.REFRESH, this.initialKey, loadResult2), null);
                                                }
                                                holder4 = this.getInputFormats;
                                                kotlinx.coroutines.sync.Mutex mutex10 = ((androidx.paging.PageFetcherSnapshotState.Holder) holder4).getHighSpeedVideoFpsRangesFor;
                                                pageFetcherSnapshot$doInitialLoad$1.getHighResolutionOutputSizeshNQ4ISI = loadResult2;
                                                pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoFpsRangesFor = holder4;
                                                pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoFpsRanges = mutex10;
                                                pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoSizes = 5;
                                                if (mutex10.lock(null, pageFetcherSnapshot$doInitialLoad$1) != coroutine_suspended) {
                                                    mutex4 = mutex10;
                                                    loadResult4 = loadResult2;
                                                    androidx.paging.PageFetcherSnapshotState pageFetcherSnapshotState4 = ((androidx.paging.PageFetcherSnapshotState.Holder) holder4).getHighSpeedVideoFpsRanges;
                                                    channel = this.getOutputMinFrameDuration;
                                                    pageEvent$paging_common = pageFetcherSnapshotState4.toPageEvent$paging_common((androidx.paging.PagingSource.LoadResult.Page) loadResult4, androidx.paging.LoadType.REFRESH);
                                                    pageFetcherSnapshot$doInitialLoad$1.getHighResolutionOutputSizeshNQ4ISI = loadResult4;
                                                    pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoFpsRangesFor = mutex4;
                                                    pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoFpsRanges = null;
                                                    pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoSizes = 6;
                                                    if (channel.send(pageEvent$paging_common, pageFetcherSnapshot$doInitialLoad$1) == coroutine_suspended) {
                                                        loadResult3 = loadResult4;
                                                        r2 = mutex4;
                                                        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                                                        if (this.remoteMediatorConnection != null) {
                                                            androidx.paging.PagingSource.LoadResult.Page page2 = (androidx.paging.PagingSource.LoadResult.Page) loadResult3;
                                                            if (page2.getPrevKey() == null || page2.getNextKey() == null) {
                                                                holder5 = this.getInputFormats;
                                                                kotlinx.coroutines.sync.Mutex mutex11 = ((androidx.paging.PageFetcherSnapshotState.Holder) holder5).getHighSpeedVideoFpsRangesFor;
                                                                pageFetcherSnapshot$doInitialLoad$1.getHighResolutionOutputSizeshNQ4ISI = loadResult3;
                                                                pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoFpsRangesFor = holder5;
                                                                pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoFpsRanges = mutex11;
                                                                pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoSizes = 7;
                                                                if (mutex11.lock(null, pageFetcherSnapshot$doInitialLoad$1) != coroutine_suspended) {
                                                                    mutex5 = mutex11;
                                                                    loadResult5 = loadResult3;
                                                                    try {
                                                                        androidx.paging.PagingState<Key, Value> currentPagingState$paging_common = ((androidx.paging.PageFetcherSnapshotState.Holder) holder5).getHighSpeedVideoFpsRanges.currentPagingState$paging_common(this.getHighSpeedVideoFpsRanges.getLastAccessHint());
                                                                        mutex5.unlock(null);
                                                                        page = (androidx.paging.PagingSource.LoadResult.Page) loadResult5;
                                                                        if (page.getPrevKey() == null) {
                                                                            this.remoteMediatorConnection.requestLoad(androidx.paging.LoadType.PREPEND, currentPagingState$paging_common);
                                                                        }
                                                                        if (page.getNextKey() == null) {
                                                                            this.remoteMediatorConnection.requestLoad(androidx.paging.LoadType.APPEND, currentPagingState$paging_common);
                                                                        }
                                                                    } finally {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        return kotlin.Unit.INSTANCE;
                                                    }
                                                }
                                            } else {
                                                androidx.paging.PagingLogger pagingLogger3 = androidx.paging.PagingLogger.INSTANCE;
                                                if (pagingLogger3.isLoggable(2)) {
                                                    pagingLogger3.log(2, getHighSpeedVideoFpsRangesFor(androidx.paging.LoadType.REFRESH, this.initialKey, null), null);
                                                }
                                                loadResult3 = loadResult2;
                                                if (this.remoteMediatorConnection != null) {
                                                }
                                                return kotlin.Unit.INSTANCE;
                                            }
                                        } finally {
                                        }
                                    }
                                } else {
                                    if (!(loadResult6 instanceof androidx.paging.PagingSource.LoadResult.Error)) {
                                        if (!(loadResult6 instanceof androidx.paging.PagingSource.LoadResult.Invalid)) {
                                            throw new kotlin.NoWhenBranchMatchedException();
                                        }
                                        androidx.paging.PagingLogger pagingLogger4 = androidx.paging.PagingLogger.INSTANCE;
                                        if (pagingLogger4.isLoggable(2)) {
                                            pagingLogger4.log(2, getHighSpeedVideoFpsRangesFor(androidx.paging.LoadType.REFRESH, this.initialKey, loadResult6), null);
                                        }
                                        close();
                                        this.pagingSource.invalidate();
                                        return kotlin.Unit.INSTANCE;
                                    }
                                    androidx.paging.PagingLogger pagingLogger5 = androidx.paging.PagingLogger.INSTANCE;
                                    if (pagingLogger5.isLoggable(2)) {
                                        pagingLogger5.log(2, getHighSpeedVideoFpsRangesFor(androidx.paging.LoadType.REFRESH, this.initialKey, loadResult6), null);
                                    }
                                    holder2 = this.getInputFormats;
                                    mutex2 = ((androidx.paging.PageFetcherSnapshotState.Holder) holder2).getHighSpeedVideoFpsRangesFor;
                                    pageFetcherSnapshot$doInitialLoad$1.getHighResolutionOutputSizeshNQ4ISI = loadResult6;
                                    pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoFpsRangesFor = holder2;
                                    pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoFpsRanges = mutex2;
                                    pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoSizes = 8;
                                    if (mutex2.lock(null, pageFetcherSnapshot$doInitialLoad$1) != coroutine_suspended) {
                                        loadResult = loadResult6;
                                        try {
                                            pageFetcherSnapshotState2 = ((androidx.paging.PageFetcherSnapshotState.Holder) holder2).getHighSpeedVideoFpsRanges;
                                            error = new androidx.paging.LoadState.Error(((androidx.paging.PagingSource.LoadResult.Error) loadResult).getThrowable());
                                            loadType2 = androidx.paging.LoadType.REFRESH;
                                            pageFetcherSnapshot$doInitialLoad$1.getHighResolutionOutputSizeshNQ4ISI = mutex2;
                                            pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoFpsRangesFor = null;
                                            pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoFpsRanges = null;
                                            pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoSizes = 9;
                                            if (getHighResolutionOutputSizeshNQ4ISI(pageFetcherSnapshotState2, loadType2, error, pageFetcherSnapshot$doInitialLoad$1) != coroutine_suspended) {
                                                mutex6 = mutex2;
                                                kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                                                mutex6.unlock(null);
                                                return kotlin.Unit.INSTANCE;
                                            }
                                        } catch (java.lang.Throwable th) {
                                            th = th;
                                            throw th;
                                        }
                                    }
                                }
                                return coroutine_suspended;
                            case 4:
                                mutex3 = (kotlinx.coroutines.sync.Mutex) pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoFpsRanges;
                                holder3 = (androidx.paging.PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoFpsRangesFor;
                                loadResult2 = (androidx.paging.PagingSource.LoadResult) pageFetcherSnapshot$doInitialLoad$1.getHighResolutionOutputSizeshNQ4ISI;
                                kotlin.ResultKt.throwOnFailure(obj);
                                androidx.paging.PageFetcherSnapshotState pageFetcherSnapshotState32 = ((androidx.paging.PageFetcherSnapshotState.Holder) holder3).getHighSpeedVideoFpsRanges;
                                insert = pageFetcherSnapshotState32.insert(0, androidx.paging.LoadType.REFRESH, (androidx.paging.PagingSource.LoadResult.Page) loadResult2);
                                pageFetcherSnapshotState32.getSourceLoadStates().set(androidx.paging.LoadType.REFRESH, androidx.paging.LoadState.NotLoading.INSTANCE.getIncomplete$paging_common());
                                if (((androidx.paging.PagingSource.LoadResult.Page) loadResult2).getPrevKey() == null) {
                                }
                                if (((androidx.paging.PagingSource.LoadResult.Page) loadResult2).getNextKey() == null) {
                                }
                                if (!insert) {
                                }
                                break;
                            case 5:
                                kotlinx.coroutines.sync.Mutex mutex12 = (kotlinx.coroutines.sync.Mutex) pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoFpsRanges;
                                holder4 = (androidx.paging.PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoFpsRangesFor;
                                loadResult4 = (androidx.paging.PagingSource.LoadResult) pageFetcherSnapshot$doInitialLoad$1.getHighResolutionOutputSizeshNQ4ISI;
                                kotlin.ResultKt.throwOnFailure(obj);
                                mutex4 = mutex12;
                                androidx.paging.PageFetcherSnapshotState pageFetcherSnapshotState42 = ((androidx.paging.PageFetcherSnapshotState.Holder) holder4).getHighSpeedVideoFpsRanges;
                                channel = this.getOutputMinFrameDuration;
                                pageEvent$paging_common = pageFetcherSnapshotState42.toPageEvent$paging_common((androidx.paging.PagingSource.LoadResult.Page) loadResult4, androidx.paging.LoadType.REFRESH);
                                pageFetcherSnapshot$doInitialLoad$1.getHighResolutionOutputSizeshNQ4ISI = loadResult4;
                                pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoFpsRangesFor = mutex4;
                                pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoFpsRanges = null;
                                pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoSizes = 6;
                                if (channel.send(pageEvent$paging_common, pageFetcherSnapshot$doInitialLoad$1) == coroutine_suspended) {
                                }
                                break;
                            case 6:
                                kotlinx.coroutines.sync.Mutex mutex13 = (kotlinx.coroutines.sync.Mutex) pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoFpsRangesFor;
                                loadResult3 = (androidx.paging.PagingSource.LoadResult) pageFetcherSnapshot$doInitialLoad$1.getHighResolutionOutputSizeshNQ4ISI;
                                kotlin.ResultKt.throwOnFailure(obj);
                                r2 = mutex13;
                                kotlin.Unit unit32 = kotlin.Unit.INSTANCE;
                                if (this.remoteMediatorConnection != null) {
                                }
                                return kotlin.Unit.INSTANCE;
                            case 7:
                                mutex5 = (kotlinx.coroutines.sync.Mutex) pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoFpsRanges;
                                holder5 = (androidx.paging.PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoFpsRangesFor;
                                loadResult5 = (androidx.paging.PagingSource.LoadResult) pageFetcherSnapshot$doInitialLoad$1.getHighResolutionOutputSizeshNQ4ISI;
                                kotlin.ResultKt.throwOnFailure(obj);
                                androidx.paging.PagingState<Key, Value> currentPagingState$paging_common2 = ((androidx.paging.PageFetcherSnapshotState.Holder) holder5).getHighSpeedVideoFpsRanges.currentPagingState$paging_common(this.getHighSpeedVideoFpsRanges.getLastAccessHint());
                                mutex5.unlock(null);
                                page = (androidx.paging.PagingSource.LoadResult.Page) loadResult5;
                                if (page.getPrevKey() == null) {
                                }
                                if (page.getNextKey() == null) {
                                }
                                return kotlin.Unit.INSTANCE;
                            case 8:
                                mutex2 = (kotlinx.coroutines.sync.Mutex) pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoFpsRanges;
                                holder2 = (androidx.paging.PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoFpsRangesFor;
                                loadResult = (androidx.paging.PagingSource.LoadResult) pageFetcherSnapshot$doInitialLoad$1.getHighResolutionOutputSizeshNQ4ISI;
                                kotlin.ResultKt.throwOnFailure(obj);
                                pageFetcherSnapshotState2 = ((androidx.paging.PageFetcherSnapshotState.Holder) holder2).getHighSpeedVideoFpsRanges;
                                error = new androidx.paging.LoadState.Error(((androidx.paging.PagingSource.LoadResult.Error) loadResult).getThrowable());
                                loadType2 = androidx.paging.LoadType.REFRESH;
                                pageFetcherSnapshot$doInitialLoad$1.getHighResolutionOutputSizeshNQ4ISI = mutex2;
                                pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoFpsRangesFor = null;
                                pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoFpsRanges = null;
                                pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoSizes = 9;
                                if (getHighResolutionOutputSizeshNQ4ISI(pageFetcherSnapshotState2, loadType2, error, pageFetcherSnapshot$doInitialLoad$1) != coroutine_suspended) {
                                }
                                return coroutine_suspended;
                            case 9:
                                mutex6 = (kotlinx.coroutines.sync.Mutex) pageFetcherSnapshot$doInitialLoad$1.getHighResolutionOutputSizeshNQ4ISI;
                                try {
                                    kotlin.ResultKt.throwOnFailure(obj);
                                    kotlin.Unit unit42 = kotlin.Unit.INSTANCE;
                                    mutex6.unlock(null);
                                    return kotlin.Unit.INSTANCE;
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    mutex2 = mutex6;
                                    throw th;
                                }
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
        pageFetcherSnapshot$doInitialLoad$1 = new androidx.paging.PageFetcherSnapshot$doInitialLoad$1(this, continuation);
        java.lang.Object obj2 = pageFetcherSnapshot$doInitialLoad$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = pageFetcherSnapshot$doInitialLoad$1.getHighSpeedVideoSizes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x05aa, code lost:
    
        if (r2.lock(null, r3) == r4) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x01f3, code lost:
    
        if (r2.lock(null, r3) != r4) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0408, code lost:
    
        if (r15 != r4) goto L249;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02ef A[Catch: all -> 0x0691, TRY_LEAVE, TryCatch #3 {all -> 0x0691, blocks: (B:192:0x02d6, B:194:0x02ef), top: B:191:0x02d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x04bb A[Catch: all -> 0x05e3, TRY_LEAVE, TryCatch #4 {all -> 0x05e3, blocks: (B:72:0x04ad, B:74:0x04bb), top: B:71:0x04ad }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0505 A[Catch: all -> 0x00b0, TryCatch #2 {all -> 0x00b0, blocks: (B:77:0x04e3, B:78:0x04ec, B:80:0x0505, B:82:0x0511, B:84:0x0519, B:85:0x0526, B:86:0x0520, B:87:0x052b, B:91:0x055a, B:169:0x007e, B:172:0x00ab), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0519 A[Catch: all -> 0x00b0, TryCatch #2 {all -> 0x00b0, blocks: (B:77:0x04e3, B:78:0x04ec, B:80:0x0505, B:82:0x0511, B:84:0x0519, B:85:0x0526, B:86:0x0520, B:87:0x052b, B:91:0x055a, B:169:0x007e, B:172:0x00ab), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0520 A[Catch: all -> 0x00b0, TryCatch #2 {all -> 0x00b0, blocks: (B:77:0x04e3, B:78:0x04ec, B:80:0x0505, B:82:0x0511, B:84:0x0519, B:85:0x0526, B:86:0x0520, B:87:0x052b, B:91:0x055a, B:169:0x007e, B:172:0x00ab), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r0v69, types: [androidx.paging.PagingLogger] */
    /* JADX WARN: Type inference failed for: r17v0, types: [androidx.paging.PageFetcherSnapshot, androidx.paging.PageFetcherSnapshot<Key, Value>] */
    /* JADX WARN: Type inference failed for: r2v12, types: [T] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v34, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v35, types: [androidx.paging.PagingLogger] */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v75 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v40, types: [androidx.paging.PagingSource$LoadResult, java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r8v29, types: [T, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x0581 -> B:20:0x05cf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x0585 -> B:20:0x05cf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x05aa -> B:13:0x05ac). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(androidx.paging.LoadType loadType, androidx.paging.GenerationalViewportHint generationalViewportHint, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.paging.PageFetcherSnapshot$doLoad$1 pageFetcherSnapshot$doLoad$1;
        ?? r5;
        kotlinx.coroutines.sync.Mutex mutex;
        kotlin.jvm.internal.Ref.IntRef intRef;
        androidx.paging.PageFetcherSnapshotState.Holder<Key, Value> holder;
        kotlinx.coroutines.sync.Mutex mutex2;
        androidx.paging.GenerationalViewportHint generationalViewportHint2;
        androidx.paging.LoadType loadType2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        androidx.paging.GenerationalViewportHint generationalViewportHint3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        androidx.paging.PageFetcherSnapshotState.Holder<Key, Value> holder2;
        kotlinx.coroutines.sync.Mutex mutex3;
        kotlin.jvm.internal.Ref.IntRef intRef2;
        kotlinx.coroutines.sync.Mutex mutex4;
        java.lang.Object highSpeedVideoSizes;
        ?? r2;
        java.lang.Object obj;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        kotlin.jvm.internal.Ref.IntRef intRef3;
        androidx.paging.GenerationalViewportHint generationalViewportHint4;
        androidx.paging.LoadType loadType3;
        androidx.paging.PagingSource.LoadParams<Key> loadParams;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        androidx.paging.PageFetcherSnapshotState.Holder<Key, Value> holder3;
        ?? r22;
        androidx.paging.PagingSource.LoadResult loadResult;
        java.lang.Object obj2;
        androidx.paging.PageFetcherSnapshotState.Holder<Key, Value> holder4;
        kotlinx.coroutines.sync.Mutex mutex5;
        androidx.paging.PageFetcherSnapshotState pageFetcherSnapshotState;
        kotlinx.coroutines.sync.Mutex mutex6;
        androidx.paging.GenerationalViewportHint generationalViewportHint5;
        androidx.paging.LoadType loadType4;
        androidx.paging.PageFetcherSnapshotState.Holder<Key, Value> holder5;
        androidx.paging.LoadType loadType5;
        androidx.paging.LoadType loadType6;
        kotlin.jvm.internal.Ref.ObjectRef objectRef4;
        kotlin.jvm.internal.Ref.IntRef intRef4;
        androidx.paging.GenerationalViewportHint generationalViewportHint6;
        androidx.paging.PageFetcherSnapshotState pageFetcherSnapshotState2;
        androidx.paging.PagingSource.LoadResult loadResult2;
        androidx.paging.LoadType loadType7;
        androidx.paging.PagingSource.LoadParams<Key> loadParams2;
        kotlin.jvm.internal.Ref.IntRef intRef5;
        kotlin.jvm.internal.Ref.ObjectRef objectRef5;
        androidx.paging.LoadType loadType8;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef3;
        androidx.paging.GenerationalViewportHint generationalViewportHint7;
        java.lang.Throwable th;
        androidx.paging.PageFetcherSnapshotState pageFetcherSnapshotState3;
        androidx.paging.LoadState.Error error;
        kotlinx.coroutines.sync.Mutex mutex7;
        int i;
        int i2;
        androidx.paging.PageFetcherSnapshotState.Holder<Key, Value> holder6;
        kotlinx.coroutines.sync.Mutex mutex8;
        java.lang.Object obj3;
        androidx.paging.PageFetcherSnapshotState pageFetcherSnapshotState4;
        androidx.paging.PageEvent<Value> pageEvent$paging_common;
        kotlinx.coroutines.channels.Channel<androidx.paging.PageEvent<Value>> channel;
        kotlinx.coroutines.sync.Mutex mutex9;
        androidx.paging.PageEvent.Drop<Value> dropEventOrNull;
        java.lang.Object prevKey;
        java.lang.Object obj4;
        androidx.paging.LoadType loadType9 = loadType;
        try {
            if (continuation instanceof androidx.paging.PageFetcherSnapshot$doLoad$1) {
                pageFetcherSnapshot$doLoad$1 = (androidx.paging.PageFetcherSnapshot$doLoad$1) continuation;
                if ((pageFetcherSnapshot$doLoad$1.getOutputSizes & Integer.MIN_VALUE) != 0) {
                    pageFetcherSnapshot$doLoad$1.getOutputSizes -= 2147483648;
                    java.lang.Object obj5 = pageFetcherSnapshot$doLoad$1.getOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r5 = pageFetcherSnapshot$doLoad$1.getOutputSizes;
                    int i3 = 1;
                    switch (r5) {
                        case 0:
                            kotlin.ResultKt.throwOnFailure(obj5);
                            if (loadType9 == androidx.paging.LoadType.REFRESH) {
                                throw new java.lang.IllegalArgumentException("Use doInitialLoad for LoadType == REFRESH".toString());
                            }
                            intRef = new kotlin.jvm.internal.Ref.IntRef();
                            holder = this.getInputFormats;
                            mutex2 = ((androidx.paging.PageFetcherSnapshotState.Holder) holder).getHighSpeedVideoFpsRangesFor;
                            pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizes = loadType9;
                            generationalViewportHint2 = generationalViewportHint;
                            pageFetcherSnapshot$doLoad$1.Camera2StreamConfigurationMap = generationalViewportHint2;
                            pageFetcherSnapshot$doLoad$1.getHighSpeedVideoFpsRanges = intRef;
                            pageFetcherSnapshot$doLoad$1.getOutputMinFrameDuration = holder;
                            pageFetcherSnapshot$doLoad$1.getInputFormats = mutex2;
                            pageFetcherSnapshot$doLoad$1.getOutputSizes = 1;
                            break;
                        case 1:
                            kotlinx.coroutines.sync.Mutex mutex10 = (kotlinx.coroutines.sync.Mutex) pageFetcherSnapshot$doLoad$1.getInputFormats;
                            holder = (androidx.paging.PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doLoad$1.getOutputMinFrameDuration;
                            intRef = (kotlin.jvm.internal.Ref.IntRef) pageFetcherSnapshot$doLoad$1.getHighSpeedVideoFpsRanges;
                            generationalViewportHint2 = (androidx.paging.GenerationalViewportHint) pageFetcherSnapshot$doLoad$1.Camera2StreamConfigurationMap;
                            androidx.paging.LoadType loadType10 = (androidx.paging.LoadType) pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizes;
                            kotlin.ResultKt.throwOnFailure(obj5);
                            mutex2 = mutex10;
                            loadType9 = loadType10;
                            try {
                                androidx.paging.PageFetcherSnapshotState pageFetcherSnapshotState5 = ((androidx.paging.PageFetcherSnapshotState.Holder) holder).getHighSpeedVideoFpsRanges;
                                int i4 = androidx.paging.PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType9.ordinal()];
                                if (i4 == 1) {
                                    throw new java.lang.IllegalStateException("Use doInitialLoad for LoadType == REFRESH");
                                }
                                if (i4 == 2) {
                                    int initialPageIndex = (pageFetcherSnapshotState5.getInitialPageIndex() + generationalViewportHint2.getHint().getOriginalPageOffsetFirst()) - 1;
                                    if (initialPageIndex > kotlin.collections.CollectionsKt.getLastIndex(pageFetcherSnapshotState5.getPages$paging_common())) {
                                        intRef.element += this.Camera2StreamConfigurationMap.pageSize * (initialPageIndex - kotlin.collections.CollectionsKt.getLastIndex(pageFetcherSnapshotState5.getPages$paging_common()));
                                        initialPageIndex = kotlin.collections.CollectionsKt.getLastIndex(pageFetcherSnapshotState5.getPages$paging_common());
                                    }
                                    if (initialPageIndex >= 0) {
                                        int i5 = 0;
                                        while (true) {
                                            intRef.element += pageFetcherSnapshotState5.getPages$paging_common().get(i5).getData().size();
                                            if (i5 != initialPageIndex) {
                                                i5++;
                                            }
                                        }
                                    }
                                } else {
                                    if (i4 != 3) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                    int initialPageIndex2 = pageFetcherSnapshotState5.getInitialPageIndex() + generationalViewportHint2.getHint().getOriginalPageOffsetLast() + 1;
                                    if (initialPageIndex2 < 0) {
                                        intRef.element += this.Camera2StreamConfigurationMap.pageSize * (-initialPageIndex2);
                                        initialPageIndex2 = 0;
                                    }
                                    int lastIndex = kotlin.collections.CollectionsKt.getLastIndex(pageFetcherSnapshotState5.getPages$paging_common());
                                    if (initialPageIndex2 <= lastIndex) {
                                        while (true) {
                                            intRef.element += pageFetcherSnapshotState5.getPages$paging_common().get(initialPageIndex2).getData().size();
                                            if (initialPageIndex2 != lastIndex) {
                                                initialPageIndex2++;
                                            }
                                        }
                                    }
                                }
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                mutex2.unlock(null);
                                kotlin.jvm.internal.Ref.ObjectRef objectRef6 = new kotlin.jvm.internal.Ref.ObjectRef();
                                androidx.paging.PageFetcherSnapshotState.Holder<Key, Value> holder7 = this.getInputFormats;
                                kotlinx.coroutines.sync.Mutex mutex11 = ((androidx.paging.PageFetcherSnapshotState.Holder) holder7).getHighSpeedVideoFpsRangesFor;
                                pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizes = loadType9;
                                pageFetcherSnapshot$doLoad$1.Camera2StreamConfigurationMap = generationalViewportHint2;
                                pageFetcherSnapshot$doLoad$1.getHighSpeedVideoFpsRanges = intRef;
                                pageFetcherSnapshot$doLoad$1.getOutputMinFrameDuration = objectRef6;
                                pageFetcherSnapshot$doLoad$1.getInputFormats = holder7;
                                pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizesFor = mutex11;
                                pageFetcherSnapshot$doLoad$1.getOutputFormats = objectRef6;
                                pageFetcherSnapshot$doLoad$1.getOutputSizes = 2;
                                if (mutex11.lock(null, pageFetcherSnapshot$doLoad$1) != coroutine_suspended) {
                                    loadType2 = loadType9;
                                    objectRef = objectRef6;
                                    generationalViewportHint3 = generationalViewportHint2;
                                    objectRef2 = objectRef;
                                    kotlin.jvm.internal.Ref.IntRef intRef6 = intRef;
                                    holder2 = holder7;
                                    mutex3 = mutex11;
                                    intRef2 = intRef6;
                                    try {
                                        androidx.paging.PageFetcherSnapshotState pageFetcherSnapshotState6 = ((androidx.paging.PageFetcherSnapshotState.Holder) holder2).getHighSpeedVideoFpsRanges;
                                        highSpeedVideoSizes = getHighSpeedVideoSizes(pageFetcherSnapshotState6, loadType2, generationalViewportHint3.getGenerationId(), generationalViewportHint3.getHint().presentedItemsBeyondAnchor$paging_common(loadType2) + intRef2.element);
                                        if (highSpeedVideoSizes == null) {
                                            pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizes = loadType2;
                                            pageFetcherSnapshot$doLoad$1.Camera2StreamConfigurationMap = generationalViewportHint3;
                                            pageFetcherSnapshot$doLoad$1.getHighSpeedVideoFpsRanges = intRef2;
                                            pageFetcherSnapshot$doLoad$1.getOutputMinFrameDuration = objectRef2;
                                            pageFetcherSnapshot$doLoad$1.getInputFormats = mutex3;
                                            pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizesFor = highSpeedVideoSizes;
                                            pageFetcherSnapshot$doLoad$1.getOutputFormats = objectRef;
                                            pageFetcherSnapshot$doLoad$1.getOutputSizes = 3;
                                            if (getHighResolutionOutputSizeshNQ4ISI(pageFetcherSnapshotState6, loadType2, pageFetcherSnapshot$doLoad$1) != coroutine_suspended) {
                                                mutex4 = mutex3;
                                                obj = highSpeedVideoSizes;
                                                r2 = obj;
                                                mutex3 = mutex4;
                                                mutex3.unlock(null);
                                                objectRef.element = r2;
                                                booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
                                                if (objectRef2.element != null) {
                                                    androidx.paging.PagingSource.LoadParams<Key> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(loadType2, objectRef2.element);
                                                    androidx.paging.PagingLogger pagingLogger = androidx.paging.PagingLogger.INSTANCE;
                                                    if (pagingLogger.isLoggable(3)) {
                                                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Start ");
                                                        sb.append(loadType2);
                                                        sb.append(" with loadKey ");
                                                        sb.append(objectRef2.element);
                                                        sb.append(" on ");
                                                        sb.append(this.pagingSource);
                                                        obj4 = null;
                                                        pagingLogger.log(3, sb.toString(), null);
                                                    } else {
                                                        obj4 = null;
                                                    }
                                                    androidx.paging.PagingSource<Key, Value> pagingSource = this.pagingSource;
                                                    pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizes = loadType2;
                                                    pageFetcherSnapshot$doLoad$1.Camera2StreamConfigurationMap = generationalViewportHint3;
                                                    pageFetcherSnapshot$doLoad$1.getHighSpeedVideoFpsRanges = intRef2;
                                                    pageFetcherSnapshot$doLoad$1.getOutputMinFrameDuration = objectRef2;
                                                    pageFetcherSnapshot$doLoad$1.getInputFormats = booleanRef;
                                                    pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizesFor = highResolutionOutputSizeshNQ4ISI;
                                                    pageFetcherSnapshot$doLoad$1.getOutputFormats = obj4;
                                                    pageFetcherSnapshot$doLoad$1.getInputSizeshNQ4ISI = obj4;
                                                    pageFetcherSnapshot$doLoad$1.getOutputSizes = 4;
                                                    java.lang.Object load = pagingSource.load(highResolutionOutputSizeshNQ4ISI, pageFetcherSnapshot$doLoad$1);
                                                    if (load != coroutine_suspended) {
                                                        generationalViewportHint4 = generationalViewportHint3;
                                                        loadType3 = loadType2;
                                                        objectRef3 = objectRef2;
                                                        intRef3 = intRef2;
                                                        booleanRef2 = booleanRef;
                                                        loadParams = highResolutionOutputSizeshNQ4ISI;
                                                        obj5 = load;
                                                        loadResult = (androidx.paging.PagingSource.LoadResult) obj5;
                                                        if (loadResult instanceof androidx.paging.PagingSource.LoadResult.Page) {
                                                            int i6 = androidx.paging.PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType3.ordinal()];
                                                            if (i6 == 2) {
                                                                prevKey = ((androidx.paging.PagingSource.LoadResult.Page) loadResult).getPrevKey();
                                                            } else if (i6 == 3) {
                                                                prevKey = ((androidx.paging.PagingSource.LoadResult.Page) loadResult).getNextKey();
                                                            } else {
                                                                throw new java.lang.IllegalArgumentException("Use doInitialLoad for LoadType == REFRESH");
                                                            }
                                                            if (!this.pagingSource.getKeyReuseSupported() && kotlin.jvm.internal.Intrinsics.areEqual(prevKey, objectRef3.element)) {
                                                                java.lang.String str = loadType3 == androidx.paging.LoadType.PREPEND ? "prevKey" : "nextKey";
                                                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("The same value, ");
                                                                sb2.append(objectRef3.element);
                                                                sb2.append(", was passed as the ");
                                                                sb2.append(str);
                                                                sb2.append(" in two\n                            | sequential Pages loaded from a PagingSource. Re-using load keys in\n                            | PagingSource is often an error, and must be explicitly enabled by\n                            | overriding PagingSource.keyReuseSupported.\n                            ");
                                                                throw new java.lang.IllegalStateException(kotlin.text.StringsKt.trimMargin$default(sb2.toString(), null, i3, null).toString());
                                                            }
                                                            holder3 = this.getInputFormats;
                                                            kotlinx.coroutines.sync.Mutex mutex12 = ((androidx.paging.PageFetcherSnapshotState.Holder) holder3).getHighSpeedVideoFpsRangesFor;
                                                            pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizes = loadType3;
                                                            pageFetcherSnapshot$doLoad$1.Camera2StreamConfigurationMap = generationalViewportHint4;
                                                            pageFetcherSnapshot$doLoad$1.getHighSpeedVideoFpsRanges = intRef3;
                                                            pageFetcherSnapshot$doLoad$1.getOutputMinFrameDuration = objectRef3;
                                                            pageFetcherSnapshot$doLoad$1.getInputFormats = booleanRef2;
                                                            pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizesFor = loadParams;
                                                            pageFetcherSnapshot$doLoad$1.getOutputFormats = loadResult;
                                                            pageFetcherSnapshot$doLoad$1.getInputSizeshNQ4ISI = holder3;
                                                            pageFetcherSnapshot$doLoad$1.getOutputStallDurationlomOqCM = mutex12;
                                                            pageFetcherSnapshot$doLoad$1.getOutputSizes = 5;
                                                            obj2 = 0;
                                                            java.lang.Object lock = mutex12.lock(null, pageFetcherSnapshot$doLoad$1);
                                                            r22 = mutex12;
                                                            break;
                                                        } else {
                                                            if (!(loadResult instanceof androidx.paging.PagingSource.LoadResult.Error)) {
                                                                if (!(loadResult instanceof androidx.paging.PagingSource.LoadResult.Invalid)) {
                                                                    throw new kotlin.NoWhenBranchMatchedException();
                                                                }
                                                                androidx.paging.PagingLogger pagingLogger2 = androidx.paging.PagingLogger.INSTANCE;
                                                                if (pagingLogger2.isLoggable(2)) {
                                                                    pagingLogger2.log(2, getHighSpeedVideoFpsRangesFor(loadType3, objectRef3.element, loadResult), null);
                                                                }
                                                                close();
                                                                this.pagingSource.invalidate();
                                                                return kotlin.Unit.INSTANCE;
                                                            }
                                                            androidx.paging.PagingLogger pagingLogger3 = androidx.paging.PagingLogger.INSTANCE;
                                                            if (pagingLogger3.isLoggable(2)) {
                                                                pagingLogger3.log(2, getHighSpeedVideoFpsRangesFor(loadType3, objectRef3.element, loadResult), null);
                                                            }
                                                            androidx.paging.PageFetcherSnapshotState.Holder<Key, Value> holder8 = this.getInputFormats;
                                                            mutex5 = ((androidx.paging.PageFetcherSnapshotState.Holder) holder8).getHighSpeedVideoFpsRangesFor;
                                                            pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizes = loadType3;
                                                            pageFetcherSnapshot$doLoad$1.Camera2StreamConfigurationMap = generationalViewportHint4;
                                                            pageFetcherSnapshot$doLoad$1.getHighSpeedVideoFpsRanges = loadResult;
                                                            pageFetcherSnapshot$doLoad$1.getOutputMinFrameDuration = holder8;
                                                            pageFetcherSnapshot$doLoad$1.getInputFormats = mutex5;
                                                            pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizesFor = null;
                                                            pageFetcherSnapshot$doLoad$1.getOutputSizes = 6;
                                                            if (mutex5.lock(null, pageFetcherSnapshot$doLoad$1) != coroutine_suspended) {
                                                                holder4 = holder8;
                                                                try {
                                                                    pageFetcherSnapshotState3 = ((androidx.paging.PageFetcherSnapshotState.Holder) holder4).getHighSpeedVideoFpsRanges;
                                                                    error = new androidx.paging.LoadState.Error(((androidx.paging.PagingSource.LoadResult.Error) loadResult).getThrowable());
                                                                    pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizes = loadType3;
                                                                    pageFetcherSnapshot$doLoad$1.Camera2StreamConfigurationMap = generationalViewportHint4;
                                                                    pageFetcherSnapshot$doLoad$1.getHighSpeedVideoFpsRanges = mutex5;
                                                                    pageFetcherSnapshot$doLoad$1.getOutputMinFrameDuration = pageFetcherSnapshotState3;
                                                                    pageFetcherSnapshot$doLoad$1.getInputFormats = null;
                                                                    pageFetcherSnapshot$doLoad$1.getOutputSizes = 7;
                                                                    if (getHighResolutionOutputSizeshNQ4ISI(pageFetcherSnapshotState3, loadType3, error, pageFetcherSnapshot$doLoad$1) != coroutine_suspended) {
                                                                        pageFetcherSnapshotState = pageFetcherSnapshotState3;
                                                                        mutex6 = mutex5;
                                                                        generationalViewportHint5 = generationalViewportHint4;
                                                                        loadType4 = loadType3;
                                                                        pageFetcherSnapshotState.getFailedHintsByLoadType$paging_common().put(loadType4, generationalViewportHint5.getHint());
                                                                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                                                        mutex6.unlock(null);
                                                                        return kotlin.Unit.INSTANCE;
                                                                    }
                                                                } catch (java.lang.Throwable th2) {
                                                                    th = th2;
                                                                    throw th;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                return kotlin.Unit.INSTANCE;
                                            }
                                        } else {
                                            r2 = 0;
                                            mutex3.unlock(null);
                                            objectRef.element = r2;
                                            booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
                                            if (objectRef2.element != null) {
                                            }
                                            return kotlin.Unit.INSTANCE;
                                        }
                                    } catch (java.lang.Throwable th3) {
                                        th = th3;
                                        mutex4 = mutex3;
                                        throw th;
                                    }
                                }
                                return coroutine_suspended;
                            } finally {
                            }
                        case 2:
                            objectRef = (kotlin.jvm.internal.Ref.ObjectRef) pageFetcherSnapshot$doLoad$1.getOutputFormats;
                            mutex3 = (kotlinx.coroutines.sync.Mutex) pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizesFor;
                            holder2 = (androidx.paging.PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doLoad$1.getInputFormats;
                            objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) pageFetcherSnapshot$doLoad$1.getOutputMinFrameDuration;
                            intRef2 = (kotlin.jvm.internal.Ref.IntRef) pageFetcherSnapshot$doLoad$1.getHighSpeedVideoFpsRanges;
                            generationalViewportHint3 = (androidx.paging.GenerationalViewportHint) pageFetcherSnapshot$doLoad$1.Camera2StreamConfigurationMap;
                            loadType2 = (androidx.paging.LoadType) pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizes;
                            kotlin.ResultKt.throwOnFailure(obj5);
                            androidx.paging.PageFetcherSnapshotState pageFetcherSnapshotState62 = ((androidx.paging.PageFetcherSnapshotState.Holder) holder2).getHighSpeedVideoFpsRanges;
                            highSpeedVideoSizes = getHighSpeedVideoSizes(pageFetcherSnapshotState62, loadType2, generationalViewportHint3.getGenerationId(), generationalViewportHint3.getHint().presentedItemsBeyondAnchor$paging_common(loadType2) + intRef2.element);
                            if (highSpeedVideoSizes == null) {
                            }
                            break;
                        case 3:
                            objectRef = (kotlin.jvm.internal.Ref.ObjectRef) pageFetcherSnapshot$doLoad$1.getOutputFormats;
                            obj = pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizesFor;
                            mutex4 = (kotlinx.coroutines.sync.Mutex) pageFetcherSnapshot$doLoad$1.getInputFormats;
                            objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) pageFetcherSnapshot$doLoad$1.getOutputMinFrameDuration;
                            intRef2 = (kotlin.jvm.internal.Ref.IntRef) pageFetcherSnapshot$doLoad$1.getHighSpeedVideoFpsRanges;
                            generationalViewportHint3 = (androidx.paging.GenerationalViewportHint) pageFetcherSnapshot$doLoad$1.Camera2StreamConfigurationMap;
                            loadType2 = (androidx.paging.LoadType) pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizes;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj5);
                                r2 = obj;
                                mutex3 = mutex4;
                                mutex3.unlock(null);
                                objectRef.element = r2;
                                booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
                                if (objectRef2.element != null) {
                                }
                                return kotlin.Unit.INSTANCE;
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                throw th;
                            }
                        case 4:
                            androidx.paging.PagingSource.LoadParams<Key> loadParams3 = (androidx.paging.PagingSource.LoadParams) pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizesFor;
                            kotlin.jvm.internal.Ref.BooleanRef booleanRef4 = (kotlin.jvm.internal.Ref.BooleanRef) pageFetcherSnapshot$doLoad$1.getInputFormats;
                            kotlin.jvm.internal.Ref.ObjectRef objectRef7 = (kotlin.jvm.internal.Ref.ObjectRef) pageFetcherSnapshot$doLoad$1.getOutputMinFrameDuration;
                            kotlin.jvm.internal.Ref.IntRef intRef7 = (kotlin.jvm.internal.Ref.IntRef) pageFetcherSnapshot$doLoad$1.getHighSpeedVideoFpsRanges;
                            androidx.paging.GenerationalViewportHint generationalViewportHint8 = (androidx.paging.GenerationalViewportHint) pageFetcherSnapshot$doLoad$1.Camera2StreamConfigurationMap;
                            androidx.paging.LoadType loadType11 = (androidx.paging.LoadType) pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizes;
                            kotlin.ResultKt.throwOnFailure(obj5);
                            intRef3 = intRef7;
                            generationalViewportHint4 = generationalViewportHint8;
                            loadType3 = loadType11;
                            loadParams = loadParams3;
                            booleanRef2 = booleanRef4;
                            objectRef3 = objectRef7;
                            loadResult = (androidx.paging.PagingSource.LoadResult) obj5;
                            if (loadResult instanceof androidx.paging.PagingSource.LoadResult.Page) {
                            }
                            return coroutine_suspended;
                        case 5:
                            kotlinx.coroutines.sync.Mutex mutex13 = (kotlinx.coroutines.sync.Mutex) pageFetcherSnapshot$doLoad$1.getOutputStallDurationlomOqCM;
                            holder3 = (androidx.paging.PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doLoad$1.getInputSizeshNQ4ISI;
                            androidx.paging.PagingSource.LoadResult loadResult3 = (androidx.paging.PagingSource.LoadResult) pageFetcherSnapshot$doLoad$1.getOutputFormats;
                            loadParams = (androidx.paging.PagingSource.LoadParams) pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizesFor;
                            booleanRef2 = (kotlin.jvm.internal.Ref.BooleanRef) pageFetcherSnapshot$doLoad$1.getInputFormats;
                            objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) pageFetcherSnapshot$doLoad$1.getOutputMinFrameDuration;
                            intRef3 = (kotlin.jvm.internal.Ref.IntRef) pageFetcherSnapshot$doLoad$1.getHighSpeedVideoFpsRanges;
                            generationalViewportHint4 = (androidx.paging.GenerationalViewportHint) pageFetcherSnapshot$doLoad$1.Camera2StreamConfigurationMap;
                            loadType3 = (androidx.paging.LoadType) pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizes;
                            kotlin.ResultKt.throwOnFailure(obj5);
                            r22 = mutex13;
                            loadResult = loadResult3;
                            obj2 = 0;
                            try {
                                boolean insert = ((androidx.paging.PageFetcherSnapshotState.Holder) holder3).getHighSpeedVideoFpsRanges.insert(generationalViewportHint4.getGenerationId(), loadType3, (androidx.paging.PagingSource.LoadResult.Page) loadResult);
                                r22.unlock(obj2);
                                if (!insert) {
                                    ?? r0 = androidx.paging.PagingLogger.INSTANCE;
                                    if (r0.isLoggable(2)) {
                                        r0.log(2, getHighSpeedVideoFpsRangesFor(loadType3, objectRef3.element, obj2), obj2);
                                    }
                                    return kotlin.Unit.INSTANCE;
                                }
                                ?? r23 = androidx.paging.PagingLogger.INSTANCE;
                                if (r23.isLoggable(3)) {
                                    r23.log(3, getHighSpeedVideoFpsRangesFor(loadType3, objectRef3.element, loadResult), obj2);
                                }
                                androidx.paging.PagingSource.LoadResult.Page page = (androidx.paging.PagingSource.LoadResult.Page) loadResult;
                                intRef3.element += page.getData().size();
                                if ((loadType3 == androidx.paging.LoadType.PREPEND && page.getPrevKey() == null) || (loadType3 == androidx.paging.LoadType.APPEND && page.getNextKey() == null)) {
                                    booleanRef2.element = true;
                                }
                                if (androidx.paging.PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType3.ordinal()] == 2) {
                                    loadType5 = androidx.paging.LoadType.APPEND;
                                } else {
                                    loadType5 = androidx.paging.LoadType.PREPEND;
                                }
                                androidx.paging.PageFetcherSnapshotState.Holder<Key, Value> holder9 = this.getInputFormats;
                                mutex = ((androidx.paging.PageFetcherSnapshotState.Holder) holder9).getHighSpeedVideoFpsRangesFor;
                                pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizes = loadType3;
                                pageFetcherSnapshot$doLoad$1.Camera2StreamConfigurationMap = generationalViewportHint4;
                                pageFetcherSnapshot$doLoad$1.getHighSpeedVideoFpsRanges = intRef3;
                                pageFetcherSnapshot$doLoad$1.getOutputMinFrameDuration = objectRef3;
                                pageFetcherSnapshot$doLoad$1.getInputFormats = booleanRef2;
                                pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizesFor = loadParams;
                                pageFetcherSnapshot$doLoad$1.getOutputFormats = loadResult;
                                pageFetcherSnapshot$doLoad$1.getInputSizeshNQ4ISI = loadType5;
                                pageFetcherSnapshot$doLoad$1.getOutputStallDurationlomOqCM = holder9;
                                pageFetcherSnapshot$doLoad$1.getOutputMinFrameDurationlomOqCM = mutex;
                                pageFetcherSnapshot$doLoad$1.getOutputSizes = 8;
                                if (mutex.lock(null, pageFetcherSnapshot$doLoad$1) != coroutine_suspended) {
                                    holder5 = holder9;
                                    kotlin.jvm.internal.Ref.IntRef intRef8 = intRef3;
                                    objectRef4 = objectRef3;
                                    loadType6 = loadType3;
                                    generationalViewportHint6 = generationalViewportHint4;
                                    intRef4 = intRef8;
                                    try {
                                        pageFetcherSnapshotState4 = ((androidx.paging.PageFetcherSnapshotState.Holder) holder5).getHighSpeedVideoFpsRanges;
                                        dropEventOrNull = pageFetcherSnapshotState4.dropEventOrNull(loadType5, generationalViewportHint6.getHint());
                                        if (dropEventOrNull == null) {
                                            pageFetcherSnapshotState4.drop(dropEventOrNull);
                                            kotlinx.coroutines.channels.Channel<androidx.paging.PageEvent<Value>> channel2 = this.getOutputMinFrameDuration;
                                            pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizes = loadType6;
                                            pageFetcherSnapshot$doLoad$1.Camera2StreamConfigurationMap = generationalViewportHint6;
                                            pageFetcherSnapshot$doLoad$1.getHighSpeedVideoFpsRanges = intRef4;
                                            pageFetcherSnapshot$doLoad$1.getOutputMinFrameDuration = objectRef4;
                                            pageFetcherSnapshot$doLoad$1.getInputFormats = booleanRef2;
                                            pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizesFor = loadParams;
                                            pageFetcherSnapshot$doLoad$1.getOutputFormats = loadResult;
                                            pageFetcherSnapshot$doLoad$1.getInputSizeshNQ4ISI = mutex;
                                            pageFetcherSnapshot$doLoad$1.getOutputStallDurationlomOqCM = pageFetcherSnapshotState4;
                                            pageFetcherSnapshot$doLoad$1.getOutputMinFrameDurationlomOqCM = null;
                                            pageFetcherSnapshot$doLoad$1.getOutputSizes = 9;
                                            if (channel2.send(dropEventOrNull, pageFetcherSnapshot$doLoad$1) != coroutine_suspended) {
                                                loadResult2 = loadResult;
                                                pageFetcherSnapshotState2 = pageFetcherSnapshotState4;
                                                mutex9 = mutex;
                                                loadType7 = loadType6;
                                                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                                                pageFetcherSnapshotState4 = pageFetcherSnapshotState2;
                                                loadResult = loadResult2;
                                                loadParams2 = loadParams;
                                                loadType6 = loadType7;
                                                r5 = mutex9;
                                                objectRef4.element = getHighSpeedVideoSizes(pageFetcherSnapshotState4, loadType6, generationalViewportHint6.getGenerationId(), generationalViewportHint6.getHint().presentedItemsBeyondAnchor$paging_common(loadType6) + intRef4.element);
                                                if (objectRef4.element == null && !(pageFetcherSnapshotState4.getSourceLoadStates().get(loadType6) instanceof androidx.paging.LoadState.Error)) {
                                                    pageFetcherSnapshotState4.getSourceLoadStates().set(loadType6, !booleanRef2.element ? androidx.paging.LoadState.NotLoading.INSTANCE.getComplete$paging_common() : androidx.paging.LoadState.NotLoading.INSTANCE.getIncomplete$paging_common());
                                                }
                                                pageEvent$paging_common = pageFetcherSnapshotState4.toPageEvent$paging_common((androidx.paging.PagingSource.LoadResult.Page) loadResult, loadType6);
                                                channel = this.getOutputMinFrameDuration;
                                                pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizes = loadType6;
                                                pageFetcherSnapshot$doLoad$1.Camera2StreamConfigurationMap = generationalViewportHint6;
                                                pageFetcherSnapshot$doLoad$1.getHighSpeedVideoFpsRanges = intRef4;
                                                pageFetcherSnapshot$doLoad$1.getOutputMinFrameDuration = objectRef4;
                                                pageFetcherSnapshot$doLoad$1.getInputFormats = booleanRef2;
                                                pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizesFor = loadParams2;
                                                pageFetcherSnapshot$doLoad$1.getOutputFormats = loadResult;
                                                pageFetcherSnapshot$doLoad$1.getInputSizeshNQ4ISI = r5;
                                                pageFetcherSnapshot$doLoad$1.getOutputStallDurationlomOqCM = null;
                                                pageFetcherSnapshot$doLoad$1.getOutputMinFrameDurationlomOqCM = null;
                                                pageFetcherSnapshot$doLoad$1.getOutputSizes = 10;
                                                if (channel.send(pageEvent$paging_common, pageFetcherSnapshot$doLoad$1) != coroutine_suspended) {
                                                    objectRef5 = objectRef4;
                                                    intRef5 = intRef4;
                                                    generationalViewportHint7 = generationalViewportHint6;
                                                    booleanRef3 = booleanRef2;
                                                    loadType8 = loadType6;
                                                    mutex7 = r5;
                                                    kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                                                    mutex7.unlock(null);
                                                    i = ((loadParams2 instanceof androidx.paging.PagingSource.LoadParams.Prepend) || ((androidx.paging.PagingSource.LoadResult.Page) loadResult).getPrevKey() != null) ? 0 : 1;
                                                    i2 = ((loadParams2 instanceof androidx.paging.PagingSource.LoadParams.Append) || ((androidx.paging.PagingSource.LoadResult.Page) loadResult).getNextKey() != null) ? 0 : 1;
                                                    if (this.remoteMediatorConnection != null && (i != 0 || i2 != 0)) {
                                                        holder6 = this.getInputFormats;
                                                        mutex8 = ((androidx.paging.PageFetcherSnapshotState.Holder) holder6).getHighSpeedVideoFpsRangesFor;
                                                        pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizes = loadType8;
                                                        pageFetcherSnapshot$doLoad$1.Camera2StreamConfigurationMap = generationalViewportHint7;
                                                        pageFetcherSnapshot$doLoad$1.getHighSpeedVideoFpsRanges = intRef5;
                                                        pageFetcherSnapshot$doLoad$1.getOutputMinFrameDuration = objectRef5;
                                                        pageFetcherSnapshot$doLoad$1.getInputFormats = booleanRef3;
                                                        pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizesFor = holder6;
                                                        pageFetcherSnapshot$doLoad$1.getOutputFormats = mutex8;
                                                        obj3 = null;
                                                        pageFetcherSnapshot$doLoad$1.getInputSizeshNQ4ISI = null;
                                                        pageFetcherSnapshot$doLoad$1.getHighSpeedVideoFpsRangesFor = i;
                                                        pageFetcherSnapshot$doLoad$1.getHighResolutionOutputSizeshNQ4ISI = i2;
                                                        pageFetcherSnapshot$doLoad$1.getOutputSizes = 11;
                                                        break;
                                                    }
                                                    generationalViewportHint3 = generationalViewportHint7;
                                                    booleanRef = booleanRef3;
                                                    objectRef2 = objectRef5;
                                                    kotlin.jvm.internal.Ref.IntRef intRef9 = intRef5;
                                                    loadType2 = loadType8;
                                                    intRef2 = intRef9;
                                                    i3 = 1;
                                                    if (objectRef2.element != null) {
                                                    }
                                                    return kotlin.Unit.INSTANCE;
                                                }
                                            }
                                        } else {
                                            loadParams2 = loadParams;
                                            r5 = mutex;
                                            objectRef4.element = getHighSpeedVideoSizes(pageFetcherSnapshotState4, loadType6, generationalViewportHint6.getGenerationId(), generationalViewportHint6.getHint().presentedItemsBeyondAnchor$paging_common(loadType6) + intRef4.element);
                                            if (objectRef4.element == null) {
                                                pageFetcherSnapshotState4.getSourceLoadStates().set(loadType6, !booleanRef2.element ? androidx.paging.LoadState.NotLoading.INSTANCE.getComplete$paging_common() : androidx.paging.LoadState.NotLoading.INSTANCE.getIncomplete$paging_common());
                                            }
                                            pageEvent$paging_common = pageFetcherSnapshotState4.toPageEvent$paging_common((androidx.paging.PagingSource.LoadResult.Page) loadResult, loadType6);
                                            channel = this.getOutputMinFrameDuration;
                                            pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizes = loadType6;
                                            pageFetcherSnapshot$doLoad$1.Camera2StreamConfigurationMap = generationalViewportHint6;
                                            pageFetcherSnapshot$doLoad$1.getHighSpeedVideoFpsRanges = intRef4;
                                            pageFetcherSnapshot$doLoad$1.getOutputMinFrameDuration = objectRef4;
                                            pageFetcherSnapshot$doLoad$1.getInputFormats = booleanRef2;
                                            pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizesFor = loadParams2;
                                            pageFetcherSnapshot$doLoad$1.getOutputFormats = loadResult;
                                            pageFetcherSnapshot$doLoad$1.getInputSizeshNQ4ISI = r5;
                                            pageFetcherSnapshot$doLoad$1.getOutputStallDurationlomOqCM = null;
                                            pageFetcherSnapshot$doLoad$1.getOutputMinFrameDurationlomOqCM = null;
                                            pageFetcherSnapshot$doLoad$1.getOutputSizes = 10;
                                            if (channel.send(pageEvent$paging_common, pageFetcherSnapshot$doLoad$1) != coroutine_suspended) {
                                            }
                                        }
                                    } catch (java.lang.Throwable th5) {
                                        th = th5;
                                        throw th;
                                    }
                                }
                                return coroutine_suspended;
                            } catch (java.lang.Throwable th6) {
                                r22.unlock(obj2);
                                throw th6;
                            }
                        case 6:
                            kotlinx.coroutines.sync.Mutex mutex14 = (kotlinx.coroutines.sync.Mutex) pageFetcherSnapshot$doLoad$1.getInputFormats;
                            holder4 = (androidx.paging.PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doLoad$1.getOutputMinFrameDuration;
                            androidx.paging.PagingSource.LoadResult loadResult4 = (androidx.paging.PagingSource.LoadResult) pageFetcherSnapshot$doLoad$1.getHighSpeedVideoFpsRanges;
                            androidx.paging.GenerationalViewportHint generationalViewportHint9 = (androidx.paging.GenerationalViewportHint) pageFetcherSnapshot$doLoad$1.Camera2StreamConfigurationMap;
                            androidx.paging.LoadType loadType12 = (androidx.paging.LoadType) pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizes;
                            kotlin.ResultKt.throwOnFailure(obj5);
                            generationalViewportHint4 = generationalViewportHint9;
                            loadType3 = loadType12;
                            mutex5 = mutex14;
                            loadResult = loadResult4;
                            pageFetcherSnapshotState3 = ((androidx.paging.PageFetcherSnapshotState.Holder) holder4).getHighSpeedVideoFpsRanges;
                            error = new androidx.paging.LoadState.Error(((androidx.paging.PagingSource.LoadResult.Error) loadResult).getThrowable());
                            pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizes = loadType3;
                            pageFetcherSnapshot$doLoad$1.Camera2StreamConfigurationMap = generationalViewportHint4;
                            pageFetcherSnapshot$doLoad$1.getHighSpeedVideoFpsRanges = mutex5;
                            pageFetcherSnapshot$doLoad$1.getOutputMinFrameDuration = pageFetcherSnapshotState3;
                            pageFetcherSnapshot$doLoad$1.getInputFormats = null;
                            pageFetcherSnapshot$doLoad$1.getOutputSizes = 7;
                            if (getHighResolutionOutputSizeshNQ4ISI(pageFetcherSnapshotState3, loadType3, error, pageFetcherSnapshot$doLoad$1) != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        case 7:
                            pageFetcherSnapshotState = (androidx.paging.PageFetcherSnapshotState) pageFetcherSnapshot$doLoad$1.getOutputMinFrameDuration;
                            mutex6 = (kotlinx.coroutines.sync.Mutex) pageFetcherSnapshot$doLoad$1.getHighSpeedVideoFpsRanges;
                            generationalViewportHint5 = (androidx.paging.GenerationalViewportHint) pageFetcherSnapshot$doLoad$1.Camera2StreamConfigurationMap;
                            loadType4 = (androidx.paging.LoadType) pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizes;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj5);
                                pageFetcherSnapshotState.getFailedHintsByLoadType$paging_common().put(loadType4, generationalViewportHint5.getHint());
                                kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
                                mutex6.unlock(null);
                                return kotlin.Unit.INSTANCE;
                            } catch (java.lang.Throwable th7) {
                                th = th7;
                                mutex5 = mutex6;
                                throw th;
                            }
                        case 8:
                            kotlinx.coroutines.sync.Mutex mutex15 = (kotlinx.coroutines.sync.Mutex) pageFetcherSnapshot$doLoad$1.getOutputMinFrameDurationlomOqCM;
                            holder5 = (androidx.paging.PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doLoad$1.getOutputStallDurationlomOqCM;
                            loadType5 = (androidx.paging.LoadType) pageFetcherSnapshot$doLoad$1.getInputSizeshNQ4ISI;
                            androidx.paging.PagingSource.LoadResult loadResult5 = (androidx.paging.PagingSource.LoadResult) pageFetcherSnapshot$doLoad$1.getOutputFormats;
                            androidx.paging.PagingSource.LoadParams<Key> loadParams4 = (androidx.paging.PagingSource.LoadParams) pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizesFor;
                            kotlin.jvm.internal.Ref.BooleanRef booleanRef5 = (kotlin.jvm.internal.Ref.BooleanRef) pageFetcherSnapshot$doLoad$1.getInputFormats;
                            kotlin.jvm.internal.Ref.ObjectRef objectRef8 = (kotlin.jvm.internal.Ref.ObjectRef) pageFetcherSnapshot$doLoad$1.getOutputMinFrameDuration;
                            kotlin.jvm.internal.Ref.IntRef intRef10 = (kotlin.jvm.internal.Ref.IntRef) pageFetcherSnapshot$doLoad$1.getHighSpeedVideoFpsRanges;
                            androidx.paging.GenerationalViewportHint generationalViewportHint10 = (androidx.paging.GenerationalViewportHint) pageFetcherSnapshot$doLoad$1.Camera2StreamConfigurationMap;
                            loadType6 = (androidx.paging.LoadType) pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizes;
                            kotlin.ResultKt.throwOnFailure(obj5);
                            mutex = mutex15;
                            loadResult = loadResult5;
                            loadParams = loadParams4;
                            booleanRef2 = booleanRef5;
                            objectRef4 = objectRef8;
                            intRef4 = intRef10;
                            generationalViewportHint6 = generationalViewportHint10;
                            pageFetcherSnapshotState4 = ((androidx.paging.PageFetcherSnapshotState.Holder) holder5).getHighSpeedVideoFpsRanges;
                            dropEventOrNull = pageFetcherSnapshotState4.dropEventOrNull(loadType5, generationalViewportHint6.getHint());
                            if (dropEventOrNull == null) {
                            }
                            break;
                        case 9:
                            pageFetcherSnapshotState2 = (androidx.paging.PageFetcherSnapshotState) pageFetcherSnapshot$doLoad$1.getOutputStallDurationlomOqCM;
                            kotlinx.coroutines.sync.Mutex mutex16 = (kotlinx.coroutines.sync.Mutex) pageFetcherSnapshot$doLoad$1.getInputSizeshNQ4ISI;
                            loadResult2 = (androidx.paging.PagingSource.LoadResult) pageFetcherSnapshot$doLoad$1.getOutputFormats;
                            loadParams = (androidx.paging.PagingSource.LoadParams) pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizesFor;
                            booleanRef2 = (kotlin.jvm.internal.Ref.BooleanRef) pageFetcherSnapshot$doLoad$1.getInputFormats;
                            objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) pageFetcherSnapshot$doLoad$1.getOutputMinFrameDuration;
                            intRef4 = (kotlin.jvm.internal.Ref.IntRef) pageFetcherSnapshot$doLoad$1.getHighSpeedVideoFpsRanges;
                            generationalViewportHint6 = (androidx.paging.GenerationalViewportHint) pageFetcherSnapshot$doLoad$1.Camera2StreamConfigurationMap;
                            loadType7 = (androidx.paging.LoadType) pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizes;
                            kotlin.ResultKt.throwOnFailure(obj5);
                            mutex9 = mutex16;
                            kotlin.Unit unit32 = kotlin.Unit.INSTANCE;
                            pageFetcherSnapshotState4 = pageFetcherSnapshotState2;
                            loadResult = loadResult2;
                            loadParams2 = loadParams;
                            loadType6 = loadType7;
                            r5 = mutex9;
                            objectRef4.element = getHighSpeedVideoSizes(pageFetcherSnapshotState4, loadType6, generationalViewportHint6.getGenerationId(), generationalViewportHint6.getHint().presentedItemsBeyondAnchor$paging_common(loadType6) + intRef4.element);
                            if (objectRef4.element == null) {
                            }
                            pageEvent$paging_common = pageFetcherSnapshotState4.toPageEvent$paging_common((androidx.paging.PagingSource.LoadResult.Page) loadResult, loadType6);
                            channel = this.getOutputMinFrameDuration;
                            pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizes = loadType6;
                            pageFetcherSnapshot$doLoad$1.Camera2StreamConfigurationMap = generationalViewportHint6;
                            pageFetcherSnapshot$doLoad$1.getHighSpeedVideoFpsRanges = intRef4;
                            pageFetcherSnapshot$doLoad$1.getOutputMinFrameDuration = objectRef4;
                            pageFetcherSnapshot$doLoad$1.getInputFormats = booleanRef2;
                            pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizesFor = loadParams2;
                            pageFetcherSnapshot$doLoad$1.getOutputFormats = loadResult;
                            pageFetcherSnapshot$doLoad$1.getInputSizeshNQ4ISI = r5;
                            pageFetcherSnapshot$doLoad$1.getOutputStallDurationlomOqCM = null;
                            pageFetcherSnapshot$doLoad$1.getOutputMinFrameDurationlomOqCM = null;
                            pageFetcherSnapshot$doLoad$1.getOutputSizes = 10;
                            if (channel.send(pageEvent$paging_common, pageFetcherSnapshot$doLoad$1) != coroutine_suspended) {
                            }
                            break;
                        case 10:
                            kotlinx.coroutines.sync.Mutex mutex17 = (kotlinx.coroutines.sync.Mutex) pageFetcherSnapshot$doLoad$1.getInputSizeshNQ4ISI;
                            loadResult = (androidx.paging.PagingSource.LoadResult) pageFetcherSnapshot$doLoad$1.getOutputFormats;
                            loadParams2 = (androidx.paging.PagingSource.LoadParams) pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizesFor;
                            kotlin.jvm.internal.Ref.BooleanRef booleanRef6 = (kotlin.jvm.internal.Ref.BooleanRef) pageFetcherSnapshot$doLoad$1.getInputFormats;
                            kotlin.jvm.internal.Ref.ObjectRef objectRef9 = (kotlin.jvm.internal.Ref.ObjectRef) pageFetcherSnapshot$doLoad$1.getOutputMinFrameDuration;
                            intRef5 = (kotlin.jvm.internal.Ref.IntRef) pageFetcherSnapshot$doLoad$1.getHighSpeedVideoFpsRanges;
                            androidx.paging.GenerationalViewportHint generationalViewportHint11 = (androidx.paging.GenerationalViewportHint) pageFetcherSnapshot$doLoad$1.Camera2StreamConfigurationMap;
                            androidx.paging.LoadType loadType13 = (androidx.paging.LoadType) pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizes;
                            kotlin.ResultKt.throwOnFailure(obj5);
                            objectRef5 = objectRef9;
                            loadType8 = loadType13;
                            booleanRef3 = booleanRef6;
                            generationalViewportHint7 = generationalViewportHint11;
                            mutex7 = mutex17;
                            kotlin.Unit unit42 = kotlin.Unit.INSTANCE;
                            mutex7.unlock(null);
                            if (loadParams2 instanceof androidx.paging.PagingSource.LoadParams.Prepend) {
                                break;
                            }
                            if (loadParams2 instanceof androidx.paging.PagingSource.LoadParams.Append) {
                                break;
                            }
                            if (this.remoteMediatorConnection != null) {
                                holder6 = this.getInputFormats;
                                mutex8 = ((androidx.paging.PageFetcherSnapshotState.Holder) holder6).getHighSpeedVideoFpsRangesFor;
                                pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizes = loadType8;
                                pageFetcherSnapshot$doLoad$1.Camera2StreamConfigurationMap = generationalViewportHint7;
                                pageFetcherSnapshot$doLoad$1.getHighSpeedVideoFpsRanges = intRef5;
                                pageFetcherSnapshot$doLoad$1.getOutputMinFrameDuration = objectRef5;
                                pageFetcherSnapshot$doLoad$1.getInputFormats = booleanRef3;
                                pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizesFor = holder6;
                                pageFetcherSnapshot$doLoad$1.getOutputFormats = mutex8;
                                obj3 = null;
                                pageFetcherSnapshot$doLoad$1.getInputSizeshNQ4ISI = null;
                                pageFetcherSnapshot$doLoad$1.getHighSpeedVideoFpsRangesFor = i;
                                pageFetcherSnapshot$doLoad$1.getHighResolutionOutputSizeshNQ4ISI = i2;
                                pageFetcherSnapshot$doLoad$1.getOutputSizes = 11;
                                break;
                            }
                            generationalViewportHint3 = generationalViewportHint7;
                            booleanRef = booleanRef3;
                            objectRef2 = objectRef5;
                            kotlin.jvm.internal.Ref.IntRef intRef92 = intRef5;
                            loadType2 = loadType8;
                            intRef2 = intRef92;
                            i3 = 1;
                            if (objectRef2.element != null) {
                            }
                            return kotlin.Unit.INSTANCE;
                        case 11:
                            i2 = pageFetcherSnapshot$doLoad$1.getHighResolutionOutputSizeshNQ4ISI;
                            i = pageFetcherSnapshot$doLoad$1.getHighSpeedVideoFpsRangesFor;
                            kotlinx.coroutines.sync.Mutex mutex18 = (kotlinx.coroutines.sync.Mutex) pageFetcherSnapshot$doLoad$1.getOutputFormats;
                            holder6 = (androidx.paging.PageFetcherSnapshotState.Holder) pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizesFor;
                            booleanRef3 = (kotlin.jvm.internal.Ref.BooleanRef) pageFetcherSnapshot$doLoad$1.getInputFormats;
                            objectRef5 = (kotlin.jvm.internal.Ref.ObjectRef) pageFetcherSnapshot$doLoad$1.getOutputMinFrameDuration;
                            kotlin.jvm.internal.Ref.IntRef intRef11 = (kotlin.jvm.internal.Ref.IntRef) pageFetcherSnapshot$doLoad$1.getHighSpeedVideoFpsRanges;
                            generationalViewportHint7 = (androidx.paging.GenerationalViewportHint) pageFetcherSnapshot$doLoad$1.Camera2StreamConfigurationMap;
                            loadType8 = (androidx.paging.LoadType) pageFetcherSnapshot$doLoad$1.getHighSpeedVideoSizes;
                            kotlin.ResultKt.throwOnFailure(obj5);
                            mutex8 = mutex18;
                            intRef5 = intRef11;
                            obj3 = null;
                            try {
                                androidx.paging.PagingState<Key, Value> currentPagingState$paging_common = ((androidx.paging.PageFetcherSnapshotState.Holder) holder6).getHighSpeedVideoFpsRanges.currentPagingState$paging_common(this.getHighSpeedVideoFpsRanges.getLastAccessHint());
                                mutex8.unlock(obj3);
                                if (i != 0) {
                                    this.remoteMediatorConnection.requestLoad(androidx.paging.LoadType.PREPEND, currentPagingState$paging_common);
                                }
                                if (i2 != 0) {
                                    this.remoteMediatorConnection.requestLoad(androidx.paging.LoadType.APPEND, currentPagingState$paging_common);
                                }
                                generationalViewportHint3 = generationalViewportHint7;
                                booleanRef = booleanRef3;
                                objectRef2 = objectRef5;
                                kotlin.jvm.internal.Ref.IntRef intRef922 = intRef5;
                                loadType2 = loadType8;
                                intRef2 = intRef922;
                                i3 = 1;
                                if (objectRef2.element != null) {
                                }
                                return kotlin.Unit.INSTANCE;
                            } finally {
                            }
                        default:
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (r5) {
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
            mutex = r5;
        }
        pageFetcherSnapshot$doLoad$1 = new androidx.paging.PageFetcherSnapshot$doLoad$1(this, continuation);
        java.lang.Object obj52 = pageFetcherSnapshot$doLoad$1.getOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r5 = pageFetcherSnapshot$doLoad$1.getOutputSizes;
        int i32 = 1;
    }

    private static java.lang.String getHighSpeedVideoFpsRangesFor(androidx.paging.LoadType p0, Key p1, androidx.paging.PagingSource.LoadResult<Key, Value> p2) {
        if (p2 == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("End ");
            sb.append(p0);
            sb.append(" with loadkey ");
            sb.append(p1);
            sb.append(". Load CANCELLED.");
            return sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("End ");
        sb2.append(p0);
        sb2.append(" with loadKey ");
        sb2.append(p1);
        sb2.append(". Returned ");
        sb2.append(p2);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(androidx.paging.PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState, androidx.paging.LoadType loadType, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (!kotlin.jvm.internal.Intrinsics.areEqual(pageFetcherSnapshotState.getSourceLoadStates().get(loadType), androidx.paging.LoadState.Loading.INSTANCE)) {
            pageFetcherSnapshotState.getSourceLoadStates().set(loadType, androidx.paging.LoadState.Loading.INSTANCE);
            java.lang.Object send = this.getOutputMinFrameDuration.send(new androidx.paging.PageEvent.LoadStateUpdate(pageFetcherSnapshotState.getSourceLoadStates().snapshot(), null), continuation);
            return send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(androidx.paging.PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState, androidx.paging.LoadType loadType, androidx.paging.LoadState.Error error, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (!kotlin.jvm.internal.Intrinsics.areEqual(pageFetcherSnapshotState.getSourceLoadStates().get(loadType), error)) {
            pageFetcherSnapshotState.getSourceLoadStates().set(loadType, error);
            java.lang.Object send = this.getOutputMinFrameDuration.send(new androidx.paging.PageEvent.LoadStateUpdate(pageFetcherSnapshotState.getSourceLoadStates().snapshot(), null), continuation);
            return send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    private final Key getHighSpeedVideoSizes(androidx.paging.PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState, androidx.paging.LoadType loadType, int i, int i2) {
        if (i != pageFetcherSnapshotState.generationId$paging_common(loadType) || (pageFetcherSnapshotState.getSourceLoadStates().get(loadType) instanceof androidx.paging.LoadState.Error) || i2 >= this.Camera2StreamConfigurationMap.prefetchDistance) {
            return null;
        }
        if (loadType == androidx.paging.LoadType.PREPEND) {
            return (Key) ((androidx.paging.PagingSource.LoadResult.Page) kotlin.collections.CollectionsKt.first((java.util.List) pageFetcherSnapshotState.getPages$paging_common())).getPrevKey();
        }
        return (Key) ((androidx.paging.PagingSource.LoadResult.Page) kotlin.collections.CollectionsKt.last((java.util.List) pageFetcherSnapshotState.getPages$paging_common())).getNextKey();
    }

    public static final /* synthetic */ java.lang.Object access$collectAsGenerationalViewportHints(final androidx.paging.PageFetcherSnapshot pageFetcherSnapshot, kotlinx.coroutines.flow.Flow flow, final androidx.paging.LoadType loadType, kotlin.coroutines.Continuation continuation) {
        java.lang.Object collect = kotlinx.coroutines.flow.FlowKt.conflate(androidx.paging.FlowExtKt.simpleRunningReduce(androidx.paging.FlowExtKt.simpleTransformLatest(flow, new androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(null, pageFetcherSnapshot, loadType)), new androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3(loadType, null))).collect(new kotlinx.coroutines.flow.FlowCollector(pageFetcherSnapshot) { // from class: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$4
            final /* synthetic */ androidx.paging.PageFetcherSnapshot<Key, Value> getHighSpeedVideoFpsRangesFor;

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation2) {
                java.lang.Object highSpeedVideoSizes;
                highSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(loadType, (androidx.paging.GenerationalViewportHint) obj, continuation2);
                return highSpeedVideoSizes == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoSizes : kotlin.Unit.INSTANCE;
            }

            {
                this.getHighSpeedVideoFpsRangesFor = pageFetcherSnapshot;
            }
        }, continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.lang.Object access$retryLoadError(androidx.paging.PageFetcherSnapshot pageFetcherSnapshot, androidx.paging.LoadType loadType, androidx.paging.ViewportHint viewportHint, kotlin.coroutines.Continuation continuation) {
        if (androidx.paging.PageFetcherSnapshot.WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()] == 1) {
            java.lang.Object highSpeedVideoSizes = pageFetcherSnapshot.getHighSpeedVideoSizes(continuation);
            return highSpeedVideoSizes == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoSizes : kotlin.Unit.INSTANCE;
        }
        if (viewportHint == null) {
            throw new java.lang.IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint".toString());
        }
        pageFetcherSnapshot.getHighSpeedVideoFpsRanges.forceSetHint(loadType, viewportHint);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$startConsumingHints(androidx.paging.PageFetcherSnapshot pageFetcherSnapshot, kotlinx.coroutines.CoroutineScope coroutineScope) {
        if (pageFetcherSnapshot.Camera2StreamConfigurationMap.jumpThreshold != Integer.MIN_VALUE) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.paging.PageFetcherSnapshot$startConsumingHints$1(pageFetcherSnapshot, null), 3, null);
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.paging.PageFetcherSnapshot$startConsumingHints$2(pageFetcherSnapshot, null), 3, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.paging.PageFetcherSnapshot$startConsumingHints$3(pageFetcherSnapshot, null), 3, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.paging.LoadType.values().length];
            try {
                iArr[androidx.paging.LoadType.REFRESH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.paging.LoadType.PREPEND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.paging.LoadType.APPEND.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
