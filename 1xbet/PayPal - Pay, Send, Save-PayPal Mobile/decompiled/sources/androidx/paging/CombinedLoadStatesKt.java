package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0003\u001a\t\u0018\u00010\u0001¢\u0006\u0002\b\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/CombinedLoadStates;", "Lkotlin/jvm/JvmSuppressWildcards;", "awaitNotLoading", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CombinedLoadStatesKt {
    public static final java.lang.Object awaitNotLoading(kotlinx.coroutines.flow.Flow<androidx.paging.CombinedLoadStates> flow, kotlin.coroutines.Continuation<androidx.paging.CombinedLoadStates> continuation) {
        final kotlinx.coroutines.flow.Flow debounce = kotlinx.coroutines.flow.FlowKt.debounce(flow, 1L);
        return kotlinx.coroutines.flow.FlowKt.firstOrNull(new kotlinx.coroutines.flow.Flow<androidx.paging.CombinedLoadStates>() { // from class: androidx.paging.CombinedLoadStatesKt$awaitNotLoading$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super androidx.paging.CombinedLoadStates> flowCollector, kotlin.coroutines.Continuation continuation2) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new androidx.paging.CombinedLoadStatesKt$awaitNotLoading$$inlined$filter$1.AnonymousClass2(flowCollector), continuation2);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: androidx.paging.CombinedLoadStatesKt$awaitNotLoading$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRanges;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    androidx.paging.CombinedLoadStatesKt$awaitNotLoading$$inlined$filter$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof androidx.paging.CombinedLoadStatesKt$awaitNotLoading$$inlined$filter$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (androidx.paging.CombinedLoadStatesKt$awaitNotLoading$$inlined$filter$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoFpsRanges;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoFpsRanges;
                                androidx.paging.CombinedLoadStates combinedLoadStates = (androidx.paging.CombinedLoadStates) obj;
                                if (combinedLoadStates.getIsIdle() || combinedLoadStates.getHasError()) {
                                    anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new androidx.paging.CombinedLoadStatesKt$awaitNotLoading$$inlined$filter$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.CombinedLoadStatesKt$awaitNotLoading$$inlined$filter$1$2", f = "CombinedLoadStates.kt", i = {}, l = {50}, m = "emit", n = {}, s = {}, v = 1)
                /* renamed from: androidx.paging.CombinedLoadStatesKt$awaitNotLoading$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    int getHighResolutionOutputSizeshNQ4ISI;
                    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getHighSpeedVideoFpsRanges = obj;
                        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
                        return androidx.paging.CombinedLoadStatesKt$awaitNotLoading$$inlined$filter$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector) {
                    this.getHighSpeedVideoFpsRanges = flowCollector;
                }
            }
        }, continuation);
    }
}
