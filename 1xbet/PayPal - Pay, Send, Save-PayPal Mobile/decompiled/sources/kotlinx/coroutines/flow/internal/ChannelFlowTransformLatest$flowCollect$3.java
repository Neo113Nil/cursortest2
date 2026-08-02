package kotlinx.coroutines.flow.internal;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class ChannelFlowTransformLatest$flowCollect$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (this.getHighResolutionOutputSizeshNQ4ISI.flow.collect(new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.AnonymousClass1(objectRef, coroutineScope, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap), this) == coroutine_suspended) {
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

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.Job> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> getHighSpeedVideoSizes;

        /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1 channelFlowTransformLatest$flowCollect$3$1$emit$1;
            int i;
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.AnonymousClass1<T> anonymousClass1;
            kotlinx.coroutines.Job launch$default;
            if (continuation instanceof kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1) {
                channelFlowTransformLatest$flowCollect$3$1$emit$1 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1) continuation;
                if ((channelFlowTransformLatest$flowCollect$3$1$emit$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj = channelFlowTransformLatest$flowCollect$3$1$emit$1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = channelFlowTransformLatest$flowCollect$3$1$emit$1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.Job job = this.getHighResolutionOutputSizeshNQ4ISI.element;
                        if (job != null) {
                            job.cancel((java.util.concurrent.CancellationException) new kotlinx.coroutines.flow.internal.ChildCancelledException());
                            channelFlowTransformLatest$flowCollect$3$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = this;
                            channelFlowTransformLatest$flowCollect$3$1$emit$1.getHighSpeedVideoFpsRanges = t;
                            channelFlowTransformLatest$flowCollect$3$1$emit$1.getHighSpeedVideoFpsRangesFor = job;
                            channelFlowTransformLatest$flowCollect$3$1$emit$1.Camera2StreamConfigurationMap = 1;
                            if (job.join(channelFlowTransformLatest$flowCollect$3$1$emit$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        anonymousClass1 = this;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t = (T) channelFlowTransformLatest$flowCollect$3$1$emit$1.getHighSpeedVideoFpsRanges;
                        anonymousClass1 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.AnonymousClass1) channelFlowTransformLatest$flowCollect$3$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.Job> objectRef = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                    launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(anonymousClass1.getHighSpeedVideoFpsRanges, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.AnonymousClass1.AnonymousClass2(anonymousClass1.getHighSpeedVideoSizes, anonymousClass1.getHighSpeedVideoFpsRangesFor, t, null), 1, null);
                    objectRef.element = (T) launch$default;
                    return kotlin.Unit.INSTANCE;
                }
            }
            channelFlowTransformLatest$flowCollect$3$1$emit$1 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1(this, continuation);
            java.lang.Object obj2 = channelFlowTransformLatest$flowCollect$3$1$emit$1.getHighSpeedVideoSizes;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = channelFlowTransformLatest$flowCollect$3$1$emit$1.Camera2StreamConfigurationMap;
            if (i != 0) {
            }
            kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.Job> objectRef2 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(anonymousClass1.getHighSpeedVideoFpsRanges, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.AnonymousClass1.AnonymousClass2(anonymousClass1.getHighSpeedVideoSizes, anonymousClass1.getHighSpeedVideoFpsRangesFor, t, null), 1, null);
            objectRef2.element = (T) launch$default;
            return kotlin.Unit.INSTANCE;
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> getHighResolutionOutputSizeshNQ4ISI;
            final /* synthetic */ T getHighSpeedVideoFpsRanges;
            final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> getHighSpeedVideoFpsRangesFor;
            int getHighSpeedVideoSizes;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.jvm.functions.Function3 function3;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.getHighSpeedVideoSizes;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    function3 = ((kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest) this.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoFpsRangesFor;
                    java.lang.Object obj2 = this.getHighSpeedVideoFpsRangesFor;
                    T t = this.getHighSpeedVideoFpsRanges;
                    this.getHighSpeedVideoSizes = 1;
                    if (function3.invoke(obj2, t, this) == coroutine_suspended) {
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
                return ((kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.AnonymousClass1.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.AnonymousClass1.AnonymousClass2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, kotlinx.coroutines.flow.FlowCollector<? super R> flowCollector, T t, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.AnonymousClass1.AnonymousClass2> continuation) {
                super(2, continuation);
                this.getHighResolutionOutputSizeshNQ4ISI = channelFlowTransformLatest;
                this.getHighSpeedVideoFpsRangesFor = flowCollector;
                this.getHighSpeedVideoFpsRanges = t;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.Job> objectRef, kotlinx.coroutines.CoroutineScope coroutineScope, kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, kotlinx.coroutines.flow.FlowCollector<? super R> flowCollector) {
            this.getHighResolutionOutputSizeshNQ4ISI = objectRef;
            this.getHighSpeedVideoFpsRanges = coroutineScope;
            this.getHighSpeedVideoSizes = channelFlowTransformLatest;
            this.getHighSpeedVideoFpsRangesFor = flowCollector;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3 channelFlowTransformLatest$flowCollect$3 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
        channelFlowTransformLatest$flowCollect$3.getHighSpeedVideoFpsRanges = obj;
        return channelFlowTransformLatest$flowCollect$3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelFlowTransformLatest$flowCollect$3(kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, kotlinx.coroutines.flow.FlowCollector<? super R> flowCollector, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = channelFlowTransformLatest;
        this.Camera2StreamConfigurationMap = flowCollector;
    }
}
