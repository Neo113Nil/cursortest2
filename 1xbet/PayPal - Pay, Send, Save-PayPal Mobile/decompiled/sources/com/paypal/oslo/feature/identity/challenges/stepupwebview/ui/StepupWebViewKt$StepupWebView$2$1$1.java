package com.paypal.oslo.feature.identity.challenges.stepupwebview.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class StepupWebViewKt$StepupWebView$2$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEvent, kotlin.Unit> {
    public final void getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEvent stepupWebViewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepupWebViewEvent, "");
        ((com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewViewModel) this.receiver).processEvent(stepupWebViewEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.mvi.StepupWebViewEvent stepupWebViewEvent) {
        getHighResolutionOutputSizeshNQ4ISI(stepupWebViewEvent);
        return kotlin.Unit.INSTANCE;
    }

    StepupWebViewKt$StepupWebView$2$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.StepupWebViewViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/mvi/StepupWebViewEvent;)V", 0);
    }
}
