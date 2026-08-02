package com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationSideEffectsMiddleware", f = "ContactlessPaymentsOperationSideEffectsMiddleware.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {63, 91}, m = "handleEvent", n = {"event", "currentState", "eventDispatcher", "cardId", "event", "currentState", "eventDispatcher", "cardId"}, nl = {66, 109}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes12.dex */
final class ContactlessPaymentsOperationSideEffectsMiddleware$handleEvent$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationSideEffectsMiddleware getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.handleEvent2((com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent) null, (com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationState) null, (kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent, kotlin.Unit>) null, (kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactlessPaymentsOperationSideEffectsMiddleware$handleEvent$1(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationSideEffectsMiddleware contactlessPaymentsOperationSideEffectsMiddleware, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationSideEffectsMiddleware$handleEvent$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = contactlessPaymentsOperationSideEffectsMiddleware;
    }
}
