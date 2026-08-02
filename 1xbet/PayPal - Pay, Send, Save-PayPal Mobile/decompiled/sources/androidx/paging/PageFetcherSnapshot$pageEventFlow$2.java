package androidx.paging;

/* JADX INFO: Add missing generic type declarations: [Value] */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "Value", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Landroidx/paging/PageEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$2", f = "PageFetcherSnapshot.kt", i = {0, 0}, l = {647, 193}, m = "invokeSuspend", n = {"this_$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1"}, v = 1)
/* loaded from: classes7.dex */
final class PageFetcherSnapshot$pageEventFlow$2<Value> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super androidx.paging.PageEvent<Value>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.paging.PageFetcherSnapshot<Key, Value> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0072, code lost:
    
        if (r1.emit(new androidx.paging.PageEvent.LoadStateUpdate(r8, null, 2, null), r7) == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        androidx.paging.PageFetcherSnapshotState.Holder holder;
        kotlinx.coroutines.sync.Mutex mutex;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoSizes;
                holder = ((androidx.paging.PageFetcherSnapshot) this.getHighResolutionOutputSizeshNQ4ISI).getInputFormats;
                kotlinx.coroutines.sync.Mutex mutex2 = holder.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoSizes = holder;
                this.getHighSpeedVideoFpsRangesFor = mutex2;
                this.Camera2StreamConfigurationMap = flowCollector;
                this.getHighSpeedVideoFpsRanges = 1;
                if (mutex2.lock(null, this) != coroutine_suspended) {
                    mutex = mutex2;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.Camera2StreamConfigurationMap;
            mutex = (kotlinx.coroutines.sync.Mutex) this.getHighSpeedVideoFpsRangesFor;
            holder = (androidx.paging.PageFetcherSnapshotState.Holder) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.paging.LoadStates snapshot = holder.getHighSpeedVideoFpsRanges.getSourceLoadStates().snapshot();
            mutex.unlock(null);
            this.getHighSpeedVideoSizes = null;
            this.getHighSpeedVideoFpsRangesFor = null;
            this.Camera2StreamConfigurationMap = null;
            this.getHighSpeedVideoFpsRanges = 2;
        } catch (java.lang.Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.paging.PageFetcherSnapshot$pageEventFlow$2) create((kotlinx.coroutines.flow.FlowCollector) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.paging.PageFetcherSnapshot$pageEventFlow$2 pageFetcherSnapshot$pageEventFlow$2 = new androidx.paging.PageFetcherSnapshot$pageEventFlow$2(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        pageFetcherSnapshot$pageEventFlow$2.getHighSpeedVideoSizes = obj;
        return pageFetcherSnapshot$pageEventFlow$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshot$pageEventFlow$2(androidx.paging.PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, kotlin.coroutines.Continuation<? super androidx.paging.PageFetcherSnapshot$pageEventFlow$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = pageFetcherSnapshot;
    }
}
