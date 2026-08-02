package com.paypal.oslo.feature.businesscustomers.ui.customerform;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel", f = "CustomerFormViewModel.kt", i = {0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE, 269}, m = "createCustomer", n = {"customer", "customer", "this_$iv", "it$iv", "newCustomer", "$i$f$onRight", "$i$a$-also-Either$onRight$1$iv", "$i$a$-onRight-CustomerFormViewModel$createCustomer$2", "customer", "this_$iv", "it$iv", "newCustomer", "$i$f$onRight", "$i$a$-also-Either$onRight$1$iv", "$i$a$-onRight-CustomerFormViewModel$createCustomer$2"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE, 269, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE}, s = {"L$0", "L$0", "L$1", "L$3", "L$4", "I$0", "I$1", "I$2", "L$0", "L$1", "L$3", "L$4", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes11.dex */
final class CustomerFormViewModel$createCustomer$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getOutputFormats = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getOutputStallDurationlomOqCM.getHighSpeedVideoFpsRanges(null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerFormViewModel$createCustomer$1(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel customerFormViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel$createCustomer$1> continuation) {
        super(continuation);
        this.getOutputStallDurationlomOqCM = customerFormViewModel;
    }
}
