package com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class StepupCreditCardScreenKt$StepupCreditCardScreen$5$5$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditCard, "");
        ((com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardViewModel) this.receiver).onCardSelected(creditCard);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.identity.shared.domain.model.challenge.CreditCard creditCard) {
        getHighSpeedVideoFpsRangesFor(creditCard);
        return kotlin.Unit.INSTANCE;
    }

    StepupCreditCardScreenKt$StepupCreditCardScreen$5$5$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.identity.challenges.stepupcreditcard.ui.StepupCreditCardViewModel.class, "onCardSelected", "onCardSelected(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/CreditCard;)V", 0);
    }
}
