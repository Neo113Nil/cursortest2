package com.paypal.oslo.feature.businesscustomers.ui.customerprofile;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel", f = "CustomerProfileViewModel.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {151, 156}, m = "personalInfo", n = {"$this$personalInfo", "address", "$i$a$-let-CustomerProfileViewModel$personalInfo$billingAddress$1", "$this$personalInfo", "billingAddress", "address", "$i$a$-let-CustomerProfileViewModel$personalInfo$shippingAddress$1"}, nl = {152, 157}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class CustomerProfileViewModel$personalInfo$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel getInputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel.access$personalInfo(this.getInputFormats, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerProfileViewModel$personalInfo$1(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel customerProfileViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel$personalInfo$1> continuation) {
        super(continuation);
        this.getInputFormats = customerProfileViewModel;
    }
}
