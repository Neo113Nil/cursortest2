package androidx.paging;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1", f = "SimpleChannelFlow.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class SimpleChannelFlowKt$simpleChannelFlow$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.paging.SimpleProducerScope<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1", f = "SimpleChannelFlow.kt", i = {0, 1}, l = {62, 63}, m = "invokeSuspend", n = {"producer", "producer"}, s = {"L$0", "L$0"}, v = 1)
    /* renamed from: androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        java.lang.Object Camera2StreamConfigurationMap;
        final /* synthetic */ kotlin.jvm.functions.Function2<androidx.paging.SimpleProducerScope<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;
        private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<T> getHighSpeedVideoSizes;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0083, code lost:
        
            if (r12.getHighSpeedVideoSizes.emit(r13, r12) == r0) goto L22;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0064  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0083 -> B:6:0x001a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.Job launch$default;
            kotlinx.coroutines.channels.ChannelIterator it;
            kotlinx.coroutines.Job job;
            kotlinx.coroutines.channels.ChannelIterator channelIterator;
            java.lang.Object hasNext;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRanges;
                kotlinx.coroutines.channels.Channel Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(0, null, null, 6, null);
                launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1(Channel$default, this.getHighResolutionOutputSizeshNQ4ISI, null), 3, null);
                it = Channel$default.iterator();
                this.getHighSpeedVideoFpsRanges = launch$default;
                this.Camera2StreamConfigurationMap = it;
                this.getHighSpeedVideoFpsRangesFor = 1;
                hasNext = it.hasNext(this);
                if (hasNext != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.Camera2StreamConfigurationMap;
                job = (kotlinx.coroutines.Job) this.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                it = channelIterator;
                launch$default = job;
                this.getHighSpeedVideoFpsRanges = launch$default;
                this.Camera2StreamConfigurationMap = it;
                this.getHighSpeedVideoFpsRangesFor = 1;
                hasNext = it.hasNext(this);
                if (hasNext != coroutine_suspended) {
                    kotlinx.coroutines.Job job2 = launch$default;
                    channelIterator = it;
                    obj = hasNext;
                    job = job2;
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                        return kotlin.Unit.INSTANCE;
                    }
                    java.lang.Object next = channelIterator.next();
                    this.getHighSpeedVideoFpsRanges = job;
                    this.Camera2StreamConfigurationMap = channelIterator;
                    this.getHighSpeedVideoFpsRangesFor = 2;
                }
                return coroutine_suspended;
            }
            channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.Camera2StreamConfigurationMap;
            job = (kotlinx.coroutines.Job) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
            if (((java.lang.Boolean) obj).booleanValue()) {
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1.AnonymousClass1 anonymousClass1 = new androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            anonymousClass1.getHighSpeedVideoFpsRanges = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.jvm.functions.Function2<? super androidx.paging.SimpleProducerScope<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = flowCollector;
            this.getHighResolutionOutputSizeshNQ4ISI = function2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            if (kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1.AnonymousClass1((kotlinx.coroutines.flow.FlowCollector) this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, null), this) == coroutine_suspended) {
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
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1) create((kotlinx.coroutines.flow.FlowCollector) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1 simpleChannelFlowKt$simpleChannelFlow$1 = new androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1(this.getHighSpeedVideoFpsRanges, continuation);
        simpleChannelFlowKt$simpleChannelFlow$1.Camera2StreamConfigurationMap = obj;
        return simpleChannelFlowKt$simpleChannelFlow$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SimpleChannelFlowKt$simpleChannelFlow$1(kotlin.jvm.functions.Function2<? super androidx.paging.SimpleProducerScope<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = function2;
    }
}
