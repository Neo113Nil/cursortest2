package com.paypal.oslo.feature.businesscustomers.ui.emailmodal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class AddEmailScreenKt$AddEmailScreen$3$1 extends kotlin.jvm.internal.AdaptedFunctionReference implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalEvent, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalEvent addEmailModalEvent) {
        com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalEvent addEmailModalEvent2 = addEmailModalEvent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addEmailModalEvent2, "");
        ((com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel) this.receiver).handleEvent$business_customers_prodRelease(addEmailModalEvent2);
        return kotlin.Unit.INSTANCE;
    }

    AddEmailScreenKt$AddEmailScreen$3$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel.class, "handleEvent", "handleEvent$business_customers_prodRelease(Lcom/paypal/oslo/feature/businesscustomers/ui/emailmodal/AddEmailModalEvent;)Lkotlinx/coroutines/Job;", 8);
    }
}
