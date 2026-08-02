package com.paypal.oslo.feature.savings.ui.common;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/savings/navigation/result/MoneyManagementSuccessNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.common.MoneyManagementResultHandlerKt$MoneyManagementResultHandler$1$1", f = "MoneyManagementResultHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class MoneyManagementResultHandlerKt$MoneyManagementResultHandler$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ kotlin.jvm.functions.Function2<com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult, java.lang.String, kotlin.Unit> getHighSpeedVideoSizesFor;
    final /* synthetic */ java.lang.String getInputFormats;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult moneyManagementSuccessNavResult = (com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult) this.getOutputMinFrameDuration;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getInputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoSizesFor.invoke(moneyManagementSuccessNavResult, com.paypal.oslo.feature.savings.ui.common.MoneyManagementResultHandlerKt.formatToastMessage(com.paypal.oslo.feature.savings.ui.common.MoneyManagementResultHandlerKt.buildToastMessageData(moneyManagementSuccessNavResult, this.getInputFormats), this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getOutputFormats, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult moneyManagementSuccessNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.savings.ui.common.MoneyManagementResultHandlerKt$MoneyManagementResultHandler$1$1) create(moneyManagementSuccessNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.savings.ui.common.MoneyManagementResultHandlerKt$MoneyManagementResultHandler$1$1 moneyManagementResultHandlerKt$MoneyManagementResultHandler$1$1 = new com.paypal.oslo.feature.savings.ui.common.MoneyManagementResultHandlerKt$MoneyManagementResultHandler$1$1(this.getInputFormats, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getOutputFormats, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoSizesFor, continuation);
        moneyManagementResultHandlerKt$MoneyManagementResultHandler$1$1.getOutputMinFrameDuration = obj;
        return moneyManagementResultHandlerKt$MoneyManagementResultHandler$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MoneyManagementResultHandlerKt$MoneyManagementResultHandler$1$1(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult, ? super java.lang.String, kotlin.Unit> function2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.common.MoneyManagementResultHandlerKt$MoneyManagementResultHandler$1$1> continuation) {
        super(2, continuation);
        this.getInputFormats = str;
        this.Camera2StreamConfigurationMap = str2;
        this.getHighSpeedVideoFpsRangesFor = str3;
        this.getOutputFormats = str4;
        this.getHighSpeedVideoFpsRanges = str5;
        this.getHighResolutionOutputSizeshNQ4ISI = str6;
        this.getHighSpeedVideoSizes = str7;
        this.getHighSpeedVideoSizesFor = function2;
    }
}
