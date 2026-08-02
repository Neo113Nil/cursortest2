package com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\n\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0082@¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/FetchPinMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/SideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvEvent;", "<init>", "()V", "state", "Lkotlin/Function1;", "", "eventDispatcher", "onState", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managepin/entercvv/viewmodel/EnterCvvState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "p0", "p1", "Camera2StreamConfigurationMap", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FetchPinMiddleware extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState, com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public FetchPinMiddleware() {
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object onState(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState enterCvvState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return onState2(enterCvvState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: onState, reason: avoid collision after fix types in other method */
    public final java.lang.Object onState2(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState enterCvvState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (enterCvvState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState.FetchingPin) {
            java.lang.Object Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(((com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvState.FetchingPin) enterCvvState).getReadyInfo().getCvv(), function1, continuation);
            return Camera2StreamConfigurationMap == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? Camera2StreamConfigurationMap : kotlin.Unit.INSTANCE;
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(java.lang.String str, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.FetchPinMiddleware$fetchPin$1 fetchPinMiddleware$fetchPin$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.FetchPinMiddleware$fetchPin$1) {
            fetchPinMiddleware$fetchPin$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.FetchPinMiddleware$fetchPin$1) continuation;
            if ((fetchPinMiddleware$fetchPin$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                fetchPinMiddleware$fetchPin$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = fetchPinMiddleware$fetchPin$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fetchPinMiddleware$fetchPin$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    fetchPinMiddleware$fetchPin$1.getHighResolutionOutputSizeshNQ4ISI = str;
                    fetchPinMiddleware$fetchPin$1.getHighSpeedVideoFpsRanges = function1;
                    fetchPinMiddleware$fetchPin$1.Camera2StreamConfigurationMap = 1;
                    if (kotlinx.coroutines.DelayKt.delay(2000L, fetchPinMiddleware$fetchPin$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) fetchPinMiddleware$fetchPin$1.getHighSpeedVideoFpsRanges;
                    str = (java.lang.String) fetchPinMiddleware$fetchPin$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append("0");
                function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnPinReceived(sb.toString()));
                return kotlin.Unit.INSTANCE;
            }
        }
        fetchPinMiddleware$fetchPin$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.FetchPinMiddleware$fetchPin$1(this, continuation);
        java.lang.Object obj2 = fetchPinMiddleware$fetchPin$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fetchPinMiddleware$fetchPin$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str);
        sb2.append("0");
        function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.entercvv.viewmodel.EnterCvvEvent.OnPinReceived(sb2.toString()));
        return kotlin.Unit.INSTANCE;
    }
}
