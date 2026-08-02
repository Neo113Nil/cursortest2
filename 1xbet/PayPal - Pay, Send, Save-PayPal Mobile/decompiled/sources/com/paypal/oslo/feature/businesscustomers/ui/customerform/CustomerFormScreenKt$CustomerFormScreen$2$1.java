package com.paypal.oslo.feature.businesscustomers.ui.customerform;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class CustomerFormScreenKt$CustomerFormScreen$2$1 extends kotlin.jvm.internal.AdaptedFunctionReference implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent customerFormEvent) {
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormEvent customerFormEvent2 = customerFormEvent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerFormEvent2, "");
        ((com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel) this.receiver).handleEvent$business_customers_prodRelease(customerFormEvent2);
        return kotlin.Unit.INSTANCE;
    }

    CustomerFormScreenKt$CustomerFormScreen$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.class, "handleEvent", "handleEvent$business_customers_prodRelease(Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormEvent;)Lkotlinx/coroutines/Job;", 8);
    }
}
