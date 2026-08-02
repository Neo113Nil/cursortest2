package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "downstream", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", i = {0, 0, 0, 0}, l = {412}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "ticker"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes17.dex */
final class FlowKt__DelayKt$sample$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T> getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ long getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ReceiveChannel produce$default;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        kotlinx.coroutines.channels.ReceiveChannel<kotlin.Unit> fixedPeriodTicker;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputMinFrameDuration;
            kotlinx.coroutines.flow.FlowCollector flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.Camera2StreamConfigurationMap;
            produce$default = kotlinx.coroutines.channels.ProduceKt.produce$default(coroutineScope, null, -1, new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1(this.getHighResolutionOutputSizeshNQ4ISI, null), 1, null);
            objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            flowCollector = flowCollector2;
            fixedPeriodTicker = kotlinx.coroutines.flow.FlowKt.fixedPeriodTicker(coroutineScope, this.getHighSpeedVideoSizes);
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fixedPeriodTicker = (kotlinx.coroutines.channels.ReceiveChannel) this.getHighSpeedVideoFpsRanges;
            objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.getHighSpeedVideoFpsRangesFor;
            produce$default = (kotlinx.coroutines.channels.ReceiveChannel) this.Camera2StreamConfigurationMap;
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getOutputMinFrameDuration;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (objectRef.element != kotlinx.coroutines.flow.internal.NullSurrogateKt.DONE) {
            kotlinx.coroutines.selects.SelectImplementation selectImplementation = new kotlinx.coroutines.selects.SelectImplementation(getGetHighSpeedVideoSizes());
            kotlinx.coroutines.selects.SelectImplementation selectImplementation2 = selectImplementation;
            selectImplementation2.invoke(produce$default.getOnReceiveCatching(), new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1(objectRef, fixedPeriodTicker, null));
            selectImplementation2.invoke(fixedPeriodTicker.getOnReceive(), new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2(objectRef, flowCollector, null));
            this.getOutputMinFrameDuration = flowCollector;
            this.Camera2StreamConfigurationMap = produce$default;
            this.getHighSpeedVideoFpsRangesFor = objectRef;
            this.getHighSpeedVideoFpsRanges = fixedPeriodTicker;
            this.getHighSpeedVideoSizesFor = 1;
            if (selectImplementation.doSelect(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2 flowKt__DelayKt$sample$2 = new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        flowKt__DelayKt$sample$2.getOutputMinFrameDuration = coroutineScope;
        flowKt__DelayKt$sample$2.Camera2StreamConfigurationMap = (kotlinx.coroutines.flow.FlowCollector) obj;
        return flowKt__DelayKt$sample$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__DelayKt$sample$2(long j, kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoSizes = j;
        this.getHighResolutionOutputSizeshNQ4ISI = flow;
    }
}
