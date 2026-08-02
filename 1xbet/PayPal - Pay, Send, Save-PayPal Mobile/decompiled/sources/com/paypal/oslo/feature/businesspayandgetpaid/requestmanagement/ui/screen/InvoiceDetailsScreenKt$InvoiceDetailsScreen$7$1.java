package com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.screen;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class InvoiceDetailsScreenKt$InvoiceDetailsScreen$7$1 extends kotlin.jvm.internal.AdaptedFunctionReference implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction.InvoiceAction, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction.InvoiceAction invoiceAction) {
        com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.invoiceaction.InvoiceAction invoiceAction2 = invoiceAction;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceAction2, "");
        ((com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel) this.receiver).onInvoiceAction(invoiceAction2);
        return kotlin.Unit.INSTANCE;
    }

    InvoiceDetailsScreenKt$InvoiceDetailsScreen$7$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.ui.viewmodel.InvoiceDetailsViewModel.class, "onInvoiceAction", "onInvoiceAction(Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/ui/invoiceaction/InvoiceAction;)Lkotlinx/coroutines/Job;", 8);
    }
}
