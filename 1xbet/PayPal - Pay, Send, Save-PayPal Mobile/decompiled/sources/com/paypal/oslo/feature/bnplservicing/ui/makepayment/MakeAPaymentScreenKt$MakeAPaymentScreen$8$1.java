package com.paypal.oslo.feature.bnplservicing.ui.makepayment;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class MakeAPaymentScreenKt$MakeAPaymentScreen$8$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent makeAPaymentEvent) {
        com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent makeAPaymentEvent2 = makeAPaymentEvent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(makeAPaymentEvent2, "");
        ((com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel) this.receiver).processEvent$bnpl_servicing_prodRelease(makeAPaymentEvent2);
        return kotlin.Unit.INSTANCE;
    }

    MakeAPaymentScreenKt$MakeAPaymentScreen$8$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentViewModel.class, "processEvent", "processEvent$bnpl_servicing_prodRelease(Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent;)V", 0);
    }
}
