package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$3", f = "PageFetcherSnapshot.kt", i = {0, 0}, l = {647, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE}, m = "invokeSuspend", n = {"this_$iv", "$this$withLock_u24default$iv$iv"}, s = {"L$0", "L$1"}, v = 1)
/* loaded from: classes7.dex */
final class PageFetcherSnapshot$startConsumingHints$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.paging.PageFetcherSnapshot<Key, Value> getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (androidx.paging.PageFetcherSnapshot.access$collectAsGenerationalViewportHints(r1, r8, androidx.paging.LoadType.APPEND, r7) == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.paging.PageFetcherSnapshot pageFetcherSnapshot;
        androidx.paging.PageFetcherSnapshotState.Holder holder;
        kotlinx.coroutines.sync.Mutex mutex;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                pageFetcherSnapshot = this.getHighSpeedVideoSizes;
                holder = pageFetcherSnapshot.getInputFormats;
                kotlinx.coroutines.sync.Mutex mutex2 = holder.getHighSpeedVideoFpsRangesFor;
                this.getHighResolutionOutputSizeshNQ4ISI = holder;
                this.getHighSpeedVideoFpsRanges = mutex2;
                this.Camera2StreamConfigurationMap = pageFetcherSnapshot;
                this.getHighSpeedVideoFpsRangesFor = 1;
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
            pageFetcherSnapshot = (androidx.paging.PageFetcherSnapshot) this.Camera2StreamConfigurationMap;
            mutex = (kotlinx.coroutines.sync.Mutex) this.getHighSpeedVideoFpsRanges;
            holder = (androidx.paging.PageFetcherSnapshotState.Holder) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow<java.lang.Integer> consumeAppendGenerationIdAsFlow = holder.getHighSpeedVideoFpsRanges.consumeAppendGenerationIdAsFlow();
            mutex.unlock(null);
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getHighSpeedVideoFpsRanges = null;
            this.Camera2StreamConfigurationMap = null;
            this.getHighSpeedVideoFpsRangesFor = 2;
        } catch (java.lang.Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.paging.PageFetcherSnapshot$startConsumingHints$3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.paging.PageFetcherSnapshot$startConsumingHints$3(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshot$startConsumingHints$3(androidx.paging.PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, kotlin.coroutines.Continuation<? super androidx.paging.PageFetcherSnapshot$startConsumingHints$3> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = pageFetcherSnapshot;
    }
}
