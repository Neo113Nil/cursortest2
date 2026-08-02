package com.paypal.oslo.feature.inappcheckout.ui.thanks.reducer;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/reducer/ThanksReducer;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/contract/ThanksContract$State;", "currentState", "Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/contract/ThanksContract$Event;", "event", "reduce", "(Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/contract/ThanksContract$State;Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/contract/ThanksContract$Event;)Lcom/paypal/oslo/feature/inappcheckout/ui/thanks/contract/ThanksContract$State;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ThanksReducer {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ThanksReducer() {
    }

    public final com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.State reduce(com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.State currentState, com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Event.Initialise)) {
            return currentState;
        }
        com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Event.Initialise initialise = (com.paypal.oslo.feature.inappcheckout.ui.thanks.contract.ThanksContract.Event.Initialise) event;
        return currentState.copy(false, initialise.getThanksScreenData().getMerchantName(), initialise.getThanksScreenData().getReturnUrl());
    }
}
