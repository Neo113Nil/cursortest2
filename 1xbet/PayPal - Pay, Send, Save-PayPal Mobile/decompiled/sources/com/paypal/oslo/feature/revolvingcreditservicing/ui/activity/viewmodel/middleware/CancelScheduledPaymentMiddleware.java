package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ,\u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ>\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000bH\u0082@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/middleware/CancelScheduledPaymentMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/SideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/CancelRepaymentUseCase;", "cancelRepaymentUseCase", "Lcom/paypal/oslo/feature/revolvingcreditservicing/event/DataInvalidationEventBus;", "dataInvalidationEventBus", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/CancelRepaymentUseCase;Lcom/paypal/oslo/feature/revolvingcreditservicing/event/DataInvalidationEventBus;)V", "state", "Lkotlin/Function1;", "", "eventDispatcher", "onState", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/viewmodel/ActivityState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "p0", "p1", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "p2", "p3", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/CancelRepaymentUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/revolvingcreditservicing/event/DataInvalidationEventBus;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CancelScheduledPaymentMiddleware extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CancelRepaymentUseCase getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public CancelScheduledPaymentMiddleware(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CancelRepaymentUseCase cancelRepaymentUseCase, com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus dataInvalidationEventBus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelRepaymentUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInvalidationEventBus, "");
        this.getHighResolutionOutputSizeshNQ4ISI = cancelRepaymentUseCase;
        this.getHighSpeedVideoSizes = dataInvalidationEventBus;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object onState(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState activityState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return onState2(activityState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: onState, reason: avoid collision after fix types in other method */
    public final java.lang.Object onState2(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState activityState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlin.Pair pair;
        if (activityState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.CancelingPayment) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.CancelingPayment cancelingPayment = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.CancelingPayment) activityState;
            pair = kotlin.TuplesKt.to(cancelingPayment.getRepaymentId(), cancelingPayment.getArgs());
        } else {
            if (!(activityState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.RetryCancelingPayment)) {
                return kotlin.Unit.INSTANCE;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.RetryCancelingPayment retryCancelingPayment = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityState.RetryCancelingPayment) activityState;
            pair = kotlin.TuplesKt.to(retryCancelingPayment.getRepaymentId(), retryCancelingPayment.getArgs());
        }
        java.lang.String str = (java.lang.String) pair.component1();
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs activityHubArgs = (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityHubArgs) pair.component2();
        java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(str, activityHubArgs.getCreditAccountId(), activityHubArgs.getCpi(), function1, continuation);
        return highSpeedVideoFpsRangesFor == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRangesFor : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b2, code lost:
    
        if (r2 != r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.CancelScheduledPaymentMiddleware$cancelPayment$1 cancelScheduledPaymentMiddleware$cancelPayment$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.request.CancelRepaymentRequest cancelRepaymentRequest;
        java.lang.Object invoke;
        arrow.core.Either either;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent, kotlin.Unit> function12;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.CancelScheduledPaymentMiddleware$cancelPayment$1) {
            cancelScheduledPaymentMiddleware$cancelPayment$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.CancelScheduledPaymentMiddleware$cancelPayment$1) continuation;
            if ((cancelScheduledPaymentMiddleware$cancelPayment$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                cancelScheduledPaymentMiddleware$cancelPayment$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = cancelScheduledPaymentMiddleware$cancelPayment$1.getOutputSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cancelScheduledPaymentMiddleware$cancelPayment$1.getInputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String str3 = str2;
                    if (str3 == null || kotlin.text.StringsKt.isBlank(str3) || kotlin.text.StringsKt.isBlank(str)) {
                        return kotlin.Unit.INSTANCE;
                    }
                    cancelRepaymentRequest = new com.paypal.oslo.feature.revolvingcreditservicing.domain.request.CancelRepaymentRequest(str2, str, creditProductIdentifier);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CancelRepaymentUseCase cancelRepaymentUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                    cancelScheduledPaymentMiddleware$cancelPayment$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    cancelScheduledPaymentMiddleware$cancelPayment$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    cancelScheduledPaymentMiddleware$cancelPayment$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier);
                    cancelScheduledPaymentMiddleware$cancelPayment$1.getInputFormats = function1;
                    cancelScheduledPaymentMiddleware$cancelPayment$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cancelRepaymentRequest);
                    cancelScheduledPaymentMiddleware$cancelPayment$1.getInputSizeshNQ4ISI = 1;
                    invoke = cancelRepaymentUseCase.invoke(cancelRepaymentRequest, cancelScheduledPaymentMiddleware$cancelPayment$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = cancelScheduledPaymentMiddleware$cancelPayment$1.getHighSpeedVideoSizes;
                        int i3 = cancelScheduledPaymentMiddleware$cancelPayment$1.getHighSpeedVideoFpsRanges;
                        function12 = (kotlin.jvm.functions.Function1) cancelScheduledPaymentMiddleware$cancelPayment$1.getInputFormats;
                        kotlin.ResultKt.throwOnFailure(obj);
                        function12.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnCancelPaymentSuccess.INSTANCE);
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.request.CancelRepaymentRequest cancelRepaymentRequest2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.request.CancelRepaymentRequest) cancelScheduledPaymentMiddleware$cancelPayment$1.getOutputMinFrameDuration;
                    function1 = (kotlin.jvm.functions.Function1) cancelScheduledPaymentMiddleware$cancelPayment$1.getInputFormats;
                    creditProductIdentifier = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) cancelScheduledPaymentMiddleware$cancelPayment$1.getHighResolutionOutputSizeshNQ4ISI;
                    str2 = (java.lang.String) cancelScheduledPaymentMiddleware$cancelPayment$1.getHighSpeedVideoFpsRangesFor;
                    java.lang.String str4 = (java.lang.String) cancelScheduledPaymentMiddleware$cancelPayment$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    cancelRepaymentRequest = cancelRepaymentRequest2;
                    str = str4;
                    invoke = obj;
                }
                either = ((arrow.core.Ior) invoke).toEither();
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.CancelRepaymentResponse cancelRepaymentResponse = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.CancelRepaymentResponse) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus dataInvalidationEventBus = this.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEvent.PaymentDataChanged paymentDataChanged = com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEvent.PaymentDataChanged.INSTANCE;
                    cancelScheduledPaymentMiddleware$cancelPayment$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    cancelScheduledPaymentMiddleware$cancelPayment$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    cancelScheduledPaymentMiddleware$cancelPayment$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier);
                    cancelScheduledPaymentMiddleware$cancelPayment$1.getInputFormats = function1;
                    cancelScheduledPaymentMiddleware$cancelPayment$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cancelRepaymentRequest);
                    cancelScheduledPaymentMiddleware$cancelPayment$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    cancelScheduledPaymentMiddleware$cancelPayment$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cancelRepaymentResponse);
                    cancelScheduledPaymentMiddleware$cancelPayment$1.getHighSpeedVideoFpsRanges = 0;
                    cancelScheduledPaymentMiddleware$cancelPayment$1.getHighSpeedVideoSizes = 0;
                    cancelScheduledPaymentMiddleware$cancelPayment$1.getInputSizeshNQ4ISI = 2;
                    if (dataInvalidationEventBus.emit(paymentDataChanged, cancelScheduledPaymentMiddleware$cancelPayment$1) != coroutine_suspended) {
                        function12 = function1;
                        function12.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnCancelPaymentSuccess.INSTANCE);
                        return kotlin.Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                if (either instanceof arrow.core.Either.Left) {
                    function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnCancelPaymentFailed.INSTANCE);
                    return kotlin.Unit.INSTANCE;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        cancelScheduledPaymentMiddleware$cancelPayment$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.middleware.CancelScheduledPaymentMiddleware$cancelPayment$1(this, continuation);
        java.lang.Object obj2 = cancelScheduledPaymentMiddleware$cancelPayment$1.getOutputSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cancelScheduledPaymentMiddleware$cancelPayment$1.getInputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) invoke).toEither();
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}
