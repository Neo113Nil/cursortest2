package com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class ContactlessPaymentsOperationKt$ContactlessPaymentsOperation$5$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent, kotlin.Unit> {
    public final void getHighSpeedVideoSizes(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent contactlessPaymentsOperationEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactlessPaymentsOperationEvent, "");
        ((com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationViewModel) this.receiver).processEvent(contactlessPaymentsOperationEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent contactlessPaymentsOperationEvent) {
        getHighSpeedVideoSizes(contactlessPaymentsOperationEvent);
        return kotlin.Unit.INSTANCE;
    }

    ContactlessPaymentsOperationKt$ContactlessPaymentsOperation$5$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsOperationViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/core/mvi/Event;)V", 0);
    }
}
