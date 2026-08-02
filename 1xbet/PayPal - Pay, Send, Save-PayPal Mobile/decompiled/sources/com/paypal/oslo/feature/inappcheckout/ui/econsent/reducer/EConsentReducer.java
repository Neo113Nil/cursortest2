package com.paypal.oslo.feature.inappcheckout.ui.econsent.reducer;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/reducer/EConsentReducer;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$State;", "currentState", "Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Event;", "event", "reduce", "(Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$State;Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$Event;)Lcom/paypal/oslo/feature/inappcheckout/ui/econsent/contract/EConsentContract$State;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EConsentReducer {
    public static final int $stable = 0;

    @javax.inject.Inject
    public EConsentReducer() {
    }

    public final com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.State reduce(com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.State currentState, com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.Initialize) {
            return com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.State.copy$default(currentState, ((com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.Initialize) event).getEntity(), false, 2, null);
        }
        if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.SetLoading) {
            return com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.State.copy$default(currentState, null, ((com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.SetLoading) event).isButtonLoading(), 1, null);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.OnAgreeAndContinue.INSTANCE) || (event instanceof com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.OnLinkClick) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.OnProfileClick.INSTANCE) || (event instanceof com.paypal.oslo.feature.inappcheckout.ui.econsent.contract.EConsentContract.Event.TrackAnalyticsEvent)) {
            return currentState;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
