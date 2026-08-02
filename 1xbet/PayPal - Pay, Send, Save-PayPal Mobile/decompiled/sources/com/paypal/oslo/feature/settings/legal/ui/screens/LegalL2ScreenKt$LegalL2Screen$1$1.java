package com.paypal.oslo.feature.settings.legal.ui.screens;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class LegalL2ScreenKt$LegalL2Screen$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent, kotlin.Unit> {
    public final void getHighSpeedVideoSizes(com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent legalEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legalEvent, "");
        ((com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel) this.receiver).onIntent(legalEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.settings.legal.ui.mvi.LegalEvent legalEvent) {
        getHighSpeedVideoSizes(legalEvent);
        return kotlin.Unit.INSTANCE;
    }

    LegalL2ScreenKt$LegalL2Screen$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.settings.legal.ui.viewmodel.LegalViewModel.class, "onIntent", "onIntent(Lcom/paypal/oslo/feature/settings/legal/ui/mvi/LegalEvent;)V", 0);
    }
}
