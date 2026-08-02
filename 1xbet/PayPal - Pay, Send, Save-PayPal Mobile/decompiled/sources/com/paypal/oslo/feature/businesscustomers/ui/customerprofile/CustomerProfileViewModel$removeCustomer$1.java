package com.paypal.oslo.feature.businesscustomers.ui.customerprofile;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel", f = "CustomerProfileViewModel.kt", i = {0, 1, 1, 1, 1, 1, 1}, l = {138, 141}, m = "removeCustomer", n = {"customer", "customer", "this_$iv", "it$iv", "$i$f$onRight", "$i$a$-also-Either$onRight$1$iv", "$i$a$-onRight-CustomerProfileViewModel$removeCustomer$3"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 142}, s = {"L$0", "L$0", "L$1", "L$3", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes11.dex */
final class CustomerProfileViewModel$removeCustomer$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel.access$removeCustomer(this.getInputFormats, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerProfileViewModel$removeCustomer$1(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel customerProfileViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel$removeCustomer$1> continuation) {
        super(continuation);
        this.getInputFormats = customerProfileViewModel;
    }
}
