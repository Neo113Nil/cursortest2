package com.paypal.oslo.core.network.connectivity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/core/network/connectivity/NetworkQuality;", "", "<init>", "(Ljava/lang/String;I)V", "OFFLINE", "SLOW", "MODERATE", "FAST"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NetworkQuality {
    public static final com.paypal.oslo.core.network.connectivity.NetworkQuality FAST;
    public static final com.paypal.oslo.core.network.connectivity.NetworkQuality MODERATE;
    public static final com.paypal.oslo.core.network.connectivity.NetworkQuality OFFLINE;
    public static final com.paypal.oslo.core.network.connectivity.NetworkQuality SLOW;
    private static final /* synthetic */ com.paypal.oslo.core.network.connectivity.NetworkQuality[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private NetworkQuality(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.network.connectivity.NetworkQuality networkQuality = new com.paypal.oslo.core.network.connectivity.NetworkQuality("OFFLINE", 0);
        OFFLINE = networkQuality;
        com.paypal.oslo.core.network.connectivity.NetworkQuality networkQuality2 = new com.paypal.oslo.core.network.connectivity.NetworkQuality("SLOW", 1);
        SLOW = networkQuality2;
        com.paypal.oslo.core.network.connectivity.NetworkQuality networkQuality3 = new com.paypal.oslo.core.network.connectivity.NetworkQuality("MODERATE", 2);
        MODERATE = networkQuality3;
        com.paypal.oslo.core.network.connectivity.NetworkQuality networkQuality4 = new com.paypal.oslo.core.network.connectivity.NetworkQuality("FAST", 3);
        FAST = networkQuality4;
        com.paypal.oslo.core.network.connectivity.NetworkQuality[] networkQualityArr = {networkQuality, networkQuality2, networkQuality3, networkQuality4};
        getHighResolutionOutputSizeshNQ4ISI = networkQualityArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(networkQualityArr);
    }

    public static com.paypal.oslo.core.network.connectivity.NetworkQuality[] values() {
        return (com.paypal.oslo.core.network.connectivity.NetworkQuality[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.core.network.connectivity.NetworkQuality valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.network.connectivity.NetworkQuality) java.lang.Enum.valueOf(com.paypal.oslo.core.network.connectivity.NetworkQuality.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.network.connectivity.NetworkQuality> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
