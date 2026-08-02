package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class AccountSummaryScreenKt$AccountSummaryScreen$11$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent accountSummaryEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSummaryEvent, "");
        ((com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryViewModel) this.receiver).processEvent(accountSummaryEvent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryEvent accountSummaryEvent) {
        getHighSpeedVideoFpsRanges(accountSummaryEvent);
        return kotlin.Unit.INSTANCE;
    }

    AccountSummaryScreenKt$AccountSummaryScreen$11$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.viewmodel.AccountSummaryViewModel.class, "processEvent", "processEvent(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/viewmodel/AccountSummaryEvent;)V", 0);
    }
}
