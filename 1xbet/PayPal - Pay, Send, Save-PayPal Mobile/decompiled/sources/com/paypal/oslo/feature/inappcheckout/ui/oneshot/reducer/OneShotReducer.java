package com.paypal.oslo.feature.inappcheckout.ui.oneshot.reducer;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/reducer/OneShotReducer;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$State;", "currentState", "Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Event;", "event", "reduce", "(Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$State;Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$Event;)Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/contract/OneShotContract$State;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OneShotReducer {
    public static final int $stable = 0;

    @javax.inject.Inject
    public OneShotReducer() {
    }

    public final com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.State reduce(com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.State currentState, com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Event.Initialize) {
            return currentState.copy(true, true, false, null);
        }
        if (!(event instanceof com.paypal.oslo.feature.inappcheckout.ui.oneshot.contract.OneShotContract.Event.RetryAuthentication)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return currentState.copy(false, true, true, null);
    }
}
