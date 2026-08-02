package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ,\u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ>\u0010\u0016\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailSideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/SideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/CancelRepaymentUseCase;", "cancelRepaymentUseCase", "Lcom/paypal/oslo/feature/revolvingcreditservicing/event/DataInvalidationEventBus;", "dataInvalidationEventBus", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/CancelRepaymentUseCase;Lcom/paypal/oslo/feature/revolvingcreditservicing/event/DataInvalidationEventBus;)V", "state", "Lkotlin/Function1;", "", "eventDispatcher", "onState", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "", "p1", "p2", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "p3", "getHighSpeedVideoFpsRangesFor", "(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/CancelRepaymentUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/revolvingcreditservicing/event/DataInvalidationEventBus;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ActivityDetailSideEffectMiddleware extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CancelRepaymentUseCase getHighSpeedVideoFpsRangesFor;

    public ActivityDetailSideEffectMiddleware(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CancelRepaymentUseCase cancelRepaymentUseCase, com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus dataInvalidationEventBus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelRepaymentUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataInvalidationEventBus, "");
        this.getHighSpeedVideoFpsRangesFor = cancelRepaymentUseCase;
        this.getHighSpeedVideoFpsRanges = dataInvalidationEventBus;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object onState(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState activityDetailState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return onState2(activityDetailState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: onState, reason: avoid collision after fix types in other method */
    public final java.lang.Object onState2(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState activityDetailState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ActivityDetailDestinationArgs args;
        if (activityDetailState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.CancelingPayment) {
            args = ((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.CancelingPayment) activityDetailState).getArgs();
        } else {
            if (!(activityDetailState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.RetryCancelingPayment)) {
                return kotlin.Unit.INSTANCE;
            }
            args = ((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailState.RetryCancelingPayment) activityDetailState).getArgs();
        }
        java.lang.Object highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(function1, args.getTransaction().getGetHighResolutionOutputSizeshNQ4ISI(), args.getCreditAccountId(), args.getCreditProductIdentifier(), continuation);
        return highSpeedVideoFpsRangesFor == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRangesFor : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00f5, code lost:
    
        if (r5.emit(r6, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0118, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
    
        if (r2 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent, kotlin.Unit> function1, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailSideEffectMiddleware$cancelPayment$1 activityDetailSideEffectMiddleware$cancelPayment$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.request.CancelRepaymentRequest cancelRepaymentRequest;
        java.lang.Object invoke;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailSideEffectMiddleware$cancelPayment$1) {
            activityDetailSideEffectMiddleware$cancelPayment$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailSideEffectMiddleware$cancelPayment$1) continuation;
            if ((activityDetailSideEffectMiddleware$cancelPayment$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                activityDetailSideEffectMiddleware$cancelPayment$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = activityDetailSideEffectMiddleware$cancelPayment$1.getOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = activityDetailSideEffectMiddleware$cancelPayment$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String str3 = str2;
                    if (str3 == null || kotlin.text.StringsKt.isBlank(str3)) {
                        return kotlin.Unit.INSTANCE;
                    }
                    cancelRepaymentRequest = new com.paypal.oslo.feature.revolvingcreditservicing.domain.request.CancelRepaymentRequest(str2, str, creditProductIdentifier);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CancelRepaymentUseCase cancelRepaymentUseCase = this.getHighSpeedVideoFpsRangesFor;
                    activityDetailSideEffectMiddleware$cancelPayment$1.getHighSpeedVideoFpsRanges = function1;
                    activityDetailSideEffectMiddleware$cancelPayment$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    activityDetailSideEffectMiddleware$cancelPayment$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    activityDetailSideEffectMiddleware$cancelPayment$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier);
                    activityDetailSideEffectMiddleware$cancelPayment$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cancelRepaymentRequest);
                    activityDetailSideEffectMiddleware$cancelPayment$1.getOutputFormats = 1;
                    invoke = cancelRepaymentUseCase.invoke(cancelRepaymentRequest, activityDetailSideEffectMiddleware$cancelPayment$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = activityDetailSideEffectMiddleware$cancelPayment$1.getHighSpeedVideoSizes;
                        int i3 = activityDetailSideEffectMiddleware$cancelPayment$1.getHighSpeedVideoFpsRangesFor;
                        function1 = (kotlin.jvm.functions.Function1) activityDetailSideEffectMiddleware$cancelPayment$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent.OnPaymentCanceled.INSTANCE);
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.request.CancelRepaymentRequest cancelRepaymentRequest2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.request.CancelRepaymentRequest) activityDetailSideEffectMiddleware$cancelPayment$1.getOutputMinFrameDuration;
                    creditProductIdentifier = (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) activityDetailSideEffectMiddleware$cancelPayment$1.getInputSizeshNQ4ISI;
                    str2 = (java.lang.String) activityDetailSideEffectMiddleware$cancelPayment$1.getHighResolutionOutputSizeshNQ4ISI;
                    str = (java.lang.String) activityDetailSideEffectMiddleware$cancelPayment$1.Camera2StreamConfigurationMap;
                    kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent, kotlin.Unit> function12 = (kotlin.jvm.functions.Function1) activityDetailSideEffectMiddleware$cancelPayment$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    cancelRepaymentRequest = cancelRepaymentRequest2;
                    function1 = function12;
                    invoke = obj;
                }
                either = ((arrow.core.Ior) invoke).toEither();
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.CancelRepaymentResponse cancelRepaymentResponse = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.CancelRepaymentResponse) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEventBus dataInvalidationEventBus = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEvent.PaymentDataChanged paymentDataChanged = com.paypal.oslo.feature.revolvingcreditservicing.event.DataInvalidationEvent.PaymentDataChanged.INSTANCE;
                    activityDetailSideEffectMiddleware$cancelPayment$1.getHighSpeedVideoFpsRanges = function1;
                    activityDetailSideEffectMiddleware$cancelPayment$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    activityDetailSideEffectMiddleware$cancelPayment$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    activityDetailSideEffectMiddleware$cancelPayment$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier);
                    activityDetailSideEffectMiddleware$cancelPayment$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cancelRepaymentRequest);
                    activityDetailSideEffectMiddleware$cancelPayment$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    activityDetailSideEffectMiddleware$cancelPayment$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cancelRepaymentResponse);
                    activityDetailSideEffectMiddleware$cancelPayment$1.getHighSpeedVideoFpsRangesFor = 0;
                    activityDetailSideEffectMiddleware$cancelPayment$1.getHighSpeedVideoSizes = 0;
                    activityDetailSideEffectMiddleware$cancelPayment$1.getOutputFormats = 2;
                } else {
                    if (either instanceof arrow.core.Either.Left) {
                        function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailEvent.OnCancelPaymentFailed.INSTANCE);
                        return kotlin.Unit.INSTANCE;
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
        }
        activityDetailSideEffectMiddleware$cancelPayment$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailSideEffectMiddleware$cancelPayment$1(this, continuation);
        java.lang.Object obj2 = activityDetailSideEffectMiddleware$cancelPayment$1.getOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = activityDetailSideEffectMiddleware$cancelPayment$1.getOutputFormats;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) invoke).toEither();
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }
}
