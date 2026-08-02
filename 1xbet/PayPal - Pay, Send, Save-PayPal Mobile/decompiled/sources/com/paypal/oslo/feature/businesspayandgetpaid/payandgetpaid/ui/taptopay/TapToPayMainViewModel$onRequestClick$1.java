package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayMainViewModel$onRequestClick$1", f = "TapToPayMainViewModel.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {84, 94}, m = "invokeSuspend", n = {"userState", "currencyCode", "countryCode", "allItems", "userState", "currencyCode", "countryCode", "allItems", "taxSettings", "tapToPayRequest"}, nl = {86, 97}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
/* loaded from: classes11.dex */
final class TapToPayMainViewModel$onRequestClick$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayMainViewModel getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x011f, code lost:
    
        if (r7.emit(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayMainUiEffect.NavigateToPaymentSummary(r6), r13) == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.core.userstore.UserStore userStore;
        com.paypal.oslo.core.userstore.model.UserState value;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> list;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetTaxSettingsUseCase getTaxSettingsUseCase;
        java.lang.String str;
        java.lang.String str2;
        java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> list2;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            mutableStateFlow.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
            userStore = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            value = userStore.getUserState().getValue();
            if (value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
                com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded = (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value;
                kotlin.Pair pair = new kotlin.Pair(profileLoaded.getUser().getAccountCurrencyCode(), profileLoaded.getUser().getAccountCountryCode());
                java.lang.String str3 = (java.lang.String) pair.component1();
                java.lang.String str4 = (java.lang.String) pair.component2();
                com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem = this.getHighSpeedVideoFpsRangesFor;
                if (lineItem != null && lineItem.getUnitPrice().compareTo(new com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney(0L, this.getHighSpeedVideoFpsRangesFor.getUnitPrice().getCurrencyCode())) > 0) {
                    list = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem>) this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
                } else {
                    list = this.getHighResolutionOutputSizeshNQ4ISI;
                }
                getTaxSettingsUseCase = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(value);
                this.getHighSpeedVideoFpsRanges = str3;
                this.getHighSpeedVideoSizes = str4;
                this.getInputFormats = list;
                this.getHighSpeedVideoSizesFor = 1;
                java.lang.Object invoke = getTaxSettingsUseCase.invoke(this);
                if (invoke != coroutine_suspended) {
                    java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> list3 = list;
                    str = str3;
                    obj = invoke;
                    str2 = str4;
                    list2 = list3;
                }
                return coroutine_suspended;
            }
            if (!(value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileError)) {
                mutableStateFlow2 = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                mutableStateFlow2.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                return kotlin.Unit.INSTANCE;
            }
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.businesspayandgetpaid.LoggerKt.log;
            java.lang.String message = ((com.paypal.oslo.core.userstore.model.UserState.ProfileError) value).getCause().getMessage();
            if (message == null) {
                message = "Unknown";
            }
            com.paypal.android.logger.Logger.d$default(logger, "Failed to load user profile", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", message)), null, 4, null);
            mutableStateFlow3 = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            mutableStateFlow3.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        list2 = (java.util.List) this.getInputFormats;
        str2 = (java.lang.String) this.getHighSpeedVideoSizes;
        str = (java.lang.String) this.getHighSpeedVideoFpsRanges;
        value = (com.paypal.oslo.core.userstore.model.UserState) this.Camera2StreamConfigurationMap;
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings taxSettings = (com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TaxSettings) obj;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayRequest tapToPayRequest = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayRequest(str, list2, taxSettings, str2);
        mutableSharedFlow = this.getInputSizeshNQ4ISI.getHighSpeedVideoSizes;
        this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(value);
        this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
        this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
        this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
        this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(taxSettings);
        this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tapToPayRequest);
        this.getHighSpeedVideoSizesFor = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayMainViewModel$onRequestClick$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayMainViewModel$onRequestClick$1(this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapToPayMainViewModel$onRequestClick$1(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayMainViewModel tapToPayMainViewModel, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem, java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> list, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.taptopay.TapToPayMainViewModel$onRequestClick$1> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = tapToPayMainViewModel;
        this.getHighSpeedVideoFpsRangesFor = lineItem;
        this.getHighResolutionOutputSizeshNQ4ISI = list;
    }
}
