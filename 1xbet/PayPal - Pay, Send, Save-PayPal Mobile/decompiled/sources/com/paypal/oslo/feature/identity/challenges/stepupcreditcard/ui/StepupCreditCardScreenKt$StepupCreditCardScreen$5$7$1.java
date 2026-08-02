package com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class StepupCreditCardScreenKt$StepupCreditCardScreen$5$7$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optionType, "");
        ((com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardViewModel) this.receiver).onMoreOptionSelected(optionType);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType) {
        getHighSpeedVideoFpsRangesFor(optionType);
        return kotlin.Unit.INSTANCE;
    }

    StepupCreditCardScreenKt$StepupCreditCardScreen$5$7$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardViewModel.class, "onMoreOptionSelected", "onMoreOptionSelected(Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;)V", 0);
    }
}
