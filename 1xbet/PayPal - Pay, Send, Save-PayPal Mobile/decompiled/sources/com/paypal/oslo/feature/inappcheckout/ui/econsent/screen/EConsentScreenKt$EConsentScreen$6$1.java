package com.paypal.oslo.feature.inappcheckout.ui.econsent.screen;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class EConsentScreenKt$EConsentScreen$6$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event, kotlin.Unit> {
    public final void getHighSpeedVideoSizes(com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        ((com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel) this.receiver).onEvent(event);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event event) {
        getHighSpeedVideoSizes(event);
        return kotlin.Unit.INSTANCE;
    }

    EConsentScreenKt$EConsentScreen$6$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.inappcheckout.ui.econsent.viewmodel.EConsentViewModel.class, "onEvent", "onEvent(Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Event;)V", 0);
    }
}
