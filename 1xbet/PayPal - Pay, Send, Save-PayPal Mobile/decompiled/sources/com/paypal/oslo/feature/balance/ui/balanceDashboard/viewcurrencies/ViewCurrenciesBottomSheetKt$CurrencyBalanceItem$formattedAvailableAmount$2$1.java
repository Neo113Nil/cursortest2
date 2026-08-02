package com.paypal.oslo.feature.balance.ui.balanceDashboard.viewcurrencies;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/ProduceStateScope;", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.balanceDashboard.viewcurrencies.ViewCurrenciesBottomSheetKt$CurrencyBalanceItem$formattedAvailableAmount$2$1", f = "ViewCurrenciesBottomSheet.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE}, m = "invokeSuspend", n = {"$this$produceState"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class ViewCurrenciesBottomSheetKt$CurrencyBalanceItem$formattedAvailableAmount$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.runtime.ProduceStateScope<java.lang.String>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function2<com.paypal.oslo.feature.balance.domain.model.Money, kotlin.coroutines.Continuation<? super java.lang.String>, java.lang.Object> getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.balance.domain.model.CurrencyBalance getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.runtime.ProduceStateScope produceStateScope = (androidx.compose.runtime.ProduceStateScope) this.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.functions.Function2<com.paypal.oslo.feature.balance.domain.model.Money, kotlin.coroutines.Continuation<? super java.lang.String>, java.lang.Object> function2 = this.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.balance.domain.model.Money availableAmount = this.getHighSpeedVideoSizes.getAvailableAmount();
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(produceStateScope);
            this.getHighResolutionOutputSizeshNQ4ISI = produceStateScope;
            this.Camera2StreamConfigurationMap = 1;
            obj = function2.invoke(availableAmount, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            produceStateScope = (androidx.compose.runtime.ProduceStateScope) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        produceStateScope.setValue(obj);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.runtime.ProduceStateScope<java.lang.String> produceStateScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.balance.ui.balanceDashboard.viewcurrencies.ViewCurrenciesBottomSheetKt$CurrencyBalanceItem$formattedAvailableAmount$2$1) create(produceStateScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.balance.ui.balanceDashboard.viewcurrencies.ViewCurrenciesBottomSheetKt$CurrencyBalanceItem$formattedAvailableAmount$2$1 viewCurrenciesBottomSheetKt$CurrencyBalanceItem$formattedAvailableAmount$2$1 = new com.paypal.oslo.feature.balance.ui.balanceDashboard.viewcurrencies.ViewCurrenciesBottomSheetKt$CurrencyBalanceItem$formattedAvailableAmount$2$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
        viewCurrenciesBottomSheetKt$CurrencyBalanceItem$formattedAvailableAmount$2$1.getHighSpeedVideoFpsRangesFor = obj;
        return viewCurrenciesBottomSheetKt$CurrencyBalanceItem$formattedAvailableAmount$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ViewCurrenciesBottomSheetKt$CurrencyBalanceItem$formattedAvailableAmount$2$1(kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.balance.domain.model.Money, ? super kotlin.coroutines.Continuation<? super java.lang.String>, ? extends java.lang.Object> function2, com.paypal.oslo.feature.balance.domain.model.CurrencyBalance currencyBalance, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.balanceDashboard.viewcurrencies.ViewCurrenciesBottomSheetKt$CurrencyBalanceItem$formattedAvailableAmount$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = function2;
        this.getHighSpeedVideoSizes = currencyBalance;
    }
}
