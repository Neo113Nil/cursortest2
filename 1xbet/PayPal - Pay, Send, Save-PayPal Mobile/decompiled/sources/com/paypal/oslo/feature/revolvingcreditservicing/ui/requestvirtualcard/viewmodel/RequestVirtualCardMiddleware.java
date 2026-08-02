package com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\n\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/SideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardEvent;", "<init>", "()V", "state", "Lkotlin/Function1;", "", "eventDispatcher", "onState", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/requestvirtualcard/viewmodel/RequestVirtualCardState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RequestVirtualCardMiddleware extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState, com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardEvent> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public RequestVirtualCardMiddleware() {
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object onState(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState requestVirtualCardState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return onState2(requestVirtualCardState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: onState, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object onState2(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState requestVirtualCardState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardMiddleware$onState$1 requestVirtualCardMiddleware$onState$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardMiddleware$onState$1) {
            requestVirtualCardMiddleware$onState$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardMiddleware$onState$1) continuation;
            if ((requestVirtualCardMiddleware$onState$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                requestVirtualCardMiddleware$onState$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = requestVirtualCardMiddleware$onState$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = requestVirtualCardMiddleware$onState$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (requestVirtualCardState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardState.Loading) {
                        requestVirtualCardMiddleware$onState$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(requestVirtualCardState);
                        requestVirtualCardMiddleware$onState$1.getHighResolutionOutputSizeshNQ4ISI = function1;
                        requestVirtualCardMiddleware$onState$1.Camera2StreamConfigurationMap = 1;
                        if (kotlinx.coroutines.DelayKt.delay(500L, requestVirtualCardMiddleware$onState$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = (kotlin.jvm.functions.Function1) requestVirtualCardMiddleware$onState$1.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardEvent.OnUnableToVerifyAddressError.INSTANCE);
                return kotlin.Unit.INSTANCE;
            }
        }
        requestVirtualCardMiddleware$onState$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardMiddleware$onState$1(this, continuation);
        java.lang.Object obj2 = requestVirtualCardMiddleware$onState$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = requestVirtualCardMiddleware$onState$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.requestvirtualcard.viewmodel.RequestVirtualCardEvent.OnUnableToVerifyAddressError.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
