package com.paypal.oslo.feature.qrc.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Error;", "Lcom/paypal/oslo/feature/qrc/domain/session/QrcSessionResultAction$Action;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase$invoke$1", f = "PollQrcSessionUseCase.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3}, l = {67, 68, 77, 82}, m = "invokeSuspend", n = {"$this$flow", "maxDurationMs", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_START_TIME, "remainingRetries", "isLastPollCall", "$this$flow", "result", "maxDurationMs", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_START_TIME, "remainingRetries", "isLastPollCall", "$this$flow", "result", "maxDurationMs", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_START_TIME, "remainingRetries", "isLastPollCall", "$this$flow", "maxDurationMs", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_START_TIME, "remainingRetries"}, nl = {68, 71, 81, 84}, s = {"L$0", "I$0", "J$0", "I$1", "Z$0", "L$0", "L$1", "I$0", "J$0", "I$1", "Z$0", "L$0", "L$1", "I$0", "J$0", "I$1", "Z$0", "L$0", "I$0", "J$0", "I$1"}, v = 2)
/* loaded from: classes14.dex */
final class PollQrcSessionUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error, ? extends com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.session.PollingSessionInfo getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    long getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    boolean getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c4, code lost:
    
        if (r1.emit(r13, r18) == r2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0133, code lost:
    
        if (r1.emit(arrow.core.IorKt.leftIor(com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error.TimeoutError.INSTANCE), r18) == r2) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0116  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0105 -> B:14:0x0073). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long currentTimeMillis;
        com.paypal.oslo.feature.qrc.domain.config.QrcSessionPollingConfig qrcSessionPollingConfig;
        int i;
        int i2;
        arrow.core.Ior ior;
        int i3;
        long j;
        int i4;
        boolean z;
        com.paypal.oslo.feature.qrc.domain.config.QrcSessionPollingConfig qrcSessionPollingConfig2;
        java.lang.Object obj2;
        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = this.getHighSpeedVideoSizesFor;
        int i6 = 2;
        if (i5 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int maximumPollingInterval = this.getHighResolutionOutputSizeshNQ4ISI.getMaximumPollingInterval();
            currentTimeMillis = java.lang.System.currentTimeMillis();
            qrcSessionPollingConfig = this.getOutputMinFrameDuration.Camera2StreamConfigurationMap;
            int pollingApiMaxRetries = qrcSessionPollingConfig.getPollingApiMaxRetries();
            i = maximumPollingInterval * 1000;
            i2 = pollingApiMaxRetries;
        } else if (i5 == 1) {
            z = this.getOutputFormats;
            i4 = this.Camera2StreamConfigurationMap;
            j = this.getHighSpeedVideoFpsRangesFor;
            i3 = this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
            obj2 = obj;
            ior = (arrow.core.Ior) obj2;
            this.getInputSizeshNQ4ISI = flowCollector;
            this.getHighSpeedVideoFpsRanges = ior;
            this.getHighSpeedVideoSizes = i3;
            this.getHighSpeedVideoFpsRangesFor = j;
            this.Camera2StreamConfigurationMap = i4;
            this.getOutputFormats = z;
            this.getHighSpeedVideoSizesFor = i6;
        } else {
            if (i5 == 2) {
                z = this.getOutputFormats;
                i4 = this.Camera2StreamConfigurationMap;
                j = this.getHighSpeedVideoFpsRangesFor;
                i3 = this.getHighSpeedVideoSizes;
                ior = (arrow.core.Ior) this.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                if (ior.isLeft() && !(ior.leftOrNull() instanceof com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error.NoInternetError)) {
                    i4--;
                }
                if (!com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase.access$shouldStopPolling(this.getOutputMinFrameDuration, ior) && i4 > 0) {
                    qrcSessionPollingConfig2 = this.getOutputMinFrameDuration.Camera2StreamConfigurationMap;
                    this.getInputSizeshNQ4ISI = flowCollector;
                    this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                    this.getHighSpeedVideoSizes = i3;
                    this.getHighSpeedVideoFpsRangesFor = j;
                    this.Camera2StreamConfigurationMap = i4;
                    this.getOutputFormats = z;
                    this.getHighSpeedVideoSizesFor = 3;
                    if (kotlinx.coroutines.DelayKt.delay(qrcSessionPollingConfig2.getPollingIntervalMs(), this) != coroutine_suspended) {
                        i2 = i4;
                        currentTimeMillis = j;
                        i = i3;
                        i6 = 2;
                    }
                    return coroutine_suspended;
                }
                i2 = i4;
                currentTimeMillis = j;
                i = i3;
                if (com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase.access$hasReachedTimeout(this.getOutputMinFrameDuration, currentTimeMillis, i)) {
                    this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                    this.getHighSpeedVideoFpsRanges = null;
                    this.getHighSpeedVideoSizes = i;
                    this.getHighSpeedVideoFpsRangesFor = currentTimeMillis;
                    this.Camera2StreamConfigurationMap = i2;
                    this.getHighSpeedVideoSizesFor = 4;
                }
                return kotlin.Unit.INSTANCE;
            }
            if (i5 != 3) {
                if (i5 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            i2 = this.Camera2StreamConfigurationMap;
            currentTimeMillis = this.getHighSpeedVideoFpsRangesFor;
            i = this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (kotlinx.coroutines.JobKt.isActive(getGetHighSpeedVideoSizes()) && !com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase.access$hasReachedTimeout(this.getOutputMinFrameDuration, currentTimeMillis, i)) {
            boolean access$isLastPollCall = com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase.access$isLastPollCall(this.getOutputMinFrameDuration, currentTimeMillis, i, i2);
            this.getInputSizeshNQ4ISI = flowCollector;
            this.getHighSpeedVideoFpsRanges = null;
            this.getHighSpeedVideoSizes = i;
            this.getHighSpeedVideoFpsRangesFor = currentTimeMillis;
            this.Camera2StreamConfigurationMap = i2;
            this.getOutputFormats = access$isLastPollCall;
            this.getHighSpeedVideoSizesFor = 1;
            obj2 = com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase.access$pollOnce(this.getOutputMinFrameDuration, this.getHighResolutionOutputSizeshNQ4ISI, access$isLastPollCall, this);
            if (obj2 != coroutine_suspended) {
                long j2 = currentTimeMillis;
                i4 = i2;
                z = access$isLastPollCall;
                i3 = i;
                j = j2;
                ior = (arrow.core.Ior) obj2;
                this.getInputSizeshNQ4ISI = flowCollector;
                this.getHighSpeedVideoFpsRanges = ior;
                this.getHighSpeedVideoSizes = i3;
                this.getHighSpeedVideoFpsRangesFor = j;
                this.Camera2StreamConfigurationMap = i4;
                this.getOutputFormats = z;
                this.getHighSpeedVideoSizesFor = i6;
            }
            return coroutine_suspended;
        }
        if (com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase.access$hasReachedTimeout(this.getOutputMinFrameDuration, currentTimeMillis, i)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Ior<? extends com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Error, ? extends com.paypal.oslo.feature.qrc.domain.session.QrcSessionResultAction.Action>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase$invoke$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase$invoke$1 pollQrcSessionUseCase$invoke$1 = new com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase$invoke$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, continuation);
        pollQrcSessionUseCase$invoke$1.getInputSizeshNQ4ISI = obj;
        return pollQrcSessionUseCase$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PollQrcSessionUseCase$invoke$1(com.paypal.oslo.feature.qrc.domain.model.session.PollingSessionInfo pollingSessionInfo, com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase pollQrcSessionUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase$invoke$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = pollingSessionInfo;
        this.getOutputMinFrameDuration = pollQrcSessionUseCase;
    }
}
