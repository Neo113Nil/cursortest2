package kotlinx.coroutines.flow.internal;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class ChannelFlowMerge$collectTo$2<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<T> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlinx.coroutines.Job getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlinx.coroutines.flow.internal.SendingCollector<T> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlinx.coroutines.sync.Semaphore getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1 channelFlowMerge$collectTo$2$emit$1;
        int i;
        kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2<T> channelFlowMerge$collectTo$2;
        if (continuation instanceof kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1) {
            channelFlowMerge$collectTo$2$emit$1 = (kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1) continuation;
            if ((channelFlowMerge$collectTo$2$emit$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                channelFlowMerge$collectTo$2$emit$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = channelFlowMerge$collectTo$2$emit$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelFlowMerge$collectTo$2$emit$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.Job job = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (job != null) {
                        kotlinx.coroutines.JobKt.ensureActive(job);
                    }
                    kotlinx.coroutines.sync.Semaphore semaphore = this.getHighSpeedVideoSizes;
                    channelFlowMerge$collectTo$2$emit$1.Camera2StreamConfigurationMap = this;
                    channelFlowMerge$collectTo$2$emit$1.getHighResolutionOutputSizeshNQ4ISI = flow;
                    channelFlowMerge$collectTo$2$emit$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (semaphore.acquire(channelFlowMerge$collectTo$2$emit$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    channelFlowMerge$collectTo$2 = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flow = (kotlinx.coroutines.flow.Flow) channelFlowMerge$collectTo$2$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                    channelFlowMerge$collectTo$2 = (kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2) channelFlowMerge$collectTo$2$emit$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(channelFlowMerge$collectTo$2.Camera2StreamConfigurationMap, null, null, new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2.AnonymousClass1(flow, channelFlowMerge$collectTo$2.getHighSpeedVideoFpsRangesFor, channelFlowMerge$collectTo$2.getHighSpeedVideoSizes, null), 3, null);
                return kotlin.Unit.INSTANCE;
            }
        }
        channelFlowMerge$collectTo$2$emit$1 = new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1(this, continuation);
        java.lang.Object obj2 = channelFlowMerge$collectTo$2$emit$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelFlowMerge$collectTo$2$emit$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(channelFlowMerge$collectTo$2.Camera2StreamConfigurationMap, null, null, new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2.AnonymousClass1(flow, channelFlowMerge$collectTo$2.getHighSpeedVideoFpsRangesFor, channelFlowMerge$collectTo$2.getHighSpeedVideoSizes, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.Flow<T> Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlinx.coroutines.sync.Semaphore getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlinx.coroutines.flow.internal.SendingCollector<T> getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (this.Camera2StreamConfigurationMap.collect(this.getHighSpeedVideoFpsRangesFor, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                this.getHighSpeedVideoFpsRanges.release();
                return kotlin.Unit.INSTANCE;
            } catch (java.lang.Throwable th) {
                this.getHighSpeedVideoFpsRanges.release();
                throw th;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlinx.coroutines.flow.internal.SendingCollector<T> sendingCollector, kotlinx.coroutines.sync.Semaphore semaphore, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = flow;
            this.getHighSpeedVideoFpsRangesFor = sendingCollector;
            this.getHighSpeedVideoFpsRanges = semaphore;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    ChannelFlowMerge$collectTo$2(kotlinx.coroutines.Job job, kotlinx.coroutines.sync.Semaphore semaphore, kotlinx.coroutines.channels.ProducerScope<? super T> producerScope, kotlinx.coroutines.flow.internal.SendingCollector<T> sendingCollector) {
        this.getHighResolutionOutputSizeshNQ4ISI = job;
        this.getHighSpeedVideoSizes = semaphore;
        this.Camera2StreamConfigurationMap = producerScope;
        this.getHighSpeedVideoFpsRangesFor = sendingCollector;
    }
}
