package com.paypal.oslo.feature.savings.ui.home;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class SavingsHomeScreenKt$SavingsHomeScreen$6$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent savingsHomeIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsHomeIntent, "");
        ((com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel) this.receiver).processIntent(savingsHomeIntent);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent savingsHomeIntent) {
        getHighSpeedVideoFpsRanges(savingsHomeIntent);
        return kotlin.Unit.INSTANCE;
    }

    SavingsHomeScreenKt$SavingsHomeScreen$6$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel.class, "processIntent", "processIntent(Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeIntent;)V", 0);
    }
}
