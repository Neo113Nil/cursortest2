package com.paypal.oslo.feature.balance.ui.onholddetails;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "money", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "<unused var>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.onholddetails.MultipleHoldsBottomSheetKt$MultipleHoldsBottomSheetPreview$1$1$1", f = "MultipleHoldsBottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class MultipleHoldsBottomSheetKt$MultipleHoldsBottomSheetPreview$1$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<com.paypal.oslo.feature.balance.domain.model.Money, java.lang.Integer, kotlin.coroutines.Continuation<? super java.lang.String>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.balance.domain.model.Money money = (com.paypal.oslo.feature.balance.domain.model.Money) this.Camera2StreamConfigurationMap;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD.concat(java.lang.String.valueOf(money.getAmount()));
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.balance.domain.model.Money money, java.lang.Integer num, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.balance.ui.onholddetails.MultipleHoldsBottomSheetKt$MultipleHoldsBottomSheetPreview$1$1$1 multipleHoldsBottomSheetKt$MultipleHoldsBottomSheetPreview$1$1$1 = new com.paypal.oslo.feature.balance.ui.onholddetails.MultipleHoldsBottomSheetKt$MultipleHoldsBottomSheetPreview$1$1$1(continuation);
        multipleHoldsBottomSheetKt$MultipleHoldsBottomSheetPreview$1$1$1.Camera2StreamConfigurationMap = money;
        return multipleHoldsBottomSheetKt$MultipleHoldsBottomSheetPreview$1$1$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    MultipleHoldsBottomSheetKt$MultipleHoldsBottomSheetPreview$1$1$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.onholddetails.MultipleHoldsBottomSheetKt$MultipleHoldsBottomSheetPreview$1$1$1> continuation) {
        super(3, continuation);
    }
}
