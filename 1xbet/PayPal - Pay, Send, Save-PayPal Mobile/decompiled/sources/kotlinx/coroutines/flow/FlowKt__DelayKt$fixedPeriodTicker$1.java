package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1", f = "Delay.kt", i = {0, 1, 2}, l = {307, 309, 310}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes3.dex */
final class FlowKt__DelayKt$fixedPeriodTicker$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super kotlin.Unit>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ long getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r7.getHighSpeedVideoFpsRanges, r7) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        if (r1.getChannel().send(kotlin.Unit.INSTANCE, r7) != r0) goto L17;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0061 -> B:12:0x0041). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ProducerScope producerScope;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.channels.ProducerScope producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = producerScope2;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (kotlinx.coroutines.DelayKt.delay(this.getHighSpeedVideoFpsRanges, this) != coroutine_suspended) {
                producerScope = producerScope2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i == 2) {
                producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighResolutionOutputSizeshNQ4ISI = producerScope;
                this.getHighSpeedVideoFpsRangesFor = 3;
            } else if (i != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighResolutionOutputSizeshNQ4ISI = producerScope;
        this.getHighSpeedVideoFpsRangesFor = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super kotlin.Unit> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1 flowKt__DelayKt$fixedPeriodTicker$1 = new kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1(this.getHighSpeedVideoFpsRanges, continuation);
        flowKt__DelayKt$fixedPeriodTicker$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return flowKt__DelayKt$fixedPeriodTicker$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowKt__DelayKt$fixedPeriodTicker$1(long j, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = j;
    }
}
