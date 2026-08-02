package com.paypal.oslo.feature.identity.login.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "", "<init>", "(Ljava/lang/String;I)V", "LOGIN", "NATIVE_CHECKOUT", "LINK_ACCOUNT", "SWITCH_ACCOUNT", "PASSWORD_RECOVERY"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AuthIntent {
    public static final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent LINK_ACCOUNT;
    public static final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent LOGIN;
    public static final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent NATIVE_CHECKOUT;
    public static final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent PASSWORD_RECOVERY;
    public static final com.paypal.oslo.feature.identity.login.domain.model.AuthIntent SWITCH_ACCOUNT;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.AuthIntent[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private AuthIntent(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent = new com.paypal.oslo.feature.identity.login.domain.model.AuthIntent("LOGIN", 0);
        LOGIN = authIntent;
        com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent2 = new com.paypal.oslo.feature.identity.login.domain.model.AuthIntent("NATIVE_CHECKOUT", 1);
        NATIVE_CHECKOUT = authIntent2;
        com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent3 = new com.paypal.oslo.feature.identity.login.domain.model.AuthIntent("LINK_ACCOUNT", 2);
        LINK_ACCOUNT = authIntent3;
        com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent4 = new com.paypal.oslo.feature.identity.login.domain.model.AuthIntent("SWITCH_ACCOUNT", 3);
        SWITCH_ACCOUNT = authIntent4;
        com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent5 = new com.paypal.oslo.feature.identity.login.domain.model.AuthIntent("PASSWORD_RECOVERY", 4);
        PASSWORD_RECOVERY = authIntent5;
        com.paypal.oslo.feature.identity.login.domain.model.AuthIntent[] authIntentArr = {authIntent, authIntent2, authIntent3, authIntent4, authIntent5};
        getHighSpeedVideoFpsRangesFor = authIntentArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(authIntentArr);
    }

    public static com.paypal.oslo.feature.identity.login.domain.model.AuthIntent[] values() {
        return (com.paypal.oslo.feature.identity.login.domain.model.AuthIntent[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.identity.login.domain.model.AuthIntent valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.login.domain.model.AuthIntent) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.login.domain.model.AuthIntent> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
