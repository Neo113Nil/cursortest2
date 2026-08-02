package com.paypal.oslo.feature.identity.rememberedlogin.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class RememberedLoginScreenKt$RememberedLoginScreen$5$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent rememberedLoginEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rememberedLoginEvent, "");
        ((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel) this.receiver).processEvent(rememberedLoginEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent rememberedLoginEvent) {
        getHighSpeedVideoFpsRangesFor(rememberedLoginEvent);
        return kotlin.Unit.INSTANCE;
    }

    RememberedLoginScreenKt$RememberedLoginScreen$5$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/RememberedLoginEvent;)V", 0);
    }
}
