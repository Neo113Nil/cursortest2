package com.paypal.oslo.feature.settings.closeaccount.ui.screen;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class CloseYourAccountScreenKt$CloseYourAccountScreen$3$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent closeAccountEvent) {
        com.paypal.oslo.feature.settings.closeaccount.ui.mvi.CloseAccountEvent closeAccountEvent2 = closeAccountEvent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeAccountEvent2, "");
        ((com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel) this.receiver).onIntent$settings_prodRelease(closeAccountEvent2);
        return kotlin.Unit.INSTANCE;
    }

    CloseYourAccountScreenKt$CloseYourAccountScreen$3$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.settings.closeaccount.ui.viewmodel.CloseYourAccountViewModel.class, "onIntent", "onIntent$settings_prodRelease(Lcom/paypal/oslo/feature/settings/closeaccount/ui/mvi/CloseAccountEvent;)V", 0);
    }
}
