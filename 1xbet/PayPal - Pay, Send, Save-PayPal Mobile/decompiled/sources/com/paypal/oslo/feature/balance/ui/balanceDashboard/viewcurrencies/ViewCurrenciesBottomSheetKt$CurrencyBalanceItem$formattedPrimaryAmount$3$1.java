package com.paypal.oslo.feature.balance.ui.balanceDashboard.viewcurrencies;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/ProduceStateScope;", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.balanceDashboard.viewcurrencies.ViewCurrenciesBottomSheetKt$CurrencyBalanceItem$formattedPrimaryAmount$3$1", f = "ViewCurrenciesBottomSheet.kt", i = {0, 0, 0}, l = {226}, m = "invokeSuspend", n = {"$this$produceState", "it", "$i$a$-let-ViewCurrenciesBottomSheetKt$CurrencyBalanceItem$formattedPrimaryAmount$3$1$1"}, nl = {226}, s = {"L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class ViewCurrenciesBottomSheetKt$CurrencyBalanceItem$formattedPrimaryAmount$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.runtime.ProduceStateScope<java.lang.String>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.balance.domain.model.CurrencyBalance getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function2<com.paypal.oslo.feature.balance.domain.model.Money, kotlin.coroutines.Continuation<? super java.lang.String>, java.lang.Object> getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x004c, code lost:
    
        if (r6 == null) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        androidx.compose.runtime.ProduceStateScope produceStateScope = (androidx.compose.runtime.ProduceStateScope) this.getOutputFormats;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.balance.domain.model.Money primaryCurrencyAmount = this.getHighSpeedVideoFpsRanges.getPrimaryCurrencyAmount();
            if (primaryCurrencyAmount != null) {
                kotlin.jvm.functions.Function2<com.paypal.oslo.feature.balance.domain.model.Money, kotlin.coroutines.Continuation<? super java.lang.String>, java.lang.Object> function2 = this.getHighSpeedVideoFpsRangesFor;
                this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(produceStateScope);
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(primaryCurrencyAmount);
                this.getHighSpeedVideoSizes = produceStateScope;
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                this.getInputSizeshNQ4ISI = 1;
                obj = function2.invoke(primaryCurrencyAmount, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            str = "";
            produceStateScope.setValue(str);
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        produceStateScope = (androidx.compose.runtime.ProduceStateScope) this.getHighSpeedVideoSizes;
        kotlin.ResultKt.throwOnFailure(obj);
        str = (java.lang.String) obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.runtime.ProduceStateScope<java.lang.String> produceStateScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.balance.ui.balanceDashboard.viewcurrencies.ViewCurrenciesBottomSheetKt$CurrencyBalanceItem$formattedPrimaryAmount$3$1) create(produceStateScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.balance.ui.balanceDashboard.viewcurrencies.ViewCurrenciesBottomSheetKt$CurrencyBalanceItem$formattedPrimaryAmount$3$1 viewCurrenciesBottomSheetKt$CurrencyBalanceItem$formattedPrimaryAmount$3$1 = new com.paypal.oslo.feature.balance.ui.balanceDashboard.viewcurrencies.ViewCurrenciesBottomSheetKt$CurrencyBalanceItem$formattedPrimaryAmount$3$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
        viewCurrenciesBottomSheetKt$CurrencyBalanceItem$formattedPrimaryAmount$3$1.getOutputFormats = obj;
        return viewCurrenciesBottomSheetKt$CurrencyBalanceItem$formattedPrimaryAmount$3$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ViewCurrenciesBottomSheetKt$CurrencyBalanceItem$formattedPrimaryAmount$3$1(com.paypal.oslo.feature.balance.domain.model.CurrencyBalance currencyBalance, kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.balance.domain.model.Money, ? super kotlin.coroutines.Continuation<? super java.lang.String>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.balanceDashboard.viewcurrencies.ViewCurrenciesBottomSheetKt$CurrencyBalanceItem$formattedPrimaryAmount$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = currencyBalance;
        this.getHighSpeedVideoFpsRangesFor = function2;
    }
}
