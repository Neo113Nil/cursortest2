package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlinx/coroutines/flow/SharingCommand;", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", i = {1, 2, 3}, l = {174, 176, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, 179, 181}, m = "invokeSuspend", n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes5.dex */
final class StartedWhileSubscribed$command$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super kotlinx.coroutines.flow.SharingCommand>, java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ int Camera2StreamConfigurationMap;
    final /* synthetic */ kotlinx.coroutines.flow.StartedWhileSubscribed getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a6, code lost:
    
        if (r1.emit(kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE, r9) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0096, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r4, r9) != r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
    
        if (r1.emit(kotlinx.coroutines.flow.SharingCommand.STOP, r9) != r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        if (r10.emit(kotlinx.coroutines.flow.SharingCommand.START, r9) == r0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j;
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        long j2;
        long j3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoFpsRangesFor;
            if (this.Camera2StreamConfigurationMap > 0) {
                this.getHighSpeedVideoSizes = 1;
            } else {
                j = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
                this.getHighSpeedVideoFpsRangesFor = flowCollector2;
                this.getHighSpeedVideoSizes = 2;
                if (kotlinx.coroutines.DelayKt.delay(j, this) != coroutine_suspended) {
                    flowCollector = flowCollector2;
                    j2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
                    if (j2 > 0) {
                    }
                    this.getHighSpeedVideoFpsRangesFor = null;
                    this.getHighSpeedVideoSizes = 5;
                }
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i == 2) {
                flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                j2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
                if (j2 > 0) {
                    this.getHighSpeedVideoFpsRangesFor = flowCollector;
                    this.getHighSpeedVideoSizes = 3;
                }
                this.getHighSpeedVideoFpsRangesFor = null;
                this.getHighSpeedVideoSizes = 5;
            } else if (i == 3) {
                flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                j3 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
                this.getHighSpeedVideoFpsRangesFor = flowCollector;
                this.getHighSpeedVideoSizes = 4;
            } else if (i == 4) {
                flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRangesFor = null;
                this.getHighSpeedVideoSizes = 5;
            } else if (i != 5) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super kotlinx.coroutines.flow.SharingCommand> flowCollector, java.lang.Integer num, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        int intValue = num.intValue();
        kotlinx.coroutines.flow.StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new kotlinx.coroutines.flow.StartedWhileSubscribed$command$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        startedWhileSubscribed$command$1.getHighSpeedVideoFpsRangesFor = flowCollector;
        startedWhileSubscribed$command$1.Camera2StreamConfigurationMap = intValue;
        return startedWhileSubscribed$command$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StartedWhileSubscribed$command$1(kotlinx.coroutines.flow.StartedWhileSubscribed startedWhileSubscribed, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.StartedWhileSubscribed$command$1> continuation) {
        super(3, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = startedWhileSubscribed;
    }
}
