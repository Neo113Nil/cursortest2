package com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "navResult", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/navigation/result/PushProvisioningNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt$PushProvisioningWidget$9$1", f = "PushProvisioningWidget.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class PushProvisioningWidgetKt$PushProvisioningWidget$9$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.debitcard.pushprovisioning.navigation.result.PushProvisioningNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningResult, kotlin.Unit> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.debitcard.pushprovisioning.navigation.result.PushProvisioningNavResult pushProvisioningNavResult = (com.paypal.oslo.feature.debitcard.pushprovisioning.navigation.result.PushProvisioningNavResult) this.getHighSpeedVideoFpsRanges;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoSizes.invoke(pushProvisioningNavResult.getResult());
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.debitcard.pushprovisioning.navigation.result.PushProvisioningNavResult pushProvisioningNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt$PushProvisioningWidget$9$1) create(pushProvisioningNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt$PushProvisioningWidget$9$1 pushProvisioningWidgetKt$PushProvisioningWidget$9$1 = new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt$PushProvisioningWidget$9$1(this.getHighSpeedVideoSizes, continuation);
        pushProvisioningWidgetKt$PushProvisioningWidget$9$1.getHighSpeedVideoFpsRanges = obj;
        return pushProvisioningWidgetKt$PushProvisioningWidget$9$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PushProvisioningWidgetKt$PushProvisioningWidget$9$1(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.pushprovisioning.ui.model.PushProvisioningResult, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetKt$PushProvisioningWidget$9$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = function1;
    }
}
