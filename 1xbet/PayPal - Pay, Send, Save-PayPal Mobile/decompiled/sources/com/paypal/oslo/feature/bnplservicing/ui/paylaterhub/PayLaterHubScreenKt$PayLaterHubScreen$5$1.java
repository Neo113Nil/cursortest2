package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class PayLaterHubScreenKt$PayLaterHubScreen$5$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent payLaterHubEvent) {
        com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubEvent payLaterHubEvent2 = payLaterHubEvent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payLaterHubEvent2, "");
        ((com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel) this.receiver).processEvent$bnpl_servicing_prodRelease(payLaterHubEvent2);
        return kotlin.Unit.INSTANCE;
    }

    PayLaterHubScreenKt$PayLaterHubScreen$5$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.PayLaterHubViewModel.class, "processEvent", "processEvent$bnpl_servicing_prodRelease(Lcom/paypal/oslo/feature/bnplservicing/ui/paylaterhub/PayLaterHubEvent;)V", 0);
    }
}
