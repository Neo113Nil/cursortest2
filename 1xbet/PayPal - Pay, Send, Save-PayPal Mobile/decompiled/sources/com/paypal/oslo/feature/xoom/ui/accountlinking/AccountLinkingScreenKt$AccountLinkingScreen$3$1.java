package com.paypal.oslo.feature.xoom.ui.accountlinking;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class AccountLinkingScreenKt$AccountLinkingScreen$3$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent accountLinkingEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountLinkingEvent, "");
        ((com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingViewModel) this.receiver).processEvent(accountLinkingEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingEvent accountLinkingEvent) {
        getHighSpeedVideoFpsRangesFor(accountLinkingEvent);
        return kotlin.Unit.INSTANCE;
    }

    AccountLinkingScreenKt$AccountLinkingScreen$3$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingEvent;)V", 0);
    }
}
