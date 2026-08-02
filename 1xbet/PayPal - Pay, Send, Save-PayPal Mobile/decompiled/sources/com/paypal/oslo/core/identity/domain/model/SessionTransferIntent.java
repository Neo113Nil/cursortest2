package com.paypal.oslo.core.identity.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/core/identity/domain/model/SessionTransferIntent;", "", "<init>", "(Ljava/lang/String;I)V", "INTERAPP_SINGLE_SIGN_ON", "WEB_SINGLE_SIGN_ON", "WEB_CHECKOUT_SINGLE_SIGN_ON", "CONNECT_SINGLE_SIGN_ON", "XOOM_SINGLE_SIGN_ON", "ZETTLE_SINGLE_SIGN_ON"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SessionTransferIntent {
    public static final com.paypal.oslo.core.identity.domain.model.SessionTransferIntent CONNECT_SINGLE_SIGN_ON;
    public static final com.paypal.oslo.core.identity.domain.model.SessionTransferIntent INTERAPP_SINGLE_SIGN_ON;
    public static final com.paypal.oslo.core.identity.domain.model.SessionTransferIntent WEB_CHECKOUT_SINGLE_SIGN_ON;
    public static final com.paypal.oslo.core.identity.domain.model.SessionTransferIntent WEB_SINGLE_SIGN_ON;
    public static final com.paypal.oslo.core.identity.domain.model.SessionTransferIntent XOOM_SINGLE_SIGN_ON;
    public static final com.paypal.oslo.core.identity.domain.model.SessionTransferIntent ZETTLE_SINGLE_SIGN_ON;
    private static final /* synthetic */ com.paypal.oslo.core.identity.domain.model.SessionTransferIntent[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private SessionTransferIntent(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.identity.domain.model.SessionTransferIntent sessionTransferIntent = new com.paypal.oslo.core.identity.domain.model.SessionTransferIntent("INTERAPP_SINGLE_SIGN_ON", 0);
        INTERAPP_SINGLE_SIGN_ON = sessionTransferIntent;
        com.paypal.oslo.core.identity.domain.model.SessionTransferIntent sessionTransferIntent2 = new com.paypal.oslo.core.identity.domain.model.SessionTransferIntent("WEB_SINGLE_SIGN_ON", 1);
        WEB_SINGLE_SIGN_ON = sessionTransferIntent2;
        com.paypal.oslo.core.identity.domain.model.SessionTransferIntent sessionTransferIntent3 = new com.paypal.oslo.core.identity.domain.model.SessionTransferIntent("WEB_CHECKOUT_SINGLE_SIGN_ON", 2);
        WEB_CHECKOUT_SINGLE_SIGN_ON = sessionTransferIntent3;
        com.paypal.oslo.core.identity.domain.model.SessionTransferIntent sessionTransferIntent4 = new com.paypal.oslo.core.identity.domain.model.SessionTransferIntent("CONNECT_SINGLE_SIGN_ON", 3);
        CONNECT_SINGLE_SIGN_ON = sessionTransferIntent4;
        com.paypal.oslo.core.identity.domain.model.SessionTransferIntent sessionTransferIntent5 = new com.paypal.oslo.core.identity.domain.model.SessionTransferIntent("XOOM_SINGLE_SIGN_ON", 4);
        XOOM_SINGLE_SIGN_ON = sessionTransferIntent5;
        com.paypal.oslo.core.identity.domain.model.SessionTransferIntent sessionTransferIntent6 = new com.paypal.oslo.core.identity.domain.model.SessionTransferIntent("ZETTLE_SINGLE_SIGN_ON", 5);
        ZETTLE_SINGLE_SIGN_ON = sessionTransferIntent6;
        com.paypal.oslo.core.identity.domain.model.SessionTransferIntent[] sessionTransferIntentArr = {sessionTransferIntent, sessionTransferIntent2, sessionTransferIntent3, sessionTransferIntent4, sessionTransferIntent5, sessionTransferIntent6};
        getHighSpeedVideoFpsRangesFor = sessionTransferIntentArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(sessionTransferIntentArr);
    }

    public static com.paypal.oslo.core.identity.domain.model.SessionTransferIntent[] values() {
        return (com.paypal.oslo.core.identity.domain.model.SessionTransferIntent[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.core.identity.domain.model.SessionTransferIntent valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.identity.domain.model.SessionTransferIntent) java.lang.Enum.valueOf(com.paypal.oslo.core.identity.domain.model.SessionTransferIntent.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.identity.domain.model.SessionTransferIntent> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
