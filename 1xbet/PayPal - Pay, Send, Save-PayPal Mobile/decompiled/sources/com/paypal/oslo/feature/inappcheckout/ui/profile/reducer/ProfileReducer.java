package com.paypal.oslo.feature.inappcheckout.ui.profile.reducer;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/profile/reducer/ProfileReducer;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$State;", "currentState", "Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Event;", "event", "reduce", "(Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$State;Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$Event;)Lcom/paypal/oslo/feature/inappcheckout/ui/profile/contract/ProfileContract$State;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProfileReducer {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ProfileReducer() {
    }

    public final com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.State reduce(com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.State currentState, com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        boolean z = false;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        if (event instanceof com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.Initialize) {
            return new com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.State(((com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.Initialize) event).getBuyerInfoEntity(), z, 2, defaultConstructorMarker);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.StartLoading.INSTANCE)) {
            return com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.State.copy$default(currentState, null, true, 1, null);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.FinishLoading.INSTANCE)) {
            return com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.State.copy$default(currentState, null, false, 1, null);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.HandleBackPress.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.LogoutUser.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.NavigateToPrivacy.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.NavigateToPolicies.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.inappcheckout.ui.profile.contract.ProfileContract.Event.NavigateToTerms.INSTANCE)) {
            return currentState;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
