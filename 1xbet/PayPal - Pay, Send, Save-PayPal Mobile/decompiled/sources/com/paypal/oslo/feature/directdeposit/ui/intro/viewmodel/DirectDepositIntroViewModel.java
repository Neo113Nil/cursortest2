package com.paypal.oslo.feature.directdeposit.ui.intro.viewmodel;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0006J\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/intro/viewmodel/DirectDepositIntroViewModel;", "Lcom/paypal/oslo/feature/directdeposit/ui/common/MviViewModel;", "Lcom/paypal/oslo/feature/directdeposit/ui/intro/intent/IntroIntent;", "Lcom/paypal/oslo/feature/directdeposit/ui/intro/viewmodel/DirectDepositIntroUiState;", "Lcom/paypal/oslo/feature/directdeposit/ui/intro/effect/IntroEffect;", "<init>", "()V", "intent", "", "processIntent", "(Lcom/paypal/oslo/feature/directdeposit/ui/intro/intent/IntroIntent;)V", "onGetStartedClick", "onBackClick"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DirectDepositIntroViewModel extends com.paypal.oslo.feature.directdeposit.ui.common.MviViewModel<com.paypal.oslo.feature.directdeposit.ui.intro.intent.IntroIntent, com.paypal.oslo.feature.directdeposit.ui.intro.viewmodel.DirectDepositIntroUiState, com.paypal.oslo.feature.directdeposit.ui.intro.effect.IntroEffect> {
    public static final int $stable = 8;

    @javax.inject.Inject
    public DirectDepositIntroViewModel() {
        super(new com.paypal.oslo.feature.directdeposit.ui.intro.viewmodel.DirectDepositIntroUiState(false, null, 3, null));
    }

    @Override // com.paypal.oslo.feature.directdeposit.ui.common.MviViewModel
    public final void processIntent(com.paypal.oslo.feature.directdeposit.ui.intro.intent.IntroIntent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        if (!(intent instanceof com.paypal.oslo.feature.directdeposit.ui.intro.intent.IntroIntent.NavigateNext)) {
            if (!(intent instanceof com.paypal.oslo.feature.directdeposit.ui.intro.intent.IntroIntent.BackClicked)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            emitEffect(com.paypal.oslo.feature.directdeposit.ui.intro.effect.IntroEffect.NavigateBack.INSTANCE);
        } else {
            emitEffect(new com.paypal.oslo.feature.directdeposit.ui.intro.effect.IntroEffect.ShowToast("Setting up Direct Deposit..."));
            emitEffect(com.paypal.oslo.feature.directdeposit.ui.intro.effect.IntroEffect.NavigateToNext.INSTANCE);
        }
    }

    public final void onGetStartedClick() {
        processIntent((com.paypal.oslo.feature.directdeposit.ui.intro.intent.IntroIntent) com.paypal.oslo.feature.directdeposit.ui.intro.intent.IntroIntent.NavigateNext.INSTANCE);
    }

    public final void onBackClick() {
        processIntent((com.paypal.oslo.feature.directdeposit.ui.intro.intent.IntroIntent) com.paypal.oslo.feature.directdeposit.ui.intro.intent.IntroIntent.BackClicked.INSTANCE);
    }
}
