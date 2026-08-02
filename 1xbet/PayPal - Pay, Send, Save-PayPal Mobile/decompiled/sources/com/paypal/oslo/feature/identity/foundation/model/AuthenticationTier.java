package com.paypal.oslo.feature.identity.foundation.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/foundation/model/AuthenticationTier;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "USER_ACCESS_TOKEN_LONG_LIVED_SESSION", "USER_ACCESS_TOKEN_AUTHENTICATED_STATE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AuthenticationTier {
    public static final com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier USER_ACCESS_TOKEN_AUTHENTICATED_STATE;
    public static final com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier USER_ACCESS_TOKEN_LONG_LIVED_SESSION;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private final java.lang.String value;

    private AuthenticationTier(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier authenticationTier = new com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier("USER_ACCESS_TOKEN_LONG_LIVED_SESSION", 0, "UserAccessToken_LongLivedSession");
        USER_ACCESS_TOKEN_LONG_LIVED_SESSION = authenticationTier;
        com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier authenticationTier2 = new com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier("USER_ACCESS_TOKEN_AUTHENTICATED_STATE", 1, "UserAccessToken_AuthenticatedState");
        USER_ACCESS_TOKEN_AUTHENTICATED_STATE = authenticationTier2;
        com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier[] authenticationTierArr = {authenticationTier, authenticationTier2};
        getHighResolutionOutputSizeshNQ4ISI = authenticationTierArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(authenticationTierArr);
    }

    public static com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier[] values() {
        return (com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
