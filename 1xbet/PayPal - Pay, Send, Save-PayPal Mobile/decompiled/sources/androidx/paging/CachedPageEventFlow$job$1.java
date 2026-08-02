package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.CachedPageEventFlow$job$1", f = "CachedPageEventFlow.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class CachedPageEventFlow$job$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow<androidx.paging.PageEvent<T>> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.paging.CachedPageEventFlow<T> getHighSpeedVideoSizes;

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.paging.CachedPageEventFlow$job$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ androidx.paging.CachedPageEventFlow<T> getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
        
            if (r7.getHighSpeedVideoFpsRanges(r6, r0) != r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        
            if (r7.emit(r6, r0) != r1) goto L18;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(kotlin.collections.IndexedValue<? extends androidx.paging.PageEvent<T>> indexedValue, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            androidx.paging.CachedPageEventFlow$job$1$1$emit$1 cachedPageEventFlow$job$1$1$emit$1;
            int i;
            kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
            androidx.paging.FlattenedPageController flattenedPageController;
            if (continuation instanceof androidx.paging.CachedPageEventFlow$job$1$1$emit$1) {
                cachedPageEventFlow$job$1$1$emit$1 = (androidx.paging.CachedPageEventFlow$job$1$1$emit$1) continuation;
                if ((cachedPageEventFlow$job$1$1$emit$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    cachedPageEventFlow$job$1$1$emit$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj = cachedPageEventFlow$job$1$1$emit$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = cachedPageEventFlow$job$1$1$emit$1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutableSharedFlow = ((androidx.paging.CachedPageEventFlow) this.getHighSpeedVideoFpsRangesFor).getHighSpeedVideoFpsRangesFor;
                        cachedPageEventFlow$job$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = indexedValue;
                        cachedPageEventFlow$job$1$1$emit$1.Camera2StreamConfigurationMap = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        indexedValue = (kotlin.collections.IndexedValue) cachedPageEventFlow$job$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    flattenedPageController = ((androidx.paging.CachedPageEventFlow) this.getHighSpeedVideoFpsRangesFor).getHighSpeedVideoSizes;
                    cachedPageEventFlow$job$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = null;
                    cachedPageEventFlow$job$1$1$emit$1.Camera2StreamConfigurationMap = 2;
                }
            }
            cachedPageEventFlow$job$1$1$emit$1 = new androidx.paging.CachedPageEventFlow$job$1$1$emit$1(this, continuation);
            java.lang.Object obj2 = cachedPageEventFlow$job$1$1$emit$1.getHighSpeedVideoFpsRanges;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = cachedPageEventFlow$job$1$1$emit$1.Camera2StreamConfigurationMap;
            if (i != 0) {
            }
            flattenedPageController = ((androidx.paging.CachedPageEventFlow) this.getHighSpeedVideoFpsRangesFor).getHighSpeedVideoSizes;
            cachedPageEventFlow$job$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = null;
            cachedPageEventFlow$job$1$1$emit$1.Camera2StreamConfigurationMap = 2;
        }

        AnonymousClass1(androidx.paging.CachedPageEventFlow<T> cachedPageEventFlow) {
            this.getHighSpeedVideoFpsRangesFor = cachedPageEventFlow;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (kotlinx.coroutines.flow.FlowKt.withIndex(this.getHighResolutionOutputSizeshNQ4ISI).collect(new androidx.paging.CachedPageEventFlow$job$1.AnonymousClass1(this.getHighSpeedVideoSizes), this) == coroutine_suspended) {
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
        return ((androidx.paging.CachedPageEventFlow$job$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.paging.CachedPageEventFlow$job$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CachedPageEventFlow$job$1(kotlinx.coroutines.flow.Flow<? extends androidx.paging.PageEvent<T>> flow, androidx.paging.CachedPageEventFlow<T> cachedPageEventFlow, kotlin.coroutines.Continuation<? super androidx.paging.CachedPageEventFlow$job$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = flow;
        this.getHighSpeedVideoSizes = cachedPageEventFlow;
    }
}
