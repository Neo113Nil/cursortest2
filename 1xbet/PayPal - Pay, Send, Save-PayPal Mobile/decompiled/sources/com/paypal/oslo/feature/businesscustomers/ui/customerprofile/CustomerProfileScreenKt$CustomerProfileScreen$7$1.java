package com.paypal.oslo.feature.businesscustomers.ui.customerprofile;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class CustomerProfileScreenKt$CustomerProfileScreen$7$1 extends kotlin.jvm.internal.AdaptedFunctionReference implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent customerProfileEvent) {
        com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileEvent customerProfileEvent2 = customerProfileEvent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerProfileEvent2, "");
        ((com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel) this.receiver).handleEvent$business_customers_prodRelease(customerProfileEvent2);
        return kotlin.Unit.INSTANCE;
    }

    CustomerProfileScreenKt$CustomerProfileScreen$7$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel.class, "handleEvent", "handleEvent$business_customers_prodRelease(Lcom/paypal/oslo/feature/businesscustomers/ui/customerprofile/CustomerProfileEvent;)Lkotlinx/coroutines/Job;", 8);
    }
}
