package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001^B#\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00070\u000b¢\u0006\u0002\b\f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH¦@¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u00070\u000b¢\u0006\u0002\b\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0015J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001bJ\u001b\u0010\u001f\u001a\u00020\u000b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001d¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010!\u001a\u00020\u000b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001d¢\u0006\u0004\b!\u0010 J&\u0010$\u001a\u00020\u000b2\u0017\u0010\u001e\u001a\u0013\u0012\t\u0012\u00070#¢\u0006\u0002\b\f\u0012\u0004\u0012\u00020\u000b0\"¢\u0006\u0004\b$\u0010%J&\u0010&\u001a\u00020\u000b2\u0017\u0010\u001e\u001a\u0013\u0012\t\u0012\u00070#¢\u0006\u0002\b\f\u0012\u0004\u0012\u00020\u000b0\"¢\u0006\u0004\b&\u0010%JX\u00103\u001a\u00020\u000b2\u0012\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000(0'2\u0006\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u00122\u0006\u0010-\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u00010.2\b\u00100\u001a\u0004\u0018\u00010.2\u0006\u00102\u001a\u000201H\u0082@¢\u0006\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001c\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010BR \u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001d0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010E\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010IR\u0016\u0010J\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010?\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010LR\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020,0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010NR\u0011\u0010Q\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\bO\u0010PR\"\u0010S\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0R8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u000b0W8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bC\u0010XR\u0017\u0010]\u001a\b\u0012\u0004\u0012\u00020\u000b0Z8G¢\u0006\u0006\u001a\u0004\b[\u0010\\"}, d2 = {"Landroidx/paging/PagingDataPresenter;", "", "T", "Lkotlin/coroutines/CoroutineContext;", "mainContext", "Landroidx/paging/PagingData;", "cachedPagingData", "<init>", "(Lkotlin/coroutines/CoroutineContext;Landroidx/paging/PagingData;)V", "Landroidx/paging/PagingDataEvent;", "event", "", "Lkotlin/jvm/JvmSuppressWildcards;", "presentPagingDataEvent", "(Landroidx/paging/PagingDataEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pagingData", "collectFrom", "(Landroidx/paging/PagingData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "index", "get", "(I)Ljava/lang/Object;", "peek", "Landroidx/paging/ItemSnapshotList;", "snapshot", "()Landroidx/paging/ItemSnapshotList;", "retry", "()V", com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ACTION_REFRESH, "Lkotlin/Function0;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addOnPagesUpdatedListener", "(Lkotlin/jvm/functions/Function0;)V", "removeOnPagesUpdatedListener", "Lkotlin/Function1;", "Landroidx/paging/CombinedLoadStates;", "addLoadStateListener", "(Lkotlin/jvm/functions/Function1;)V", "removeLoadStateListener", "", "Landroidx/paging/TransformablePage;", "p0", "p1", "p2", "", "p3", "Landroidx/paging/LoadStates;", "p4", "p5", "Landroidx/paging/HintReceiver;", "p6", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/util/List;IIZLandroidx/paging/LoadStates;Landroidx/paging/LoadStates;Landroidx/paging/HintReceiver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOutputMinFrameDuration", "Lkotlin/coroutines/CoroutineContext;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Landroidx/paging/HintReceiver;", "Landroidx/paging/UiReceiver;", "getOutputMinFrameDurationlomOqCM", "Landroidx/paging/UiReceiver;", "getHighSpeedVideoSizes", "Landroidx/paging/PageStore;", "getInputSizeshNQ4ISI", "Landroidx/paging/PageStore;", "Landroidx/paging/MutableCombinedLoadStateCollection;", "Landroidx/paging/MutableCombinedLoadStateCollection;", "Camera2StreamConfigurationMap", "Landroidx/paging/internal/CopyOnWriteArrayList;", "getOutputFormats", "Landroidx/paging/internal/CopyOnWriteArrayList;", "getHighSpeedVideoSizesFor", "Landroidx/paging/SingleRunner;", "Landroidx/paging/SingleRunner;", "getInputFormats", "Z", com.visa.cbp.getEncExpo.warmup, "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size, "Lkotlinx/coroutines/flow/StateFlow;", "loadStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getLoadStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getOutputStallDurationlomOqCM", "Lkotlinx/coroutines/flow/Flow;", "getOnPagesUpdatedFlow", "()Lkotlinx/coroutines/flow/Flow;", "onPagesUpdatedFlow", "InitialUiReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class PagingDataPresenter<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<kotlin.Unit> getOutputStallDurationlomOqCM;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.paging.MutableCombinedLoadStateCollection Camera2StreamConfigurationMap;
    private androidx.paging.HintReceiver getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.paging.SingleRunner getOutputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private volatile int getInputSizeshNQ4ISI;
    private volatile boolean getInputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.paging.PageStore<T> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.paging.internal.CopyOnWriteArrayList<kotlin.jvm.functions.Function0<kotlin.Unit>> getHighSpeedVideoSizesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final kotlin.coroutines.CoroutineContext getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private androidx.paging.UiReceiver getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<androidx.paging.CombinedLoadStates> loadStateFlow;

    public abstract java.lang.Object presentPagingDataEvent(androidx.paging.PagingDataEvent<T> pagingDataEvent, kotlin.coroutines.Continuation<kotlin.Unit> continuation);

    public PagingDataPresenter(kotlin.coroutines.CoroutineContext coroutineContext, androidx.paging.PagingData<T> pagingData) {
        androidx.paging.PageEvent.Insert<T> cachedEvent$paging_common;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        this.getHighSpeedVideoFpsRangesFor = coroutineContext;
        this.getHighSpeedVideoSizes = new androidx.paging.PagingDataPresenter.InitialUiReceiver();
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.paging.PageStore.INSTANCE.initial$paging_common(pagingData != null ? pagingData.cachedEvent$paging_common() : null);
        androidx.paging.MutableCombinedLoadStateCollection mutableCombinedLoadStateCollection = new androidx.paging.MutableCombinedLoadStateCollection();
        if (pagingData != null && (cachedEvent$paging_common = pagingData.cachedEvent$paging_common()) != null) {
            mutableCombinedLoadStateCollection.set(cachedEvent$paging_common.getSourceLoadStates(), cachedEvent$paging_common.getMediatorLoadStates());
        }
        this.Camera2StreamConfigurationMap = mutableCombinedLoadStateCollection;
        this.getHighSpeedVideoSizesFor = new androidx.paging.internal.CopyOnWriteArrayList<>();
        this.getOutputFormats = new androidx.paging.SingleRunner(false, 1, null);
        this.getOutputMinFrameDuration = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.loadStateFlow = mutableCombinedLoadStateCollection.getStateFlow();
        this.getOutputStallDurationlomOqCM = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow(0, 64, kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST);
        addOnPagesUpdatedListener(new kotlin.jvm.functions.Function0() { // from class: androidx.paging.PagingDataPresenter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.paging.PagingDataPresenter.$r8$lambda$4HezSm9xz4sJdqQSPbJB4zJV7r0(androidx.paging.PagingDataPresenter.this);
            }
        });
    }

    public /* synthetic */ PagingDataPresenter(kotlinx.coroutines.MainCoroutineDispatcher mainCoroutineDispatcher, androidx.paging.PagingData pagingData, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlinx.coroutines.Dispatchers.getMain() : mainCoroutineDispatcher, (i & 2) != 0 ? null : pagingData);
    }

    public final java.lang.Object collectFrom(androidx.paging.PagingData<T> pagingData, kotlin.coroutines.Continuation<kotlin.Unit> continuation) {
        java.lang.Object runInIsolation$default = androidx.paging.SingleRunner.runInIsolation$default(this.getOutputFormats, 0, new androidx.paging.PagingDataPresenter$collectFrom$2(this, pagingData, null), continuation, 1, null);
        return runInIsolation$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? runInIsolation$default : kotlin.Unit.INSTANCE;
    }

    public final T get(int index) {
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> mutableStateFlow = this.getOutputMinFrameDuration;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), java.lang.Boolean.TRUE)) {
        }
        this.getInputFormats = true;
        this.getInputSizeshNQ4ISI = index;
        androidx.paging.PagingLogger pagingLogger = androidx.paging.PagingLogger.INSTANCE;
        if (pagingLogger.isLoggable(2)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Accessing item index[");
            sb.append(index);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            pagingLogger.log(2, sb.toString(), null);
        }
        androidx.paging.HintReceiver hintReceiver = this.getHighSpeedVideoFpsRanges;
        if (hintReceiver != null) {
            hintReceiver.accessHint(this.getHighResolutionOutputSizeshNQ4ISI.accessHintForPresenterIndex(index));
        }
        T t = this.getHighResolutionOutputSizeshNQ4ISI.get(index);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> mutableStateFlow2 = this.getOutputMinFrameDuration;
        while (!mutableStateFlow2.compareAndSet(mutableStateFlow2.getValue(), java.lang.Boolean.FALSE)) {
        }
        return t;
    }

    public final T peek(int index) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(index);
    }

    public final androidx.paging.ItemSnapshotList<T> snapshot() {
        return this.getHighResolutionOutputSizeshNQ4ISI.snapshot();
    }

    public final int getSize() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getSize();
    }

    public final kotlinx.coroutines.flow.StateFlow<androidx.paging.CombinedLoadStates> getLoadStateFlow() {
        return this.loadStateFlow;
    }

    public final kotlinx.coroutines.flow.Flow<kotlin.Unit> getOnPagesUpdatedFlow() {
        return kotlinx.coroutines.flow.FlowKt.asSharedFlow(this.getOutputStallDurationlomOqCM);
    }

    public final void addOnPagesUpdatedListener(kotlin.jvm.functions.Function0<kotlin.Unit> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        this.getHighSpeedVideoSizesFor.add(listener);
    }

    public final void removeOnPagesUpdatedListener(kotlin.jvm.functions.Function0<kotlin.Unit> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        this.getHighSpeedVideoSizesFor.remove(listener);
    }

    public final void addLoadStateListener(kotlin.jvm.functions.Function1<androidx.paging.CombinedLoadStates, kotlin.Unit> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        this.Camera2StreamConfigurationMap.addListener(listener);
    }

    public final void removeLoadStateListener(kotlin.jvm.functions.Function1<androidx.paging.CombinedLoadStates, kotlin.Unit> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        this.Camera2StreamConfigurationMap.removeListener(listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d4 A[Catch: CancellationException -> 0x0062, TryCatch #1 {CancellationException -> 0x0062, blocks: (B:11:0x0058, B:13:0x00cb, B:15:0x00d4, B:17:0x00e4, B:19:0x00ea, B:20:0x00f0, B:22:0x0100, B:24:0x0106, B:25:0x010c, B:27:0x013a, B:28:0x0154, B:32:0x0170, B:33:0x0178, B:35:0x017e, B:37:0x0182), top: B:10:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0170 A[Catch: CancellationException -> 0x0062, TryCatch #1 {CancellationException -> 0x0062, blocks: (B:11:0x0058, B:13:0x00cb, B:15:0x00d4, B:17:0x00e4, B:19:0x00ea, B:20:0x00f0, B:22:0x0100, B:24:0x0106, B:25:0x010c, B:27:0x013a, B:28:0x0154, B:32:0x0170, B:33:0x0178, B:35:0x017e, B:37:0x0182), top: B:10:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.util.List<androidx.paging.TransformablePage<T>> list, int i, int i2, boolean z, androidx.paging.LoadStates loadStates, androidx.paging.LoadStates loadStates2, androidx.paging.HintReceiver hintReceiver, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.paging.PagingDataPresenter$presentNewList$1 pagingDataPresenter$presentNewList$1;
        int i3;
        androidx.paging.PageStore<T> pageStore;
        androidx.paging.HintReceiver hintReceiver2;
        java.util.List<androidx.paging.TransformablePage<T>> list2;
        boolean z2;
        androidx.paging.HintReceiver hintReceiver3;
        androidx.paging.PageStore<T> pageStore2;
        androidx.paging.PageStore<T> pageStore3;
        androidx.paging.LoadStates loadStates3;
        androidx.paging.HintReceiver hintReceiver4;
        androidx.paging.LoadStates loadStates4;
        androidx.paging.PagingLogger pagingLogger;
        androidx.paging.HintReceiver hintReceiver5;
        java.util.List<T> data;
        java.util.List<T> data2;
        int i4 = i;
        int i5 = i2;
        if (continuation instanceof androidx.paging.PagingDataPresenter$presentNewList$1) {
            pagingDataPresenter$presentNewList$1 = (androidx.paging.PagingDataPresenter$presentNewList$1) continuation;
            if ((pagingDataPresenter$presentNewList$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                pagingDataPresenter$presentNewList$1.getOutputStallDurationlomOqCM -= 2147483648;
                java.lang.Object obj = pagingDataPresenter$presentNewList$1.getOutputMinFrameDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = pagingDataPresenter$presentNewList$1.getOutputStallDurationlomOqCM;
                if (i3 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (z && loadStates == null) {
                        throw new java.lang.IllegalArgumentException("Cannot dispatch LoadStates in PagingDataPresenter without source LoadStates set.".toString());
                    }
                    this.getInputFormats = false;
                    pageStore = this.getHighResolutionOutputSizeshNQ4ISI;
                    hintReceiver2 = this.getHighSpeedVideoFpsRanges;
                    androidx.paging.PageStore<T> pageStore4 = new androidx.paging.PageStore<>(list, i4, i5);
                    androidx.paging.PageStore<T> pageStore5 = this.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(pageStore5, "");
                    androidx.paging.PageStore<T> pageStore6 = pageStore5;
                    this.getHighResolutionOutputSizeshNQ4ISI = pageStore4;
                    this.getHighSpeedVideoFpsRanges = hintReceiver;
                    try {
                        androidx.paging.PagingDataEvent<T> refresh = new androidx.paging.PagingDataEvent.Refresh<>(pageStore4, pageStore6);
                        pagingDataPresenter$presentNewList$1.getHighSpeedVideoFpsRanges = list;
                        pagingDataPresenter$presentNewList$1.Camera2StreamConfigurationMap = loadStates;
                        pagingDataPresenter$presentNewList$1.getHighSpeedVideoFpsRangesFor = loadStates2;
                        pagingDataPresenter$presentNewList$1.getOutputFormats = hintReceiver;
                        pagingDataPresenter$presentNewList$1.getInputSizeshNQ4ISI = pageStore;
                        pagingDataPresenter$presentNewList$1.getInputFormats = hintReceiver2;
                        pagingDataPresenter$presentNewList$1.getHighSpeedVideoSizesFor = pageStore4;
                        pagingDataPresenter$presentNewList$1.getHighResolutionOutputSizeshNQ4ISI = i4;
                        pagingDataPresenter$presentNewList$1.getHighSpeedVideoSizes = i5;
                        pagingDataPresenter$presentNewList$1.getOutputMinFrameDuration = z;
                        pagingDataPresenter$presentNewList$1.getOutputStallDurationlomOqCM = 1;
                        if (presentPagingDataEvent(refresh, pagingDataPresenter$presentNewList$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        list2 = list;
                        z2 = z;
                        hintReceiver3 = hintReceiver;
                        pageStore2 = pageStore;
                        pageStore3 = pageStore4;
                        loadStates3 = loadStates;
                        hintReceiver4 = hintReceiver2;
                        loadStates4 = loadStates2;
                    } catch (java.util.concurrent.CancellationException e) {
                        e = e;
                        this.getHighResolutionOutputSizeshNQ4ISI = pageStore;
                        this.getHighSpeedVideoFpsRanges = hintReceiver2;
                        throw e;
                    }
                } else {
                    if (i3 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z2 = pagingDataPresenter$presentNewList$1.getOutputMinFrameDuration;
                    int i6 = pagingDataPresenter$presentNewList$1.getHighSpeedVideoSizes;
                    int i7 = pagingDataPresenter$presentNewList$1.getHighResolutionOutputSizeshNQ4ISI;
                    pageStore3 = (androidx.paging.PageStore) pagingDataPresenter$presentNewList$1.getHighSpeedVideoSizesFor;
                    hintReceiver4 = (androidx.paging.HintReceiver) pagingDataPresenter$presentNewList$1.getInputFormats;
                    pageStore2 = (androidx.paging.PageStore) pagingDataPresenter$presentNewList$1.getInputSizeshNQ4ISI;
                    hintReceiver3 = (androidx.paging.HintReceiver) pagingDataPresenter$presentNewList$1.getOutputFormats;
                    loadStates4 = (androidx.paging.LoadStates) pagingDataPresenter$presentNewList$1.getHighSpeedVideoFpsRangesFor;
                    loadStates3 = (androidx.paging.LoadStates) pagingDataPresenter$presentNewList$1.Camera2StreamConfigurationMap;
                    list2 = (java.util.List) pagingDataPresenter$presentNewList$1.getHighSpeedVideoFpsRanges;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        i5 = i6;
                        i4 = i7;
                    } catch (java.util.concurrent.CancellationException e2) {
                        e = e2;
                        hintReceiver2 = hintReceiver4;
                        pageStore = pageStore2;
                        this.getHighResolutionOutputSizeshNQ4ISI = pageStore;
                        this.getHighSpeedVideoFpsRanges = hintReceiver2;
                        throw e;
                    }
                }
                pagingLogger = androidx.paging.PagingLogger.INSTANCE;
                if (pagingLogger.isLoggable(3)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Presenting data (\n                            |   first item: ");
                    androidx.paging.TransformablePage transformablePage = (androidx.paging.TransformablePage) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) list2);
                    sb.append((transformablePage == null || (data2 = transformablePage.getData()) == null) ? null : kotlin.collections.CollectionsKt.firstOrNull((java.util.List) data2));
                    sb.append("\n                            |   last item: ");
                    androidx.paging.TransformablePage transformablePage2 = (androidx.paging.TransformablePage) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) list2);
                    sb.append((transformablePage2 == null || (data = transformablePage2.getData()) == null) ? null : kotlin.collections.CollectionsKt.lastOrNull((java.util.List) data));
                    sb.append("\n                            |   placeholdersBefore: ");
                    sb.append(i4);
                    sb.append("\n                            |   placeholdersAfter: ");
                    sb.append(i5);
                    sb.append("\n                            |   hintReceiver: ");
                    sb.append(hintReceiver3);
                    sb.append("\n                            |   sourceLoadStates: ");
                    sb.append(loadStates3);
                    sb.append("\n                        ");
                    java.lang.String obj2 = sb.toString();
                    if (loadStates4 != null) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append(obj2);
                        sb2.append("|   mediatorLoadStates: ");
                        sb2.append(loadStates4);
                        sb2.append('\n');
                        obj2 = sb2.toString();
                    }
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    sb3.append(obj2);
                    sb3.append("|)");
                    pagingLogger.log(3, kotlin.text.StringsKt.trimMargin$default(sb3.toString(), null, 1, null), null);
                }
                if (z2) {
                    androidx.paging.MutableCombinedLoadStateCollection mutableCombinedLoadStateCollection = this.Camera2StreamConfigurationMap;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(loadStates3);
                    mutableCombinedLoadStateCollection.set(loadStates3, loadStates4);
                }
                if (pageStore3.getSize() == 0 && (hintReceiver5 = this.getHighSpeedVideoFpsRanges) != null) {
                    hintReceiver5.accessHint(pageStore3.initializeHint());
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        pagingDataPresenter$presentNewList$1 = new androidx.paging.PagingDataPresenter$presentNewList$1(this, continuation);
        java.lang.Object obj3 = pagingDataPresenter$presentNewList$1.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = pagingDataPresenter$presentNewList$1.getOutputStallDurationlomOqCM;
        if (i3 != 0) {
        }
        pagingLogger = androidx.paging.PagingLogger.INSTANCE;
        if (pagingLogger.isLoggable(3)) {
        }
        if (z2) {
        }
        if (pageStore3.getSize() == 0) {
            hintReceiver5.accessHint(pageStore3.initializeHint());
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003R\u0016\u0010\n\u001a\u00020\u00078\u0007@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\b\u001a\u00020\u00078\u0007@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\n\u0010\t"}, d2 = {"Landroidx/paging/PagingDataPresenter$InitialUiReceiver;", "Landroidx/paging/UiReceiver;", "<init>", "()V", "", "retry", com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ACTION_REFRESH, "", "getHighSpeedVideoSizes", "Z", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    static final class InitialUiReceiver implements androidx.paging.UiReceiver {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        boolean getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        boolean getHighSpeedVideoFpsRangesFor;

        @Override // androidx.paging.UiReceiver
        public final void retry() {
            this.getHighSpeedVideoFpsRangesFor = true;
        }

        @Override // androidx.paging.UiReceiver
        public final void refresh() {
            this.getHighSpeedVideoSizes = true;
        }
    }

    public final void retry() {
        androidx.paging.PagingLogger pagingLogger = androidx.paging.PagingLogger.INSTANCE;
        if (pagingLogger.isLoggable(3)) {
            pagingLogger.log(3, "Retry signal received", null);
        }
        this.getHighSpeedVideoSizes.retry();
    }

    public final void refresh() {
        androidx.paging.PagingLogger pagingLogger = androidx.paging.PagingLogger.INSTANCE;
        if (pagingLogger.isLoggable(3)) {
            pagingLogger.log(3, "Refresh signal received", null);
        }
        this.getHighSpeedVideoSizes.refresh();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4HezSm9xz4sJdqQSPbJB4zJV7r0(androidx.paging.PagingDataPresenter pagingDataPresenter) {
        pagingDataPresenter.getOutputStallDurationlomOqCM.tryEmit(kotlin.Unit.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$setUiReceiver(androidx.paging.PagingDataPresenter pagingDataPresenter, androidx.paging.UiReceiver uiReceiver) {
        androidx.paging.UiReceiver uiReceiver2 = pagingDataPresenter.getHighSpeedVideoSizes;
        pagingDataPresenter.getHighSpeedVideoSizes = uiReceiver;
        if (uiReceiver2 instanceof androidx.paging.PagingDataPresenter.InitialUiReceiver) {
            androidx.paging.PagingDataPresenter.InitialUiReceiver initialUiReceiver = (androidx.paging.PagingDataPresenter.InitialUiReceiver) uiReceiver2;
            if (initialUiReceiver.getHighSpeedVideoFpsRangesFor) {
                uiReceiver.retry();
            }
            if (initialUiReceiver.getHighSpeedVideoSizes) {
                uiReceiver.refresh();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PagingDataPresenter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
