package com.paypal.oslo.feature.controlcenter.api.observability;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0019\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u001a\u0010\u001f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/controlcenter/api/observability/SettingsUserJourneys;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/controlcenter/api/observability/UserJourney;", "loading", "Lcom/paypal/oslo/feature/controlcenter/api/observability/UserJourney;", "getLoading", "()Lcom/paypal/oslo/feature/controlcenter/api/observability/UserJourney;", "profileLoading", "getProfileLoading", "internalNavigation", "getInternalNavigation", "biometricsEnrollment", "getBiometricsEnrollment", "llsEnrollment", "getLlsEnrollment", "logout", "getLogout", "legalScreens", "getLegalScreens", "closeAccount", "getCloseAccount", "linkedBusinesses", "getLinkedBusinesses", "profileEmail", "getProfileEmail", "profilePhone", "getProfilePhone", "profileAddress", "getProfileAddress", "profileName", "getProfileName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SettingsUserJourneys {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.controlcenter.api.observability.SettingsUserJourneys INSTANCE = new com.paypal.oslo.feature.controlcenter.api.observability.SettingsUserJourneys();
    private static final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney loading = new com.paypal.oslo.feature.controlcenter.api.observability.UserJourney("SETTINGS_LOADING");
    private static final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney profileLoading = new com.paypal.oslo.feature.controlcenter.api.observability.UserJourney("SETTINGS_PROFILE_LOADING");
    private static final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney internalNavigation = new com.paypal.oslo.feature.controlcenter.api.observability.UserJourney("SETTINGS_INTERNAL_NAVIGATION");
    private static final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney biometricsEnrollment = new com.paypal.oslo.feature.controlcenter.api.observability.UserJourney("SETTINGS_BIOMETRICS_ENROLLMENT");
    private static final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney llsEnrollment = new com.paypal.oslo.feature.controlcenter.api.observability.UserJourney("SETTINGS_LLS_ENROLLMENT");
    private static final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney logout = new com.paypal.oslo.feature.controlcenter.api.observability.UserJourney("SETTINGS_LOGOUT");
    private static final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney legalScreens = new com.paypal.oslo.feature.controlcenter.api.observability.UserJourney("SETTINGS_LEGAL_SCREENS");
    private static final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney closeAccount = new com.paypal.oslo.feature.controlcenter.api.observability.UserJourney("SETTINGS_CLOSE_ACCOUNT");
    private static final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney linkedBusinesses = new com.paypal.oslo.feature.controlcenter.api.observability.UserJourney("SETTINGS_LINKED_BUSINESSES");
    private static final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney profileEmail = new com.paypal.oslo.feature.controlcenter.api.observability.UserJourney("ME_PROFILE_EMAIL");
    private static final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney profilePhone = new com.paypal.oslo.feature.controlcenter.api.observability.UserJourney("ME_PROFILE_PHONE");
    private static final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney profileAddress = new com.paypal.oslo.feature.controlcenter.api.observability.UserJourney("ME_PROFILE_ADDRESS");
    private static final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney profileName = new com.paypal.oslo.feature.controlcenter.api.observability.UserJourney("ME_PROFILE_NAME");

    private SettingsUserJourneys() {
    }

    public final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney getLoading() {
        return loading;
    }

    public final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney getProfileLoading() {
        return profileLoading;
    }

    public final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney getInternalNavigation() {
        return internalNavigation;
    }

    public final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney getBiometricsEnrollment() {
        return biometricsEnrollment;
    }

    public final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney getLlsEnrollment() {
        return llsEnrollment;
    }

    public final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney getLogout() {
        return logout;
    }

    public final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney getLegalScreens() {
        return legalScreens;
    }

    public final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney getCloseAccount() {
        return closeAccount;
    }

    public final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney getLinkedBusinesses() {
        return linkedBusinesses;
    }

    public final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney getProfileEmail() {
        return profileEmail;
    }

    public final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney getProfilePhone() {
        return profilePhone;
    }

    public final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney getProfileAddress() {
        return profileAddress;
    }

    public final com.paypal.oslo.feature.controlcenter.api.observability.UserJourney getProfileName() {
        return profileName;
    }
}
