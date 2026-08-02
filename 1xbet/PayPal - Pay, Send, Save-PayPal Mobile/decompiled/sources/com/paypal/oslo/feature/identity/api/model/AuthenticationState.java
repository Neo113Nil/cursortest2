package com.paypal.oslo.feature.identity.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/AuthenticationState;", "", "<init>", "(Ljava/lang/String;I)V", "REMEMBERED", "LOGGED_IN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AuthenticationState {
    public static final com.paypal.oslo.feature.identity.api.model.AuthenticationState LOGGED_IN;
    public static final com.paypal.oslo.feature.identity.api.model.AuthenticationState REMEMBERED;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.api.model.AuthenticationState[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private AuthenticationState(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.identity.api.model.AuthenticationState authenticationState = new com.paypal.oslo.feature.identity.api.model.AuthenticationState("REMEMBERED", 0);
        REMEMBERED = authenticationState;
        com.paypal.oslo.feature.identity.api.model.AuthenticationState authenticationState2 = new com.paypal.oslo.feature.identity.api.model.AuthenticationState("LOGGED_IN", 1);
        LOGGED_IN = authenticationState2;
        com.paypal.oslo.feature.identity.api.model.AuthenticationState[] authenticationStateArr = {authenticationState, authenticationState2};
        getHighSpeedVideoFpsRanges = authenticationStateArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(authenticationStateArr);
    }

    public static com.paypal.oslo.feature.identity.api.model.AuthenticationState[] values() {
        return (com.paypal.oslo.feature.identity.api.model.AuthenticationState[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.identity.api.model.AuthenticationState valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.api.model.AuthenticationState) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.api.model.AuthenticationState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.api.model.AuthenticationState> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
