package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bB)\b\u0017\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\f¢\u0006\u0004\b\n\u0010\rB3\b\u0017\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\f\u0012\b\b\u0002\u0010\t\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u001e\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0012\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001c\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001dJ\u0013\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f¢\u0006\u0004\b \u0010!J\u001b\u0010$\u001a\u00020\u00112\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\"¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u00020\u00112\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\"¢\u0006\u0004\b&\u0010%J!\u0010)\u001a\u00020\u00112\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00110'¢\u0006\u0004\b)\u0010*J!\u0010+\u001a\u00020\u00112\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00110'¢\u0006\u0004\b+\u0010*J#\u0010,\u001a\u00020\u00112\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00110'H\u0000¢\u0006\u0004\b,\u0010*R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00102\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00105\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010-\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00104R \u00109\u001a\b\u0012\u0004\u0012\u000208078\u0001X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u0010=R \u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000@0?8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bA\u0010BR \u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000D8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0014\u00103\u001a\u00020I8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0011\u0010N\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\bL\u0010MR \u0010P\u001a\b\u0012\u0004\u0012\u00020(0O8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR \u0010T\u001a\b\u0012\u0004\u0012\u00020\u00110O8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010Q\u001a\u0004\bU\u0010SR(\u0010J\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u0011\u0018\u00010'0?8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bC\u0010BR&\u00100\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00110'0V8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u0010WR&\u0010X\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00110'8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u001b\u0010A\u001a\u00020\\8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b/\u0010]\u001a\u0004\b-\u0010^R\u0014\u0010a\u001a\u00020_8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u0010`"}, d2 = {"Landroidx/paging/AsyncPagingDataDiffer;", "", "T", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "diffCallback", "Landroidx/recyclerview/widget/ListUpdateCallback;", "updateCallback", "Lkotlin/coroutines/CoroutineContext;", "mainDispatcher", "workerDispatcher", "<init>", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Landroidx/recyclerview/widget/ListUpdateCallback;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Landroidx/recyclerview/widget/ListUpdateCallback;Lkotlinx/coroutines/CoroutineDispatcher;)V", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;Landroidx/recyclerview/widget/ListUpdateCallback;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Landroidx/paging/PagingData;", "pagingData", "", "submitData", "(Landroidx/paging/PagingData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/Lifecycle;", com.paypal.oslo.core.telemetry.AppLifecycleConstants.FEATURE, "(Landroidx/lifecycle/Lifecycle;Landroidx/paging/PagingData;)V", "retry", "()V", com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ACTION_REFRESH, "", "index", "getItem", "(I)Ljava/lang/Object;", "peek", "Landroidx/paging/ItemSnapshotList;", "snapshot", "()Landroidx/paging/ItemSnapshotList;", "Lkotlin/Function0;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addOnPagesUpdatedListener", "(Lkotlin/jvm/functions/Function0;)V", "removeOnPagesUpdatedListener", "Lkotlin/Function1;", "Landroidx/paging/CombinedLoadStates;", "addLoadStateListener", "(Lkotlin/jvm/functions/Function1;)V", "removeLoadStateListener", "addLoadStateListenerInternal$paging_runtime", "getHighSpeedVideoFpsRanges", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "getHighSpeedVideoSizes", "getHighSpeedVideoSizesFor", "Landroidx/recyclerview/widget/ListUpdateCallback;", "getHighResolutionOutputSizeshNQ4ISI", "getInputFormats", "Lkotlin/coroutines/CoroutineContext;", "Camera2StreamConfigurationMap", "getOutputStallDurationlomOqCM", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "inGetItem", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getInGetItem$paging_runtime", "()Lkotlinx/coroutines/flow/MutableStateFlow;", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/paging/PlaceholderPaddedList;", "getOutputFormats", "Ljava/util/concurrent/atomic/AtomicReference;", "getOutputMinFrameDuration", "Landroidx/paging/PagingDataPresenter;", "presenter", "Landroidx/paging/PagingDataPresenter;", "getPresenter$paging_runtime", "()Landroidx/paging/PagingDataPresenter;", "Ljava/util/concurrent/atomic/AtomicInteger;", "getInputSizeshNQ4ISI", "Ljava/util/concurrent/atomic/AtomicInteger;", "getItemCount", "()I", "itemCount", "Lkotlinx/coroutines/flow/Flow;", "loadStateFlow", "Lkotlinx/coroutines/flow/Flow;", "getLoadStateFlow", "()Lkotlinx/coroutines/flow/Flow;", "onPagesUpdatedFlow", "getOnPagesUpdatedFlow", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "internalLoadStateListener", "Lkotlin/jvm/functions/Function1;", "getInternalLoadStateListener$paging_runtime", "()Lkotlin/jvm/functions/Function1;", "Landroid/os/Handler;", "Lkotlin/Lazy;", "()Landroid/os/Handler;", "Landroidx/paging/AsyncPagingDataDiffer$LoadStateListenerRunnable$1;", "Landroidx/paging/AsyncPagingDataDiffer$LoadStateListenerRunnable$1;", "getOutputStallDuration"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AsyncPagingDataDiffer<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.concurrent.CopyOnWriteArrayList<kotlin.jvm.functions.Function1<androidx.paging.CombinedLoadStates, kotlin.Unit>> getHighSpeedVideoSizesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<T> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.paging.AsyncPagingDataDiffer$LoadStateListenerRunnable$1 getOutputStallDuration;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.Lazy getOutputFormats;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.recyclerview.widget.ListUpdateCallback getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final kotlin.coroutines.CoroutineContext Camera2StreamConfigurationMap;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicInteger getInputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicReference<androidx.paging.PlaceholderPaddedList<T>> getOutputMinFrameDuration;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicReference<kotlin.jvm.functions.Function1<androidx.paging.CombinedLoadStates, kotlin.Unit>> getInputSizeshNQ4ISI;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final kotlin.coroutines.CoroutineContext getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> inGetItem;
    private final kotlin.jvm.functions.Function1<androidx.paging.CombinedLoadStates, kotlin.Unit> internalLoadStateListener;
    private final kotlinx.coroutines.flow.Flow<androidx.paging.CombinedLoadStates> loadStateFlow;
    private final kotlinx.coroutines.flow.Flow<kotlin.Unit> onPagesUpdatedFlow;
    private final androidx.paging.PagingDataPresenter<T> presenter;

    public AsyncPagingDataDiffer(androidx.recyclerview.widget.DiffUtil.ItemCallback<T> itemCallback, androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback, final kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.CoroutineContext coroutineContext2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemCallback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listUpdateCallback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext2, "");
        this.getHighSpeedVideoSizes = itemCallback;
        this.getHighResolutionOutputSizeshNQ4ISI = listUpdateCallback;
        this.Camera2StreamConfigurationMap = coroutineContext;
        this.getHighSpeedVideoFpsRanges = coroutineContext2;
        this.inGetItem = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.getOutputMinFrameDuration = new java.util.concurrent.atomic.AtomicReference<>(null);
        androidx.paging.PagingDataPresenter<T> pagingDataPresenter = new androidx.paging.PagingDataPresenter<T>(this, coroutineContext) { // from class: androidx.paging.AsyncPagingDataDiffer$presenter$1
            final /* synthetic */ androidx.paging.AsyncPagingDataDiffer<T> getHighSpeedVideoSizes;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.getHighSpeedVideoSizes = this;
                androidx.paging.PagingData pagingData = null;
                int i = 2;
                java.lang.Object[] objArr = 0 == true ? 1 : 0;
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
            @Override // androidx.paging.PagingDataPresenter
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object presentPagingDataEvent(androidx.paging.PagingDataEvent<T> pagingDataEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                androidx.paging.AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1 asyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1;
                int i;
                androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback2;
                androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback3;
                androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback4;
                androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback5;
                androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback6;
                androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback7;
                androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback8;
                androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback9;
                androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback10;
                androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback11;
                androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback12;
                androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback13;
                androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback14;
                androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback15;
                androidx.paging.AsyncPagingDataDiffer<T> asyncPagingDataDiffer;
                java.util.concurrent.atomic.AtomicReference atomicReference;
                kotlin.coroutines.CoroutineContext coroutineContext3;
                androidx.paging.AsyncPagingDataDiffer<T> asyncPagingDataDiffer2;
                androidx.paging.PagingDataEvent.Refresh refresh;
                androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback16;
                androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback17;
                java.util.concurrent.atomic.AtomicReference atomicReference2;
                java.util.concurrent.atomic.AtomicReference atomicReference3;
                androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback18;
                int i2;
                if (continuation instanceof androidx.paging.AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1) {
                    asyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1 = (androidx.paging.AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1) continuation;
                    if ((asyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                        asyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1.getHighSpeedVideoSizes -= 2147483648;
                        java.lang.Object obj = asyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1.getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = asyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1.getHighSpeedVideoSizes;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            if (pagingDataEvent instanceof androidx.paging.PagingDataEvent.Refresh) {
                                asyncPagingDataDiffer = this.getHighSpeedVideoSizes;
                                androidx.paging.PagingDataEvent.Refresh refresh2 = (androidx.paging.PagingDataEvent.Refresh) pagingDataEvent;
                                if (refresh2.getPreviousList().getSize() == 0) {
                                    if (refresh2.getNewList().getSize() > 0) {
                                        listUpdateCallback17 = ((androidx.paging.AsyncPagingDataDiffer) asyncPagingDataDiffer).getHighResolutionOutputSizeshNQ4ISI;
                                        listUpdateCallback17.onInserted(0, refresh2.getNewList().getSize());
                                    }
                                } else if (refresh2.getNewList().getSize() != 0) {
                                    atomicReference = ((androidx.paging.AsyncPagingDataDiffer) asyncPagingDataDiffer).getOutputMinFrameDuration;
                                    atomicReference.set(refresh2.getPreviousList());
                                    try {
                                        coroutineContext3 = ((androidx.paging.AsyncPagingDataDiffer) asyncPagingDataDiffer).getHighSpeedVideoFpsRanges;
                                        androidx.paging.AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1 asyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1 = new androidx.paging.AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1(refresh2, asyncPagingDataDiffer, null);
                                        asyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1.Camera2StreamConfigurationMap = pagingDataEvent;
                                        asyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1.getHighSpeedVideoFpsRangesFor = asyncPagingDataDiffer;
                                        asyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1.getHighSpeedVideoFpsRanges = refresh2;
                                        asyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1.getHighSpeedVideoSizes = 1;
                                        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(coroutineContext3, asyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1, asyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1);
                                        if (withContext == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        asyncPagingDataDiffer2 = asyncPagingDataDiffer;
                                        obj = withContext;
                                        refresh = refresh2;
                                    } catch (java.lang.Throwable th) {
                                        th = th;
                                        atomicReference2 = ((androidx.paging.AsyncPagingDataDiffer) asyncPagingDataDiffer).getOutputMinFrameDuration;
                                        atomicReference2.set(null);
                                        throw th;
                                    }
                                } else if (refresh2.getPreviousList().getSize() > 0) {
                                    listUpdateCallback16 = ((androidx.paging.AsyncPagingDataDiffer) asyncPagingDataDiffer).getHighResolutionOutputSizeshNQ4ISI;
                                    listUpdateCallback16.onRemoved(0, refresh2.getPreviousList().getSize());
                                }
                            } else if (pagingDataEvent instanceof androidx.paging.PagingDataEvent.Prepend) {
                                androidx.paging.AsyncPagingDataDiffer<T> asyncPagingDataDiffer3 = this.getHighSpeedVideoSizes;
                                androidx.paging.PagingDataEvent.Prepend prepend = (androidx.paging.PagingDataEvent.Prepend) pagingDataEvent;
                                int size = prepend.getInserted().size();
                                int min = java.lang.Math.min(prepend.getOldPlaceholdersBefore(), size);
                                int oldPlaceholdersBefore = prepend.getOldPlaceholdersBefore();
                                int i3 = size - min;
                                if (min > 0) {
                                    listUpdateCallback15 = ((androidx.paging.AsyncPagingDataDiffer) asyncPagingDataDiffer3).getHighResolutionOutputSizeshNQ4ISI;
                                    listUpdateCallback15.onChanged(oldPlaceholdersBefore - min, min, null);
                                }
                                if (i3 > 0) {
                                    listUpdateCallback14 = ((androidx.paging.AsyncPagingDataDiffer) asyncPagingDataDiffer3).getHighResolutionOutputSizeshNQ4ISI;
                                    listUpdateCallback14.onInserted(0, i3);
                                }
                                int newPlaceholdersBefore = (prepend.getNewPlaceholdersBefore() - prepend.getOldPlaceholdersBefore()) + min;
                                if (newPlaceholdersBefore > 0) {
                                    listUpdateCallback13 = ((androidx.paging.AsyncPagingDataDiffer) asyncPagingDataDiffer3).getHighResolutionOutputSizeshNQ4ISI;
                                    listUpdateCallback13.onInserted(0, newPlaceholdersBefore);
                                } else if (newPlaceholdersBefore < 0) {
                                    listUpdateCallback12 = ((androidx.paging.AsyncPagingDataDiffer) asyncPagingDataDiffer3).getHighResolutionOutputSizeshNQ4ISI;
                                    listUpdateCallback12.onRemoved(0, -newPlaceholdersBefore);
                                }
                            } else if (pagingDataEvent instanceof androidx.paging.PagingDataEvent.Append) {
                                androidx.paging.AsyncPagingDataDiffer<T> asyncPagingDataDiffer4 = this.getHighSpeedVideoSizes;
                                androidx.paging.PagingDataEvent.Append append = (androidx.paging.PagingDataEvent.Append) pagingDataEvent;
                                int size2 = append.getInserted().size();
                                int min2 = java.lang.Math.min(append.getOldPlaceholdersAfter(), size2);
                                int startIndex = append.getStartIndex();
                                int i4 = size2 - min2;
                                if (min2 > 0) {
                                    listUpdateCallback11 = ((androidx.paging.AsyncPagingDataDiffer) asyncPagingDataDiffer4).getHighResolutionOutputSizeshNQ4ISI;
                                    listUpdateCallback11.onChanged(startIndex, min2, null);
                                }
                                if (i4 > 0) {
                                    listUpdateCallback10 = ((androidx.paging.AsyncPagingDataDiffer) asyncPagingDataDiffer4).getHighResolutionOutputSizeshNQ4ISI;
                                    listUpdateCallback10.onInserted(startIndex + min2, i4);
                                }
                                int newPlaceholdersAfter = (append.getNewPlaceholdersAfter() - append.getOldPlaceholdersAfter()) + min2;
                                int startIndex2 = append.getStartIndex() + size2 + append.getNewPlaceholdersAfter();
                                if (newPlaceholdersAfter > 0) {
                                    listUpdateCallback9 = ((androidx.paging.AsyncPagingDataDiffer) asyncPagingDataDiffer4).getHighResolutionOutputSizeshNQ4ISI;
                                    listUpdateCallback9.onInserted(startIndex2 - newPlaceholdersAfter, newPlaceholdersAfter);
                                } else if (newPlaceholdersAfter < 0) {
                                    listUpdateCallback8 = ((androidx.paging.AsyncPagingDataDiffer) asyncPagingDataDiffer4).getHighResolutionOutputSizeshNQ4ISI;
                                    listUpdateCallback8.onRemoved(startIndex2, -newPlaceholdersAfter);
                                }
                            } else if (pagingDataEvent instanceof androidx.paging.PagingDataEvent.DropPrepend) {
                                androidx.paging.AsyncPagingDataDiffer<T> asyncPagingDataDiffer5 = this.getHighSpeedVideoSizes;
                                androidx.paging.PagingDataEvent.DropPrepend dropPrepend = (androidx.paging.PagingDataEvent.DropPrepend) pagingDataEvent;
                                int newPlaceholdersBefore2 = (dropPrepend.getNewPlaceholdersBefore() - dropPrepend.getDropCount()) - dropPrepend.getOldPlaceholdersBefore();
                                if (newPlaceholdersBefore2 > 0) {
                                    listUpdateCallback7 = ((androidx.paging.AsyncPagingDataDiffer) asyncPagingDataDiffer5).getHighResolutionOutputSizeshNQ4ISI;
                                    listUpdateCallback7.onInserted(0, newPlaceholdersBefore2);
                                } else if (newPlaceholdersBefore2 < 0) {
                                    listUpdateCallback5 = ((androidx.paging.AsyncPagingDataDiffer) asyncPagingDataDiffer5).getHighResolutionOutputSizeshNQ4ISI;
                                    listUpdateCallback5.onRemoved(0, -newPlaceholdersBefore2);
                                }
                                int max = java.lang.Math.max(0, dropPrepend.getOldPlaceholdersBefore() + newPlaceholdersBefore2);
                                int newPlaceholdersBefore3 = dropPrepend.getNewPlaceholdersBefore() - max;
                                if (newPlaceholdersBefore3 > 0) {
                                    listUpdateCallback6 = ((androidx.paging.AsyncPagingDataDiffer) asyncPagingDataDiffer5).getHighResolutionOutputSizeshNQ4ISI;
                                    listUpdateCallback6.onChanged(max, newPlaceholdersBefore3, null);
                                }
                            } else {
                                if (!(pagingDataEvent instanceof androidx.paging.PagingDataEvent.DropAppend)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                androidx.paging.AsyncPagingDataDiffer<T> asyncPagingDataDiffer6 = this.getHighSpeedVideoSizes;
                                androidx.paging.PagingDataEvent.DropAppend dropAppend = (androidx.paging.PagingDataEvent.DropAppend) pagingDataEvent;
                                int newPlaceholdersAfter2 = (dropAppend.getNewPlaceholdersAfter() - dropAppend.getDropCount()) - dropAppend.getOldPlaceholdersAfter();
                                int startIndex3 = dropAppend.getStartIndex() + dropAppend.getNewPlaceholdersAfter();
                                if (newPlaceholdersAfter2 > 0) {
                                    listUpdateCallback4 = ((androidx.paging.AsyncPagingDataDiffer) asyncPagingDataDiffer6).getHighResolutionOutputSizeshNQ4ISI;
                                    listUpdateCallback4.onInserted(startIndex3 - newPlaceholdersAfter2, newPlaceholdersAfter2);
                                } else if (newPlaceholdersAfter2 < 0) {
                                    listUpdateCallback2 = ((androidx.paging.AsyncPagingDataDiffer) asyncPagingDataDiffer6).getHighResolutionOutputSizeshNQ4ISI;
                                    listUpdateCallback2.onRemoved(startIndex3, -newPlaceholdersAfter2);
                                }
                                int newPlaceholdersAfter3 = (dropAppend.getNewPlaceholdersAfter() - dropAppend.getOldPlaceholdersAfter()) + (newPlaceholdersAfter2 < 0 ? java.lang.Math.min(dropAppend.getOldPlaceholdersAfter(), -newPlaceholdersAfter2) : 0);
                                if (newPlaceholdersAfter3 > 0) {
                                    listUpdateCallback3 = ((androidx.paging.AsyncPagingDataDiffer) asyncPagingDataDiffer6).getHighResolutionOutputSizeshNQ4ISI;
                                    listUpdateCallback3.onChanged(dropAppend.getStartIndex(), newPlaceholdersAfter3, null);
                                }
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        refresh = (androidx.paging.PagingDataEvent.Refresh) asyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1.getHighSpeedVideoFpsRanges;
                        asyncPagingDataDiffer2 = (androidx.paging.AsyncPagingDataDiffer) asyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1.getHighSpeedVideoFpsRangesFor;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            asyncPagingDataDiffer = asyncPagingDataDiffer2;
                            atomicReference2 = ((androidx.paging.AsyncPagingDataDiffer) asyncPagingDataDiffer).getOutputMinFrameDuration;
                            atomicReference2.set(null);
                            throw th;
                        }
                        androidx.paging.PlaceholderPaddedDiffResult placeholderPaddedDiffResult = (androidx.paging.PlaceholderPaddedDiffResult) obj;
                        atomicReference3 = ((androidx.paging.AsyncPagingDataDiffer) asyncPagingDataDiffer2).getOutputMinFrameDuration;
                        atomicReference3.set(null);
                        androidx.paging.PlaceholderPaddedList<T> previousList = refresh.getPreviousList();
                        listUpdateCallback18 = ((androidx.paging.AsyncPagingDataDiffer) asyncPagingDataDiffer2).getHighResolutionOutputSizeshNQ4ISI;
                        androidx.paging.PlaceholderPaddedListDiffHelperKt.dispatchDiff(previousList, listUpdateCallback18, refresh.getNewList(), placeholderPaddedDiffResult);
                        androidx.paging.PlaceholderPaddedList<T> previousList2 = refresh.getPreviousList();
                        androidx.paging.PlaceholderPaddedList<T> newList = refresh.getNewList();
                        i2 = ((androidx.paging.AsyncPagingDataDiffer) asyncPagingDataDiffer2).getHighSpeedVideoFpsRangesFor;
                        int transformAnchorIndex = androidx.paging.PlaceholderPaddedListDiffHelperKt.transformAnchorIndex(previousList2, placeholderPaddedDiffResult, newList, i2);
                        ((androidx.paging.AsyncPagingDataDiffer) asyncPagingDataDiffer2).getHighSpeedVideoFpsRangesFor = transformAnchorIndex;
                        get(transformAnchorIndex);
                        return kotlin.Unit.INSTANCE;
                    }
                }
                asyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1 = new androidx.paging.AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1(this, continuation);
                java.lang.Object obj2 = asyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = asyncPagingDataDiffer$presenter$1$presentPagingDataEvent$1.getHighSpeedVideoSizes;
                if (i != 0) {
                }
                androidx.paging.PlaceholderPaddedDiffResult placeholderPaddedDiffResult2 = (androidx.paging.PlaceholderPaddedDiffResult) obj2;
                atomicReference3 = ((androidx.paging.AsyncPagingDataDiffer) asyncPagingDataDiffer2).getOutputMinFrameDuration;
                atomicReference3.set(null);
                androidx.paging.PlaceholderPaddedList<T> previousList3 = refresh.getPreviousList();
                listUpdateCallback18 = ((androidx.paging.AsyncPagingDataDiffer) asyncPagingDataDiffer2).getHighResolutionOutputSizeshNQ4ISI;
                androidx.paging.PlaceholderPaddedListDiffHelperKt.dispatchDiff(previousList3, listUpdateCallback18, refresh.getNewList(), placeholderPaddedDiffResult2);
                androidx.paging.PlaceholderPaddedList<T> previousList22 = refresh.getPreviousList();
                androidx.paging.PlaceholderPaddedList<T> newList2 = refresh.getNewList();
                i2 = ((androidx.paging.AsyncPagingDataDiffer) asyncPagingDataDiffer2).getHighSpeedVideoFpsRangesFor;
                int transformAnchorIndex2 = androidx.paging.PlaceholderPaddedListDiffHelperKt.transformAnchorIndex(previousList22, placeholderPaddedDiffResult2, newList2, i2);
                ((androidx.paging.AsyncPagingDataDiffer) asyncPagingDataDiffer2).getHighSpeedVideoFpsRangesFor = transformAnchorIndex2;
                get(transformAnchorIndex2);
                return kotlin.Unit.INSTANCE;
            }
        };
        this.presenter = pagingDataPresenter;
        this.getInputFormats = new java.util.concurrent.atomic.AtomicInteger(0);
        this.loadStateFlow = kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.flow(new androidx.paging.AsyncPagingDataDiffer$special$$inlined$transform$1(kotlinx.coroutines.flow.FlowKt__ContextKt.buffer$default(kotlinx.coroutines.flow.FlowKt.filterNotNull(pagingDataPresenter.getLoadStateFlow()), -1, null, 2, null), null, this)), kotlinx.coroutines.Dispatchers.getMain());
        this.onPagesUpdatedFlow = pagingDataPresenter.getOnPagesUpdatedFlow();
        this.getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicReference<>(null);
        this.getHighSpeedVideoSizesFor = new java.util.concurrent.CopyOnWriteArrayList<>();
        this.internalLoadStateListener = new kotlin.jvm.functions.Function1() { // from class: androidx.paging.AsyncPagingDataDiffer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.paging.AsyncPagingDataDiffer.$r8$lambda$oOrKr1bfhPUfNeOPohOPPWu7Mg4(androidx.paging.AsyncPagingDataDiffer.this, (androidx.paging.CombinedLoadStates) obj);
            }
        };
        this.getOutputFormats = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.paging.AsyncPagingDataDiffer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.paging.AsyncPagingDataDiffer.$r8$lambda$XYpPRYiCYYS0Auq37q_A6cTzjGc();
            }
        });
        this.getOutputStallDuration = new androidx.paging.AsyncPagingDataDiffer$LoadStateListenerRunnable$1(this);
    }

    public /* synthetic */ AsyncPagingDataDiffer(androidx.recyclerview.widget.DiffUtil.ItemCallback itemCallback, androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback, kotlinx.coroutines.MainCoroutineDispatcher mainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(itemCallback, listUpdateCallback, (i & 4) != 0 ? kotlinx.coroutines.Dispatchers.getMain() : mainCoroutineDispatcher, (i & 8) != 0 ? kotlinx.coroutines.Dispatchers.getDefault() : coroutineDispatcher);
    }

    public /* synthetic */ AsyncPagingDataDiffer(androidx.recyclerview.widget.DiffUtil.ItemCallback itemCallback, androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback, kotlinx.coroutines.MainCoroutineDispatcher mainCoroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(itemCallback, listUpdateCallback, (i & 4) != 0 ? kotlinx.coroutines.Dispatchers.getMain() : mainCoroutineDispatcher);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Superseded by constructors which accept CoroutineContext")
    public /* synthetic */ AsyncPagingDataDiffer(androidx.recyclerview.widget.DiffUtil.ItemCallback itemCallback, androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        this(itemCallback, listUpdateCallback, (kotlin.coroutines.CoroutineContext) coroutineDispatcher, (kotlin.coroutines.CoroutineContext) kotlinx.coroutines.Dispatchers.getDefault());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemCallback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listUpdateCallback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
    }

    public /* synthetic */ AsyncPagingDataDiffer(androidx.recyclerview.widget.DiffUtil.ItemCallback itemCallback, androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback, kotlinx.coroutines.MainCoroutineDispatcher mainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(itemCallback, listUpdateCallback, (i & 4) != 0 ? kotlinx.coroutines.Dispatchers.getMain() : mainCoroutineDispatcher, (i & 8) != 0 ? kotlinx.coroutines.Dispatchers.getDefault() : coroutineDispatcher);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Superseded by constructors which accept CoroutineContext")
    public /* synthetic */ AsyncPagingDataDiffer(androidx.recyclerview.widget.DiffUtil.ItemCallback itemCallback, androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher2) {
        this(itemCallback, listUpdateCallback, (kotlin.coroutines.CoroutineContext) coroutineDispatcher, (kotlin.coroutines.CoroutineContext) coroutineDispatcher2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemCallback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listUpdateCallback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher2, "");
    }

    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getInGetItem$paging_runtime() {
        return this.inGetItem;
    }

    public final androidx.paging.PagingDataPresenter<T> getPresenter$paging_runtime() {
        return this.presenter;
    }

    public final java.lang.Object submitData(androidx.paging.PagingData<T> pagingData, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        this.getInputFormats.incrementAndGet();
        java.lang.Object collectFrom = this.presenter.collectFrom(pagingData, continuation);
        return collectFrom == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collectFrom : kotlin.Unit.INSTANCE;
    }

    public final void submitData(androidx.view.Lifecycle lifecycle, androidx.paging.PagingData<T> pagingData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pagingData, "");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.LifecycleKt.getCoroutineScope(lifecycle), null, null, new androidx.paging.AsyncPagingDataDiffer$submitData$2(this, this.getInputFormats.incrementAndGet(), pagingData, null), 3, null);
    }

    public final void retry() {
        this.presenter.retry();
    }

    public final void refresh() {
        this.presenter.refresh();
    }

    public final T getItem(int index) {
        java.lang.Boolean value;
        T t;
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        try {
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> mutableStateFlow = this.inGetItem;
            do {
                value = mutableStateFlow.getValue();
                java.lang.Boolean bool = value;
            } while (!mutableStateFlow.compareAndSet(value, java.lang.Boolean.TRUE));
            this.getHighSpeedVideoFpsRangesFor = index;
            androidx.paging.PlaceholderPaddedList<T> placeholderPaddedList = this.getOutputMinFrameDuration.get();
            if (placeholderPaddedList != null) {
                highResolutionOutputSizeshNQ4ISI = androidx.paging.AsyncPagingDataDifferKt.getHighResolutionOutputSizeshNQ4ISI(placeholderPaddedList, index);
                t = (T) highResolutionOutputSizeshNQ4ISI;
            } else {
                t = this.presenter.get(index);
            }
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> mutableStateFlow2 = this.inGetItem;
            while (!mutableStateFlow2.compareAndSet(mutableStateFlow2.getValue(), java.lang.Boolean.FALSE)) {
            }
            return t;
        } catch (java.lang.Throwable th) {
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> mutableStateFlow3 = this.inGetItem;
            while (!mutableStateFlow3.compareAndSet(mutableStateFlow3.getValue(), java.lang.Boolean.FALSE)) {
            }
            throw th;
        }
    }

    public final T peek(int index) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        androidx.paging.PlaceholderPaddedList<T> placeholderPaddedList = this.getOutputMinFrameDuration.get();
        if (placeholderPaddedList == null) {
            return this.presenter.peek(index);
        }
        highResolutionOutputSizeshNQ4ISI = androidx.paging.AsyncPagingDataDifferKt.getHighResolutionOutputSizeshNQ4ISI(placeholderPaddedList, index);
        return (T) highResolutionOutputSizeshNQ4ISI;
    }

    public final androidx.paging.ItemSnapshotList<T> snapshot() {
        androidx.paging.ItemSnapshotList<T> access$snapshot;
        androidx.paging.PlaceholderPaddedList<T> placeholderPaddedList = this.getOutputMinFrameDuration.get();
        return (placeholderPaddedList == null || (access$snapshot = androidx.paging.AsyncPagingDataDifferKt.access$snapshot(placeholderPaddedList)) == null) ? this.presenter.snapshot() : access$snapshot;
    }

    public final int getItemCount() {
        androidx.paging.PlaceholderPaddedList<T> placeholderPaddedList = this.getOutputMinFrameDuration.get();
        return placeholderPaddedList != null ? placeholderPaddedList.getSize() : this.presenter.getSize();
    }

    public final kotlinx.coroutines.flow.Flow<androidx.paging.CombinedLoadStates> getLoadStateFlow() {
        return this.loadStateFlow;
    }

    public final kotlinx.coroutines.flow.Flow<kotlin.Unit> getOnPagesUpdatedFlow() {
        return this.onPagesUpdatedFlow;
    }

    public final void addOnPagesUpdatedListener(kotlin.jvm.functions.Function0<kotlin.Unit> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        this.presenter.addOnPagesUpdatedListener(listener);
    }

    public final void removeOnPagesUpdatedListener(kotlin.jvm.functions.Function0<kotlin.Unit> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        this.presenter.removeOnPagesUpdatedListener(listener);
    }

    public final void addLoadStateListener(kotlin.jvm.functions.Function1<? super androidx.paging.CombinedLoadStates, kotlin.Unit> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        if (this.getInputSizeshNQ4ISI.get() == null) {
            addLoadStateListenerInternal$paging_runtime(this.internalLoadStateListener);
        }
        this.getHighSpeedVideoSizesFor.add(listener);
    }

    public final void removeLoadStateListener(kotlin.jvm.functions.Function1<? super androidx.paging.CombinedLoadStates, kotlin.Unit> listener) {
        kotlin.jvm.functions.Function1<androidx.paging.CombinedLoadStates, kotlin.Unit> function1;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        this.getHighSpeedVideoSizesFor.remove(listener);
        if (!this.getHighSpeedVideoSizesFor.isEmpty() || (function1 = this.getInputSizeshNQ4ISI.get()) == null) {
            return;
        }
        this.presenter.removeLoadStateListener(function1);
    }

    public final void addLoadStateListenerInternal$paging_runtime(kotlin.jvm.functions.Function1<? super androidx.paging.CombinedLoadStates, kotlin.Unit> listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        this.getInputSizeshNQ4ISI.set(listener);
        this.presenter.addLoadStateListener(listener);
    }

    public final kotlin.jvm.functions.Function1<androidx.paging.CombinedLoadStates, kotlin.Unit> getInternalLoadStateListener$paging_runtime() {
        return this.internalLoadStateListener;
    }

    private final android.os.Handler getHighSpeedVideoFpsRanges() {
        return (android.os.Handler) this.getOutputFormats.getValue();
    }

    public static /* synthetic */ android.os.Handler $r8$lambda$XYpPRYiCYYS0Auq37q_A6cTzjGc() {
        return new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$oOrKr1bfhPUfNeOPohOPPWu7Mg4(androidx.paging.AsyncPagingDataDiffer asyncPagingDataDiffer, androidx.paging.CombinedLoadStates combinedLoadStates) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(combinedLoadStates, "");
        if (asyncPagingDataDiffer.inGetItem.getValue().booleanValue()) {
            android.os.Handler highSpeedVideoFpsRanges = asyncPagingDataDiffer.getHighSpeedVideoFpsRanges();
            highSpeedVideoFpsRanges.removeCallbacks(asyncPagingDataDiffer.getOutputStallDuration);
            asyncPagingDataDiffer.getOutputStallDuration.getLoadState().set(combinedLoadStates);
            highSpeedVideoFpsRanges.post(asyncPagingDataDiffer.getOutputStallDuration);
        } else {
            java.util.Iterator<T> it = asyncPagingDataDiffer.getHighSpeedVideoSizesFor.iterator();
            while (it.hasNext()) {
                ((kotlin.jvm.functions.Function1) it.next()).invoke(combinedLoadStates);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AsyncPagingDataDiffer(androidx.recyclerview.widget.DiffUtil.ItemCallback<T> itemCallback, androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback, kotlin.coroutines.CoroutineContext coroutineContext) {
        this(itemCallback, listUpdateCallback, coroutineContext, (kotlin.coroutines.CoroutineContext) null, 8, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemCallback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listUpdateCallback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AsyncPagingDataDiffer(androidx.recyclerview.widget.DiffUtil.ItemCallback<T> itemCallback, androidx.recyclerview.widget.ListUpdateCallback listUpdateCallback) {
        this(itemCallback, listUpdateCallback, (kotlin.coroutines.CoroutineContext) null, (kotlin.coroutines.CoroutineContext) null, 12, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemCallback, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listUpdateCallback, "");
    }
}
