package com.paypal.oslo.feature.debitcard.shared.ui.webview;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class DebitCardWebViewScreenKt$DebitCardWebViewScreen$2$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent debitCardWebViewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardWebViewEvent, "");
        ((com.paypal.oslo.feature.debitcard.shared.ui.webview.viewmodel.DebitCardWebViewModel) this.receiver).processEvent(debitCardWebViewEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.debitcard.shared.ui.webview.mvi.DebitCardWebViewEvent debitCardWebViewEvent) {
        getHighResolutionOutputSizeshNQ4ISI(debitCardWebViewEvent);
        return kotlin.Unit.INSTANCE;
    }

    DebitCardWebViewScreenKt$DebitCardWebViewScreen$2$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.debitcard.shared.ui.webview.viewmodel.DebitCardWebViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/core/mvi/Event;)V", 0);
    }
}
