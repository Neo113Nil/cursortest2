package com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$enrichWithCurrencyNames$2$codeToName$1$1", f = "CurrencyPickerViewModel.kt", i = {0, 0}, l = {352}, m = "invokeSuspend", n = {"$this$async", "safeCode"}, nl = {354}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes13.dex */
final class CurrencyPickerViewModel$enrichWithCurrencyNames$2$codeToName$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m23436constructorimpl;
        com.paypal.oslo.core.i18n.domain.usecase.GetCurrencyDetailsUseCase getCurrencyDetailsUseCase;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11383boximpl(com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(str)));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel currencyPickerViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
            if (kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl) == null) {
                java.lang.String m11389unboximpl = ((com.paypal.oslo.core.i18n.domain.model.CurrencyCode) m23436constructorimpl).m11389unboximpl();
                getCurrencyDetailsUseCase = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(m11389unboximpl);
                this.Camera2StreamConfigurationMap = 1;
                obj = getCurrencyDetailsUseCase.invoke(new com.paypal.oslo.core.i18n.domain.model.CurrencyConfiguration(m11389unboximpl, null, 0, null, null, 30, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, "Invalid currency code, skipping enrichment", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("currencyCode", str2)), null, 4, null);
                return kotlin.TuplesKt.to(str2, str2);
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel currencyPickerViewModel2 = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String str3 = this.getHighSpeedVideoFpsRangesFor;
        if (either instanceof arrow.core.Either.Right) {
            str3 = ((com.paypal.oslo.core.i18n.domain.model.CurrencyInfo) ((arrow.core.Either.Right) either).getValue()).getCurrencyName();
        } else {
            if (!(either instanceof arrow.core.Either.Left)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, "Failed to resolve currency name", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("currencyCode", str3)), null, 4, null);
        }
        return kotlin.TuplesKt.to(this.getHighSpeedVideoFpsRangesFor, str3);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>> continuation) {
        return ((com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$enrichWithCurrencyNames$2$codeToName$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$enrichWithCurrencyNames$2$codeToName$1$1 currencyPickerViewModel$enrichWithCurrencyNames$2$codeToName$1$1 = new com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$enrichWithCurrencyNames$2$codeToName$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
        currencyPickerViewModel$enrichWithCurrencyNames$2$codeToName$1$1.getHighSpeedVideoFpsRanges = obj;
        return currencyPickerViewModel$enrichWithCurrencyNames$2$codeToName$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurrencyPickerViewModel$enrichWithCurrencyNames$2$codeToName$1$1(com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel currencyPickerViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.currencypicker.viewmodel.CurrencyPickerViewModel$enrichWithCurrencyNames$2$codeToName$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = currencyPickerViewModel;
        this.getHighSpeedVideoFpsRangesFor = str;
    }
}
