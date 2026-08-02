package com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentSideEffectsMiddleware", f = "FundingOptionsComponentSideEffectsMiddleware.kt", i = {0, 0, 0, 0}, l = {43}, m = "handleEvent", n = {"event", "currentState", "eventDispatcher", "request"}, nl = {44}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes12.dex */
final class FundingOptionsComponentSideEffectsMiddleware$handleEvent$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentSideEffectsMiddleware getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.handleEvent2((com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent) null, (com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentUiState) null, (kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentEvent, kotlin.Unit>) null, (kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FundingOptionsComponentSideEffectsMiddleware$handleEvent$1(com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentSideEffectsMiddleware fundingOptionsComponentSideEffectsMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.mvi.FundingOptionsComponentSideEffectsMiddleware$handleEvent$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = fundingOptionsComponentSideEffectsMiddleware;
    }
}
