package com.paypal.oslo.feature.businesscustomers.ui.customerform;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel", f = "CustomerFormViewModel.kt", i = {0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_CHECK_LOGO_NAVBAR_LIGHT_APPEARANCE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, m = "updateCustomer", n = {"customer", "customer", "this_$iv", "it$iv", "updatedCustomer", "$i$f$onRight", "$i$a$-also-Either$onRight$1$iv", "$i$a$-onRight-CustomerFormViewModel$updateCustomer$2", "customer", "this_$iv", "it$iv", "updatedCustomer", "$i$f$onRight", "$i$a$-also-Either$onRight$1$iv", "$i$a$-onRight-CustomerFormViewModel$updateCustomer$2"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE}, s = {"L$0", "L$0", "L$1", "L$3", "L$4", "I$0", "I$1", "I$2", "L$0", "L$1", "L$3", "L$4", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes11.dex */
final class CustomerFormViewModel$updateCustomer$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getInputSizeshNQ4ISI = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getOutputStallDurationlomOqCM.Camera2StreamConfigurationMap(null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerFormViewModel$updateCustomer$1(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel customerFormViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel$updateCustomer$1> continuation) {
        super(continuation);
        this.getOutputStallDurationlomOqCM = customerFormViewModel;
    }
}
