package com.paypal.oslo.feature.controlcenter.api.observability;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/controlcenter/api/observability/ControlCenterUserJourneys;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/controlcenter/api/observability/UserJourney;", "loading", "Lcom/paypal/oslo/feature/controlcenter/api/observability/UserJourney;", "getLoading", "()Lcom/paypal/oslo/feature/controlcenter/api/observability/UserJourney;", "internalNavigation", "getInternalNavigation", "accountSwitch", "getAccountSwitch", "profilePicture", "getProfilePicture", "subscriptions", "getSubscriptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ControlCenterUserJourneys {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.controlcenter.api.observability.ControlCenterUserJourneys INSTANCE = new com.paypal.oslo.feature.controlcenter.api.observability.ControlCenterUserJourneys();
    private static final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney loading = new com.paypal.oslo.feature.controlcenter.api.observability.UserJourney("ME_LOADING");
    private static final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney internalNavigation = new com.paypal.oslo.feature.controlcenter.api.observability.UserJourney("ME_INTERNAL_NAVIGATION");
    private static final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney accountSwitch = new com.paypal.oslo.feature.controlcenter.api.observability.UserJourney("ME_ACCOUNT_SWITCH");
    private static final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney profilePicture = new com.paypal.oslo.feature.controlcenter.api.observability.UserJourney("ME_PROFILE_PICTURE");
    private static final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney subscriptions = new com.paypal.oslo.feature.controlcenter.api.observability.UserJourney("ME_SUBSCRIPTIONS");

    private ControlCenterUserJourneys() {
    }

    public final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney getLoading() {
        return loading;
    }

    public final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney getInternalNavigation() {
        return internalNavigation;
    }

    public final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney getAccountSwitch() {
        return accountSwitch;
    }

    public final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney getProfilePicture() {
        return profilePicture;
    }

    public final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney getSubscriptions() {
        return subscriptions;
    }
}
