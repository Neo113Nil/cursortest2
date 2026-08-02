package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/result/PaymentCanceledNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt$ActivityScreen$1$1", f = "ActivityScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class ActivityScreenKt$ActivityScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.PaymentCanceledNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.PaymentCanceledNavResult paymentCanceledNavResult = (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.PaymentCanceledNavResult) this.getHighSpeedVideoSizes;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (paymentCanceledNavResult.getResultKey() == com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ResultKey.PAYMENT_CANCELED) {
            this.getHighSpeedVideoFpsRanges.process(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityEvent.OnPaymentCanceled.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.PaymentCanceledNavResult paymentCanceledNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt$ActivityScreen$1$1) create(paymentCanceledNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt$ActivityScreen$1$1 activityScreenKt$ActivityScreen$1$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt$ActivityScreen$1$1(this.getHighSpeedVideoFpsRanges, continuation);
        activityScreenKt$ActivityScreen$1$1.getHighSpeedVideoSizes = obj;
        return activityScreenKt$ActivityScreen$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityScreenKt$ActivityScreen$1$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.viewmodel.ActivityViewModel activityViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.ActivityScreenKt$ActivityScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = activityViewModel;
    }
}
