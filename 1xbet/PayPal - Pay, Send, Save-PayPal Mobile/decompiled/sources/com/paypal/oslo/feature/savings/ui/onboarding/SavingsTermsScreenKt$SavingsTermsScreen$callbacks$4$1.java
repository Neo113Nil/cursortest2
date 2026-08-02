package com.paypal.oslo.feature.savings.ui.onboarding;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class SavingsTermsScreenKt$SavingsTermsScreen$callbacks$4$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    public final void getHighSpeedVideoSizes() {
        ((com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel) this.receiver).onFdicRatesClick();
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ kotlin.Unit invoke() {
        getHighSpeedVideoSizes();
        return kotlin.Unit.INSTANCE;
    }

    SavingsTermsScreenKt$SavingsTermsScreen$callbacks$4$1(java.lang.Object obj) {
        super(0, obj, com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsViewModel.class, "onFdicRatesClick", "onFdicRatesClick()V", 0);
    }
}
