package androidx.paging;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "T", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Landroidx/paging/PageEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1", f = "CachedPageEventFlow.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class CachedPageEventFlow$downstreamFlow$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super androidx.paging.PageEvent<T>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.paging.CachedPageEventFlow<T> getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.SharedFlow sharedFlow;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoSizes;
            kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
            intRef.element = Integer.MIN_VALUE;
            sharedFlow = ((androidx.paging.CachedPageEventFlow) this.getHighSpeedVideoFpsRangesFor).Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (kotlinx.coroutines.flow.FlowKt.takeWhile(sharedFlow, new androidx.paging.CachedPageEventFlow$downstreamFlow$1.AnonymousClass1(null)).collect(new androidx.paging.CachedPageEventFlow$downstreamFlow$1.AnonymousClass2(intRef, flowCollector), this) == coroutine_suspended) {
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

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0006\u0018\u00010\u0005H\n"}, d2 = {"<anonymous>", "", "T", "", "it", "Lkotlin/collections/IndexedValue;", "Landroidx/paging/PageEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$1", f = "CachedPageEventFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.paging.CachedPageEventFlow$downstreamFlow$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.collections.IndexedValue<? extends androidx.paging.PageEvent<T>>, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
        int getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRanges != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((kotlin.collections.IndexedValue) this.Camera2StreamConfigurationMap) != null);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            return ((androidx.paging.CachedPageEventFlow$downstreamFlow$1.AnonymousClass1) create((kotlin.collections.IndexedValue) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.paging.CachedPageEventFlow$downstreamFlow$1.AnonymousClass1 anonymousClass1 = new androidx.paging.CachedPageEventFlow$downstreamFlow$1.AnonymousClass1(continuation);
            anonymousClass1.Camera2StreamConfigurationMap = obj;
            return anonymousClass1;
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super androidx.paging.CachedPageEventFlow$downstreamFlow$1.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.paging.CachedPageEventFlow$downstreamFlow$1$2, reason: invalid class name */
    static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ kotlin.jvm.internal.Ref.IntRef getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<androidx.paging.PageEvent<T>> getHighSpeedVideoSizes;

        /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(kotlin.collections.IndexedValue<? extends androidx.paging.PageEvent<T>> indexedValue, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            androidx.paging.CachedPageEventFlow$downstreamFlow$1$2$emit$1 cachedPageEventFlow$downstreamFlow$1$2$emit$1;
            int i;
            if (continuation instanceof androidx.paging.CachedPageEventFlow$downstreamFlow$1$2$emit$1) {
                cachedPageEventFlow$downstreamFlow$1$2$emit$1 = (androidx.paging.CachedPageEventFlow$downstreamFlow$1$2$emit$1) continuation;
                if ((cachedPageEventFlow$downstreamFlow$1$2$emit$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    cachedPageEventFlow$downstreamFlow$1$2$emit$1.getHighSpeedVideoSizes -= 2147483648;
                    java.lang.Object obj = cachedPageEventFlow$downstreamFlow$1$2$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = cachedPageEventFlow$downstreamFlow$1$2$emit$1.getHighSpeedVideoSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(indexedValue);
                        if (indexedValue.getIndex() > this.getHighSpeedVideoFpsRanges.element) {
                            kotlinx.coroutines.flow.FlowCollector<androidx.paging.PageEvent<T>> flowCollector = this.getHighSpeedVideoSizes;
                            androidx.paging.PageEvent<T> value = indexedValue.getValue();
                            cachedPageEventFlow$downstreamFlow$1$2$emit$1.Camera2StreamConfigurationMap = indexedValue;
                            cachedPageEventFlow$downstreamFlow$1$2$emit$1.getHighSpeedVideoSizes = 1;
                            if (flowCollector.emit(value, cachedPageEventFlow$downstreamFlow$1$2$emit$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    indexedValue = (kotlin.collections.IndexedValue) cachedPageEventFlow$downstreamFlow$1$2$emit$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getHighSpeedVideoFpsRanges.element = indexedValue.getIndex();
                    return kotlin.Unit.INSTANCE;
                }
            }
            cachedPageEventFlow$downstreamFlow$1$2$emit$1 = new androidx.paging.CachedPageEventFlow$downstreamFlow$1$2$emit$1(this, continuation);
            java.lang.Object obj2 = cachedPageEventFlow$downstreamFlow$1$2$emit$1.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = cachedPageEventFlow$downstreamFlow$1$2$emit$1.getHighSpeedVideoSizes;
            if (i != 0) {
            }
            this.getHighSpeedVideoFpsRanges.element = indexedValue.getIndex();
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(kotlin.jvm.internal.Ref.IntRef intRef, kotlinx.coroutines.flow.FlowCollector<? super androidx.paging.PageEvent<T>> flowCollector) {
            this.getHighSpeedVideoFpsRanges = intRef;
            this.getHighSpeedVideoSizes = flowCollector;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.paging.CachedPageEventFlow$downstreamFlow$1) create((kotlinx.coroutines.flow.FlowCollector) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.paging.CachedPageEventFlow$downstreamFlow$1 cachedPageEventFlow$downstreamFlow$1 = new androidx.paging.CachedPageEventFlow$downstreamFlow$1(this.getHighSpeedVideoFpsRangesFor, continuation);
        cachedPageEventFlow$downstreamFlow$1.getHighSpeedVideoSizes = obj;
        return cachedPageEventFlow$downstreamFlow$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CachedPageEventFlow$downstreamFlow$1(androidx.paging.CachedPageEventFlow<T> cachedPageEventFlow, kotlin.coroutines.Continuation<? super androidx.paging.CachedPageEventFlow$downstreamFlow$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = cachedPageEventFlow;
    }
}
