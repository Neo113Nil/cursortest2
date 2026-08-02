package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1", f = "SimpleChannelFlow.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.channels.Channel<T> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.paging.SimpleProducerScope<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoSizes = 1;
                if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.Camera2StreamConfigurationMap, null, 1, null);
        } catch (java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap.close(th);
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1$1", f = "SimpleChannelFlow.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ kotlinx.coroutines.channels.Channel<T> getHighResolutionOutputSizeshNQ4ISI;
        private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlin.jvm.functions.Function2<androidx.paging.SimpleProducerScope<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.paging.SimpleProducerScopeImpl simpleProducerScopeImpl = new androidx.paging.SimpleProducerScopeImpl((kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
                kotlin.jvm.functions.Function2<androidx.paging.SimpleProducerScope<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.getHighSpeedVideoFpsRangesFor;
                this.Camera2StreamConfigurationMap = 1;
                if (function2.invoke(simpleProducerScopeImpl, this) == coroutine_suspended) {
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
            return ((androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1.AnonymousClass1 anonymousClass1 = new androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass1.getHighSpeedVideoFpsRanges = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlinx.coroutines.channels.Channel<T> channel, kotlin.jvm.functions.Function2<? super androidx.paging.SimpleProducerScope<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = channel;
            this.getHighSpeedVideoFpsRangesFor = function2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1(kotlinx.coroutines.channels.Channel<T> channel, kotlin.jvm.functions.Function2<? super androidx.paging.SimpleProducerScope<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = channel;
        this.getHighSpeedVideoFpsRangesFor = function2;
    }
}
