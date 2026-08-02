package com.paypal.oslo.feature.identity.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/Intent;", "", "<init>", "(Ljava/lang/String;I)V", "LOGIN", "LINK_ACCOUNT"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Intent {
    public static final com.paypal.oslo.feature.identity.api.Intent LINK_ACCOUNT;
    public static final com.paypal.oslo.feature.identity.api.Intent LOGIN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.api.Intent[] getHighSpeedVideoFpsRangesFor;

    private Intent(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.identity.api.Intent intent = new com.paypal.oslo.feature.identity.api.Intent("LOGIN", 0);
        LOGIN = intent;
        com.paypal.oslo.feature.identity.api.Intent intent2 = new com.paypal.oslo.feature.identity.api.Intent("LINK_ACCOUNT", 1);
        LINK_ACCOUNT = intent2;
        com.paypal.oslo.feature.identity.api.Intent[] intentArr = {intent, intent2};
        getHighSpeedVideoFpsRangesFor = intentArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(intentArr);
    }

    public static com.paypal.oslo.feature.identity.api.Intent[] values() {
        return (com.paypal.oslo.feature.identity.api.Intent[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.identity.api.Intent valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.api.Intent) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.api.Intent.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.api.Intent> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
