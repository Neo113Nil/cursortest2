package com.paypal.oslo.feature.identity.analytics.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/paypal/oslo/feature/identity/analytics/domain/Action;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Triggered", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE, "View", "Login", "LoginWithSavedCreds", "LoginWithPasskey", "LoginWithFaceId", "ChangeUser", "Error", "AddIdentifier", "EnterPassword"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Action {
    public static final com.paypal.oslo.feature.identity.analytics.domain.Action AddIdentifier;
    public static final com.paypal.oslo.feature.identity.analytics.domain.Action ChangeUser;
    public static final com.paypal.oslo.feature.identity.analytics.domain.Action Completed;
    public static final com.paypal.oslo.feature.identity.analytics.domain.Action EnterPassword;
    public static final com.paypal.oslo.feature.identity.analytics.domain.Action Error;
    public static final com.paypal.oslo.feature.identity.analytics.domain.Action Login;
    public static final com.paypal.oslo.feature.identity.analytics.domain.Action LoginWithFaceId;
    public static final com.paypal.oslo.feature.identity.analytics.domain.Action LoginWithPasskey;
    public static final com.paypal.oslo.feature.identity.analytics.domain.Action LoginWithSavedCreds;
    public static final com.paypal.oslo.feature.identity.analytics.domain.Action Triggered;
    public static final com.paypal.oslo.feature.identity.analytics.domain.Action View;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.analytics.domain.Action[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private final java.lang.String value;

    private Action(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.identity.analytics.domain.Action action = new com.paypal.oslo.feature.identity.analytics.domain.Action("Triggered", 0, com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.TRIGGERED);
        Triggered = action;
        com.paypal.oslo.feature.identity.analytics.domain.Action action2 = new com.paypal.oslo.feature.identity.analytics.domain.Action(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE, 1, com.paypal.oslo.feature.bankingbundle.api.analytics.BankingBundleAnalytics.FlowOutcome.COMPLETED);
        Completed = action2;
        com.paypal.oslo.feature.identity.analytics.domain.Action action3 = new com.paypal.oslo.feature.identity.analytics.domain.Action("View", 2, "view");
        View = action3;
        com.paypal.oslo.feature.identity.analytics.domain.Action action4 = new com.paypal.oslo.feature.identity.analytics.domain.Action("Login", 3, "login");
        Login = action4;
        com.paypal.oslo.feature.identity.analytics.domain.Action action5 = new com.paypal.oslo.feature.identity.analytics.domain.Action("LoginWithSavedCreds", 4, "login_with_saved_creds");
        LoginWithSavedCreds = action5;
        com.paypal.oslo.feature.identity.analytics.domain.Action action6 = new com.paypal.oslo.feature.identity.analytics.domain.Action("LoginWithPasskey", 5, "login_with_passkey");
        LoginWithPasskey = action6;
        com.paypal.oslo.feature.identity.analytics.domain.Action action7 = new com.paypal.oslo.feature.identity.analytics.domain.Action("LoginWithFaceId", 6, "login_with_faceid");
        LoginWithFaceId = action7;
        com.paypal.oslo.feature.identity.analytics.domain.Action action8 = new com.paypal.oslo.feature.identity.analytics.domain.Action("ChangeUser", 7, "change_user");
        ChangeUser = action8;
        com.paypal.oslo.feature.identity.analytics.domain.Action action9 = new com.paypal.oslo.feature.identity.analytics.domain.Action("Error", 8, "error");
        Error = action9;
        com.paypal.oslo.feature.identity.analytics.domain.Action action10 = new com.paypal.oslo.feature.identity.analytics.domain.Action("AddIdentifier", 9, "add_identifier");
        AddIdentifier = action10;
        com.paypal.oslo.feature.identity.analytics.domain.Action action11 = new com.paypal.oslo.feature.identity.analytics.domain.Action("EnterPassword", 10, "enter_password");
        EnterPassword = action11;
        com.paypal.oslo.feature.identity.analytics.domain.Action[] actionArr = {action, action2, action3, action4, action5, action6, action7, action8, action9, action10, action11};
        getHighResolutionOutputSizeshNQ4ISI = actionArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(actionArr);
    }

    public static com.paypal.oslo.feature.identity.analytics.domain.Action[] values() {
        return (com.paypal.oslo.feature.identity.analytics.domain.Action[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.identity.analytics.domain.Action valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.analytics.domain.Action) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.analytics.domain.Action.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.analytics.domain.Action> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
