package com.paypal.oslo.feature.subscriptions.shared.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;", "", "<init>", "(Ljava/lang/String;I)V", "ENABLED", "DISABLED", "UNAVAILABLE", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BalancePreference {
    public static final com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference DISABLED;
    public static final com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference ENABLED;
    public static final com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference UNAVAILABLE;
    public static final com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private BalancePreference(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference = new com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference("ENABLED", 0);
        ENABLED = balancePreference;
        com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference2 = new com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference("DISABLED", 1);
        DISABLED = balancePreference2;
        com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference3 = new com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference("UNAVAILABLE", 2);
        UNAVAILABLE = balancePreference3;
        com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference4 = new com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference("UNKNOWN", 3);
        UNKNOWN = balancePreference4;
        com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference[] balancePreferenceArr = {balancePreference, balancePreference2, balancePreference3, balancePreference4};
        getHighSpeedVideoFpsRanges = balancePreferenceArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(balancePreferenceArr);
    }

    public static com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference[] values() {
        return (com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference) java.lang.Enum.valueOf(com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
