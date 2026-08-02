package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1", f = "Delay.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class FlowKt__DelayKt$sample$2$values$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super java.lang.Object>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T> Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;

        /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1$emit$1 flowKt__DelayKt$sample$2$values$1$1$emit$1;
            int i;
            if (continuation instanceof kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1$emit$1) {
                flowKt__DelayKt$sample$2$values$1$1$emit$1 = (kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1$emit$1) continuation;
                if ((flowKt__DelayKt$sample$2$values$1$1$emit$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    flowKt__DelayKt$sample$2$values$1$1$emit$1.getHighSpeedVideoSizes -= 2147483648;
                    java.lang.Object obj = flowKt__DelayKt$sample$2$values$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = flowKt__DelayKt$sample$2$values$1$1$emit$1.getHighSpeedVideoSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.channels.ProducerScope<java.lang.Object> producerScope = this.getHighResolutionOutputSizeshNQ4ISI;
                        if (t == null) {
                            t = (T) kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL;
                        }
                        flowKt__DelayKt$sample$2$values$1$1$emit$1.getHighSpeedVideoSizes = 1;
                        if (producerScope.send(t, flowKt__DelayKt$sample$2$values$1$1$emit$1) == coroutine_suspended) {
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
            }
            flowKt__DelayKt$sample$2$values$1$1$emit$1 = new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1$emit$1(this, continuation);
            java.lang.Object obj2 = flowKt__DelayKt$sample$2$values$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = flowKt__DelayKt$sample$2$values$1$1$emit$1.getHighSpeedVideoSizes;
            if (i != 0) {
            }
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(kotlinx.coroutines.channels.ProducerScope<java.lang.Object> producerScope) {
            this.getHighResolutionOutputSizeshNQ4ISI = producerScope;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRanges = 1;
            if (this.Camera2StreamConfigurationMap.collect(new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1.AnonymousClass1(producerScope), this) == coroutine_suspended) {
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
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super java.lang.Object> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1 flowKt__DelayKt$sample$2$values$1 = new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1(this.Camera2StreamConfigurationMap, continuation);
        flowKt__DelayKt$sample$2$values$1.getHighSpeedVideoFpsRangesFor = obj;
        return flowKt__DelayKt$sample$2$values$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__DelayKt$sample$2$values$1(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = flow;
    }
}
